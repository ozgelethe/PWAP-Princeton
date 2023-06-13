// Declare a two-dimensional array                     double[][] a;
// Create a two-dimensional array of a given length    a = new double[1000][1000];
// Refer to an array entry by index                    a[i][j] = b[i][j] * c[j][k];
// Refer to the number of rows                         a.length;
// Refer to the number of columns                      a[i].length;  *can be different for each row
// Refer to row i                                      a[i]          *no way to refer to column j

// operation                               typical code

// Default initialization to 0
// for numeric types                       a = new double[1000][1000];

// Declare, create and initialize
// in a single statement                   double[][] a = new double[1000][1000];

// Initialize to literal values            double[][] p =
//                                         {
//                                             { .92, .02, .02, .02, .02 },
//                                             { .02, .92, .32, .32, .32 },
//                                             { .02, .02, .02, .92, .02 },
//                                             { .92, .02, .02, .02, .02 },
//                                             { .47, .02, .47, .02, .02 },
//                                         };


// Vector addition

// double[] c = new double[N];
// for (int i = 0; i < N; i++)
//  c[i] = a[i] + b[i];


//  Matrix addition

// double[][] c = new double[N][N];
// for (int i = 0; i < N; i++)
//  for (int j = 0; j < N; j++)
//  c[i][j] = a[i][j] + b[i][j];


// Vector dot product

// double sum = 0.0;
// for (int i = 0; i < N; i++)
//  sum += a[i]*b[i];


//  Matrix multiplication

// double[][] c = new double[N][N];
// for (int i = 0; i < N; i++)
//  for (int j = 0; j < N; j++)
//  for (int k = 0; k < N; k++)
//  c[i][j] += a[i][k] * b[k][j];