public class BouncingBall {
    public static void main(String[] args) {

        // scalethe field
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();

        // starting point
        double rx = .480;
        double ry = .860;

        // velocity of the ball
        double vx = .015;
        double vy = .023;

        // set the radius of the ball
        double radius = .05;


        while (true)
        {
            //the area
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            // dont let the ball leave the area and BOUNCE!
            if (Math.abs(rx + vx) + radius > 1.0)
            {
                vx = -vx;
            }

            if (Math.abs(ry + vy) + radius > 1.0)
            {
                vy = -vy;
            }

            // update positions
            rx = rx + vx;
            ry = ry + vy;

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);
            
            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(20);
        }
        
    }
}
