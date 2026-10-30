import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        k = k % n;
        if (k == 0) return;

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        Collections.reverse(list);
        Collections.reverse(list.subList(0, k));
        Collections.reverse(list.subList(k, n));

        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }
    }
}