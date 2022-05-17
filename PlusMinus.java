class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
       double pl =0.0; 
       double mi =0.0;
       double ze=0.0;
       int size = arr.size();
       
       for(int i =0 ; i < size ; i++){
          int  elem = arr.get(i);
           if(elem>0)
             pl++;
           if(elem<0)
              mi++;
           if(elem==0)
              ze++;
         
       }
       
          System.out.println(
      String.format("%.6f", (pl/size)));
       System.out.println(
      String.format("%.6f", (mi/size)));
       System.out.println(
      String.format("%.6f", (ze/size)));
      
    }

}
       }
