// Declare an array                         double[] a;
// Create an array of a given length        a = new double[1000];
// Refer to an array entry by index         a[i] = b[j] + c[k];
// Refer to the length of an array          a.length;

// Default initialization to 0 for numeric types        a = new double[1000];
// no need to use a loop like
//  for (int i = 0; i < 1000; i++)
//  a[i] = 0.0;

// Declare, create and initialize in one statement      double[] a = new double[1000];
// Initialize to literal values                         double[] x = { 0.3, 0.6, 0.1 };

// Access command-line args in system array
// int stake = Integer.parseInt(args[0]);
// int goal = Integer.parseInt(args[1]);
// int trials = Integer.parseInt(args[2]);

// copy to another array
// double[] b = new double[N];
// for (int i = 0; i < N; i++)
//  b[i] = a[i]; 

//  Create an array with N random values
//  double[] a = new double[N];
// for (int i = 0; i < N; i++)
//  a[i] = Math.random();

//  Print array values, one per line
//  for (int i = 0; i < N; i++)
//  System.out.println(a[i]);

//  Compute the average of array values
//  double sum = 0.0;
//  for (int i = 0; i < N; i++)
//   sum += a[i];
//  double average = sum / N; 

//  Find the maximum of array values
//  double max = a[0];
//  for (int i = 1; i < N; i++)
//   if (a[i] > max) max = a[i];
