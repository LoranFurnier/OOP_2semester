public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){};
    public Rectangle(double w, double l){
        width = w;
        length = l;
    };
    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    };
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea (){
        return width*length;
    }
    @Override
    public double getPerimeter (){
        return 2*(width+length);
    }
    @Override
    public String toString (){
        if (filled==true) {
            return "This rectangle is " + getColor() + ", its area is " + getArea() + ", its perimeter is " + getPerimeter() + "\nAlso, it's filled";
        } else return "This rectangle is " + getColor() + ", its area is " + getArea() + ", its perimeter is " + getPerimeter();
    }
}
