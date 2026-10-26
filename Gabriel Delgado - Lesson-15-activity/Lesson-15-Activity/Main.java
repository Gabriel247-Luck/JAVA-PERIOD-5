class Main {

    public static void main(String[] args) {
        (new Main()).init();
    }

    void print(Object o){System.out.println(o);}
    void printt(Object o){System.out.print(o);}

    void init() {
        System.out.println(spaces(10) + "DONE");
        System.out.println(harmonic(5));
        System.out.println(sin(3, Math.PI / 6));
        fib(6);
        mTable();
    }

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

    double sin(int n, double x) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / fact(2 * i + 1);
        }
        return sum;
    }

    int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
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
        System.out.println();
    }

    void nRow(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.print(n * i + " ");
            }
             System.out.println();
              }

    void mTable() {
        for (int i = 1; i <= 12; i++) {
            nRow(i);
        }
    }
}