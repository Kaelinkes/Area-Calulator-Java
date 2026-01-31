import java.util.Scanner;

class Main{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pick = -1;
        String tryAgain = "YES";

        do {
            Menu();
            System.out.print("Enter your pick: ");
            pick = input.nextInt();
            
            switch (pick) {
                case 1 -> CalculateCircle();
                case 2 -> CalculateTriangle();
                case 3 -> CalculateRectangle();
                case 4 -> CalculateSquare();
                default -> System.err.println("Invalid option");
            }
            
            System.out.print("Would you like to go again(yes/no): ");
            tryAgain = input.next().toUpperCase();
            System.out.println(" ");

        }while (tryAgain.contentEquals("YES"));

        System.out.println("Exiting....\nHave a nice day");
        input.close();
    }

    static void Menu(){
        System.out.println("#################################");
        System.out.println("######## AREA Calculator ########");
        System.out.println("#################################");
        System.out.println(" ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Square");
        System.out.println(" ");
        System.out.println("#################################");
    }

    static void CalculateCircle(){
        double r;

        System.out.print("Enter the radius: ");
        r = input.nextDouble();
        
        Circle circle = new Circle(r);
        circle.display();
    }

    static void CalculateTriangle(){
        double h,b;

        System.out.print("Enter the height: ");
        h = input.nextDouble();
        System.out.print("Enter the base: ");
        b = input.nextDouble();

        Triangle triangle = new Triangle(b, h);
        triangle.display();
    }
    static void CalculateRectangle(){
        double l,w;

        System.out.print("Enter the width: ");
        w = input.nextDouble();
        System.out.print("Enter the lenght: ");
        l = input.nextDouble();

        Rectangle rectangle = new Rectangle(w, l);
        rectangle.display();
    }
    static void CalculateSquare(){
        double side; 

        System.out.print("Enter one of the sides of the Square: ");
        side = input.nextDouble();

        Square square = new Square(side);
        square.display();
    }
}
