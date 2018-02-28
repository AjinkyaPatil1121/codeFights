int arrayChange(int[] inputArray) {
    
    // Init. variables and return variable
    int numMoves = 0; int prev, curr = 0;
    
    // Scan inputArray for rule breaking elements like [5, 1 ...]
    for (int inpA_i = 1; inpA_i < inputArray.length; inpA_i++){
        
        prev = inputArray[inpA_i-1];
        curr = inputArray[inpA_i];
        
        // If rule broken like 5, 1.. and not 5, 6.. then count number of moves required to 
        // get
        // increasing sequence plus change original array to reflect inc. order to use for
        // comparing against further elements(bc using 5,1.. for comparing would be 
        // incorrect) 
        // If > then skip
        if ( curr <= prev ){
            // Ok, rule broken but How much to make 1 equal to 6 for inc. order, inc. with
            // 1 move at a time. Add to the 
            // total moves you are making in each instance
            numMoves += ( ( prev - curr ) + 1 );
            // Change array to reflect [5,6..] in order to accurately count minimum moves 
            // required/necessary
            inputArray[inpA_i] = curr + ( prev - curr ) + 1;
        }
        
    }
    
    return numMoves;
}
