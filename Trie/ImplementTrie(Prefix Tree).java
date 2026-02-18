class Trie {
    private TrieNode root;

    // Inner class representing a node in the Trie
    private class TrieNode {
        TrieNode[] children; // Array to store child nodes (for 'a' through 'z')
        boolean isEndOfWord; // True if this node marks the end of a word

        public TrieNode() {
            children = new TrieNode[26]; // Initialize children array for 26 lowercase English letters
            isEndOfWord = false;
        }
    }

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(); // Initialize the root of the Trie
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Calculate index for the character (0 for 'a', 1 for 'b', etc.)
            if (current.children[index] == null) {
                current.children[index] = new TrieNode(); // Create a new node if it doesn't exist
            }
            current = current.children[index]; // Move to the next node
        }
        current.isEndOfWord = true; // Mark the last node as the end of a word
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word); // Use helper method to find the node for the word
        return node != null && node.isEndOfWord; // Return true if the node exists and marks the end of a word
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix); // Use helper method to find the node for the prefix
        return node != null; // Return true if the node exists (meaning the prefix exists)
    }

    // Helper method to traverse the Trie and find the node corresponding to a given string
    private TrieNode searchPrefix(String s) {
        TrieNode current = root;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return null; // Prefix not found
            }
            current = current.children[index];
        }
        return current;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */