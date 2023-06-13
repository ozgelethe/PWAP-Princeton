public class dog_walk {
    public static void main(String[] args) 
    {
        int N = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int dead_ends = 0;
        for (int t = 0; t < trials; t++)
        {
            boolean[][] a = new boolean[N][N];
            int x = N/2;
            int y = N/2;

            while(x > 0 && x < N - 1 && y > 0 && y < N - 1)
            {
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
                {
                    dead_ends++;
                    break;
                }

                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25)
                {
                    if (!a[x+1][y])
                    {
                        x++;
                    }
                }
                else if (r < 0.5)
                {
                    if (!a[x-1][y])
                    {
                        x--;
                    }
                }
                else if (r < 0.75)
                {
                    if (!a[x][y+1])
                    {
                        y++;
                    }
                }
                else if (r < 1.00)
                {
                    if (!a[x+1][y])
                    {
                        y--;
                    }
                }

            }
        }
        System.out.println(100*dead_ends/trials + "% dead ends.");
    }
}