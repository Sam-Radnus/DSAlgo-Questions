public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean>map=new HashMap<>();
        return helper(s,map,wordDict);
    }
    public boolean helper(String target,HashMap<String,Boolean>map,List<String> wordDict)
    {
        if(map.containsKey(target))
        {
            return map.get(target);
        }

        if(target.isEmpty())
        {
            return true;
        }
        for(String word:wordDict)
        {
            if(target.startsWith(word))
            {
                System.out.println(word);
                if(helper(target.substring(word.length()),map,wordDict))
                {
                    map.put(target,true);
                    return true;
                }
            }
        }
        map.put(target,false);
        return false;
    }
}
