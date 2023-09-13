import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        
        
        String s1 = "heart";
        String s2 = "earth";

        HashMap<Integer,String> map1 = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();
        boolean containsv = true;

        if(s1.length() == s2.length())
        {
            for(int i=0; i<s1.length(); ++i)
            {
                String str = "" + s1.charAt(i);   
                map1.put(i,str);        
            }
            for(int i=0; i<s2.length(); ++i)
            {
                String str1 = "" + s2.charAt(i);   
                map2.put(i,str1);        
            }
                for(int i=0; i<map1.size(); ++i)
            {
                if(!map2.containsValue(map1.get(i)))
                {
                    containsv = false;
                    break;
                }
            }
                if(containsv)
            {
                System.out.println("The two strings are anagram");
            }
            else
            {
                System.out.println("Not anagram");
            }
        }
        else
        {
            System.out.println("Length not same");
        }

        // for(Map.Entry<Integer,String> e: map1.entrySet())
        // {
        //     System.out.println(e.getValue());
        // }
        
        
       
        
    }
    
}
