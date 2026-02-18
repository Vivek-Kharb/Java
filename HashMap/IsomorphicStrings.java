class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char key= s.charAt(i);
            char value= t.charAt(i);
            // if(mp.containsKey(key) && !mp.containsValue(value) || !mp.containsKey(key) && mp.containsValue(value))
            //return false;
            if(mp.containsKey(key) &&  value!=mp.get(key) || mp.containsValue(value) && !mp.containsKey(key))
                return false;

            if(!mp.containsKey(key) && !mp.containsValue(value)){
                mp.putIfAbsent(key,value);
            }
        }
        return true;
    }
}