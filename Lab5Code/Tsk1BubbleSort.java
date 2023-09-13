import java.util.Random;
import java.util.Scanner;

public class Tsk1BubbleSort
{
    public static int[] bubblesort(int[] a)
    {
        for(int i=0; i<a.length-1; ++i)
        {
            int flag = 0;
            //temp = a[i];
            for(int j=0; j<a.length-1-i; ++j)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            {//Always write this break condition outside the inner loop
                break;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many numbers you want to enter: ");
        int n = obj.nextInt();

        int arr[] = new int[n];
        //Taking random numbers as input
        for(int i=0; i<arr.length; ++i)
        {
            arr[i] = random.nextInt(100);
            //arr[i] = obj.nextInt();
        }

        //Output the unsorted list 
        System.out.println("The unsorted list is: ");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] sort_arr = bubblesort(arr);

        //Sorted Array
        System.out.println("The sorted list is: ");
        for(int i=0; i<sort_arr.length; ++i)
        {
            System.out.print(sort_arr[i] + " ");
        }


        obj.close();
    }
}