class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') continue;
                int box = (r / 3) * 3 + (c / 3);
                // If any of these adds returns false, we've seen a duplicate
                if (!seen.add("row" + r + val) ||
                    !seen.add("col" + c + val) ||
                    !seen.add("box" + box + val)) {
                    return false;
                }
            }
        }
        return true;
    }
}
