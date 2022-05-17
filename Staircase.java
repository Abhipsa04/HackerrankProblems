class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
       for(int i =0 ; i< n ; i++){
           for(int k = n-i-1 ; k>0 ; k-- ){
               System.out.print(" ");
           }
           for(int j = 1 ; j<=i+1 ; j++ ){
               System.out.print("#");
           }
           System.out.println();
       }
       
    }

}
