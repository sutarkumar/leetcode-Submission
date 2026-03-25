class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) {
            return list;
        }

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        list.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = list.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); 
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}
