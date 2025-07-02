public class Jump {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        if(1+nums[0] >= nums.length) return 1;
        int stepNum = 0, startPlace = 0, stageMax = 0;
        while(startPlace < nums.length) {
            stepNum++;
            if (1 + startPlace + nums[startPlace] >= nums.length) break;
            for(int i = 0; i <= nums[startPlace]; i++) {
                if(startPlace + nums[i + startPlace] >= nums[startPlace + stageMax]) stageMax = i;
            }
            startPlace += nums[stageMax];
            stageMax = 0;
        }
        return stepNum;
    }

    public static void main(String[] args) {
        Jump jump = new Jump();
        System.out.println(jump.jump(new int[]{2,1,1,1,1}));
        //2,3,1,1,4
    }
}
