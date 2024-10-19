public class rectangle extends shape{
    private int length;
    private int width;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public rectangle() {
        super();
        length= 0;
        width= 0;
    }

    public rectangle(String name, String color, int length, int width) {
     super(name, color);
       this.length = length;
       this.width = width;
    }

    public void print() {
        System.out.println("Length\t:" + length);
        System.out.println("Width\t:" + width);
}

}     
