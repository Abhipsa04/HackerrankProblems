
class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
      int sum1 = 0;
      int sum2 = 0;
      int  n = arr.size()-1;
      for(int i =0 ; i< arr.size(); i++){
          for(int j =0 ; j< arr.get(i).size() ; j++){
              if(i==j){
                  sum1+=arr.get(i).get(j);
              }
              if(i==n-j){
                  sum2+=arr.get(i).get(j);
              }
          }
      }
      int diff= Math.abs(sum1-sum2);
      
      //System.out.println(sum2);
      return diff;
    }

}
