public class BubbleSort {
    // Soring Method
    void sorting(int[] arr){
        int j = 0;
        int n = arr.length;

        // Outer Loop
        while (j != n){
            // Inner loop
            //boolean swap = false;
            for (int i =0; i < n-1-j; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
              //      swap = true;
                }
            }
            j = (j + 1);
            //if (swap == false){
            //    break;}
        }
    }
    // Display Method
    void display(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Main Method
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] array = {64, 34, 25, 12, 22, 90, 11};

        obj.sorting(array);
        obj.display(array);

    }
}
