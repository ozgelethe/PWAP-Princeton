public class GreatCircle 
{
    public static void main(String[] args)
    {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // distance betwen latitudes and longitudes
        double dlog = Math.toRadians(x2 - x1); 
        double dlat = Math.toRadians(y2 - y1);
        
        //convert to radians
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);

        // apply formula
        double inside_root = Math.pow(Math.sin(dlog / 2), 2) +
                   Math.pow(Math.sin(dlat / 2), 2) *
                   Math.cos(x1) * Math.cos(x2);
        double r = 6371.0;
        double distance = 2 * r * Math.asin(Math.sqrt(inside_root));
        
        // print out the result
        System.out.print(distance);
        System.out.println(" kilometers");
    }
}
