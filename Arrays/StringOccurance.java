public class StringOccurance {

    public static int first = -1;
    public static int last = -1;
    //Teachers method
    public static void findOccurance(String str, int idx, char element)
    {
        if(idx == str.length())
        {
            System.out.println("The first index is: "+first);
            System.out.println("The last index is: "+last);
            return;
        }

        char curChar = str.charAt(idx);
        if(curChar == element)
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }

    //My method
    public static void occurance(String s, int si, char c,int occ,int lastocc)
    {
        if(si == s.length())//if you do minus 1 last occurance will
        {                     //not be printed
            return;
        }
        if(s.charAt(si) == c)
        {
            occ++;
            if(occ == 1)
            {
                System.out.println("First occurance is: "+si);
            }
            lastocc = si;
        }
        if(si == s.length() - 1)
        {
        System.out.println("Last occurance is: "+lastocc);
        }
        occurance(s, si+1, c, occ, lastocc);
        
    }
    public static void main(String[] args) {
        
        String s1 = "abaacdaefaah";
        char c = 'a';
        //If we do backward traverse last occurence will come first.
        //If we do forward traverse first occurence will come first.
        
        //occurance(s1,0,c,0,0);
        findOccurance(s1, 0, c);
    }
}
