package Arrays_Q;

public class second_array {
    public static void main(String args[])
    {
        int arr[] = {7,3,4,9,13,23,2,34,0,8};
        //int arr[] = new int[5];
        int h_no;
        h_no = arr[0];
        System.out.println(h_no);
        for(int i=0; i<arr.length; ++i)
        {
            if(h_no < arr[i])
            {
                h_no = arr[i];
            }
        }
        int sec_h = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] == h_no)
            {
                continue;
            }
            else if(sec_h < arr[i])
            {
                sec_h = arr[i];
            }
        }
        System.out.println("The highest value is: " + h_no);
        System.out.println("The second highest value is: " + sec_h);
    }
    
}
