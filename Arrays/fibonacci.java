import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the series number: ");
        int n= obj.nextInt();

        int m = 0;      // Previous number
        int nxt_num = 1;// Next number
        int sum = 0;    // Sum of previous and next number.

        if(n == 1)
        {
            System.out.println(sum);
        }
        else if(n == 2)
        {
            System.out.println(m + ", "+nxt_num);
        }
        else
        {
            System.out.print(sum + ", ");
            System.out.print(nxt_num + ", ");
            for(int i=1; i<=n-2; ++i)
            {
                /*if(n == 1)
                {
                    System.out.print(0);
                }*/
            
                sum = m + nxt_num;
                System.out.print(sum + ", ");
                m = nxt_num;
                nxt_num = sum;
            }
        }
        obj.close();
    }
    
}
