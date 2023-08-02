public class ActivationFunction 
{

    // retuns the heaviside function of x
    public static double heaviside(double x)
    {
        if (x < 0.0) return 0.0;
        else if (x == 0.0) return 0.5;
        else if (x > 0.0) return 1.0;
        else return Double.NaN;
    }

    // returns the sigmoid fuction of x
    public static double sigmoid(double x)
    {
        return 1 / (1 + 1 / (Math.exp(x)));
    }

    // returns the hyperbolic tangent of x
    public static double tanh(double x)
    {
        double t = Math.exp(x);
        return (t - 1 / t) / (t + (1/t));
    }

    // returns the softsign function of x
    public static double softsign(double x)
    {
        return x / (1 + Math.abs(x));
    }

    // returns the square non-linearlity function of x
    public static double sqnl(double x)
    {
        if (x <= -2) return -1.0;
        else if (x < 0.0) return x + (x * x / 4);
        else if (x < 2.0) return x + (x * x / 4);
        else if (x >= 2.0) return 1.0;
        else return Double.NaN;

    }

    // takes a double command-line argument x and prints each activation
    // funtion, evaluated, in the format (and order) given below
    public static void main(String[] args)
    {
        // All activation functions should return NaN (not a number) 
        // if the argument is NaN.
        double x = Double.parseDouble((args[0]));
        double heave, sig, tan, soft, sqnl;
        if (Double.isNaN(x))
        {
            heave = Double.NaN;
            sig = Double.NaN;
            tan = Double.NaN;
            soft = Double.NaN;
            sqnl = Double.NaN;
        }

        else 
        {
            heave = heaviside(x);
            sig = sigmoid(x);
            tan = tanh(x);
            soft = softsign(x);
            sqnl = sqnl(x);
        }

        System.out.printf("%1$10s%2$s%3$s%4$s%n", "heaveside(", x, ") = ", heave);
        System.out.printf("%1$10s%2$s%3$s%4$s%n", "sigmoid(", x, ") = ", sig);
        System.out.printf("%1$10s%2$s%3$s%4$s%n", "tanh(", x, ") = ", tan);
        System.out.printf("%1$10s%2$s%3$s%4$s%n", "softsign(", x, ") = ", soft);
        System.out.printf("%1$10s%2$s%3$s%4$s%n", "sqnl(", x, ") = ", sqnl);
    }
}