class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            //traverse top row
            for(int col=left; col<=right; col++){
                result.add(matrix[top][col]);
            }
            top++;

            //tarverse right column from top to bottom
            for(int row=top; row<=bottom; row++){
                result.add(matrix[row][right]);
            }
            right--;

            //tarverse bottom row
            if(top<=bottom){
                for(int col=right; col>=left; col--){
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            //tarverse from left to right
            if(left <= right){
                for(int row = bottom; row>=top; row--){
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }
}