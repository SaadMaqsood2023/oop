public class ReverseStrRecursion {

    public static String reverse(String s1, int lasti) {
        
        if(lasti == 0)
        {
            return ( "" +s1.charAt(lasti) );
        }
        //rev += s1.charAt(lasti);

        //reverse(s1, rev, lasti-1);
        //return rev;
        return ( s1.charAt(lasti) + reverse(s1, lasti-1) );
    }
    public static void main(String[] args) {
        String s = "abckl";

        System.out.print(reverse(s, s.length()-1 ));

    }
    
}
