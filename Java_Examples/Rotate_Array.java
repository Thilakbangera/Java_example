public class Rotate_Array {
    public static void reverse(int[] nums,int start,int end){
        int i;
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        Rotate_Array obj=new Rotate_Array();
        obj.rotate(nums,k);
        for(int num:nums){
            System.out.println(num);
        }
    }
}