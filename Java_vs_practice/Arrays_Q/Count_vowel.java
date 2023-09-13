package Arrays_Q;

import java.util.Scanner;

public class Count_vowel {

    static int no_of_vow(String a)
    {
        int count = 0;
        
        for(int i=0; i<a.length(); ++i)
        {
            char l = a.charAt(i);
            if(l == 'a' || l == 'e' || l =='i' || l =='o' || l == 'u'
                || l=='A' || l == 'E' || l =='I' || l =='O' || l == 'U')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the string to count vowels: ");
        String s = obj.nextLine();
        System.out.printf("The number of vowels in the String is: %d",no_of_vow(s));

        obj.close();
    }
}
