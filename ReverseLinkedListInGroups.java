//{ Driver Code Starts
import java.util.*;



// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node==null || node.next==null) return node;
        Node ptr=node;
        int c=k;
        while(c>1 && ptr!=null)
        {
            ptr=ptr.next;
            c--;
        }
        Node temp=null;
        if(ptr!=null){
          temp=ptr.next;
          ptr.next=null;
        }
        Node first=reverseList(node);
        Node second=reverse(temp,k);
        Node res=first;
        while(first.next!=null) first=first.next;
        first.next=second;
        return res;
    }
    public static Node reverseList(Node node)
    {
        if(node==null || node.next==null) return node;
        Node ptr=reverseList(node.next);
        node.next.next=node;
        node.next=null;
        return ptr;
    }
}

rr
