

public class shape {
    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public shape() {
        color = "";
        name = "";
    }

    public shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void print() {
        System.out.println("Color\t:" + color);
        System.out.println("Name\t:" + name);
    }
    
}