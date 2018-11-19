public class Circle extends Shape {
    private double radius;
    public Circle(){};
    public Circle (double r){
        radius = r;
    }
    public Circle (double r, String c, boolean f){
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea (){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter (){
        return Math.PI*2*radius;
    }
    @Override
    public String toString (){
        if (filled==true) {
            return "This circle is " + getColor() + ", its area is " + getArea() + ", its perimeter is " + getPerimeter() + "\nAlso, it's filled";
        } else return "This circle is " + getColor() + ", its area is " + getArea() + ", its perimeter is " + getPerimeter();
    }
}
