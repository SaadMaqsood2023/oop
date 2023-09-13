import java.util.Scanner;

public class palindrome {
    static boolean is_palinrome(String a)
    {
        boolean check = false;
        String s2 = "";
        for(int i=a.length()-1; i>=0; --i){
            //String s2 = "";
            s2 = s2 + a.charAt(i);
            //System.out.println(s2);
        }
        if(s2.toLowerCase().equals(a.toLowerCase())){
            check = !check;
        }
        return check;
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the string to check for palindrome.");
        String s1 = obj.nextLine();

        //is_palinrome(s1);
        System.out.printf("String %s is palindrome: %b",s1,is_palinrome(s1));
        obj.close();
    }
}
