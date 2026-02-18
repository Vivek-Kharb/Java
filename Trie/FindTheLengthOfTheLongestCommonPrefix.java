class Solution {
    public class numbers{
        numbers[] children;
        boolean eow;
        public numbers(){
            children = new numbers[10];
            for(int i =0;i<10;i++){
                children[i]=null;
            }
            eow=false;
        }
    }

    public numbers root = new numbers();

    public void addPrefix(String number){
        numbers current = root;
        int n = number.length();
        for(int i=0;i<n;i++){
            char ch  = number.charAt(i);
            int ch_index = ch - '0';
            if(current.children[ch_index]==null){
                current.children[ch_index] = new numbers();
            }
            current = current.children[ch_index];
        }
        current.eow= true;
    }

    public int findLongestPrefix(String number){
        numbers current = root;
        int n = number.length();
        int longestPrefix=0;
        for(int i =0;i<n;i++){
            char ch  = number.charAt(i);
            int ch_index = ch - '0';
            if(current.children[ch_index]==null){
                return longestPrefix;
            }
            if(current.children[ch_index]!=null){
                current = current.children[ch_index];
                longestPrefix++;
            }
        }
        return longestPrefix++;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int longestPrefix=0;
        for(int i=0;i<n1;i++){
            String str = Integer.toString(arr1[i]);
            addPrefix(str);
        }
        for(int i=0;i<n2;i++){
            longestPrefix = Math.max(longestPrefix,findLongestPrefix(Integer.toString(arr2[i])));
        }
        return longestPrefix;
    }
}