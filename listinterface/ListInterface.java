package listinterface;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
       List<Integer>list = new ArrayList<Integer>(); 

       list.add(2);
       list.add(6);
       list.add(10);
       list.add(4);
       list.add(8);
       list.add(12);
       System.out.println("List is"+list);
       list.add(4,444);
       list.remove(6);
       System.out.println("New List is"+list);
       System.out.println("List contains is"+list.contains(8));
    }
}
