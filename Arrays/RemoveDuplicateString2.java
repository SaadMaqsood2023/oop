public class RemoveDuplicateString2 {

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String string)
    {
        if(idx == str.length())
        {
            System.out.println(string);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']==true)
        {
            removeDuplicates(str, idx+1, string);
        }
        else
        {
            string += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, string);
        }
    }

    public static void main(String[] args) 
    {
     
        String str = "abcdaad";
        removeDuplicates(str, 0, "");
    }
}
