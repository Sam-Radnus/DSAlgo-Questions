class Solution {
    List<String>res;
    public List<String> letterCombinations(String digits) {
           Map<Integer,List<String>>map=new HashMap<>();
           res=new ArrayList<>();       
           if(digits.length()==0) return new ArrayList<>();
           map.put(2,Arrays.asList("a","b","c"));    
           map.put(3,Arrays.asList("d","e","f")); 
           map.put(4,Arrays.asList("g","h","i")); 
           map.put(5,Arrays.asList("j","k","l")); 
           map.put(6,Arrays.asList("m","n","o")); 
           map.put(7,Arrays.asList("p","q","r","s")); 
           map.put(8,Arrays.asList("t","u","v")); 
           map.put(9,Arrays.asList("w","x","y","z"));
           StringBuffer sb=new StringBuffer();
           helper(map,0,sb,digits);
           return res;

    }
    public void helper(Map<Integer,List<String>>map,int num,StringBuffer sb,String digits)
    {

        if(sb.length()==digits.length())
        {
            res.add(sb.toString());
            return;
        }
        if(num>=digits.length()) return;
        List<String>chars=map.get(digits.charAt(num)-'0');
        for(int c=0;c<chars.size();c++)
        {
            sb.append(chars.get(c));
            helper(map,num+1,sb,digits);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
