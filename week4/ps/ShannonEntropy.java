public class ShannonEntropy {
    public static void main(String[] args) {

        // sequence of n integers are between 1 and m
        int m = Integer.parseInt(args[0]);

        int[] values = new int[m+1];

        // compute frequencies that is the times of integer i appears
        int freq = 0;
 
        while(!(StdIn.isEmpty()))
        {
            int i = StdIn.readInt();
            values[i]++;
            freq++;
        }

        // compute the shannon entropy
        double shannon = 0.0;

        for (int i = 1; i <= m; i++) 
        {
            if (!(values[i] == 0))
            {
                double p = (double)values[i]/freq;
                double temp = (p) * (Math.log(p) / Math.log(2));
                shannon = shannon - temp;
            }
        }
        StdOut.printf("%.4f\n", shannon);

    }
}