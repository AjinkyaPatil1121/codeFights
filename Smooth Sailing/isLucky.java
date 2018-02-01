boolean isLucky(int n) {

    int sum1n = 0; int sum2n = 0;
    
    /*if (n.length() % 2 != 0){
        return false;
    }
    */
    /* split n using arithmetic ~n*10 n/10 
     * then do sum of first and second half
    */
    // Or put individual numbers of n inside an array

    // Another approach using Strings
    String nStr = n+""; // #Hacky
    //System.out.println("nSTR===="+nStr);
    int nmid = (nStr.length())/2;
    //System.out.println("nMID===="+nmid);
    for (int i = 0; i < nStr.length(); i++)
    {
        char nchar = nStr.charAt(i);
        //System.out.println("nCHAR===="+nchar);
        int nVal = Integer.parseInt(nchar+""); //#Hacky
        //System.out.println("nVAL===="+nVal);
        
        if (i < nmid){
            sum1n += nVal;
        }else{
            sum2n += nVal;
        }
    }
    //System.out.println("SUM1n===="+sum1n);
    //System.out.println("SUM2n===="+sum2n);
    
    if (sum1n == sum2n)
        return true;
    else
        return false;
    
}
// another: add first half then subtract all values in 2nd half, if result == 0 then true
// still would be O(n)
