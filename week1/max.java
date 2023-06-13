public class max {
    public static void main(String[] args) 
    {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double avarage = (double)((a + b + c + d + e) / 5.0);
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

        System.out.println(avarage);
        System.out.println(min);
        System.out.println(max);        
    }
}
