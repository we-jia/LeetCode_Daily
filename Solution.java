class Solution {
    public String makeFancyString(String s) {
        int count = 0;
        char curr = '*';
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != curr) {
                curr = c;
                count = 1;
                sb.append(c);
                continue;
            } else {
                count++;
                if (count == 2) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
