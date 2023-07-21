public class Newton 
{
    public static double sqrt(double c, double eps) 
    {
        // double in here is type of the return value
        // sqrt is method name
        // c and eps are argument declalarations
        // double eps = 1E-15;

        if (c < 0)
        {
            return Double.NaN;
        }

        double t = c;

        while (Math.abs(t - c/t) > eps*t) 
        {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    // DEF: the scope of a variable is the code that can refer to it by name
    public static void main(String[] args) 
    {
        int n = args.length;
        double[] a = new double[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = Double.parseDouble(args[i]);
        }

        for (int j = 0; j < a.length; j++)
        {
            double x = sqrt(a[j], 1e-3);
            StdOut.println(x);
        }
    }
}