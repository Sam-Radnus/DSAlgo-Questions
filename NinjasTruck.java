import java.util.*;
import java.util.Collections;
public class Solution 
{   
	
	

	public static int ninjaTruck(ArrayList<ArrayList<Integer>> box, int k)
	{	
      // helper(0,k,box);
	    List<Integer>sums=new ArrayList<>();
	  int res=0;
	   for(int i=0;i<box.size();i++)
	   {
		   int x=box.get(i).get(0);
		   int y=k;
		   int temp=0;
		
		   while(x!=0 && y!=0)
		   {
			
			 sums.add(box.get(i).get(1));
			 x--;
			 y--;
		   }
		   //sums.add(temp);
	   }
	   Collections.sort(sums);
	   while(k!=0 && sums.size()!=0)
	   {
          res+=sums.get(sums.size()-1);
		  sums.remove(sums.size()-1);
		  k--;
	   }
	   return res;
	}

}

