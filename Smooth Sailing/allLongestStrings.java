String[] allLongestStrings(String[] inputArray) {
    
    // init inplongStr to return
    String[] inplongStrs;
    
    int maxlen = 0, valCount = 0;
    ArrayList<Integer> maxindexs = new ArrayList<>();
    
    // 2nd try
    // parse inputArr once
        // get maxlength (if less scrap everything, if > then dont care, if == store values)
        // get valCount at maxlen
        // get maxindexs of inputArr at maxlen
    // init and declare ret arr inplongStrs from valCount
    // now for len of valCount (for e.g. 3 max values)
        // get maxindexs vals from inpArr, and store in return Arr
    
    // return retArr
    for (int i = 0; i < inputArray.length; i++)
    {
        int curlen = inputArray[i].length();
        
        if (maxlen < curlen){
            maxlen = curlen;
            
            valCount = 0;
            maxindexs.clear();
            
            valCount++;
            maxindexs.add(i);
        }
        else if (maxlen == curlen){
            valCount++;
            maxindexs.add(i);
        }
        
    }
    
    inplongStrs = new String[valCount];
    
    for (int j = 0; j < valCount; j++){
        inplongStrs[j] = inputArray[ maxindexs.get(j) ];
    }
    
    return inplongStrs;
    
    // Seems ineffcient
    // parse inputArr
        // for 0.length store in retarr & maxlen = 0.len
        // for 1.len
        // if 1.len >= maxlen
            // if (retarr.0.length < 1.length)
                // overwrite/remove
                // update maxlen
                // if updated then loop all old vals and remove < maxlen
            // else
                // add to returnarr
        // else
            // continue
        // 
        // init String[] arr = retuarr.size
        // copy over all elements
        // return arr

}
