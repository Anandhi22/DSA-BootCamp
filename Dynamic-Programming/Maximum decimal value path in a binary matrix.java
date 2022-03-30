public class Main {

    public static void main(String[] args) {
        int arr[][] = {{1, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 1}};
        int max;
        max = findMax(arr, 0, 0, arr.length, arr[0].length, 0, new HashMap<>());
        System.out.println(max);


    }

    private static int findMax(int[][] arr, int currRow, int currCol, int row, int col, int count, HashMap<String, Integer> memo) {

        if (currRow == row - 1 && currCol == col - 1) return arr[currRow][currCol] * (int) (Math.pow(2, count));

        if (currRow >= row || currCol >= col) return 0;

        String key = currRow + "-" + currCol;

        if (memo.containsKey(key)) return memo.get(key);

        int ans = Integer.MIN_VALUE;

        int right = arr[currRow][currCol] * (int) (Math.pow(2, count)) + findMax(arr, currRow, currCol + 1, row, col, count + 1, memo);
        int down = arr[currRow][currCol] * (int) (Math.pow(2, count)) + findMax(arr, currRow + 1, currCol, row, col, count + 1, memo);
        ans = Math.max(right, down);

        memo.put(key, ans);

        return memo.get(key);

    }
}

