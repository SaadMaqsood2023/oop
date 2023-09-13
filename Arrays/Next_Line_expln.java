import java.util.Scanner;

public class Next_Line_expln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();// Reads int value and the cursor remain just after the integer 
        //OR n = Integer.parseInt(sc.nextLine());     take the value in String then parse it in integer using wrapper class
        //sc.nextLine();
        System.out.println("Enter a string: ");
        String s = sc.nextLine(); //Reads string value from where cursor was left by the nextInt().
        //to read string value from the next line you have to use nextLine method of scanner object.
        /*
         * There are two ways to solve this problem. You can either consume the newline character after the scanner.nextInt() call  * *  takes place, or you can take all the inputs as strings and parse them to the correct data type later on.
         */

        System.out.println("String is: "+s);
        System.out.println("Number is: "+n);

        sc.close();
    }
    
}
