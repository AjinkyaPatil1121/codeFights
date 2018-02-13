String[] addBorder(String[] picture) {
    
    int pLastIndex = picture.length;
    int pElemLen = picture[0].length();
    
    StringBuilder[] picBorder = new StringBuilder[ pLastIndex + 2 ];
    String[] retStr = new String[ pLastIndex + 2 ];
    
    // Outer border - TODO: use map reduce and lambda functions for Java
    picBorder[0] = new StringBuilder(pElemLen + 2);
    picBorder[pLastIndex + 1] = new StringBuilder(pElemLen + 2);
    for (int i = 0; i < pElemLen + 2; i++){
        picBorder[0].append("*");
        picBorder[pLastIndex + 1].append("*"); // or picBorder.size() - 1
    }
    retStr [0] = picBorder[0].toString();
    retStr [pLastIndex + 1] = picBorder[pLastIndex + 1].toString();

    // Inner border
    for (int i = 1; i <= pLastIndex; i++){
        picBorder[i] = new StringBuilder(pElemLen + 2);
        picBorder[i].append("*");
        picBorder[i].append(picture[i-1]);
        picBorder[i].append("*");
        
        retStr [i] = picBorder[i].toString();
    }
    
    
    return retStr;
}

/* rectangular matrix like this always, no uneven lengths
 * [
 *   "asass"
 *   "assfe"  
 * ]
 * 
 * // build inner border by appending "*" on either side of picture[strIndex]
 * // build 2 outer "*" border with picture[0].length + 2
 * 
 * // convert stringbuilder to string and return

*/ 
