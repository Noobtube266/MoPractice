package dayOne.shapes;

public class Square {
    public double length;
    public double width;

    public Square(double length, double width){
        this.length = length;
        this.width = width;

    }
    public Double calculateArea(){
        return this.length * this.width;
    }
}
