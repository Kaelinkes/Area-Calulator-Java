public class Cricle extends Shape{
    
    double raduis;

    Cricle(double r){
        this.raduis = r;
    }
    
    @Override 
    double area(){
        return Math.PI * Math.pow(raduis, 2);
    }
    @Override
    void display(){
        System.out.printf("Area of a circle is: %.2f \n",area());
    }
}
