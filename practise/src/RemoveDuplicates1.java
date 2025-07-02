public class RemoveDuplicates1 {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = left + 2; right < nums.length;) {
            if (nums[left] == nums[left + 1] && nums[left + 1] == nums[right]) {
                nums[left + 1] = nums[right];
                right++;
            } else if (nums[left] == nums[left + 1] && nums[left + 1] != nums[right]) {
                nums[left + 2] = nums[right++];
                left += 2;
            }
            while (nums[left] > nums[left + 1]) {
                nums[++left] = nums[right++];
            }
        }
        return left+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates1 removeDuplicates = new RemoveDuplicates1();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
