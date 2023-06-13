public class GeneralizedHarmonic {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double sum = 0;

        for (int t = 1; t <= n; t++) {
            sum = sum + (1 / (Math.pow(t, r)));
        }
        System.out.println(sum);
    }
}
