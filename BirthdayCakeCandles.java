class Result {

    

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
       Collections.sort(candles, Collections.reverseOrder());
       int count = 0 ;
       int high = candles.get(0);
      
       for(int i =0 ; i<candles.size(); i++){
          if(candles.get(i)==high){
              count++;
          }
       }
       return count;
    }

}
