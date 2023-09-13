package Arrays_Q;

import java.util.Scanner;

public class SqrtFnc {

    static int sqroot(int a)
    {
        int root = 1;
        int j=1;
        for(int i=1; i<=a/2; ++i)
        {
            for(int x=1; x<=i; ++x)
            {
                if(a%x == 0)
                {
                    a /= x;
                    root *= x;
                    if(x==j)
                    {
                        root = root/x;
                    }
                    //j = x; Problem is when the inner loop again starts with 1, j also becomes 1
                }
            }
            j = i; //Solution is write assign j a value of loop outside inner loop
        }
        return root;
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to find square root: ");
        int n1 = obj.nextInt();

        System.out.printf("The square root of %d is: %d",n1,sqroot(n1));


        obj.close();
    }
}
