package Arrays_Q;

public class array_2d {
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3]; // Declaring and intantiation
        matrix[0][0] = 1;               // initialization
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for(int i=0; i<matrix.length; ++i)
        {
            for(int j=0; j<matrix.length; ++j)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Array: ");
        int num[][]= {{3,8,2},{2,7,4},{6,0,1}};
        for(int i=0; i<num.length; ++i)
        {
            for(int j=0; j<num.length; ++j)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}
