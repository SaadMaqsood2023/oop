import java.util.Scanner;

public class Max_row_2d {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the rows of matrix: ");
        int r = obj.nextInt();
        System.out.print("Enter the columns of matrix: ");
        int c = obj.nextInt();

        //Taking Input
        int[] a[] = new int[r][c];
        for(int i=0; i<a.length; ++i)
        {
            System.out.printf("Give numbers for row %d \n",i+1);
            for(int j=0; j<a[i].length; ++j)
            {
                a[i][j] = obj.nextInt();
            }
        }
        //Displaying Matrix
        System.out.println("The matrix is: ");
        for(int i=0; i<a.length; ++i)
        {  
            for(int j=0; j<a[i].length; ++j)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //Maximum number of the row
        for(int i=0; i<a.length; ++i)
        {
            System.out.printf("Maximum number of row %d is: %d \n",i+1,getMax(a[i]));
        }
        int max_num = 0;
        /* 
        for(int i=0; i<a.length; ++i)
        {  
            max_num = a[i][0];
            for(int j=0; j<a[i].length; ++j)
            {
                if(a[i][j] > max_num)
                {
                    max_num = a[i][j];
                }
            }
            System.out.printf("Maximum number of row %d is: %d \n",i+1,max_num);
        }*/

        //Maximum number of the column
        //for moving row to row in a same column you have to write column loop outside
        //and rows loop inside
        for(int i=0; i<a[i].length; ++i) //columns 
        {  
            max_num = a[0][i];
            for(int j=0; j<a.length; ++j) //rows 
            {
                if(a[j][i] > max_num)
                {
                    max_num = a[j][i];
                }
            }
            System.out.printf("Maximum number of col %d is: %d \n",i+1,max_num);
        }
        

        obj.close();
    }
    public static  int getMax(int a[]) {
        
        int max = a[0];
        for(int i=0; i<a.length; ++i)
        {
            max = (max < a[i])? a[i]: max;
        }
        return max; 
    }
    
}
