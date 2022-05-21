class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
       int pair = 0 ;
       if(n==0 || n==1){
           return pair;
       }
       Collections.sort(ar);// sort the array
       for(int i = 0 ; i < n-1 ; ){ // we have to check upto 
       // the element before last element not till the lsast element
       // if we take upto last element ar.get(i+1) will result out of bound exception
        if(ar.get(i)== ar.get(i+1)){
           pair+=1;
          i+=2;
         }
        else
          i+=1;
       }
       return pair;
    }

}
