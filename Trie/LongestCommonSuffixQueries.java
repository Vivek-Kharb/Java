class Solution {
    static class lcs{
        lcs[] child;
        int index;

        public lcs(){
            index=-1;
            child = new lcs[26];
        }
    }

    public lcs createNode(int index){
        lcs temp = new lcs();
        temp.index=index;

        for(int i=0;i<26;i++){
            temp.child[i]=null;
        }
        return temp;
    }

    public void insert(lcs root, int i ,String[] wordsContainer){
        lcs current = root;
        int n = wordsContainer[i].length();
        String word= wordsContainer[i];

        for(int j = n-1; j>=0; j--){
            int ch_index = word.charAt(j)-'a';

            if(current.child[ch_index] == null){
                current.child[ch_index] = createNode(i);
            }
            current=current.child[ch_index];
            if(wordsContainer[current.index].length() > n){
                current.index=i;
            }
        }
    }

    public int search(lcs root, String wordQuery){
        lcs current = root;
        int n = wordQuery.length();
        int result_index = root.index;


        for(int i=n-1;i>=0;i--){
            int ch_index = wordQuery.charAt(i)-'a';
            current=current.child[ch_index];

            if(current==null){
                return result_index;
            }
            result_index= current.index;
        }

        return result_index;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        int m = wordsContainer.length;
        int n = wordsQuery.length;
        int[] ans = new int[n];

        lcs root = createNode(0);

        for(int i = 0;i<wordsContainer.length;i++){
            if(wordsContainer[root.index].length() > wordsContainer[i].length()){
                root.index=i;
            }
            insert(root, i, wordsContainer);
        }

        for(int i =0;i<n;i++){
            ans[i] = search(root, wordsQuery[i]);
        }

        return ans;
    }
}