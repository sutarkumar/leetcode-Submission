class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;

        HashSet<Integer> colZero = new HashSet<>();
        HashSet<Integer> rowZero = new HashSet<>();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j] == 0){
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }


        for(int ro:rowZero){
            for(int j =0;j<column;j++){
                matrix[ro][j] = 0;
            }
        }

        for(int col:colZero){
            for(int j=0;j<rows;j++){
                matrix[j][col] =0;
            }
        }

    }
}