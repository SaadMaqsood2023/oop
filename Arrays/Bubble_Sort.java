import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //int arr[] = {36,19,29,12,5};
        //Taking input
        int arr[] = new int[5];
        System.out.println("Enter five numbers: ");
        for(int i=0; i<arr.length; ++i)
        {
            arr[i] = obj.nextInt();
        }

        //Sorting the array
        int temp;
        int flag = 0;
        for(int i=0; i<arr.length; ++i)         // After one complete round one element will be at the end either 
        {                                       // largest in ascending order or smallest in descending order so you don't need to check it then
            for(int j=0; j<arr.length - 1 - i; ++j) //You don't need to check the last element as no element is after it.
            {
                if(arr[j] > arr[j+1]) // Just change this sign to make ascending or descending order
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;         // We use flag so that if array is already sorted we don't check again 
                }                     // And terminate and don't iterate further. This makes program efficient.
            }
            if(flag == 0)
            {
                break;
            }
        }

        //Printing the sorted array
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        obj.close();
    }
    
}
