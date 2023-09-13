public class RemoveDuplicateString {

    public static void removeDuplicate(String s, int Startindex, int count) 
    {
        // +1 to check for the duplicate of the second last element
        if(Startindex+1 >= s.length()) //
        { //After removing string Startindex can become larger than length
          //if we write count then the recursion will only perform one
          //one iteration or check/remove only first elements duplicate
            System.out.println("String after removing duplicate is: ");
            System.out.println(s);
            return;
        }
        if(count >= s.length() && Startindex<s.length()-1){
            count = Startindex + 2;
            removeDuplicate(s, Startindex+1, count);
            return;     //Without return, the compiler was also executing
        }               //the next lines after returning to from where it was called.

        char c = s.charAt(Startindex);
        
        if(c != s.charAt(count))  //when count is equal to length of string it gives error
        {
            removeDuplicate(s, Startindex, ++count);
        }
        //if(c == s.charAt(count))
        else
        {
            String nstring = "";
            for(int i=0; i<s.length(); ++i)
            {
                if(i != count)
                {
                    nstring += s.charAt(i);
                }

            }
            count = Startindex + 2;  //First 0+2
            removeDuplicate(nstring, Startindex+1,count);

        }

    }
    public static void main(String[] args) {
        String myString = "abbccda";

        //String myString = "aabbccddeeffghgh";
        //String myString = "abcdef";
        removeDuplicate(myString, 0, 1);
        //we have passed count as 1 to start comparing first element with 
        // second element and then using count = Startindex + 2 we will 
        //compare second and third element and so on.
    }
}
