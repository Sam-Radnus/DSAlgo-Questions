public class ContainerWithMostWater {
    public static int maxArea(int height[])
    {
        int preptr=0;
        int ptr=height.length-1;
        int max=0;
        while(preptr<ptr)
        {
            int lh=height[preptr];
            int rh=height[ptr];
            int min_h=Math.min(lh,rh);
            max=Math.max(max,min_h*(ptr-preptr));
            if(lh < rh)
            {
                preptr++;
            }
            else
            {
                ptr--;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int ar[]={1,8,6,2,5,4,8,3,7};
        System.out.println("The Max Area : "+maxArea(ar));

    }
}
