public class Checksort {
    public static boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
            
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};  // true
        int[] nums2 = {2, 1, 3, 4};     // false

        System.out.println(check(nums1));  // Output: true
        System.out.println(check(nums2));  // Output: false
    }
}
