class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer>set=new HashSet<>();
        Stack<Integer>stck=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
               stck.push(i);
            else if(s.charAt(i)==')')
            {
                if(stck.isEmpty())
                {
                    set.add(i);
                }
                else{
                    stck.pop();
                }
            }   
        }
        while(!stck.isEmpty())
        {
            set.add(stck.pop());
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(i))
               sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
