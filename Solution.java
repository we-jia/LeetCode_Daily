class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()){
            return Collections.emptyList();
        }
        
        char[] source = s.toCharArray();
        char[] target = p.toCharArray();

        int[] hashTable = new int[26];
        for (char c : target) {
            hashTable[c - 'a']++;
        }

        int i = 0;
        for (;i < target.length - 1;++i) {
            hashTable[source[i] - 'a']--;
        }
        
        List<Integer> result = new ArrayList<>();
        int j = target.length - 1;
        for (;i < source.length;++i) {
            hashTable[source[i] - 'a']--;
            if(this.isTarget(hashTable)){
                result.add(i - j);
            }
            hashTable[source[i - j] - 'a']++;
        }

        return result;
    }

    private boolean isTarget(int[] hashTable){
        for(int i : hashTable){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
