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
    
}