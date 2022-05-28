import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayListfromArray {
    public static void main(String args[])
    {
        Element[]array=new Element[]{};//{new Element(1),new Element(2),new Element(3)};
        List<Element> list= Arrays.asList(array);
        System.out.println(list);
    }
}
