class Solution {
    static class bitTrie {
        bitTrie left;
        bitTrie right;
    }

    static  bitTrie root ;

    int maximum=0;
    public void insert(bitTrie root, int num){
        bitTrie current = root;

        for(int i=31;i>=0;i--){
            int ithBit = (num >> i) & 1;
            if(ithBit==0){
                if(current.left==null){
                    current.left = new bitTrie();
                }
                current=current.left;
            }else {
                if(current.right==null){
                    current.right= new bitTrie();
                }
                current=current.right;
            }
        }
    }

    public void findMaximum(bitTrie root, int num){
        bitTrie current=root;
        int temp=0;
        for(int i = 31;i>=0;i--){
            int ithBit = (num >> i) & 1;
            if(ithBit==0){
                if(current.right!=null){
                    current=current.right;
                    temp=temp+ (int)Math.pow(2,i);
                }
                else{
                    current=current.left;
                }
            }
            else {
                if(current.left!=null){
                    current=current.left;
                    temp=temp+ (int)Math.pow(2,i);
                }
                else{
                    current=current.right;
                }
            }
        }
        if(temp>maximum){
            maximum=temp;
        }

    }


    public int findMaximumXOR(int[] nums) {
        root = new bitTrie();

        for(int i =0;i<nums.length;i++){
            insert(root, nums[i]);
        }

        for(int i =0;i<nums.length;i++){
            findMaximum(root, nums[i]);
        }

        return maximum;

    }
}