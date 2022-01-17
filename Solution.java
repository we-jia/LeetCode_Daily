public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        char[] patternArr = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if(patternArr.length != strArr.length){
            return false;
        }

        for (int i = 0; i < patternArr.length; i++) {
            char charElement = patternArr[i];
            String strElement = strArr[i];

            if (map1.containsKey(patternArr[i]) && !strElement.equals(map1.get(charElement))) {
                return false;
            }
            if (map2.containsKey(strArr[i]) && charElement != map2.get(strElement)) {
                return false;
            }

            map1.put(charElement, strElement);
            map2.put(strElement, charElement);
        }

        return true;
    }
}
