class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        List<Integer>[] list = new ArrayList[26];
        for (int i = 0; i < list.length; ++i) {
            list[i] = new ArrayList<>();
        }

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            list[arr[i] - 'a'].add(i);
        }

        int count = 0;
        for (String word : words) {
            char[] tmpArr = word.toCharArray();
            int tmp = -1;
            for (int i = 0; i < tmpArr.length; ++i) {
                List<Integer> tmpList = list[tmpArr[i] - 'a'];
                boolean changed = false;
                for (int j = 0; j < tmpList.size(); j++) {
                    if (tmp < tmpList.get(j)) {
                        changed = true;
                        tmp = tmpList.get(j);
                        break;
                    }
                }

                if (!changed) {
                    break;
                }

                if (i == tmpArr.length - 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
