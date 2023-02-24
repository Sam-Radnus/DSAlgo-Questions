class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow=head;
        Node fast=head;
        Set<Node>set=new HashSet<>();
        while(fast!=null && fast.next!=null)
        {
            if(set.contains(fast))
            {
                slow.next=null;
                break;
            }
            set.add(fast);
            slow=fast;
            fast=fast.next;
        }
        
    }
}
