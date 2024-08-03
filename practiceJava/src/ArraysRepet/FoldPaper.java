package ArraysRepet;

public class FoldPaper {

    public static int minMoves(int h, int w, int h1, int w1) {
        // Helper function to count the number of folds required
        int countFolds(int current, int target) {
            int folds = 0;
            while (current > target) {
                current = (current + 1) / 2;  // Fold in half
                folds += 1;
            }
            return folds;
        }

        // Make sure we are always folding towards the smaller dimension
        if (h < h1 || w < w1) {
            return -1;  // It's impossible to fold to a larger dimension
        }

        // Fold height and width separately
        int foldsHeight = countFolds(h, h1);
        int foldsWidth = countFolds(w, w1);

        return foldsHeight + foldsWidth;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(minMoves(2, 3, 2, 2));  // Output: 1
        System.out.println(minMoves(8, 4, 6, 1));  // Output: 3
    }

    // Helper function defined outside of the main function for clarity
    private static int countFolds(int current, int target) {
        int folds = 0;
        while (current > target) {
            current = (current + 1) / 2;  // Fold in half
            folds += 1;
        }
        return folds;
    }
}
