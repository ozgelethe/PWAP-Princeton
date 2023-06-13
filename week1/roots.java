public class roots
{
    public static void main(String[] args)
    {
        // parse coefficients from command line 
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        
        // calculate the roots of x*x + b*x + c
        double disc =b*b - 4.0*c;
        double d = Math.sqrt(disc);
        double root1 = (-b + d) / 2.0;
        double root2 = (-b - d) /2.0;

        // print them out
        System.out.println(root1);
        System.out.println(root2);
    }
}