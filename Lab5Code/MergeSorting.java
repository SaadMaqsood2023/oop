import java.util.Scanner;

public class MergeSorting {

    int[] array;        //values are stored in this reference variable
    int[] tempMergeArr;
    int length;

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("How many numbers you want to enter: ");
        int n = obj.nextInt();

        int inputArr[] = new int[n];
        //Taking numbers as input
        for(int i=0; i<inputArr.length; ++i)
        {
            inputArr[i] = obj.nextInt();
        }

        //Output the unsorted list 
        System.out.println("The unsorted list is: ");
        for(int i=0; i<inputArr.length; ++i)
        {
            System.out.print(inputArr[i] + " ");
        }
        System.out.println();

/*------------------------------------------------------------------------ */
        //int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
        //Making object
        MergeSorting ms = new MergeSorting();

        //Passing the array to sort method for sorting 
        ms.sort(inputArr);


        //Printing the sorting array
        for(int i: inputArr)
        {
            System.out.print(i + " ");
        }
        
        obj.close();
    }

    public void sort(int inputArr[])
    {
        //Initializing field variable of array
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int si, int ei) 
    {
        //this method will work in a recursive way

        if(si < ei)
        {
            int middle = si + (ei - si)/2;

            //It will sort the left side of an array
            divideArray(si, middle);

            //It will sort the right side of an array
            divideArray(middle+1, ei);

            mergeArray(si, middle, ei);
        }
    }

    public void mergeArray(int si, int mid, int ei) 
    {
        for(int i=si; i <= ei; ++i)
        {
            //Saving all the elements of array in temporary array
            tempMergeArr[i] = array[i];
        }

        //Saving the index value in other variables
        int i = si;
        int j = mid + 1;
        int k = si;

        //Assigning the sorted numbers to the original array
        while(i<=mid && j<=ei)
        {
            if(tempMergeArr[i] <= tempMergeArr[j])
            {
                array[k] = tempMergeArr[i++];
            }
            else
            {
                array[k] = tempMergeArr[j++];
            }
            k++;
        }

        //Assigning the remaing numbers to the original array
        while(i<=mid)
        {
            array[k++] = tempMergeArr[i++];
        }
        while(j<=ei)
        {
            array[k++] = tempMergeArr[j++];
        }

    }
    
}
