class Solution {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }

        char[] arr = num.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : arr) {
            while (k > 0 && !deque.isEmpty() && deque.peekLast() > c) {
                deque.pollLast();
                k--;
            }
            deque.add(c);
        }

        while (k > 0) {
            deque.pollLast();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.pollFirst());
        }
        while (sb.indexOf("0") == 0) {
            sb.deleteCharAt(0);
        }

        return sb.toString().equals("") ? "0" : sb.toString();
    }
}
