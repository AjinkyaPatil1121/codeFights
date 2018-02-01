int[] sortByHeight(int[] a) {
    
    int[] sorteda = a.clone();
    ArrayList<Integer> atemp = new ArrayList<>();
    
    for (int a_index = 0; a_index < a.length; a_index++)
    {
        if (a[a_index] == -1){
            continue;
        }
        else{
            atemp.add(a[a_index]);
        } 
    }
    
    atemp.sort(null); // For natural ordering
    
    int atemp_ind = 0;
    for (int sa_index = 0; sa_index < sorteda.length; sa_index++)
    {
        if (sorteda[sa_index] == -1){
            continue;
        }
        else{
            sorteda[sa_index] = atemp.get(atemp_ind++);
        } 
    }
    
    return sorteda;
}
// Modified insertion sort ?
// copy a into atemp
// loop and swap values skipping -1 in for loop and during comparasion (will only do one pass)
    // needs nested loop to rescan and put each value in place for a fixed value in above loop
// return atemp
// NOPE: will need to use On2
// 
// First thought approach: remove values not -1 from a into atemp arraylist On
// sort atemp with native method
// put into sorteda[] clone one by one On
// return sorteda[]
// 
// On
