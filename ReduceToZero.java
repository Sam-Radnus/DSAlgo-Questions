public class ReduceToZero {
    public static int numberOfSteps(int num) {
           int c=0;
           while(num!=0)
           {
               if(num%2==0)
               {
                   num=num/2;
                   c++;
               }
               else
               if(num%2!=0)
               {
                   num--;
                   c++;
               }
           }
           return c;
    }
    public static void main(String args[])
    {
        System.out.println(numberOfSteps(8));
    }
}
