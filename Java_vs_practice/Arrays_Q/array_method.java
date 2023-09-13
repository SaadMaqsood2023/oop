package Arrays_Q;

public class array_method {

    static void max_num(int n[])
    {
        int big_no = n[0];
        for(int i: n)
        {
            if(big_no<i)
            {
                big_no = i;
            }
        }
        System.out.println(big_no);
    }
    
    //array returning method
    static int[] get()
    {
        return new int[]{37,43,44,50,45};
    }
    public static void main(String args[])
    {
        int mid_num[] = {44,43,37,45,50};

        max_num(mid_num);  //While passing array in the method you do not need []
        max_num(new int[]{39,38,39,47,44}); //passing anonymous array to method

        //retrieving array from the method
        int numbers[]= get();
        for(int i: numbers)
        {
            System.out.println(i);
        }
    }
    
}
