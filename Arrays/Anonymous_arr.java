public class Anonymous_arr {
    public static void main(String[] args) {
        sum(new int[]{13,15,17});
        sum(new int[][]{{10,20,30,40},{60,70}});
        
    }
    public static void sum(int[] num) {
        int total = 0;
        for(int i: num)
        {
            total += i;
        }
        System.out.println("Sum is: "+total);
    }
    public static void sum(int[][] num) {
        int total = 0;
        for(int i[]: num)
        {
            for(int j: i)
            {
                total += j;
            }
        }
        System.out.println("Sum is: "+total);
    }
}
