import java.util.HashSet;
import java.util.Set;
public class duplication {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int index=0;
        for(int num:nums){
            if (!set.contains(num)) {
            set.add(num);
            nums[index++]=num;
        }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,5,5,5};
        duplication obj=new duplication();
        int uniqueindex=obj.removeDuplicates(nums);
        System.out.println(uniqueindex);
        for (int i = 0; i < uniqueindex; i++) {
            System.out.println(nums[i]);
            
        }
        
    }
    
}
