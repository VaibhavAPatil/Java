public class InvertedHalfPyramid180deg {
    public static void main(String args[]){
        /*    Inverted Half Pyramid (Rotated by 180 degree)
         *       *
         *      **
         *     ***
         *    ****
         */

         int n=4;
          for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                // For Spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
    }
}
