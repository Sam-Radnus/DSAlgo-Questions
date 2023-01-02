class Solution {
    public int characterReplacement(String s, int k) {
        int beg=0,maxLen=0,maxFreq=0;
        int freq[]=new int[26];
        for(int end=0;end<s.length();end++)
        {
            freq[s.charAt(end)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(end)-'A']);
            if(((end-beg+1)-maxFreq)>k)
            {
                freq[(s.charAt(beg))-'A']--;
                beg++;
            }
            maxLen=Math.max(maxLen,end-beg+1);
        }
        return maxLen;
    }
}
