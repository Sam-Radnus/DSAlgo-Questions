public class ReOrderString {
    public static String reorganizeString(String S) {
        int[] hash = new int[26];
        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i) - 'a']++;                   //FREQUENCY OF A PARTICULAR CHARACTER IN THE ENTIRE ALPHABET CHART
        }
        int max = 0, letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {                         //FINDING THE ELEMENT  WITH THE MAXIMUM FREQUENCY
                max = hash[i];
                letter = i;
            }
        }
        if (max > (S.length() + 1) / 2) {                //IF THE ELEMENT WITH THE MAX INDEX OCCURS THROUGHOUT THE STRING
            return "";
        }
        char[] res = new char[S.length()];               //RESULT CHARACTER ARRAY
        int idx = 0;
        while (hash[letter] > 0) {                       //IF A CHARACTER OCCURS AT LEAST ONCE
            res[idx] = (char) (letter + 'a');            //CONVERTING THE INTEGER TO CHARACTER
            idx += 2;                                    //PLACING ELEMENTS AT EVEN INDEXES
            hash[letter]--;
        }
        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                if (idx >= res.length) {
                    idx = 1;
                }
                res[idx] = (char) (i + 'a');             //PLACING THE REST OF THE ELEMENT AT ODD PLACES
                idx += 2;
                hash[i]--;
            }
        }
        return String.valueOf(res);
    }
    public static void main(String args[])
    {
       String str="aaaabcc";
       for(int i=0;i<str.length();i++)
       {
           System.out.println((char)(i+'a'));
       }
    }
}
