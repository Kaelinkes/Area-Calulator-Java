public class Rectangle  extends Shape{
    
    double width,lenght;

    Rectangle(double w, double l){
        this.width = w;
        this.lenght = l;
    }
    
    @Override 
    double area(){
        return width*lenght;
    }

    @Override
    void display(){
        System.out.printf("Area of a rectangle is: %.2f \n",area());
    }
}
