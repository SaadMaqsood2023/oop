package Arrays_Q;

import java.util.Scanner;

public class Remove_Punc {
    static String punctuation(String s1)
    {
        String s3 = s1;
        for(int i=0; i<s1.length(); ++i)
        {
            char c = s1.charAt(i);
            if(c == '.' || c == '?' || c == ',' || c == '!' || c == '\"' || c == ':' || c == ';' || c == '\'' || 
            c == '-' || c == '/' || c == '(' || c == ')' || c == '[' || c == ']' )
            {
                //String s2 = Character.toString(c);
                s3 = s1.replaceAll("\\p{Punct}","");   //1
                /*s3 = s1.replace("?","");
                s3 = s1.replace(",","");
                s3 = s1.replace("!","");
                s3 = s1.replace("\"","");  //5
                s3 = s1.replace(":","");
                s3 = s1.replace(";","");
                s3 = s1.replace("-","");
                s3 = s1.replace("/","");
                s3 = s1.replace("(","");  //10
                s3 = s1.replace(")","");
                s3 = s1.replace("[","");
                s3 = s1.replace("]","");
                s3 = s1.replace("\'",""); //14 */
            }

        }
        return s3;
    }
    static String removePunctuations(String s1)
    {
        //return s1.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]","");
        return s1.replaceAll("[<=>?@\\[\\]^_`{|}~!\"#$%&'()*+,-./:;\\\\]","");
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the String to remove Punctuation: ");
        String s = obj.nextLine();

        System.out.printf("Without punctuation your text will be: \n%s",removePunctuations(s));

        System.out.println();
        obj.close();
        // regex syntax website: 
    }
}
