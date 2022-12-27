class Solution {
    public int calculate(String s) {
       int res=0,left=0,opt=0,sign=1,num=0;
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if (c == ' ') continue;
           if(Character.isDigit(c))
           {
               num = 10*num + (int)(c-'0');
           }
           else{
               if(opt==1) num= left*num;
               if(opt==-1) num= left/num;
               opt=0;
               if(c=='+'||c=='-')
               {
                   res+=sign*num;
                   sign=c=='+'?1:-1;
               }
               if(c=='*'||c=='/')
               {
                   System.out.println(num);
                   left=num;
                   opt=c=='*'?1:-1;
               }
               num=0;
           }
           
       }
       if(opt==1)
       {
           res+=sign*left*num;
       }
       else if(opt==-1){
           res+=sign*left/num;
       }   
       else{
           res+=sign*num;
       }
       return res;
    }
}
