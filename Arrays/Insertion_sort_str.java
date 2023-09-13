import java.util.Scanner;

public class Insertion_sort_str {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("How many string values you want to give: ");
        int n = obj.nextInt();
        obj.nextLine();

        String[] s1 = new String[n];

        //Taking the input
        for(int i=0; i<s1.length; ++i)
        {
            s1[i] = obj.nextLine();
        }

        String temp;
        int j;
        for(int i=1; i<s1.length; ++i)
        {
            temp = s1[i];
            j = i;
            while(j>0 && s1[j-1].compareTo(temp)>0)
            {
                //temp = s1[j];
                s1[j] = s1[j-1];    //5 3 4 1, 3 4 5 1
                //s1[j-1] = temp;
                j = j - 1;
            }
            //temp = s1[i-1];
            //s1[i - 1] = s1[j];
            s1[j] = temp;
        }

        //Displaying the sorted string
        for(int i=0; i<s1.length; ++i)
        {
            System.out.print(s1[i] + " ");
        }


        obj.close();
    }
    
}
