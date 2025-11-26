import java.util.*;

class solution {
    // Function to find all divisors
    public List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);            // smaller divisor

                if (i != N / i) {      // avoid duplicate for perfect square
                    res.add(N / i);    // larger divisor
                }
            }
        }

        Collections.sort(res); // sort in ascending order
        return res;            // return list
    }
}

public class printdivisors {
    public static void main(String[] args) {
        solution sol = new solution();

        int N = 36; // input number

        List<Integer> result = sol.getDivisors(N);

        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
