
class TrieNode{
    TrieNode[] children;
    boolean eow;          //end of word

    public TrieNode(){
        children = new TrieNode[26];
        for(int i =0;i<26;i++){
            children[i]=null;
        }
        eow=false;
    }
}

class Trie{
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        int n = word.length();

        for(int i=0;i<n;i++){
            int ch_index = word.charAt(i)-'a';
            if(current.children[ch_index]==null){
                current.children[ch_index] = new TrieNode();
            }
            current= current.children[ch_index];
        }
        current.eow= true;
    }

    public boolean searchPrefix(String word){
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int ch_index = word.charAt(i) - 'a';
            if (current.children[ch_index] == null) {
                return false;
            }
            current = current.children[ch_index];
        }
        return true;

    }
}



class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for(int i=0;i<n;i++){
            Trie prefixTrie = new Trie();
            Trie suffixTrie = new Trie();

            prefixTrie.insert(words[i]);
            String reversed = new StringBuilder(words[i]).reverse().toString();
            suffixTrie.insert(reversed);

            for(int j=0;j<i;j++){
                if(words[j].length() > words[i].length()){
                    continue;
                }
                String rev = new StringBuilder(words[j]).reverse().toString();

                if (prefixTrie.searchPrefix(words[j]) && suffixTrie.searchPrefix(rev)) {
                    count++;
                }
            }
        }

        return count;



        // int n = words.length;

        // int count=0;
        // for(int i =0;i<n;i++){
        //     for(int j =i+1;j<n;j++){
        //         if(words[i].length()<=words[j].length() &&
        //         isSuffixAndPrefix(words[i],words[j]) ){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }

    // public boolean isSuffixAndPrefix(String check, String s){
    //     int n = check.length();

    //     String s1 = s.substring(0,n);
    //     String s2 = s.substring(s.length()-n);

    //     return check.equals(s1) && check.equals(s2);

    // }
}