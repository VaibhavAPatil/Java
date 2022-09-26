public class NumberPyramid {
    public static void main (String args[]){
        /*       Number Pyramid
         *           1 
         *          2 2 
         *         3 3 3
         *        4 4 4 4
         *       5 5 5 5 5
         */

         int n = 5;
         for(int i=1; i<=n; i++){

            // Spaces
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // Numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
         }
    }
}
