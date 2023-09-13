public class recursion {
    public static void printNum(int i, int n) {
        if(i > n)
        {
            return;
        }
        System.out.println(i);
        printNum(i+1, n);
    }
    /*public static int factorial(int num) {
        if(num == 0)
        {
            return 1;
        }
        
        else
        {
            return (num * factorial(num - 1));
        }
    }*/

    public static int factorial(int n) { // 5,4,3,2,1
        if(n == 1 || n == 0)
        {
            return 1;
        }

        int fact_nm1 = factorial(n-1);//4,3,2,1
        int fact_n = n * fact_nm1;
        return fact_n;  // 1 
    }
    
    public static void main(String[] args) {
        //printNum(1, 7);
        int f = factorial(5);
        System.out.println(f);
    }
    
}
