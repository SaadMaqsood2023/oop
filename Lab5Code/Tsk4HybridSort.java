//import java.util.Random;
import java.util.Scanner;

public class Tsk4HybridSort {
    
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int ind1 = si;
        int ind2 = mid+1;
        int x = 0;

        while(ind1 <= mid && ind2 <= ei)
        {
            if(arr[ind1]<arr[ind2])
            {
                merged[x++] = arr[ind1++];
            }
            else
            {
                merged[x++] = arr[ind2++];
            }
        }

        while(ind1 <= mid)
        {
            merged[x++] = arr[ind1++];
        }
        while(ind2 <= ei)
        {
            merged[x++] = arr[ind2++];
        }

        //Copy sorted array in original array
        for(int i=0, j=si; i<merged.length; i++,j++)
        {
            arr[j] = merged[i];
        }
        
        
    }

    public static void divide(int[] arr, int si, int ei) {

        //int l = ei - si + 1;
        if(si >= ei)
        {
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Random random = new Random();

        System.out.println("How many numbers you want to enter: ");
        int n = obj.nextInt();

        int arr[] = new int[n];
        //Taking random numbers as input
        for(int i=0; i<arr.length; ++i)
        {
            //arr[i] = random.nextInt(100);
            arr[i] = obj.nextInt();
        }

        //Output the unsorted list 
        System.out.println("The unsorted list is: ");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        divide(arr, 0, n-1);

        //int sort_arr = divide(arr,0,n);
        //int sort_arr = divide(arr, 0, n);

        //Sorted Array
        System.out.println("The sorted list is: ");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }


        obj.close(); 
    }
    
}
