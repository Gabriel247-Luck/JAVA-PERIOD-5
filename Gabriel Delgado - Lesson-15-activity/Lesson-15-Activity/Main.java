class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(spaces(10) + "DONE");

    String spaces(int N) {
        String result = "";

        for (int i = 0; i < N; i++) {
            result += " ";
        }
        return result;
    }

   double harmonic(int N) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

     double sin(int terms, double x) {
        double sum = 0;
        double term = x;

        for (int i = 0; i < terms; i++) {
            sum += term;
            term *= -x * x / ((2 * i + 2) * (2 * i + 3));
        }
        return sum;
    }

        void fib(int N) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(first);

            if (i < N - 1) {
                System.out.print(", ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
        
         void nRow(int N) {
          for (int i = 1; i <= N; i++) {
            System.out.printf("%4d", N * i);
        }

        System.out.println();
        
        }
        void mTable(int N) {
          for (int i = 1; i <= N; i++) {
            nRow(i);
        }
    } 
  }
}
}