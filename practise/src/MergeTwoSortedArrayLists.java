import java.util.Arrays;

public class MergeTwoSortedArrayLists {
    //https://leetcode.cn/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150

//    示例 1：
//
//    输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    输出：[1,2,2,3,5,6]
//    解释：需要合并 [1,2,3] 和 [2,5,6] 。
//    合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
//    示例 2：
//
//    输入：nums1 = [1], m = 1, nums2 = [], n = 0
//    输出：[1]
//    解释：需要合并 [1] 和 [] 。
//    合并结果是 [1] 。
//    示例 3：
//
//    输入：nums1 = [0], m = 0, nums2 = [1], n = 1
//    输出：[1]
//    解释：需要合并的数组是 [] 和 [1] 。
//    合并结果是 [1] 。
//    注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n; i >= 0 && n > 0; i--) {
            if (m == 0) {
                nums1[i - 1] = nums2[--n];
            } else if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[i - 1] = nums1[--m];
            } else if (nums1[m - 1] <= nums2[n - 1]) {
                nums1[i - 1] = nums2[--n];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeTwoSortedArrayLists testObj = new MergeTwoSortedArrayLists();
//        int []nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
//        testObj.merge(nums1, 3, nums2, 3);
        int []nums3 = {1}, nums4 = {};
        testObj.merge(nums3, 1, nums4, 0);
    }



}
