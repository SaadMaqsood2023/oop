import java.util.Scanner;

public class factorial {
    public factorial()
    {
        
    }
    static int calc_fact(int a)
    {
        int r=1;
        for(int i=2; i<=a; ++i)
        {
            r *= i;
        }
        return  r;
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Input number to find factorial: ");
        int num = obj.nextInt();
        //int result = f
        System.out.printf("The factorial of %d is: %d",num,calc_fact(num));

        obj.close();
    }
}
