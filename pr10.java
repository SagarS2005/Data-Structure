class pr10{
    
    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 100, 110, 120}
        };

        System.out.println("Row-Major Order:");

        for (int i = 0; i < arr.length; i++) {          // Traverse rows
            for (int j = 0; j < arr[i].length; j++) {   // Traverse columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}