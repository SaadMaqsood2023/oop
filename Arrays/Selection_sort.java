import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //int[] a = {38,52,9,18,6,62,13};

        //Taking input
        System.out.print("How many numbers you want to enter: ");
        int n = obj.nextInt();
        int[] a = new int[n];

        System.out.println("Give numbers: ");
        for(int i=0; i<a.length; ++i)
        {
            a[i] = obj.nextInt();
        }



                                    //MY Technique
        //int fst_val;        //First Value
        int prev_val;
        int temp, Smallest_no_index;
        for(int i=0; i<a.length-1; ++i)
        {
            //fst_val = a[i];
            prev_val = a[i+1];  //temporary value for storing small value
            Smallest_no_index = i+1;            //Smallest value index no 
            for(int j=i; j<a.length-1; ++j)
            {
                if(prev_val > a[j+1])
                {
                    prev_val = a[j+1];      // Smallest value
                    Smallest_no_index = j+1;
                }
                if(a[i] > prev_val && j == a.length - 2)
                {
                    temp = a[i];
                    a[i] = a[Smallest_no_index];
                    a[Smallest_no_index] = temp;
                }
            }
            
        }
                            //Teacher Technique
        /* 
         * int[] = {38,52,9,18,6,62,13};
         * int min; int temp=0;
         * for(int i=0; i<a.length; i++)
         * {
         *     min = i;
         *     for(int j=i+1; j<a.length; j++)
         *      {
         *          if(a[j]<a[min])
         *          {
         *              min = j;
         *          }
         *      }
         *      temp = a[i];
         *      a[i] = a[min];
         *      a[min] = temp;
         * }
         */

        //Printing Output
        for(int i=0; i<a.length; ++i)
        {
            System.out.print(a[i] + " ");
        }

        obj.close();
    }
    
}
