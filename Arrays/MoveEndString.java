public class MoveEndString {

    //public static int count;
    public static void MoveElement(String s, char element, int index, String rev1, String rev2)
    {
        if(index == s.length())
        {
            rev1 += rev2;
            System.out.println("String is: "+rev1);
            return;
        }
        if(s.charAt(index) != element)
        {
            rev1 += s.charAt(index);
            MoveElement(s, element, index+1, rev1,rev2);
        }
        else
        {
            rev2 += s.charAt(index);
            MoveElement(s, element, index+1, rev1,rev2);
        }
        //MoveElement(s, element, index+1, rev1,rev2);
    }
    public static void main(String[] args) {
        String s = "axbcxxd";

        MoveElement(s, 'x', 0, "", "");

    }
}
