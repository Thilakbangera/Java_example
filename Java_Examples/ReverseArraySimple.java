public class ReverseArraySimple {

    public static void reverse(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Original:");
        for (int num : nums) System.out.print(num + " ");

        reverse(nums);  // Reverse the array

        System.out.println("\nReversed:");
        for (int num : nums) System.out.print(num + " ");
    }
}
 