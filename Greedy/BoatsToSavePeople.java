class Solution {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left=0;
        int right = people.length-1;
        int minBoats=0;
        while(left<=right){
            if(people[right] + people[left] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            minBoats += 1;
        }
        return minBoats;
    }


    // public int numRescueBoats(int[] people, int limit) {
    //     Arrays.sort(people);

    //     int left=0;
    //     int right = people.length-1;
    //     int minBoats=0;
    //     while(left<=right){
    //         if(left==right){
    //             minBoats++;
    //             break;
    //         }
    //        else if(people[right]==limit || people[left]+people[right]>limit ){
    //         }
    //         else {// if (people[left]+people[right]<=limit)
    //             //minBoats++;
    //             left++;
    //             //right--;
    //         }

    //          right--;
    //             minBoats++;

    //         //else{}
    //     }
    //     return minBoats;
    // }
}