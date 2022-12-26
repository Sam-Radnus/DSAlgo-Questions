class Solution {
    public String removeKdigits(String num, int k) {
        int len=num.length();
        if(len==k){
            return String.valueOf(0);
        }
        int i=0;
        Stack<Character>stck=new Stack<>();
        while(i<len)
        {
            while(k>0 && !stck.isEmpty() && stck.peek()>num.charAt(i))
            {
                stck.pop();
                k--;
            }
            stck.push(num.charAt(i));
            i++;
        }
        while(k>0 && !stck.isEmpty())
        {
            stck.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stck.isEmpty())
        {
            sb.append(stck.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0')
              sb.deleteCharAt(0);
        return sb.toString();

    }
}
