public class Square extends Shape {
    double side; 

    Square(double s){
        this.side = s;
    }
    @Override
    double area(){
        return Math.pow(side, 2);
    }
    @Override
     void display(){
        System.out.printf("Area of a square is: %.2f \n",area());
    }
}
