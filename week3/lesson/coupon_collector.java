public class coupon_collector {
    public static void main(String[] args) 
    {
        int M = Integer.parseInt(args[0]); // number of needed distinct cards
        int trials = Integer.parseInt(args[1]); // number of cards collected
        int cards = 0; // number of distinct cards
        
        boolean[] found;

        for (int i = 0; i < trials; i++)
        {
            int distinct = 0;
            found = new boolean[M];
            while (distinct < M)
            {
                int r = (int)(Math.random() * M);
                cards++;
                if(!found[r])
                {
                    distinct++;
                    found[r] = true;
                }
            }
        }
        System.out.println(cards/trials);
    }
}