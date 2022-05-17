class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
       Collections.sort(arr);
       long minsum = 0;
       long maxsum = 0;
       for(int i = 0 ; i< 4 ; i++){
           minsum+=arr.get(i);
       }
       for(int j = 4 ; j>=1 ; j--){
        
           maxsum+=arr.get(j);
       }
       System.out.println(minsum + " "+ maxsum);
    }

}
