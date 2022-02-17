class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            int index = s.indexOf("@");
            if (index == -1) {
                continue;
            }
            set.add(this.handleStr(s.substring(0, index)) + s.substring(index));
        }
        return set.size();
    }

    private String handleStr(String str) {
        str = str.replace(".", "");
        int index = str.indexOf("+");
        if (index == -1) {
            return str;
        } else {
            return str.substring(0, index);
        }
    }
}
