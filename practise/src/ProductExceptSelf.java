public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] anwsers = new int[nums.length];
        anwsers[0] = 1;
        int [] l = new int[nums.length];
        int [] r = new int[nums.length];
        l[0] = 1;
        r[nums.length - 1] = 1;
        for(int i = 1, j = nums.length - 2; i < nums.length && j >= 0;i++, j--) {
            l[i] = l[i-1] * nums[i-1];
            r[j] = r[j+1] * nums[j+1];
        }
        for(int i = 0; i < nums.length; i ++){
            anwsers[i] = l[i] * r[i];
        }
        return anwsers;
    }

    public static void main(String[] args) {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        System.out.println(productExceptSelf.productExceptSelf(new int[]{1,2,3,4}));
    }
}
