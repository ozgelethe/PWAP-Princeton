public class Divisors
{
    // returns the greatest common divisor of a and b
    public static int gcd(int a, int b)
    {
        if (a == 0 && b == 0)
        {
            return 0;
        }

        int new_a = Math.abs(a);
        int new_b = Math.abs(b);

        while (new_b != 0)
        {
            int t = new_b;
            new_b = new_a % new_b;
            new_a = t;
        }

        return new_a;
        
    }

    // returns the least common multiple of a and b
    public static int lcm(int a, int b)
    {
        if (a == 0 || b == 0)
        {
            return 0;
        }

        int new_a = Math.abs(a);
        int new_b = Math.abs(b);

        int lc = new_a / gcd(new_a, new_b);

        lc = lc * new_b;

        return lc;
    }

    //returns true if a and b are relatively prime; false otherwise
    public static boolean areRelativelyPrime(int a, int b)
    {
        if (gcd(a, b) == 1)
        {
            return true;
        }

        else return false;
    }

    // retuns the number of integers between 1 and n that are
    // relatively prime with n
    public static int totient(int n)
    {
        if (n <= 0)
        {
            return 0;
        }

        else
        {
            int count = 0;

            for (int i = 1; i <= n; i++)
            {
                if (areRelativelyPrime(i, n))
                {
                    count++;
                }
            }
            return count;        
        }
        
    }

    // takes two integers command-line arguments a and b and prints
    // each function, evaluated in the format and order
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int gc = gcd(a, b);
        int lc = lcm(a, b);
        boolean RP = areRelativelyPrime(a, b);
        int eul_a = totient(a);
        int eul_b = totient(b);

        System.out.println("gcd(" + a + "," + " " + b + ")" + " = " + gc);
        System.out.println("lcm(" + a + "," + " " + b + ")" + " = " + lc);
        System.out.println("areRelativelyPrime(" + a + "," + " " + b + ")" + " = " + RP);
        System.out.println("totient(" + a + ")" + " = " + eul_a);
        System.out.println("totient(" + b + ")" + " = " + eul_b);

    }

}