class Multi_dim_Arrays_2 {
    public static void main(String[] args) {
        
        // Declaring and initializing a 3x3 array using curly brackets
        int my2dArrays[][] = { 
            {2, 2, 2}, 
            {2, 2, 2}, 
            {2, 2, 2} 
        };

        // Printing the 2D array in a grid format
        // We use my2dArrays.length to ensure we print all rows
        for (int i = 0; i < my2dArrays.length; i++) {
            for (int j = 0; j < my2dArrays[i].length; j++) {
                System.out.print(my2dArrays[i][j] + " ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}