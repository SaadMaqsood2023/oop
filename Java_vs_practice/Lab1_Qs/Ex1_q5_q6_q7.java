

import java.util.Scanner;

public class Ex1_q5_q6_q7 {

    static int sum_positive(int n)
    {
        int t = 0;
        for(int i=1; i<=n; ++i)
        {
            t += i;
        }
        return t;
    }

    static int sum_odd_positive(int n)
    {
        int t = 0;
        for(int i=1; i<=n; ++i)
        {
            if(i%2==1)
            {
                t += i;
            }
        }
        return t;
    }

    static int sum_square_positive(int n)
    {
        int t = 0;
        for(int i=1; i<= n; ++i)
        {
            t += i*i;
        }
        return t;
    }

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = ob.nextInt();

        System.out.printf("Sum of positive numbers up to that %d is: ",num);
        System.out.println();
        System.out.println(sum_positive(num));

        System.out.printf("Sum of odd positive numbers up to that %d is: ",num);
        System.out.println();
        System.out.println(sum_odd_positive(num));

        System.out.printf("Sum of square of positive numbers up to that %d is: ",num);
        System.out.println();
        System.out.println(sum_square_positive(num));

        ob.close();
    }
}
