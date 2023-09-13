import java.util.Scanner;

public class task3 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("How many inputs you want to give: ");
        int no_in = obj.nextInt();

        int sqr_sum=0,input_no=no_in; // input_no is storing it for comparison later 
        while(input_no > 0)
        {
            System.out.println("Enter the number: ");
            int n1 = obj.nextInt();

            if(n1 < no_in)
            {
                n1 *= n1;
                sqr_sum += n1;
            }
            input_no--;
        }
        System.out.printf("Sum of squares of numbers less than %d are: %d",no_in,sqr_sum);
        obj.close();
    }
}
