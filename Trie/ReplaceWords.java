class Solution {
    public class ReplaceWords{
        ReplaceWords [] children;
        boolean endOfWord;

        public ReplaceWords(){
            children = new  ReplaceWords[26];

            for(int i =0;i<26;i++){
                children[i]=null;
            }
            endOfWord =false;
        }
    }

    public  ReplaceWords root = new ReplaceWords();

    public void addWords(String word){
        int n = word.length();
        ReplaceWords current = root;

        for(int i=0;i<n;i++){
            int ch_index = word.charAt(i)-'a';
            if(current.children[ch_index]==null){
                current.children[ch_index]  = new ReplaceWords();
            }
            current=current.children[ch_index];
            if(i==n-1){
                current.endOfWord=true;
            }
        }

    }

    public String searchRoot(String word){
        ReplaceWords current = root;
        int n = word.length();

        String solution = "";
        for(int i =0;i<n;i++){
            int ch_index = word.charAt(i)-'a';
            if(current.children[ch_index]==null){
                return word;
            }
            current = current.children[ch_index];
            if(current.endOfWord==true){
                return word.substring(0,i+1);
            }
        }
        return word;

    }
    public String replaceWords(List<String> dictionary, String sentence) {
        int n = dictionary.size();
        String solutionString = "";

        for(int i =0;i<n;i++){
            addWords(dictionary.get(i));
        }

        int k = sentence.length();
        int i =0;
        while(i<k){
            String word = "";
            char ch = ' ';
            while(i<k && sentence.charAt(i)!=ch){
                word = word.concat(sentence.substring(i,i+1));
                i++;
            }
            solutionString = solutionString.concat(searchRoot(word));
            solutionString = solutionString.concat(" ");
            i++;
        }
        int length = solutionString.length();

        return solutionString.substring(0,length-1) ;
    }
}