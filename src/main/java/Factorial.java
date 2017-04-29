public class Factorial {

    public static Integer i_solve(Integer n) {
        Integer acc = 1;
        for(; n > 0; n--) {
            acc *= n;
        }
        return acc;
    }

    public static Integer r_solve(Integer n) {
        if (n == 1) { return 1; }
        return n * r_solve(n-1);
    }
}
