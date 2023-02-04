class Solution {
    int maxLen=0;
    public boolean isValid(String first,String second)
    {
        int ar[]=new int[26];
        for(int i=0;i<second.length();i++)
        {
            ar[second.charAt(i)-'a']++;
            if(ar[second.charAt(i)-'a']>1) return false;
            if(first.contains(second.charAt(i)+"")) return false; 
        }
        return true;
    }
  
    public int maxLength(List<String> arr) {
        if(arr.size()==0)
        {   
            return 0;
        }
        backtrack(arr,0,"");
        return maxLen;
    }
    private void backtrack(List<String>arr,int start,String current)
    {
       if(current.length()>maxLen)
       {
           maxLen=current.length();
        
       }
       for(int i=start;i<arr.size();i++)
       {
           if(isValid(current,arr.get(i)))
              backtrack(arr,i+1,current+arr.get(i));
       }
    }
}
