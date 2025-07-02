import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int [] numsCopy = new int[nums.length];
        int count = 0;
        for (int num : nums) {
            if (num != val) {
                numsCopy[count++] = num;
            }
        }
        System.arraycopy(numsCopy, 0, nums, 0, count);
        return count;
    }

    public int removeElement1(int[] nums, int val) {
       int count = 0, right = 0;
       for (int left = 0; right < nums.length; right++) {
           if (nums[right] != val) {
               nums[left++] = nums[right];
               count++;
           }
       }
        return count;
    }


    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums1 = {3,2,2,3};
        System.out.println(removeElement.removeElement1(nums1,3));
    }
}
