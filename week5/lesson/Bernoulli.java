public class Bernoulli
{
    public static int binomial(int n)
    {
        int heads = 0;

        for (int j = 0; j < n; j++)
        {
            if (StdRandom.bernoulli(0.5))
            {
                heads++;
            }
        }
        return heads;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] freq = new int[n+1];
        for (int t = 0; t < trials; t++)
        {
            freq[binomial(n)]++;
        }

        double[] normalized = new double[n+1];

        for (int i = 0; i <= n; i++)
        {
            normalized[i] = (double) freq[i] / trials;
        }

        StdStats.plotLines(normalized);

        double mean = n / 2.0;
        double stddev = Math.sqrt(n) / 2.0;
        double[] phi = new double[n+1];

        for (int i = 0; i <= n; i++)
        {
            phi[i] = Gaussian2.pdf(i, mean, stddev);
        }
        StdStats.plotLines(phi);
    }

}