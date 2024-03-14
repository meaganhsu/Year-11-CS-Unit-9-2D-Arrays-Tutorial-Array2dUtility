
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] a) {
        int sum = 0;

        for (int[] i : a) {
            for (int j : i) sum += j;
        }

        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] a) {
        return (double) sum(a) / (a.length * a.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] a) {
        int min = 1234567890;

        for (int[] i : a) {
            for (int j : i) {
                if (j < min) min = j;
            }
        }

        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] a) {
        int max = -1234567890;

        for (int[] i : a) {
            for (int j : i) {
                if (max < j) max = j;
            }
        }

        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] a) {
        int e = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int x = a[i][j];
                if (x % 2 == 0) e++;
            }
        }

        return e;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] a) {
        int e = 0;

        for (int[] i : a) {
            for (int j : i) {
                if (j % 2 == 0) e++;
            }
        }

        return e;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                if (0 > j) return false;
            }
        }

        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums (int[][] a) {
        int[] x = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                x[i] += a[i][j];
            }
        }

        return x;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums (int[][] a) {
        int[] x = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                x[j] += a[i][j];
                x[j] += a[i][j];
            }
        }

        return x;
    }
}
