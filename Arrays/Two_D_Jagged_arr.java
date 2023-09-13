public class Two_D_Jagged_arr {
    public static void main(String[] args) {
        /* 
        int[][] a = { {10,20,30,40},{50,60},{70,80,90}};
        //System.out.println(a); //Prints class name
        //System.out.println(a[0]); //Prints whole array row
        System.out.println(a[0][0]); //Prints 10
        System.out.println(a.length); // Prints 3
        System.out.println(a[0].length); // Prints 4
        //System.out.println(a[0][0].length); Prints error
        System.out.println();

        for(int i=0; i<a.length; ++i)
        {
            for(int j=0; j<a[i].length; ++j)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        */
        int[][] a = new int[2][];
        a[0] = new int[3]; // Assigning 3 columns to first row
        a[1] = new int[2]; // Assigning 2 columns to second row
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        System.out.println(a[0]); // Prints class name with single [I@
    }
}
