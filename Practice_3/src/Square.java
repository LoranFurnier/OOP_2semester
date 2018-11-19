public class Square extends Rectangle{
    public Square(){};
    public Square(double side){
        width = length = side;
    };
    public Square(double side, String c, boolean f){
        width = length = side;
        color = c;
        filled = f;
    };
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = this.length = side;
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
            return "This square is " + getColor() + ", its area is " + getArea() + ", its perimeter is " + getPerimeter() + "\nAlso, it's filled";
        } else return "This square is " + getColor() + ", its area is " + getArea() + ", its perimeter is " + getPerimeter();
    }
}
