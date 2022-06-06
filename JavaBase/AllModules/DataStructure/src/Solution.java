
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description 回溯算法
 * @Author 肖榆柏
 * @Date 2022/5/22 21:45
 * @Version 1.0
 */

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        Solution s = new Solution();

    }

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        //递归加回溯算法
        //首先找到退出条件:list的size == nums.length退出
        //然后找到递归回溯不包含重复元素的写法
        dfs(nums);
        return res;
    }
    public void dfs(int[] nums){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
            dfs(nums);
            list.remove(list.size() - 1);
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}