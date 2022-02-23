class Solution {
    public Node cloneGraph(Node node) {
//        BFS
//        if (node == null) {
//            return null;
//        }
//
//        Map<Integer, Node> map = new HashMap<>();
//        Queue<Node> queue = new LinkedList<>();
//        map.put(node.val, new Node(node.val));
//        queue.add(node);
//
//        while (!queue.isEmpty()) {
//            Node oldNode = queue.poll();
//            Node newNode = map.get(oldNode.val);
//
//            for (Node oldTmp : oldNode.neighbors) {
//                Node newTmp;
//                if (map.containsKey(oldTmp.val)) {
//                    newTmp = map.get(oldTmp.val);
//                } else {
//                    queue.add(oldTmp);
//                    newTmp = new Node(oldTmp.val);
//                    map.put(oldTmp.val, newTmp);
//                }
//                newNode.neighbors.add(newTmp);
//            }
//        }
//
//        return map.get(node.val);
        //DFS
        if (node == null) {
            return null;
        }

        return this.cloneWithDFS(node, new HashMap<Integer, Node>());
    }

    private Node cloneWithDFS(Node node, Map<Integer, Node> map) {
        Node newNode = new Node(node.val);
        map.put(node.val, newNode);
        for (Node oldTmp : node.neighbors) {
            Node newTmp;
            if (map.containsKey(oldTmp.val)) {
                newTmp = map.get(oldTmp.val);
            } else {
                newTmp = this.cloneWithDFS(oldTmp, map);
            }
            newNode.neighbors.add(newTmp);
        }

        return newNode;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
