import java.util.Scanner;

public class Merge_sort {

    //Conquer Method
    public static int[] conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;

        while(idx1 <= mid && idx2 <= ei)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x++] = arr[idx1++];    //assigning the element to the merged array 
                //x++; idx1++;
            }
            else
            {
                merged[x++] = arr[idx2++];
                //x++; idx2++;
            }
        }

        while(idx1 <= mid)
        {
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei)
        {
            merged[x++] = arr[idx2++];
        }

        //copy sorted array in original array 
        for(int i=0, j = si; i<merged.length; i++,j++)
        {
            arr[j] = merged[i];
        }

        return arr;

    }

    //Method Divide
    public static void divide(int arr[], int si, int ei) {
        if(si >= ei)
        {
            return;
        }

        // mid (si + ei)/2 The problem with this is if both ei and si are 
        // big numbers they can result in bigger index value
        int mid  = si + (ei - si)/2;
        
        divide(arr,si,mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    //Main Function
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.print("Enter the size of the array: ");
        int s = obj.nextInt();

        int arr[] = new int[s];
        //int n = arr.length;
        //Taking input
        for(int i=0; i<arr.length; ++i)
        {
            arr[i] = obj.nextInt();
        }

        divide(arr,0,s-1);

        //Output 
        //for(int i=0; i<s; ++i)
        //{
        //    System.out.print(arr[i] + " ");
        //}

        obj.close();
    }
}
