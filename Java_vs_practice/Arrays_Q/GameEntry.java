package Arrays_Q;
import java.util.Scanner;

public class GameEntry{
    int score;
    GameEntry(int a)
    {
        score = a;
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        //Integer  num[] = new Integer[4];
        
        GameEntry A[] = new GameEntry[5];
        System.out.println("Enter the five scores of game: ");

        A[0] = new GameEntry(obj.nextInt());
        A[1] = new GameEntry(obj.nextInt());
        A[2] = new GameEntry(obj.nextInt());
        A[3] = new GameEntry(obj.nextInt());
        A[4] = new GameEntry(obj.nextInt());

        System.out.println("The copied array objects are: ");
        GameEntry B[] = new GameEntry[5];
        
        for(int i=0; i<A.length; ++i)
        {
            //B[i].score = A[i].score; It is giving NullPointerException
            B[i] = A[i];
        }

        for(GameEntry game: B)
        {
            System.out.println(game.score);
        }

        obj.close();
    }
}