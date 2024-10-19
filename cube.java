public class cube extends rectangle {
    private int height;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public cube() {
        super();
        height = 0;
    }

    public cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
    }

    public void print() {
        System.out.println("Height\t:" + height);
    }



}
