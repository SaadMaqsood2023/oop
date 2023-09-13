import java.util.Random;
import java.util.Scanner;


public class Tsk1InsertionSort {

    public static int[] insertionsort(int[] a)
    {
        int temp;
        for(int i=1; i<a.length; ++i)
        {
            int index = i, j=i;
            temp = a[i];
            for(index=i; index>0; index--)
            {
                //index = j;
                if(temp <= a[index-1])   //Each time we will compare temp not the indexes with each other
                {//Not index we have to compare every element with one key so we have to use temp for comparing
                    
                    //temp = a[index];
                    a[index] = a[index-1];  //a[3] = a[2], a[2] = a[1]
                    j = index - 1;          //Saving the index no because the number at this position exists twice (index & index-1)
                    //a[index-1] = temp;
                }
            }
            a[j] = temp;
            /*
            if(a[index] > a[i])
            {
                temp = a[i];
                a[i] = a[index];
                a[index] =  temp;
            }*/
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

        int[] sort_arr = insertionsort(arr);

        //Sorted Array
        System.out.println("The sorted list is: ");
        for(int i=0; i<sort_arr.length; ++i)
        {
            System.out.print(sort_arr[i] + " ");
        }

        obj.close();
    }
    
}
