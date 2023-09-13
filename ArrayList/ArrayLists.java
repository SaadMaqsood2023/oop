import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists
{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        //Add elements
        list.add(2);
        list.add(8);
        list.add(17);

        System.out.println(list);

        //Get elements
        int element = list.get(0);
        System.out.println(element);

        //Add elements in between
        list.add(1,1);
        System.out.println(list);

        //Set element (to change the element that is already there)
        list.set(2,5);
        System.out.println(list);

        //Delete an element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); ++i)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}