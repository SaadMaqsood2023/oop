import java.util.Scanner;

public class Selection_sort2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int[] a = {38,52,9,18,6,62,13};

        int temp, Smallest_no_index;
        for(int i=0; i<a.length; ++i)
        {
            Smallest_no_index = i;            //Smallest value index no 
            for(int j=i+1; j<a.length; ++j)
            {
                if(a[Smallest_no_index] > a[j])
                {
                    //prev_val = j;      // Smallest value
                    Smallest_no_index = j;
                }
                
            }
            temp = a[i];
            a[i] = a[Smallest_no_index];
            a[Smallest_no_index] = temp;
                
        }

        //String array;
        String[] s = {"saad","amin","sawaiz","bilal","hassam"};
        String temps="";
        int Smallest_S_index;
        for(int i=0; i<s.length; ++i)
        {
            Smallest_S_index = i;            //Smallest value index no 
            for(int j=i+1; j<s.length; ++j)
            {
                if(s[Smallest_S_index].compareTo(s[j]) > 0)//s[Sm] > s[j]
                {
                    //prev_val = j;      // Smallest value
                    Smallest_S_index = j;
                }
                
            }
            temps = s[i];
            s[i] = s[Smallest_S_index];
            s[Smallest_S_index] = temps;
                
        }


        //Printing Output for String
        for(int i=0; i<s.length; ++i)
        {
            System.out.print(s[i] + " ");
        }

        obj.close();
    }
    
}
