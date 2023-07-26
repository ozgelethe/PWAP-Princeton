public class GaussianPlot {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-4.0, 4.0);
        StdDraw.setYscale(0, .5);
        StdDraw.setPenRadius(0.01);
        double[] x = new double[n+1];
        double[] y = new double[n+1];

        for (int i = 0; i <= n; i++)
        {
            x[i] = -4.0 + 8.0 * i / n;
            y[i] = Gaussian2.pdf(x[i]);
        }

        for(int i = 0; i < n; i++)
        {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
    }
}