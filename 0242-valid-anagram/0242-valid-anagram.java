class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (char n : s.toCharArray()) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(char j:t.toCharArray()){
            if(!map.containsKey(j)){
                return false;
            }
            map.put(j,map.get(j)-1);
            if (map.get(j) < 0) {
                return false;
            }
        }
        return true;
    }
}