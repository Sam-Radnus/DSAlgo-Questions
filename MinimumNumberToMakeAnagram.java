class Solution {
    public int minSteps(String s, String t) {
        int freq_s[]=new int[26];
        int freq_t[]=new int[26];
        ArrayList<Character>ch=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq_s[c-'a']++;
            c=t.charAt(i);
            if(!ch.contains(c)){
                ch.add(c);
            }
            freq_t[c-'a']++;
        }
        int count=0;
        for(int i=0;i<freq_t.length;i++){
            if(freq_t[i]!=0 && freq_s[i]<freq_t[i]){
               count+=Math.abs(freq_t[i]-freq_s[i]);
            }
        }
        return count;
    }
}
