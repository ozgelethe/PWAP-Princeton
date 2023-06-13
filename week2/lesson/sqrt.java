public class sqrt 
{
    public static void main(String[] args) 
    {
        double EPS = 1E-15; // error tolarance(15 places)
        // Epsilon: The difference between 1 and the smallest value greater 
        // than 1 that is representable for the data type. 
        // https://en.wikipedia.org/wiki/Machine_epsilon
        double c = Double.parseDouble(args[0]);
        double t = c;
        while(Math.abs(t - c/t) > t*EPS)
        {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
