package io.github.bluething.playground.codinginterview.kattis.hash_table;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.HashMap;
import java.util.Map;

// https://open.kattis.com/problems/nicknames
public class nicknames2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        Map<Character, AVL> treeChars = new HashMap<>();
        Map<String, Integer> cache = new HashMap<>();
        int A = io.getInt();
        while (A-- > 0) {
            String name = io.getWord();
            char firstLetter = name.charAt(0);
            if (treeChars.containsKey(firstLetter)) {
                treeChars.get(firstLetter).insert(name);
            } else {
                AVL tree = new AVL();
                tree.insert(name);
                treeChars.put(firstLetter, tree);
            }
        }

        int B = io.getInt();
        while (B-- > 0) {
            String nickname = io.getWord();
            int matches;
            char firstLetter = nickname.charAt(0);
            if (cache.containsKey(nickname)) {
                matches = cache.get(nickname);
            } else {
                if (treeChars.containsKey(firstLetter)) {
                    matches = treeChars.get(firstLetter).checkValid(nickname);
                } else {
                    matches = 0;
                }

                cache.put(nickname, matches);
            }
            io.println(matches);
        }

        io.close();
    }
}

class BSTVertex {
    public BSTVertex parent, left, right;
    public String key;
    public int height;
    public int size;

    BSTVertex(String v) {
        key = v;
        parent = left = right = null;
        height = 0;
        size = 1;
    }
}

class AVL {
    BSTVertex root;

    public AVL() {
        root = null;
    }

    private int h(BSTVertex T) {
        return T == null ? -1 : T.height;
    }
    private int size(BSTVertex T) {
        return T == null ? 0 : T.size;
    }

    protected BSTVertex rotateLeft(BSTVertex T) {
        BSTVertex w = T.right;  // T must have a right child
        w.parent = T.parent;
        T.parent = w;
        T.right = w.left;
        if (w.left != null) {
            w.left.parent = T;
        }
        w.left = T;

        T.height = Math.max(h(T.left), h(T.right)) + 1;
        T.size = size(T.left) + size(T.right) + 1;
        w.height = Math.max(h(w.left), h(w.right)) + 1;

        return w;
    }

    protected BSTVertex rotateRight(BSTVertex T) {
        BSTVertex w = T.left;   // T must have a left child
        w.parent = T.parent;
        T.parent = w;
        T.left = w.right;
        if (w.right != null) {
            w.right.parent = T;
        }
        w.right = T;

        T.height = Math.max(h(T.left), h(T.right)) + 1;
        T.size = size(T.left) + size(T.right) + 1;
        w.height = Math.max(h(w.left), h(w.right)) + 1;

        return w;
    }

    protected BSTVertex insert(BSTVertex T, String v) {
        if (T == null) {
            return new BSTVertex(v);
        }

        if (T.key.compareTo(v) < 0) {
            T.right = insert(T.right, v);
            T.right.parent = T;
        } else {
            T.left = insert(T.left, v);
            T.left.parent = T;
        }

        // balancing
        int balance = h(T.left) - h(T.right);
        if (balance == 2) { // left heavy
            int balance2 = h(T.left.left) - h(T.left.right);
            if (balance2 == 1) {
                T = rotateRight(T);
            } else {    // -1
                T.left = rotateLeft(T.left);
                T = rotateRight(T);
            }
        } else if (balance == -2) { // right heavy
            int balance2 = h(T.right.left) - h(T.right.right);
            if (balance2 == -1) {
                T = rotateLeft(T);
            } else {    // 1
                T.right = rotateRight(T.right);
                T = rotateLeft(T);
            }
        }

        T.height = Math.max(h(T.left), h(T.right)) + 1;
        T.size = size(T.left) + size(T.right) + 1;
        return T;
    }
    public void insert(String v) {
        root = insert(root, v);
    }

    // find the highest valid substring by query, meaning its ancestors are all invalid
    public int checkValid(String query) {
        BSTVertex highestValid = findHighestValid(this.root, query);
        if (highestValid == null) {
            return 0;
        }

        return 1 + checkValidOnTheLeft(highestValid.left, query) + checkValidOnTheRight(highestValid.right, query);
    }
    BSTVertex findHighestValid(BSTVertex T, String query) {
        if (T == null) {
            return null;
        }

        if (T.key.indexOf(query) == 0) {
            return T;
        }

        if (T.key.compareTo(query) < 0) {   // left side is invalid char sequence, go to the right
            return findHighestValid(T.right, query);
        } else {                            // left side is valid char sequence, go to the left
            return findHighestValid(T.left, query);
        }
    }
    int checkValidOnTheLeft(BSTVertex T, String query) {
        if (T == null) {
            return 0;
        }

        if (T.key.indexOf(query) == 0) {    // find valid char sequence, go down to the left
            return 1 + checkValidOnTheLeft(T.left, query) + size(T.right);  // size attribute can be used to prevent redundant traversal
        } else {
            return checkValidOnTheLeft(T.right, query);
        }
    }
    int checkValidOnTheRight(BSTVertex T, String query) {
        if (T == null) {
            return 0;
        }

        if (T.key.indexOf(query) == 0) {    // find valid char sequence, go down to the right
            return 1 + checkValidOnTheRight(T.right, query) + size(T.left);  // size attribute can be used to prevent redundant traversal
        } else {
            return checkValidOnTheRight(T.left, query);
        }
    }
}
