public class PlotFilter
{
    public static void main(String[] args) {

        // read coordinates of bounding box
        double Xmin = StdIn.readDouble();
        double Ymin = StdIn.readDouble();
        double Xmax = StdIn.readDouble();
        double YMax = StdIn.readDouble();

        // rescale using coordinates so all the points 
        // fit right within the drawing window
        StdDraw.setXscale(Xmin, Xmax);
        StdDraw.setYscale(Ymin, YMax);

        while(!StdIn.isEmpty())
        {
            // read and plot a point
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }
    }
}