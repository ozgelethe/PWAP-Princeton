public class ShannonEntropy {
    public static void main(String[] args) {

        // sequence of n integers are between 1 and m
        int m = Integer.parseInt(args[0]);

        int[] elements = new int[m+1];

        int count = 0;

        while(!StdIn.isEmpty()){
            int i = StdIn.readInt();
            elements[i]++;
            count++;
        }

        double shannon = 0.0;

        for (int i = 1; i < m; i++) {
            if (elements[i] == 0;)
        }


    }
}