public class CMYKtoRGB 
{
    public static void main(String[] args)
    {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = (double) (1 - black);
        double red = Math.round((255 * white * (1 - cyan)));
        double green = Math.round((255 * white * (1 - magenta)));
        double blue = Math.round((255 * white * (1 - yellow)));

        int red1 = (int)red;
        int green1 = (int)green;
        int blue1 = (int)blue;

        System.out.print("red   = ");
        System.out.println(red1);
        System.out.print("green = ");
        System.out.println(green1);
        System.out.print("blue  = ");
        System.out.println(blue1);
    }
}
