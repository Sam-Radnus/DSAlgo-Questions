import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		int count=0;
		int xor_sum=0;
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.size();i++){
			xor_sum=xor_sum^arr.get(i);
			if(map.containsKey(xor_sum ^ x )){
				count+=map.get(xor_sum ^ x);
			}
			if(xor_sum==x) count++;
			map.put(xor_sum,map.getOrDefault(xor_sum, 0)+1);
		}
		return count;
	}
}
