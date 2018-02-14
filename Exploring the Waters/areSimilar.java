boolean areSimilar(int[] a, int[] b) {
    
    // Check for unequal lengths
    if (a.length != b.length){
        return false;
    }
    
    // Copy elements to save from mutating originals
    int[] tempA = a.clone();
    int[] tempB = b.clone();
    
    Arrays.sort(tempA);
    Arrays.sort(tempB);
    
    // Immediately return if arrays are equal at outset
    if ( Arrays.equals(a,b) ) {
        return true;
    }
    else{
        // Do the arrays have similar elements to swap?
        if ( Arrays.equals(tempA,tempB) ){
            // Yes, Similar elements but can one-move swap get other array?
            int overlapCount = 0;
            int arrLen = a.length;
        
            for (int indA = 0; indA < arrLen; indA++)
            {
                if ( b[indA] == a[indA] ) {
                    overlapCount++;
                }
            }
        
            if (overlapCount < arrLen-2 ){
                return false;
            }else{ // overlap >= arrlen-2, means can swap in one move and get other array
                return true;
            }
        }
        // Arrays have different(partial similar) elements, no swapping can make both similar
        return false;
    }

}


/* 
 * if equals return true
 * else 
 *   count the overlap
 *   if < 2 // only one swapping move available, and would need > 1 swaps
 *      return false
 *   else // can be made from other in just one (swapping) move
 *      return true
 */

/*
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a,b);
*/    
