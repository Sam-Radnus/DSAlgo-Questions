class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here'
        int l=0;
        int m=0;
        Node curr1=head1,curr2=head2;
        while(head1!=null)
        {
            head1=head1.next;
            l++;
        }
        while(head2!=null)
        {
            head2=head2.next;
            m++;
        }
        int shift=Math.abs(l-m);
        
        if(l>m)
        {
            while(shift>0)
            {
                curr1=curr1.next;
                shift--;
            }
        }
        else{
            while(shift>0)
            {
                curr2=curr2.next;
                shift--;
            }
        }
        while(curr1!=null)
        {
            if(curr1==curr2)
            {
                return curr1.data;
            }
            else{
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }
        return -1;
	}
}
