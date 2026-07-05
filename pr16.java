class pr16 {
    
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {64, 25, 12, 22, 11, 90, 55, 33};
        int[] arr2 = arr1.clone();

        long start = System.nanoTime();
        selectionSort(arr1);
        long end = System.nanoTime();

        System.out.println("Selection Sort Time: " + (end - start) + " ns");

        start = System.nanoTime();
        insertionSort(arr2);
        end = System.nanoTime();

        System.out.println("Insertion Sort Time: " + (end - start) + " ns");
    }

}
