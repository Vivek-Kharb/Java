class Solution {
    public String restoreString(String s, int[] indices) {
        int stringLength = s.length();

        char[] sortedArray = new char[stringLength];

        for(int i=0;i<stringLength;i++){
            int index = indices[i];
            sortedArray[index]=s.charAt(i);
        }

        return (new String(sortedArray));

    }
}