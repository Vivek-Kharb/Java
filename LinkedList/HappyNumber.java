class Solution {
    public boolean isHappy(int n) {

        ArrayList<Integer> ll = new ArrayList<>();

        int sum=0;
        int k=0;

        while(true){
            do{
                k=n%10;
                sum+=k*k;
                n=n/10;
            }while(n!=0);

            n=sum;

            if(sum==1){
                return true;
            }

            if (ll.contains(sum)==true){
                return false;
            }
            else{
                ll.add(sum);
            }
            sum=0;
        }

    }
}