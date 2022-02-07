// 可以改用exclusive or
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            count[c - 'a']--;
        }
        return ' ';
    }
}
