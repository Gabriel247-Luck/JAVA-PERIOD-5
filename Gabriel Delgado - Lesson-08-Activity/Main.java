class Main {

    public static void main(String[] args) {
        (new Main()).init();
    }

    void init() {
        print("Hello, world!");
        System.out.println(FtoC(32));
        System.out.println(sphereVolume(5));
        System.out.println(coneVolume(5, 10));
        System.out.println(distance(1, 2, 4, 6));
    }

    void print(String message) {
        System.out.println(message);
    }

    double FtoC(double fahrenheit) {
       double result = (fahrenheit - 32) * 5.0 / 9.0;
        return result;
    }
    double sphereVolume(double radius) {
        double result =  (4.0 / 3.0) * Math.PI * radius * radius * radius;
         return result;
    }
    double coneVolume(double radius, double height) {
       double result =  (1.0 / 3.0) * Math.PI * radius * radius * height;
        return result;
    }
    double distance(double x1, double y1, double x2, double y2) {
       double result =  Math.sqrt( (x2 - x1) * (x2 - x1) +(y2 - y1) * (y2 - y1));
        return result;
    }
}
