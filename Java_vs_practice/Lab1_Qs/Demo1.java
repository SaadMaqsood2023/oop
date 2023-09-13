import java.util.Scanner;

public class Demo1 {
    
    static boolean is_even(int k)
    {
        boolean ev_no=true;
        for(int i=1; i<=k; ++i){
            ev_no = !ev_no;
        }
        return ev_no;
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number to find either it is even or odd: ");
        int num = obj.nextInt();
        System.out.print("Number is even: ");
        System.out.print(is_even(num));
        obj.close();
    }
}