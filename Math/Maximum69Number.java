class Solution {
    public int maximum69Number (int num) {
        int placeValue=-1;
        int counter=0;
        int solution=num;

        while(num!=0){
            int rem=num%10;
            if(rem==6){
                placeValue=counter;
            }
            num=num/10;
            counter++;
        }
        if(placeValue==-1){
            return solution;
        }
        else {
            solution = solution+3*((int)Math.pow(10,placeValue));
            return solution;
        }

        // return solution+3*(int)Math.pow(10,placeValue);
    }
}