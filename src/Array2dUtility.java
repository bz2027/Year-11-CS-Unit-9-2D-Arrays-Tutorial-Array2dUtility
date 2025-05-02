
public class Array2dUtility {
        for (int[] row: values) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public static int sum(int[][] values) {
        int sum = 0;
        for (int[] row: values) {
            for (int cell: row) {
                sum += cell;
            }
        }
        return sum;
    }
    public static double average(int[][] values) {
        int s = sum(values);
        return (double) s / (values.length * values.length);
    }
    public static int minimum(int[][] values) {
        int min = values[0][0];
        for (int[] row: values) {
            for (int cell: row) {
                if (cell < min) {
                    min = cell;
                }
            }
        }

        return min;
    }
    public static int maximum(int[][] values) {
        int max = values[0][0];

        for (int[] row: values) {
            for (int cell: row) {
                if (cell > max) {
                    max = cell;
                }
            }
        }

        return max;
    }
    public static int evenCountStandard(int[][] values) {
        int evenCount = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    public static int evenCountEnhanced(int[][] values) {
        int evenCount = 0;

        for (int[] row: values) {
            for (int cell: row) {
                if (cell % 2 == 0) {
                    evenCount++;
                }
            }
        }

        return evenCount;
    }
    public static boolean allPositive(int[][] values) {
        for (int[] row: values) {
            for (int cell: row) {
                if (cell <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] rowSums(int[][] values) {
        int[] rowSum = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            for (int cell: values[i]) {
                rowSum[i] += cell;
            }
        }
        return rowSum;
    }
    public static int[] colSums(int[][] values) {
        int[] colSum = new int[values.length];
        for (int[] row : values) {
            for (int j = 0; j < row.length; j++) {
                colSum[j] += row[j];
            }
        }
        return colSum;
    }
}
