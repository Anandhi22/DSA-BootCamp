public class Main {

    public static void main(String[] args) {
        int n = 6;
        int ans = findWays(n);
        System.out.println(ans);

    }

    private static int findWays(int n) {
        if ((n & 1) != 0) return 0;
        else return findCatalan(n / 2, new HashMap<>());
    }

    private static int findCatalan(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        int ways = 0;
        for (int i = 0; i < n; i++) {
            ways += (findCatalan(i, memo) * findCatalan(n - i - 1, memo));

        }
        memo.put(n, ways);
        return ways;
    }

}
