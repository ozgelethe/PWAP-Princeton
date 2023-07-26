public class Gaussian2 {
    public static double pdf(double x)
    {
        return Math.exp(-x*x /2) / Math.sqrt(2 * Math.PI);

    }

}