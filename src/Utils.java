package src;

public class Utils {
    public static int redondear(float n) {
        int res = 0;
        while (n >= 1 || n <= -1) {
            n += n > 0 ? -1 : 1;
            res += n < 0 ? -1 : 1;
        }
        res += n > 0.5 ? 1 : 0;
        return res;
    }
}
