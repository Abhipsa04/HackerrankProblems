class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
       List<Integer> output = new ArrayList<Integer>();
        int alice =0;
        int bob = 0;
       for(int i = 0 ; i< a .size();i++)
       {
           if(a.get(i)>b.get(i))
             alice++;
           else if(b.get(i)>a.get(i))
             bob++;
        
       }
      output.add(alice);
      output.add(bob);
      return output;
    }

}
