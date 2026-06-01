class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            result.add(generateRows(i));
        }
        return result;
    }
    private List<Integer> generateRows(int r) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(ans);

        for (int col = 1; col < r; col++) {
            ans = ans * (r - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }
}