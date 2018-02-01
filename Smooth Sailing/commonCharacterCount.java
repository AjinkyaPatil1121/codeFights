int commonCharacterCount(String s1, String s2) {
    
    int comCount = 0;
    Hashtable<Character,Integer> s1chars = new Hashtable<>();
    
    int count = 0; char ch;
    for (int i = 0; i < s1.length(); i++)
    {
        ch = s1.charAt(i);
        
        if (s1chars.get(ch) == null){
            count = 1;
            s1chars.put(ch,count);
        }
        else{
            count = s1chars.get(ch);
            s1chars.put(ch,++count);
        }
    }
    
    for (int j = 0; j < s2.length(); j++)
    {
        ch = s2.charAt(j);
        
        if (s1chars.get(ch) != null && s1chars.get(ch) != 0)
        {
            count = s1chars.get(ch);
            s1chars.put(ch,--count);
            comCount++;
        }
        else{
            continue;
        }
    }
    
    return comCount;
}
// init common counter var
// init HT
// Loop over s1
    // store s1 in HT (s1char, s1count)
// Loop over s2
    // if exist in HT && s1count not 0
        // subtract s1count
        // inc comCount
    //else
        // continue
//
// return comCount
//
