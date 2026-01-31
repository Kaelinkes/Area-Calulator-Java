public class Circle extends Shape{
    
    double radius;

    Circle(double r){
        this.radius = r;
    }
    
    @Override 
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    void display(){
        System.out.printf("Area of a circle is: %.2f \n",area());
    }
}
