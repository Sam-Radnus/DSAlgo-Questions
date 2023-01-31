class Solution {
    public String calSort(String str)
    { 
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        int i,j;
        List<List<String>>result=new ArrayList<>();
        String anag[]=new String[n];
        boolean visited[]=new boolean[n];
        for( i=0;i<n;i++)
        {
            anag[i]=calSort(strs[i]);
        }
        for(i=0;i<n;i++)
        {
            List<String>temp=new ArrayList<>();
            for(j=i;j<n;j++)
            {
                if(!visited[j])
                {
                    if(anag[i].equals(anag[j])){
                       temp.add(strs[j]);
                       visited[j]=true;
                    }            
                }
                if(j==n-1 && temp.size()>0)
                     result.add(temp);  
               
            }
        }
        return result;
    }
}
