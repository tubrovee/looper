public class Saddle {
    public static void main(String[] args) {
        int[][] myNumbers =
                        {{42, 21, 32, 41, 25},
                        {51, 42, 43, 14, 31},
                        {54, 45, 52, 42, 23},
                        {69, 15, 51, 31, 35},
                        {51, 52, 33, 13, 23}};
        boolean isSaddle = isSaddlePoint(myNumbers, 5);
        System.out.println("Found Saddle->" + isSaddle);
    }
    static boolean isSaddlePoint(int mat[][], int num)
    {
        // Process all rows one by one
        for (int i = 0; i < num; i++)
        {
            // Find the max element of row i.
            // Also find column index of the minimum element
            int min_row = mat[i][0];
            int colindex = 0;
            for (int j = 1; j < num; j++)
            {
                if (min_row < mat[i][j])
                {
                    min_row = mat[i][j];
                    colindex = j;
                }
            }

            // Check if the minimum element of row is also
            // the maximum element of column or not
            int k;
            for (k = 0; k < num; k++)

                // Note that col_ind is fixed
                if (min_row > mat[k][colindex])
                    break;

            // If saddle point is present in this row then
            // print it
            if (k == num)
            {
                System.out.println("Saddle point is " + min_row);
                return true;
            }
        }

        // If Saddle Point not found
        return false;
    }
}
