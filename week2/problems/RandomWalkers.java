public class RandomWalkers {

    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        double trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        double sum = 0;
        int steps = 0;
        double times = 0;
        double a = 0;
        double avarage = 0;

        while (times <= trials)
        {
            while (Math.abs(x) + Math.abs(y) != r)
            {
                a = Math.random();
                if (a > 0.75)
                {
                    x += 1;
                }
                else if (a > 0.5)
                {
                    x -= 1;
                }
                else if (a > 0.25)
                {
                    y += 1;
                }
                else
                {
                    y -= 1;
                }

                steps++;
                a = 0;
            }
            times++;
            sum = sum + steps;
        }
        avarage = sum / trials;
        System.out.println("average number of steps = " + avarage);
    }
}