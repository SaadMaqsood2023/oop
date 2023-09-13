import java.util.Scanner;

public class Sum_row_2d {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the rows of matrix: ");
        int r = obj.nextInt();
        System.out.print("Enter the columns of matrix: ");
        int c = obj.nextInt();

        int[] a[] = new int[r][c];
        for(int i=0; i<a.length; ++i)
        {
            System.out.printf("Give numbers for row %d \n",i+1);
            for(int j=0; j<a[i].length; ++j)
            {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<a.length; ++i)
        {  
            for(int j=0; j<a[i].length; ++j)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.println("The sum of rows is: ");
        for(int i=0; i<a.length; ++i)
        {
            sum = 0;
            System.out.printf("Sum for row %d is: ",i+1);
            for(int j=0; j<a[i].length; ++j)
            {
                sum += a[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("The sum of Columns is: ");

        for(int i=0; i<a.length; ++i)
        {
            sum = 0;
            System.out.printf("Sum for col %d is: ",i+1);
            for(int j=0; j<a[i].length; ++j)
            {
                sum += a[j][i];
            }
            System.out.println(sum);
        }

        obj.close();
    }

}
