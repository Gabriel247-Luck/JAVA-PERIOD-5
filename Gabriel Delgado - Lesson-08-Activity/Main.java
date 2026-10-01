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
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
        
    }
    double coneVolume(double radius, double height) {
        return  (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
    double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt( (x2 - x1) * (x2 - x1) +(y2 - y1) * (y2 - y1));
       
    }
}
