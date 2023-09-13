import java.util.Scanner;

public class fibonacci_recursion {

    /* 
    public static void fib_num(int j,int i, int nxt, int sum, int ser_no) {
        
        if(j > ser_no)
        {
            return;
        }
        System.out.print(sum + " ");
        
        if(j == 1 || j == 2)
        {
            i = 0;
            nxt = 1;
        }
        else
        {
            i = nxt;
            nxt = sum;
        }
        sum = i + nxt;
        fib_num(j+1, i, nxt, sum, ser_no);

    }*/
    
    public static int fibo(int n)
    {
        //base condition
        if(n < 2)
        {
            return n;
        }
        
        //this is not the tail recursion
        //start counting fibonacci number from zero
        return fibo(n-1)+fibo(n-2);
    }
    public static void fib_num(int i, int nxt, int ser_no) 
    {
        
        if(ser_no == 0)
        {
            return;
        }
        int sum = i + nxt;
        System.out.print(sum + " ");
        
        //this is called tail recursion
        //this is the last function call
        fib_num(nxt, sum, ser_no-1);
    }


    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Enter the series number: ");
        int n = obj.nextInt();

        //fib_num(1, 0, 1, 0, n);
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        fib_num(a, b, n-2);
        System.out.println();
        System.out.println();

        System.out.println(fibo(n));

        obj.close();
    }
    
}
