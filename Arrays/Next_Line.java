import java.util.Scanner;

public class Next_Line {
    public static void main(String[] args) {
        String s = "Hello! \n What are you doing \n Are you crazy";
        
        Scanner obj = new Scanner(s);

        System.out.print(obj.nextLine());
        //System.out.print(" " + "I am going to do it.");
        System.out.print(obj.nextLine());
        System.out.print(obj.nextLine());
        obj.close();
        /*Java Scanner's next() and nextLine() methods is that nextLine()
         * returns every character in a line of text right up until the 
         * cariage return, while next() splits the line up into individual 
         * words, returning individual text Strings one at a time.
         */
    }
}
