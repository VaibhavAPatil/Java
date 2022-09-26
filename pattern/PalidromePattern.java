public class PalidromePattern {
    public static void main(String args[]) {
        /*
         * Palidrome Pattern
         * 1
         * 2 1 2
         * 3 2 1 2 3
         * 4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */

        int n = 5;

        for (int i = 1; i<=n; i++) {
            // Spaces
            int spaces = n-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

        // Numbers

            // First Half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // Second Half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
