class pr23 {

    static int binarySearch(int[] arr, int low, int high, int key) {

        if (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;

            if (key < arr[mid])
                return binarySearch(arr, low, mid - 1, key);

            return binarySearch(arr, mid + 1, high, key);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};

        int index = binarySearch(arr, 0, arr.length - 1, 40);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}