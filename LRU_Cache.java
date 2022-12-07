class LRUCache {
    LinkedNodeList list;
    Integer cap;
    Map<Integer,Node>map;
    public LRUCache(int capacity)
    {
        cap=capacity;
        list=new LinkedNodeList();
        map=new HashMap(capacity);
    }
    public int get(int key)
    {
        Node node=map.get(key);
        if(node==null)
        {
            return -1;
        }
        list.movetoHead(node);
        return node.val;
    }
    public void put(int key,int value)
    {
        Node node=map.get(key);
        if(node!=null)
        {
            list.movetoHead(node);
            node.val=value;
        }
        else{
            Node newNode=new Node(key,value);
            if(cap==map.size())
            {
                Node tail=list.getTail();
                map.remove(tail.key);
                list.RemoveTail();
            }
            map.put(key,newNode);
            list.addToHead(newNode);
        }
    }
}

class LinkedNodeList{

    Node dummyHead;
    Node dummyTail;
    LinkedNodeList()
    {
        dummyHead=new Node(0,0);
        dummyTail=new Node(0,0);
        dummyHead.next=dummyTail;
        dummyTail.prev=dummyHead;
    }
    public void movetoHead(Node node)
    {
        node.next.prev=node.prev;
        node.prev.next=node.next;
        addToHead(node);
    }
    public void addToHead(Node node)
    {
        Node temp=dummyHead.next;
        dummyHead.next=node;
        node.next=temp;
        node.prev=dummyHead;
        temp.prev=node;

    }
    public void RemoveTail()
    {
        Node newTail=dummyTail.prev.prev;
        newTail.next=dummyTail;
        dummyTail.prev=newTail;
    }
    public Node getTail()
    {
        return dummyTail.prev;
    }
}

class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key, int value){
        this.key = key;
        this.val =value;
    }
}
