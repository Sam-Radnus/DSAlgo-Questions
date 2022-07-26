import java.util.*;
public class SimplifyPath {
    public static String simplifyPath(String path){
        Stack<String>stack=new Stack<>();
        Set<String>skip=new HashSet<>(Arrays.asList("..",".",""));
        for(String dir:path.split("/"))
        {
            if(dir.equals("..")&&!stack.isEmpty()) stack.pop();
            else if(!skip.contains(dir)) stack.push(dir);
        }
        String res="";
        List<String>list=new ArrayList<>(stack);
        res="/"+String.join("/"+list);
        return res.isEmpty()?"/":res;
    }
    public static void main(String []args)
    {
        System.out.println(simplifyPath("/home//foo/rocket//hell//aqua../.././level"));
    }
}
