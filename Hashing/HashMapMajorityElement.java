import java.util.*;

public class HashMapMajorityElement
{
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};

        HashMap<Integer,Integer> mmap = new HashMap<>();
        

        for(int i=0; i<nums.length; ++i)
        {
            if(mmap.containsKey(nums[i]))
            {
                mmap.put(nums[i], mmap.get(nums[i]) + 1);
            }
            else
            {
                mmap.put(nums[i], 1);
            }
            
        }

        System.out.println(mmap);

        for(Map.Entry<Integer,Integer> e: mmap.entrySet())
        {
            if(e.getValue() > nums.length / 3)
            {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }


    }
}