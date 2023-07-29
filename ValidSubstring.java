class Solution {
    public int longestValidParentheses(String s) {
        int len=0;
        if(!s.contains("()")){
            return 0;
        }
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            int count=0;
            if(ch[i]==')') continue;
            for(int j=i;j<s.length();j++){
                if(ch[j]=='(') count+=1;
                else count-=1;
                if(count<0) break;
                if(count==0) len=Math.max(len,j-i+1);
            }
            
        }
        return len;
    }
}
