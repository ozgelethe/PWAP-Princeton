public class RightTriangle
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = (int)(a + b + c - max - min);

        boolean is_right_triangle;

        is_right_triangle = (max > 0) && (min > 0) && (middle > 0);

        is_right_triangle = is_right_triangle && (max*max == min*min + middle*middle);

        // print them out
        System.out.println(is_right_triangle);
    }
}