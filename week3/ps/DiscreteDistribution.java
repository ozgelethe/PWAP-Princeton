public class DiscreteDistribution {
    public static void main(String[] args) 
    {
        int m = Integer.parseInt(args[0]);
        int n = args.length;
        int[] a = new int[n - 1];
        int[] s = new int[n]; // n because of s0=0
        s[0] = 0;

        for (int i = 1; i < n; i++)
        {
            a[(i-1)] = Integer.parseInt(args[i]);
            s[i] = s[i-1] + a[(i-1)];
        }

        int r;
        
        for (int j = 0; j < m; j++)
        {
            r = (int)(Math.random()*s[(n-1)]);
            for (int k = 1; k <= n; k++)
            {
                if (r >= s[(k-1)] && r < s[k])
                {
                    System.out.print(k + " ");
                }
            }
        }
        System.out.println(" ");
    }
}
