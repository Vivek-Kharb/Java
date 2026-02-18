class Solution {
    public int brokenCalc(int startValue, int target) {

        //we are going in reverse direction
        int operations=0;

        while(startValue!=target){
            if(target>startValue && target % 2==0){
                target=target/2;
            }
            else{
                target=target+1;
            }
            operations++;
        }
        return operations;
    }
}