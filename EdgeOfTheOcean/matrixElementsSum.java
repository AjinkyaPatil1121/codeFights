int matrixElementsSum(int[][] matrix) {
    
    // For storing running total cost
    int totalRoomCost = 0;
    
    // Loop over column-wise
    // [0] is a problem
    // [row++] for not a perfect rect. matrix
    // [][][] [0] will only give 3 EDIT - (this kinda rect. matrix cant exist)
    // [][][][]
    // EDIT - Scrapped! and then it works! :D
    for (int col_j=0; col_j < matrix[0].length; col_j++) // column length |1| |2| |3|.length
    {
        int row_i = 0;
        while (row_i < matrix.length)//row length counting down
                                    // = 1
                                    // = 2
                                    // = 3.length
        {
            if (matrix[row_i][col_j] == 0){ // skip the column and go to the next
                break;
            }
            else{
                totalRoomCost += matrix[row_i][col_j];
            }
            row_i++;
        }
    }
    
    return totalRoomCost;  
}
// Algorithm design
/* 
 * init int totalRoomCost
 * loop over column-wise
 *   if 0 then continue i.e. skip the column
 *   else add to running total in totalRoomCost
 * return totalRoomCost
 * 
 * 
 */
