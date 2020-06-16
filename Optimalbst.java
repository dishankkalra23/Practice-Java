public class Optimalbst extends minHeap {


    public static int[][] costOfBST = new int[len + 1][len + 1];


    // Initialisation of cost matrix

    public static void diffZero() {
        // cost of j-i = 0

        for (int k = 0; k < len; k++)
            costOfBST[k][k] = frequency[k];
        // System.out.println(Arrays.deepToString(costOfBST));

    }

    public static int sum(int rows, int columns) {
        int totalFreq = 0;
        for (int i = rows; i <= columns; i++) {
            if (i >= frequency.length)
                continue;
            totalFreq += frequency[i];
        }
        return totalFreq;
    }

    public static void diffN() {
        // j - i >= N (N > 0)

        for (int i = 2; i <= len; i++) {

            for (int row = 0; row <= len - i + 1; row++) {

                int col = row + i - 1;

                // Integer.MAX_VALUE: To initialise maximum value
                costOfBST[row][col] = Integer.MAX_VALUE;

                // Formula: cost[i][j] = min i<k<=j(cost[i,k-1]+c[k,j])

                for (int r = row; r <= col; r++) {

                    // c = cost when keys[r] becomes root of this subtree
                    int cost = ((r > row) ? costOfBST[row][r - 1] : 0)
                            + ((r < col) ? costOfBST[r + 1][col] : 0) + sum(row, col);
                    if (cost < costOfBST[row][col])
                        costOfBST[row][col] = cost;

//                    if (r > row) {
//                        cost += costOfBST[row][r - 1];
//                    }
//                    else {
//                        cost += 0;
//
//                        }
//
//                    if (r < col){
//                        cost += costOfBST[r + 1][col];
//                    }
//                    else {
//                        cost += 0
//
//                     cost += sum(row,col);

                }

            }
        }
        // System.out.println(costOfBST);
        System.out.println("Cost of Optimal Binary Search Tree: " + costOfBST[0][len - 1]);
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        minHeap obj = new minHeap();

        diffZero();
        diffN();

        obj.insertValues();

        System.out.println("Min Heap: ");
        for (int i = 1; i < obj.heap.length; i++) {

            System.out.print(obj.heap[i] + " ");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("\nExecution Time: " + (endTime - startTime) + " ms");
    }

}

class minHeap {
    public static int[] nodes = {10, 20, 30};
    public static int[] frequency = {34, 8, 50};
    public static int len = nodes.length;


    public static int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};
    // array: Original array --> to find heap
    public int arrayLen = array.length;

    public int[] heap = new int[arrayLen + 1];
    public int currentLen = 0;

    // Inserting each value in heap from array.

    public void insertValues() {
        if (arrayLen > 0) {
            for (int value : array) {
                currentLen++;
                int currentValue = currentLen;
                heap[currentValue] = value;
                swapSmaller(currentValue);
            }
        }
    }

    public void swapSmaller(int position) {
        int currentPosition = position;
        int parentPosition = position / 2;
        while (currentPosition > 0 && heap[parentPosition] > heap[currentPosition]) {
            swapping(currentPosition, parentPosition);
            currentPosition = parentPosition;
            parentPosition = parentPosition / 2;
        }
    }

    public void swapping(int first, int second) {
        int temporary = heap[first];
        heap[first] = heap[second];
        heap[second] = temporary;
    }


}
