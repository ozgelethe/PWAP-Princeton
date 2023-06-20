public class TennisBall {
    public static void main(String[] args) {
        double rx = .480;
        double ry = .860;

        double vx = .015;
        double vy = .023;

        double radius = .05;

        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();

        while (true)
        {
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
            StdDraw.filledSquare(0.0, 0.0, 1.0);

            if (Math.abs(rx + vx) + radius > 1.0)
            {
                StdAudio.play("pipebang.wav");
                vx = -vx;

            }

            if (Math.abs(ry + vy) + radius > 1.0)
            {
                StdAudio.play("pipebang.wav");
                vy = -vy;

            }

            rx = rx + vx;
            ry = ry + vy;

            StdDraw.picture(rx, ry, "Tennisball.png");

            StdDraw.show();
            StdDraw.pause(20);

        }
        
    }
}
