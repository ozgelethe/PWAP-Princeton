package week3.ps;

public class Minesweeper{
    public static void main(String[] args) {
        
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // creaate the map
        int[][] map = new int[m][n];

        // fill with mines impossible maps
        if (k > m * n) {
            k = m * n;
        }

        int minesPut = 0;

        while (minesPut < k) {
            int randm = (int)(Math.random() * m * n);
            // a great way to create random different ints
            int x = randm / n; 
            int y = randm % n;

            // dont put mines the same location
            if (map[x][y] == 1) continue;

            // put the mines
            map[x][y] = 1;
            minesPut++;
        }

        for (int i = 0; i < m * n; i++){

            int a = i / n;
            int b = i % n;
            
            if (map[a][b] == 1){
                System.out.print("*  ");
            }

            else {
                int index = 0;

                // The a, x-axis is the horizontal row, 
                // and the b, y-axis is the vertical column.
                
                for (int orderX = -1; orderX <= 1; orderX++) {

                    for (int orderY = -1; orderY <=1; orderY++) {

                        if (orderX + a < 0 || orderY + b < 0 || orderX + a >= m || orderY + b >= n){
                            continue;
                        }
                        index += map[orderX + a][orderY + b];
                    }
                }
                System.out.print(index + "  ");
            }
            if (i % n == n-1) System.out.println();
        }
    }
}
