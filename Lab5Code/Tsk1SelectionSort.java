import java.util.Random;
import java.util.Scanner;


public class Tsk1SelectionSort {

    public static int[] selectionsort(int[] a)
    {
        int temp;
        for(int i=0; i<a.length-1; ++i)
        {
            int index = i;
            int flag = 0;
            for(int j=i+1; j<a.length; ++j)
            {
                //flag = 0;
                if(a[j] < a[index])
                {//if we compare it with temp it will not compare the updated value and keep on comparing with the first value
                    index = j;
                    flag = 1;
                }
            }
            if(flag == 0)
                {
                    //flag = 1;
                    //break;
                }
            
            temp = a[i];
            a[i] = a[index];
            a[index] =  temp;
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

        int[] sort_arr = selectionsort(arr);

        //Sorted Array
        System.out.println("The sorted list is: ");
        for(int i=0; i<sort_arr.length; ++i)
        {
            System.out.print(sort_arr[i] + " ");
        }

        obj.close();
    }
}
