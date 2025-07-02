import java.util.Arrays;

public class RotateArrayList {

    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || k == 0 ) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        k = k % nums.length;
        int[] numsRemap = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if (i < k) {
                numsRemap[i] = nums[nums.length - k + i];
            } else {
                numsRemap[i] = nums[i-k];
            }
        }
        nums = numsRemap.clone();
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        RotateArrayList rotateArrayList = new RotateArrayList();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //4,5,6,7,1,2,3
        rotateArrayList.rotate(nums, 8);
    }
}
