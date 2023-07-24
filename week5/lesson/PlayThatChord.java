public class PlayThatChord {
    public static double[] avg(double[] a, double[] b) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] / 2.0 + b[i] / 2.0;
        }
        return c;
    }
}