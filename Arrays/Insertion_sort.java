import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        //int[] a = {5, 1, 6, 2, 4, 3};
        Scanner obj = new Scanner(System.in);
        System.out.print("How many numbers you want to print: ");
        int n = obj.nextInt();
        int[] a = new int[n];

        //Taking input
        for(int i=0; i<a.length; ++i)
        {
            a[i] = obj.nextInt();
        }
        //Sorting by insertion method
        int temp,j;
        for(int i=1; i<a.length; ++i)
        {
            temp = a[i];
            j = i;
            while(j>0 && a[j-1]>temp)
            {
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = temp;
        }

        //Print the array
        for(int i=0; i<a.length; ++i)
        {
            System.out.print(a[i] + " ");
        }

        obj.close();
    }
}
