class Multi_dim_Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int my2dArrays[][] = new int[2][3];

        // 1. FIXED: Changed '2' to a dynamic calculation
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // This will store 1, 2, 3 in row 1 and 4, 5, 6 in row 2
                my2dArrays[i][j] = (i * 3) + j + 1; 
            }
        }

        // 2. FIXED: Using print() instead of println() for grid layout
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(my2dArrays[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println("\nSum of 1D array: " + sum);
    }
}