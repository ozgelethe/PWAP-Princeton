public class Birthday {
    public static void main(String[] args) 
    {

        if(args.length != 2){
            System.out.println("Usage: java Birthday <n> <trials>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] counter = new int[n + 2];
        double fraction = 0.0;
        counter[0] = 0;

        System.out.println(1 + "\t" + 0 + "\t" + fraction);

        int k = 1;

        while (fraction <= 0.5)
        {
            counter[k] = 0;
            for (int i = 0; i < trials; i++)
            {
                boolean[] hasBday = new boolean[n];     //hasBday[d] = true, if someone born on day d; false otherwise

                int people = 0;
                while (true) 
                {
                    people++;                           // one more person enters the room

                    int d = (int)(n * Math.random());   // integer between 0 and n-1

                    if (hasBday[d])
                    {
                        break;                          // found two people with the same birthday
                    }
                    hasBday[d] = true;                  // update array
                }
                
                if (people == k + 1)
                {
                    counter[k]++;
                }
            }
            fraction = fraction + (double) counter[k] / trials;
            System.out.println(k + 1 + "\t" + counter[k] + "\t" + fraction);
            k++;
        }


    }
}
