class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> solution = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> num = new ArrayList<>(i+1);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    num.add(1);
                }
                else{
                    int data = solution.get(i-1).get(j) + solution.get(i-1).get(j-1);
                    num.add(data);
                }
            }
            solution.add(num);
        }

        return solution;
    }
}