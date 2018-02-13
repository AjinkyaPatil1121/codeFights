String reverseParentheses(String s) {
    
    StringBuilder retS = new StringBuilder(s); 
    StringBuilder revS;
    //char lastBrac = 'p'; 
    char curch = 'p';
    char indL = 'p';
    ArrayList<Integer> indexBrac = new ArrayList<>();
    Stack<Character> lastBrac = new Stack<>();
    
    for (int stri = 0; stri < s.length(); stri++)
    {
        //System.out.println("RETSTOPFOR==="+retS);
        if (stri >= retS.length()){
            break;
        }
        curch = retS.charAt(stri);
    
        //retS.append(curch);
        
        if ( curch == '(' || curch == ')' || 
             curch == '{' || curch == '}' ||  
             curch == '[' || curch == ']' 
           )
        {
            switch (curch){
                case '(':
                case ')':
                    if (curch == '('){
                        indexBrac.add(stri);
                        lastBrac.push(curch);
                        break;
                    }
                    if (lastBrac.size() != 0){
                        indL = lastBrac.pop();
                        if (indL == '(' ){
                            int indI = indexBrac.size()-1;
                            int substr = indexBrac.get(indI);
                            substr++;
                            revS = new StringBuilder(retS.substring(substr,stri));
                            //System.out.println("REVS==="+revS);
                            //retS.delete(indexBrac.get(indI),stri+1);
                            //System.out.println("RETS-STRINGSOFAR==="+retS);
                            retS.replace(indexBrac.get(indI), stri+1, 
                                            revS.reverse().toString());
                            //System.out.println("RETS-AFTERREV==="+retS);
                            indexBrac.remove(indI);
                            stri = stri - 2;
                        }
                    }
                    break;
/*                case '{':
                case '}':
                    if (curch == '{'){
                        indexBrac = stri;
                    }
                    if (lastBrac == '{'){
                        revS = new StringBuilder(s.substring(indexBrac,stri));
                        retS.delete(indexBrac,stri);
                        retS.replace(indexBrac, stri, revS.reverse().toString());
                    }
                    lastBrac = curch;                    
                    break;
                case '[':
                case ']':
                    if (curch == '['){
                        indexBrac = stri;
                    }
                    if (lastBrac == '['){
                        revS = new StringBuilder(s.substring(indexBrac,stri));
                        retS.delete(indexBrac,stri);
                        retS.replace(indexBrac, stri, revS.reverse().toString());
                    }
                    lastBrac = curch;                    
                    break; */
            }
        }
    }
   
    return retS.toString();

}
// as(as(a)s)sdsd(sds}dsad{asasa}erfg
// 
// init lastbrack = "" init indexBrac, countBrack
// 
// ORRR parse-loop
    // ch = getChar
    // stringRet.add(ch)
    // if ( ch == ({[]}) )
        // switch ch
            // case ( || )
                // if ( ch == (  )
                    // indexBrack = loopindex
                // if ( lastbrack == ( )
                    // new stringB = substr(indexBrac,loopindex).reverse
                    
                    // stringRet.replace(indexBrack,loopindex,with stringB)
                // lastbrack = ch
            // case [ || ]
                // if ( lastbrack == [ )
                    // lastbrack = ch
                    // string = take string and reverse
            // case { || }
                // if ( lastbrack == { )
                    // lastbrack = ch
                    // string = take string and reverse
// 
// 
// use 2 arrays to store opening and closing index
// 
// 
// 
// init stringbuilder instance and array
// StringBuilder revStrs[], nonrevStrs
// Arraylist bracketIndexS
// 
// loop-parse string for ( [ {, 
// for (int stri = 0; stri < s.length(); stri++)
    // ch = s.getCharAt(stri)
    // save index for bracket start
    // if (char == '(' || '[' || '{')
        // bracketIndexS.add(stri)
        // call bracket found(stri)
    // else
        // insert chars in a string builder
        // nonrevStrs.put(stri)
    // repeat
    //
// build the final string
    // take first chars, insert reverse string at bracket indexes
    // 
// return final string

// bracket found(int si)
    // parse-loop ahead to find closing bracket
    // while (s[si++] != ) problems, rescan everytime = expensive
    // if found
        // reverse stored string
        // return true
    // else store the chars
        // return false
