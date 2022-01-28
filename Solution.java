class WordDictionary {
    private Node node;

    public WordDictionary() {
        this.node = new Node();
    }

    public void addWord(String word) {
        this.node.add(word.toCharArray(), 0);
    }

    public boolean search(String word) {
        return this.node.search(word.toCharArray(), 0);
    }

    private class Node {
        private boolean endHere;
        private final Node[] hashTable = new Node[26];

        public void add(char[] words, int index) {
            if (words.length == index) {
                this.endHere = true;
                return;
            }
            char c = words[index];
            if (Objects.isNull(this.hashTable[c - 97])) {
                this.hashTable[c - 97] = new Node();
            }
            this.hashTable[c - 97].add(words, index + 1);
        }

        public boolean search(char[] words, int index) {
            if (words.length == index) {
                return this.endHere;
            }
            char c = words[index];
            if (c == '.') {
                for (Node node : this.hashTable) {
                    if (!Objects.isNull(node) && node.search(words, index + 1)) {
                        return true;
                    }
                }
                return false;
            }
            if (!Objects.isNull(this.hashTable[c - 97])) {
                return this.hashTable[c - 97].search(words, index + 1);
            }

            return false;
        }
    }
}
