class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> next = new ArrayList<>();
            if(i==0){
                next.add(1);
            }
            else if(i==1){
                next.add(1);
                next.add(1);

            }
            else{
                for(int k=0;k<=i;k++){
                    if(k==0 || k==i){
                        next.add(1);
                    }
                    else{
                        int sum= prev.get(k)+prev.get(k-1);
                        next.add(sum);
                    }
                }
            }
            prev.clear();
            prev.addAll(next);
            next.clear();
        }
        return prev;
    }
}