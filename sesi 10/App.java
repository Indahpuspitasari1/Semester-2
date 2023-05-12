public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nBubble Sort");
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array sebelum diurutkan : ");
        printArray(arr1);
        bubbleSort(arr1, "asc");
        System.out.println("Array setelah diurutkan (ascending): ");
        printArray(arr1);
        bubbleSort(arr1, "desc");
        System.out.println("Array setelah diurutkan (descending): ");
        printArray(arr1);

        System.out.println("\nInsertion Sort");
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array sebelum diurutkan : ");
        printArray(arr2);
        insertionSort(arr2, "asc");
        System.out.println("Array setelah diurutkan (ascending): ");
        printArray(arr2);
        insertionSort(arr2, "desc");
        System.out.println("Array setelah diurutkan (descending): ");
        printArray(arr2);

        System.out.println("\nSelection Sort");
        int[] arr3 = {64, 34, 25, 12, 22, 100, 90};
        System.out.println("Array sebelum diurutkan : ");
        printArray(arr3);
        selectionSort(arr3, "asc");
        System.out.println("Array setelah diurutkan (ascending): ");
        printArray(arr3);
        selectionSort(arr3, "desc");
        System.out.println("Array setelah diurutkan (descending): ");
        printArray(arr3);
    }

    public static void insertionSort(int[] arr, String order) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            
            if (order.equals("asc")){
                while (j >= 0 && arr[j] > key){
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            } else if (order.equals("desc")){
                while (j >= 0 && arr[j] < key){
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            } else {
                throw new Error("Unknown order");
            }
        }
    }

    public static void selectionSort(int[] arr, String order) {
        int pos;
        int temp;

        for (int i = 0; i < arr.length; i++){
            pos = i;
            for (int j = i + 1; j < arr.length; j++){
                if (order.equals("asc")){
                    if (arr[j] < arr[pos]){ // find the index of the minimum
                        pos = j;
                    }
                }else if (order.equals("desc")){
                    if (arr[j] > arr[pos]){ // find the index of the maximum
                        pos = j;
                    }
                }else {
                    throw new Error("Unknown order");
                }
            }
            temp = arr[pos]; // swap current element with the minimum
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr, String order) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (order.equals("asc")){
                    if (arr[j] > arr[j + 1]) {
                        // tukar element arr[j] dengan arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }else if (order.equals("desc")){
                    if (arr[j] < arr[j + 1]) {
                        // tukar element arr[j] dengan arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }else{
                    throw new Error("Unknown order");
                }
            }
        }
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
