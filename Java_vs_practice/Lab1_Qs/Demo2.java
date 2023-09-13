import java.util.Scanner;

public class Demo2 {
    static boolean is_even(int k)
    {
        int a=1;
        boolean ev_no= true;
        int result=k & a;
        if( result == 1)
        {
            ev_no = !ev_no;
        }
        return ev_no;
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = obj.nextInt();

        System.out.print("The number is even: ");
        System.out.print(is_even(n));

        obj.close();
    }
}
