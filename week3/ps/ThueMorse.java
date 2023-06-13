public class ThueMorse {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]); // plot n-by-n grid of cells

        boolean[] tm = new boolean[n];

        tm[0] = true;
        int p = 1;

        // generate a thue-morse suite of size n
        while(p < n) 
        {
            // copy the previous suite but inverted
            int pcopy = p;

            for (int i = 0; i < p; i++)
            {
                tm[pcopy] =! tm[i];
                pcopy++;

                if (pcopy == n)
                {
                    break;
                }
            }

            p = pcopy;
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (tm[i])
                {
                    if (tm[j])
                    {
                        System.out.print("+  ");
                    }
                    else 
                    {
                        System.out.print("-  ");
                    }
                }
                else
                {
                    if (tm[j])
                    {
                        System.out.print("-  ");
                    }
                    else
                    {
                        System.out.print("+  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}