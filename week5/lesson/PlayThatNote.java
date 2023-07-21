public class PlayThatNote 
{
    public static double[] tone(double hz, double duration)
    {
        int n = (int)(44100 * duration);
        double[] a = new double[n+1];
        for (int i = 0; i <= n; i++)
        {
            a[i] = Math.sin(2 * Math.PI * i * hz / 44100);
        }
        return a;
    }

    public static void main(String[] args)
    {
        double hz = Double.parseDouble(args[0]);
        double duration = Double.parseDouble(args[1]);
        double[] a = tone(hz, duration);
        StdAudio.play(a);
    }
}