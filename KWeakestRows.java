class populus{
    int soldiers=0;
    int index=0;
   populus(int soldiers,int index){
       this.soldiers=soldiers;
       this.index=index;
   } 
}
class Solution {
    
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<populus>pq=new PriorityQueue<>((a,b)->( a.soldiers==b.soldiers?a.index-b.index:a.soldiers-b.soldiers));
        for(int i=0;i<mat.length;i++){
            int soldiers=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    soldiers++;
                }
            }
            populus p=new populus(soldiers,i);
            pq.offer(p);
        }
        int res[]=new int[k];
        int c=0;
        while(k!=0){
            populus q=pq.poll();
            res[c++]=q.index;
            k--;
        }
        return res;

    }
}
