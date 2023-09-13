import java.util.LinkedList;

public class L_L_Demo {
    public static void main(String[] args) {
        
        LinkedList<String>  link = new LinkedList<>();

        link.add("Amir");
        link.add("Ramis");
        link.add("105");
        link.add("432.8");

        for(int i=0; i<link.size(); i++)
        {
            //getting values and also we search using this method
            System.out.print(link.get(i)+" -> ");
        }
        System.out.println("null");
        link.remove(2);

        System.out.println(link);
    }
}
