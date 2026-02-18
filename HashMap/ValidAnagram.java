class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        char[] charArray= s.toCharArray();

        for(var v : charArray){
            if(!mp.containsKey(v)){
                mp.put(v,1);
            }
            else{
                mp.put(v,(mp.get(v)+1));
            }
        }

        charArray= t.toCharArray();


        for(var v : charArray){
            if(!mp2.containsKey(v)){
                mp2.put(v,1);
            }
            else{
                mp2.put(v,(mp2.get(v)+1));
            }
        }

        return mp.equals(mp2);

        // for(var v : charArray){
        //     if(!mp.containsKey(v) || mp.get(v)==0)
        //         return false;
        //     // else if(mp.get(v)==0){
        //     //     return false;
        //     // }
        //     else{
        //         mp.put(v,(mp.get(v)-1));
        //     }
        // }

        // for(var v : mp.keySet()){
        //     if(mp.get(v)!=0)
        //         return false;
        // }
        // return true;
    }
}