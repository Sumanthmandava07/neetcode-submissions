class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        int count = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {

                if (count > n / 3) {
                    res.add(nums[i - 1]);
                }

                count = 1;
            }
        }

        // Check the last group
        if (count > n / 3) {
            res.add(nums[n - 1]);
        }

        return res;
    }
}