class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        ArrayList<ArrayList<Double>>ar=new ArrayList<>();
        if(poured==0){
            return 0.0;
        }
        double res=0.0;
        ArrayList<Double>t=new ArrayList<>();
        t.add(new Double(poured));
        ar.add(t);
        for(int i=1;i<=query_row;i++){
            ArrayList<Double>temp=new ArrayList<>();
            ArrayList<Double>prev=ar.get(i-1);
            double z=Math.max(0,(prev.get(0)-1)/2);
            temp.add(z);
            for(int j=1;j<i;j++){
                 double a=Math.max(0,(ar.get(i-1).get(j-1)-1)/2);
                 double b=Math.max(0,(ar.get(i-1).get(j)-1)/2);
                 temp.add(a+b);
            }
            z=Math.max(0,(prev.get(prev.size()-1)-1)/2);
            temp.add(z);
            ar.add(temp);
        }
        
        return Math.min(1,ar.get(query_row).get(query_glass));
    }
}
