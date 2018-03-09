boolean palindromeRearranging(String inputString) {
    
    int inpCnt = 0;
    boolean oddOneFlag = true;
    
    Hashtable <Character,Integer> theStrCnt = new Hashtable<>();
    int inpCharCnt = 0;
    char inpChar;
    
    // init the hashtable with the chars and their count in the string
    for (int inp_i = 0; inp_i < inputString.length(); inp_i++)
    {
        inpChar = inputString.charAt(inp_i);
        
        if (theStrCnt.get(inpChar) != null) {
            inpCharCnt = theStrCnt.get(inpChar);
            inpCharCnt++;
            theStrCnt.put(inpChar,inpCharCnt);
        } else {
            theStrCnt.put(inpChar,1);
        }
    }
    
    // Parse the hashTable
    // For even length of inputString we need pairs(2,4,6,8..) of char counts in HT in order to manage making a
    // palindrome
    // For odd length of inputStr, we need pairs true, but some odd char counts are allowed (like a2-b2-c1, a3-b4 
    // with all others being pairs/even)
    // because they can also make/contruct a palindrome given the condition that there is only one such odd char
    // count character (controlled by oddOneFlag) (and all others be even) and that the total inpCnt should get 
    // reduced to 0 for palindrome
    // construction to work. In all other cases it would not work so return false.
    Set<Character> keys = theStrCnt.keySet();
    int cntVal = 0;
    
    // EVEN case of inputString
    if (inputString.length() % 2 == 0)
    {
        for (char key: keys)
        {
            cntVal = theStrCnt.get(key);
            
            // Check for all even counts of characters
            if (cntVal % 2 == 0){
                continue;
            }
            // Dont have pairs of chars, not possible to make palindrome
            else{
                return false;
            }
        }
        // All characters have even pairs so,
        return true;
    }
    // ODD case of inputString
    else
    {
        // Store input string length  to check against
        inpCnt = inputString.length();
        
        for (char key: keys)
        {    
            cntVal = theStrCnt.get(key);
            
            // Check for even pairs
            if (cntVal % 2 == 0){
                inpCnt -= cntVal;
            }
            // Check for that one allowed odd pair 1,3,.. char count, then shut off bc need all others to be even 
            // pairs
            else if (oddOneFlag){
                inpCnt -= cntVal;
                oddOneFlag = false;
            }
            
            // Do the char count reductions (one odd, rest even) to inpCnt match up to input String length?
            if (inpCnt == 0){
                return true;
            } 
        }
        return false;
    }            
}
/*
Custom Test 1
Input: inputString: "aaabbbb"

Output: false // bc logic does not factor for cases below

Expected Output: true // bc abbabba
implies two cases for odd... : 

either c:1 (~like input) with only pairs

or a:3 with pairs

...inorder to make a palindrome
*/
