
import java.util.Scanner;

public class MyMath
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = obj.nextInt();

        System.out.printf("Enter the number to check if it is factor of %d: ",n);
        int m = obj.nextInt();

        System.out.println();
        System.out.print(is_multiple(n,m));

        obj.close();
    }

    static boolean is_multiple(int a, int b)
        {
            boolean check = false;
            if(a%b==0)
            {
                check = true;
                return check;
            }
            return check;
        }
}