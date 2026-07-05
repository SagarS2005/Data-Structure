class pr27 {

    public static void main(String[] args) {

        int[][] cost = {
                {9,2,7},
                {6,4,3},
                {5,8,1}
        };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (cost[i][j] < min)
                    min = cost[i][j];
            }
        }

        System.out.println("Minimum Cost (Simple Bound): " + min);
    }
}