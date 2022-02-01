public class IntegerToRoman {
    public static String ReturnRoman(int a)
    {
        String roman="";
        String romCollect[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String TenCollect[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String HunCollect[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
        String MilCollect[]={"","M","MM","MMM"};

        if(a<=10) {
            roman = romCollect[a];
        }
        else
        if(a>10&&a<=100){
            int o=a%10;
            String ones=romCollect[o];
            int t=a/10;
            String twos=TenCollect[t];
            roman=twos+ones;
        }
        else
        if(a>100&&a<=1000)
        {

                int o=a%10;
                String ones=romCollect[o];
                a=a/10;
                int t=a%10;
                String twos=TenCollect[t];
                int h=a/10;
                String threes=HunCollect[h];
              //  reverse = reverse * 10 + remainder;
                roman=threes+twos+ones;

        }
        if(a>1000)
        {
            int o=a%10;
            String ones=romCollect[o];
            a=a/10;
            int t=a%10;
            String twos=TenCollect[t];
            a=a/10;
            int h=a%10;
            String threes=HunCollect[h];
            int m=a/10;
            String Fours=MilCollect[m];
            //  reverse = reverse * 10 + remainder;
            roman=Fours+threes+twos+ones;
        }
        return roman;
    }
    public static void main(String args[])
    {
        int a;
        int i;
        for(i=1;i<=2000;i++)
        {
            System.out.println(i+":"+ReturnRoman(i));
        }
    }
}
