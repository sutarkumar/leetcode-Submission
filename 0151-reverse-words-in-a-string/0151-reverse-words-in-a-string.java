class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i].length() == 0){
                continue;
            }
        

            if(res.length() == 0){
                res.append(arr[i]);
            }else{
                res.append(" ");
                res.append(arr[i]);
            }
        }
        return res.toString();
    }
}