import java.util.Arrays;

public class RotateArraySimple {

    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];
        k = k % n;  // In case k > n

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];  // Shift each element to right
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRight(nums, k);
        System.out.println("Right rotated by " + k + ": " + Arrays.toString(nums));
    }
}
