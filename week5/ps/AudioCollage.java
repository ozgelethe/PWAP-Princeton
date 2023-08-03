public class AudioCollage
{
    // returns a new array that rescales a[] by a multiplicative factor of alpha
    public static double[] amplify(double[] a, double alpha)
    {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[i] * alpha;
        }

        return c;

    }

    // returns a new array that is the reverse of a[]
    public static double[] reverse(double[] a)
    {
        double c[] = new double[a.length];
        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[a.length - i];
        }

        return c;
    }

    // returns a new array that is the concatenation of a[] and b[]
    public static double[] merge(double[] a, double[] b)
    {
        int l = a.length + b.length;

        double[] c = new double[l];

        for(int i = 0; i < l; i++)
        {
            if (i < a.length)
            {
                c[i] = a[i];
            }

            else
            {
                c[i] = b[b.length+i-l];
            }
        }
        return c;
    }

    // returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailling 0s if necessary
    public static double[] mix(double[] a, double[] b)
    {
        int l = a.length > b.length? a.length:b.length;

        double[] new_a = new double[l];
        double[] new_b = new double[l];
        
        for (int i = 0;i < a.length; i++)
        {
            new_a[i] = a[i];
        }

        for (int i = 0; i < b.length; i++)
        {
            new_b[i] = b[i];
        }

        double[] c = new double[l];

        for ( int i = 0; i < l; i++)
        {
            c[i] = new_a[i] + new_b[i];
        }

        return c;

        // if (a.length > b.length)
        // {
        //     double[] new_b = new double[a.length];

        //     for (int i = 0; i < b.length; i++)
        //     {
        //         new_b[i] = b[i];
        //     }

        //     for (int j = b.length - 1; j < a.length; j++)
        //     {
        //         new_b[j] = 0;
        //     }


        // }

        // else if (b.length > a.length)
        // {
        //     double[] new_a = new double[b.length];

        //     for (int i = 0; i < a.length; i++)
        //     {
        //         new_a[i] = b[i];
        //     }

        //     for (int j = a.length - 1; j < b.length; j++)
        //     {
        //         new_a[j] = 0;
        //     }
        // }
    }

    // returns a new array that changesthe speed by the given factor
    public static double[] changespeed(double[] a, double alpha)
    {
        int n = a.length;
        int m = (int)Math.floor(n/alpha);

        double[] c = new double[m];
        
        for (int i = 0; i < m; i++)
        {
            int k = (int)Math.floor(i*alpha);
            c[i] = a[k];
        }

        return c;
        
    }

    // creates an audio collage and plays it on standard audio
    public static void main(String[] args)


} 