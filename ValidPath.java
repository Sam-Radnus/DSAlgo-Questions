import java.util.*;
public class ValidPath {
    public static String simplifyPath(String path) {
        Deque<String>p=new LinkedList<>();
        Set<String>skip=new HashSet<>(Arrays.asList(".","..",""));
        String []str=path.split("/");
        for(String dir:path.split("/"))
        {
            System.out.println(dir);
            if(!p.isEmpty()&&dir.equals(".."))
                p.pop();
            else if(!skip.contains(dir))
                p.push(dir);
        }
        String res="";
        for(String dir:p)
        {
            res="/"+dir+res;
        }

        return (p.isEmpty())?"/":res;
    }
    public static void main(String args[])
    {
        System.out.println(simplifyPath("/home/state/./path//lame/"));
    }
}
