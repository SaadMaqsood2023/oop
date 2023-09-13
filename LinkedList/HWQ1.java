import java.util.LinkedList;
import java.util.Scanner;

public class HWQ1 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        LinkedList<Integer> list = new LinkedList<>();

        //System.out.println("Enter five elements: ");
        /*for(int i=1; i<=5; ++i)
        {
            list.add(obj.nextInt());
        }*/
        list.add(13);
        list.add(27);
        list.add(7);
        list.add(39);
        list.add(48);
        list.add(23);
        list.add(9);
        list.add(30);
        list.add(25);
        System.out.println(list);

        for(int i=0; i<list.size(); ++i)
        {
            if(list.get(i) > 25)
            {       //when remove an element decrement i to return
                    //to same index and check the next element 
                list.remove(i--);   //otherwise next element will
            }                       //go unnoticed
        }
        System.out.println(list);


        obj.close();
    }
    
}
