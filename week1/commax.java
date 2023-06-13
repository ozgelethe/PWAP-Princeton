public class commax 
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = (int)(a + b + c - max - min);

        // print them out
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }
}
