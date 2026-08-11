class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int row = -1;

        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (target > matrix[mid][cols - 1]) {
                top = mid + 1;
            } 
            else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } 
            else {
                row = mid;
                break;
            }
        }

        if (row == -1) 
            return false;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int m = (left + right) / 2;
            if (target > matrix[row][m]) {
                left = m + 1;
            } 
            else if (target < matrix[row][m]) {
                right = m - 1;
            } 
            else {
                return true;
            }
        }
        return false;
    }
}