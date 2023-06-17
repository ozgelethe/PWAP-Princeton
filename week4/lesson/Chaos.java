public class Chaos {
    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
    
        // the hight of triagle is 
        // squareroot of (1^2 - 0.5^2 ) = 0.75
        double c = Math.sqrt(0.75);

        // vertices are cx[0]cy[0], cx[1]cy[1], cx[2]cy[2] 
        double[] cx = {0.000, 1.000, 0.500};
        double[] cy = {0.000, 0.000, c};

        StdDraw.setPenRadius(0.008);
        
        double x = 0.0;
        double y = 0.0;

        for (int t=0; t < trials; t++)
        {
            int r = (int)(Math.random()*3);
            x = (x + cx[r]) / 2.0;
            y = (y + cy[r]) / 2.0;
            StdDraw.point(x, y);
        }
    }
}