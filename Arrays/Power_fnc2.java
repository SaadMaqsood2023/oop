import java.util.Scanner;

//Stack height = logn
public class Power_fnc2 {

    public static int power(int x, int n) {
        if(n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        
        //For even number
        if(n%2 ==0)
        {
            return (power(x, n/2) * power(x, n/2));
        }
        else//n is odd
        {
            return (power(x, n/2) * power(x, n/2) * x);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Stack height n means that number of function calls or stacks
        //are equal to power taken as input

        System.out.println("Enter the number: ");
        int x = obj.nextInt();

        System.out.println("Enter the power: ");
        int n = obj.nextInt();

        System.out.print(power(x, n));


        obj.close();
    }
}
