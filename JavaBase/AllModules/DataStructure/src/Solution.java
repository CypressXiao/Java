


import org.w3c.dom.ls.LSException;

import javax.lang.model.element.VariableElement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @ClassName Solution
 * @Description 回溯算法
 * @Author 肖榆柏
 * @Date 2022/5/22 21:45
 * @Version 1.0
 */

class Solution {

    public static void main(String[] args) {


    }

    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];
    }

    public static int dp(int[] nums, int loc) {
        if (loc >= nums.length) {
            return 0;
        }
        int sum = 0;
        sum += Math.max(dp(nums, loc + 1), dp(nums, loc + 2) + nums[loc]);
        return sum;
    }

    public void flatten(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        if (root == null) {
            return;
        }
        dfs(root, list);
        TreeNode pre;
        TreeNode cur;
        for (int i = 1; i < list.size(); i++) {
            pre = list.get(i - 1);
            cur = list.get(i);
            pre.left = null;
            pre.right = cur;
        }
    }

    public static void dfs(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        dfs(root.left, list);
        dfs(root.right, list);
    }

    public int getLongestPalindrome(String A) {
        if (A == null || A.length() == 0) {
            return -1;
        }
        int maxLen = 0;
        for (int i = 0; i < A.length(); i++) {
            int num = Math.max(fun1(A, i, i), fun1(A, i, i + 1));
            maxLen = Math.max(num, maxLen);
        }
        return maxLen;
    }

    public static int fun1(String s, int left, int right) {
        int res = 0;
        while (left <= right && s.charAt(left) == s.charAt(right)) {
            if (left == right) {
                res += 1;
            } else {
                res += 2;
            }
            left++;
            right--;
        }
        return res;
    }

    public int LCS(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int maxLen = 0;
        int[][] dp = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = 0;
                }
                maxLen = Math.max(dp[i + 1][j + 1], maxLen);
            }
        }
        return maxLen;
    }


    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = Math.max(fun(s, i, i), fun(s, i, i + 1));
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int fun(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        return right - left - 1;
    }

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(area, ans);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public int kthSmallest(TreeNode root, int k) {
        /*if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new PriorityQueue<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        list.addFirst(root);
        while (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.pollLast();
                if (node.left != null) {
                    list.addFirst(node);
                }
                if (node.right != null){
                    list.addFirst(node);
                }
                if(k>0){
                    k--;
                    queue.offer(node);
                }else{
                    TreeNode temp = queue.peek();
                    if(temp.val>node.val){
                        queue.poll();
                        queue.offer(node);
                    }
                }
            }
        }
        return queue.poll().val;*/
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            k--;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        //使用一个HashMap存储当前节点及其前一个父节点
        LinkedList<TreeNode> list = new LinkedList<>();
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        TreeNode node = root;
        list.addFirst(node);
        map.put(node, null);

        while (!map.containsKey(p) || !map.containsKey(q)) {
            TreeNode tn = list.pollLast();
            if (tn.left != null) {
                map.put(node.left, node);
                list.add(node.left);
            }
            if (tn.right != null) {
                map.put(node.right, node);
                list.add(node.right);
            }
        }
        HashSet<TreeNode> set = new HashSet<>();
        while (map.containsKey(p)) {
            set.add(p);
            p = map.get(p);
        }
        while (!set.contains(q)) {
            q = map.get(q);
        }
        return q;

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }

    public static int getNum(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '"') {
                count++;
            }
        }
        return count;
    }

    public static int solve(String s) {
        Stack<Integer> nums = new Stack<>(); // 存放操作数和中间计算结果
        char[] expr = s.toCharArray();
        // 初始数字
        int num = 0;
        // 初始运算符（让第一个数字直接入栈）
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = expr[i]; // 当前字符
            if (ch == ' ') continue; // 是空格，跳过
            if (Character.isDigit(ch)) { // 是数字，进行拼接
                num = num * 10 + (ch - '0');
            }
            if (ch == '(') { // 是左括号，应当进入递归
                // 找到当前左括号对应的右括号
                int j = i + 1;
                int count = 1;
                while (count > 0) { // count为0时的j即是对应右括号的索引
                    if (expr[j] == ')') count--;
                    if (expr[j] == '(') count++;
                    j++;
                }
                // 使用左右括号的对应索引进行递归，计算括号内表达式
                num = solve(s.substring(i + 1, j - 1));
                i = j - 1; // 计算完后更新索引（跳过计算完成的括号）
            }
            // 遇到符号，对操作数进行相应的处理后入栈（处理上一个符号）
            if (!Character.isDigit(ch) || i == s.length() - 1) {
                if (sign == '+') {
                    nums.push(num); // 上一个符号是加号，直接把操作数入栈
                } else if (sign == '-') {
                    nums.push(-1 * num); // 上一个符号是减号，操作数取反再
                } else if (sign == '*') {
                    nums.push(nums.pop() * num); // 上一个符号是乘号，把乘号前面的操作数取出来进行计算再入栈
                } else if (sign == '/') {
                    nums.push(nums.pop() / num); // 上一个符号是除号，把乘号前面的操作数取出来进行计算再入栈
                }
                sign = ch; // 把符号更新为当前符号
                num = 0; // 把操作数重置为零
            }
        }

        int res = 0;
        while (!nums.isEmpty()) {
            res += nums.pop(); // 栈内数据相加即是结果
        }
        return res;
    }

    public static int getMax(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort((o1, o2) -> o2 - o1);
        int num = 26;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i) * (num - i);
        }
        return sum;

    }


    //求最长公共子序列的问题
    public static int df(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        int num1 = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            num1 += df(s1, s2, i + 1, j + 1, dp) + 1;
        } else {
            num1 += Math.max(df(s1, s2, i + 1, j, dp), df(s1, s2, i, j + 1, dp));
        }
        return num1;
    }

    public static int distance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        //定义dp数组
        int[][] dp = new int[m + 1][n + 1];
        //状态初始化
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }
        //状态转移
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //如果相等，直接等于前一个位置的情况
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                /*
                如果不相等，要么B字符串插入A中i位置对应字符即dp[i][j]=dp[i-1][j]+1
                要么A字符串插入B中j位置对应字符即dp[i][j]=dp[i][j-1]+1，要么s1字符串
                i位置字符被s2字符串j位置字符替换，即dp[i][j]=dp[i-1][j-1]+1
                */
                else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[m][n];
    }



    /*public static void quickSort(int[] arr, int left, int right) {
            if (left > right) {
                return;
            }
            int l = left;
            int r = right;
            int base = arr[left];

            while (l < r) {
                while (arr[r] >= base && l < r) {
                    r--;
                }
                while (arr[l] <= base && l < r) {
                    l++;
                }
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
            arr[left] = arr[r];
            arr[r] = base;

            //递归
            quickSort(arr, left, r - 1);
            quickSort(arr, r + 1, right);
        }*/

//深度遍历
    /*public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
    }

    //广度遍历
    public void bfs(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }*/

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
}