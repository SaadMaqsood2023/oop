public class Three_D_arr {
    public static void main(String args[])
    {
        /* 
        int[][][] a = new int[2][][];

        a[0] = new int[2][];
        a[0][0] = new int[3];
        a[0][1] = new int[2];

        a[1] = new int[2][];
        a[1][0] = new int[3];
        a[1][1] = new int[2];
        */
        int[][][] a = { 
            { {10,20,30,40},{50,60},{70,80,90}},//0
            { {10,20,30,40},{50,60},{70,80,90}} //1
        };
        //System.out.println(a);
        //System.out.println(a[0]);
        //System.out.println(a[0][0]);
        //System.out.println(a[0][0][0]);

        for(int i=0; i<a.length; ++i)
        {
            for(int j=0; j<a[i].length; ++j)
            {
                for(int k=0; k<a[i][j].length; ++k)
                {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }


    }
}
