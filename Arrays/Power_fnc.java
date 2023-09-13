import java.util.Scanner;

//STACK HEIGHT n
public class Power_fnc {

    /* MY METHOD 
    public static void power(int x, int i, int n, int pow) {

        if(i > n)
        {
            System.out.printf("Power %d times is: %d",n,pow);
            return;
        }
        power(x, ++i, n, pow*x);
    }*/

    //TEACHERS METHOD
    public static int power(int x, int n) {
        if(n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        //System.out.println(n); Statement for tracking the stack flow
        //int xpownm1 = power(x, n-1);    //Work
        //int xpown = x * xpownm1;
        //return xpown;
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = obj.nextInt();

        System.out.print("Give its power: ");
        int n = obj.nextInt();

        //My METHOD
        //power(x, 1, n,1); //number, index number, nth time,
                            //power value 
        //TEACHER METHOD
        System.out.print(power(x, n));

        obj.close();
    }
}
