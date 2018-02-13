int[] alternatingSums(int[] a) {
    
    int[] weightSum = {0,0};
    
    for (int arr_i = 0; arr_i < a.length; arr_i += 2)
    {
        weightSum[0] += a[arr_i];
    }
    
    for (int arr_j = 1; arr_j < a.length; arr_j += 2)
    {
        weightSum[1] += a[arr_j];
    }
    
    return weightSum;
}
