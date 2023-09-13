package Arrays_Q;

public class test_array{
    public static void main(String args[])
    {
        int arr[] = new int[5];//declaration, instantiation 
        arr[0]= 50; //and initialization
        arr[1]= 45;
        arr[2]=43;
        arr[3]=44;
        arr[4]=37;
        //int arr[] = {3,4,1,5,8}; // declaration, instantiation and initialization in a single line
        /*Syntax for foreach loop: 
         *for(int i : arrName)
         {
            System.out.println(i); This loop is going to print all values one by one.
         }
         */
        System.out.println("My Second semester mid term marks: ");
        for(int i:arr)
        {
            System.out.println(i);
        }
        int[] mymarks = {44,47,38,39,39};

        System.out.println("My Second semester final term marks: ");
        for(int i: mymarks)
        {
            System.out.println(i);
        }
        
    }
}