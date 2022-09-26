public class SolidRhombus {
    public static void main(String args[]){
        /*         Solid Rhombus
         *             *****
         *            *****
         *           *****
         *          *****
         *         *****
         */

         int n=5;
         for(int i=1; i<=n; i++){

            // Spaces
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            
            System.out.println();
         }

    }
}
