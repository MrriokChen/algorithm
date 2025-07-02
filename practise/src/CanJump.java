public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums.length == 0 || nums[0] == 0) return false;
        int maxDistance = 0;
        for (int i = 0; i< nums.length; i++) {
            if(nums[i] == 0 && i >= maxDistance -1) break;
            if(nums[i]>= nums.length-1 || i + nums[i] >= nums.length) return true;
            if(1 + i + nums[i] >= maxDistance) maxDistance = 1 + i + nums[i];
            else if(i > maxDistance) maxDistance += 1;
        }

        return maxDistance >= nums.length;
    }

    public static void main(String[] args) {
        CanJump canJump = new CanJump();
        System.out.println(canJump.canJump(new int[]{1,1,1,0}));
        //1,1,1,0 max = 1 + 1 + 1  4
        //1,1,0,1 max = 1 + 1 3
        //1,2,0,1  4
        //3,2,1,0,4 4
        //3,0,8,2,0,0,1
    }
}
