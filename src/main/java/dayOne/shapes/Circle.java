package dayOne.shapes;

public class Circle {
    public double radius;

public Circle(double radius){
    this.radius = radius;
}


    //Calculate the area of a circle (pi r squared)
    public Double calculateArea(){
    return Math.PI * this.radius * this.radius;

    }
}
