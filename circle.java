public class circle extends shape{
    private int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public circle() {
        super();
        radius= 0;
    }

    public circle(String name, String color, int radius) {
     super(name, color);
       this.radius = radius;
    }

    public void print() {
        System.out.println("Radius\t:" + radius);
}
    
}
