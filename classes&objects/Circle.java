class Circle {

    public int radius;

    public int getRadius() {
        return radius;
    }
    public double getAreaOfCircle() {
        return Math.PI * radius * radius;
    }
    public static void main(String args[]) {
        Circle object1 = new Circle();
        object1.radius = 4;
        System.out.println(object1.getRadius());
        System.out.println(object1.getAreaOfCircle());

        Circle object2 = new Circle();
        object2.radius = 2;
        System.out.println(object2.getRadius());
        System.out.println(object2.getAreaOfCircle());
    }
}