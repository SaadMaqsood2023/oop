package Arrays_Q;

public class F_E_array
{
    public static void main(String[] args) {
        
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        //Using for each loop to retrieve values from array
        for(int i : a)
        {
            System.out.println(i);
        }
    }
}