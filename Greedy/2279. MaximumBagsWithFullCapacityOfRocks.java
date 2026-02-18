class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] differences = new int[capacity.length];
        int n = capacity.length;

        int fullCapacityCounter=0;

        for(int i =0;i<n;i++){
            differences[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(differences);
        int i =0;
        while(additionalRocks!=0 && i<n){
            if(additionalRocks>=differences[i]){
                additionalRocks=additionalRocks-differences[i];
                fullCapacityCounter++;
                i++;
            }
            else{
                break;
            }
        }
        return fullCapacityCounter;
    }
}