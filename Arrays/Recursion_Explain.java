import java.util.Scanner;

public class Recursion_Explain {
    public static void printSum(int i, int a, int sum) {
        if(i > a)
        {
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,a,sum);
        System.out.print(i + " "); //Compiler will print the value of i at that stack level
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = obj.nextInt();

        printSum(1, a, 0);
        obj.close();
    }
}
