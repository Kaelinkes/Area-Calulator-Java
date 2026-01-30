import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pick = -1;
        String tryAgain = "YES";

        do {
            Menu();
            System.out.print("Enter your pick: ");
            pick = input.nextInt();
            
            if (pick == 1) {
                double r;

                System.out.print("Enter the raidus: ");
                r = input.nextDouble();

                Cricle cricle = new Cricle(r);
                cricle.display();

            }else if (pick == 2) {
                double h,b;

                System.out.print("Enter the height: ");
                h = input.nextDouble();
                System.out.print("Enter the base: ");
                b = input.nextDouble();

                Triangle triangle = new Triangle(b, h);
                triangle.display();
            }else if(pick == 3){
                double l,w;

                System.out.print("Enter the width: ");
                w = input.nextDouble();
                System.out.print("Enter the Lenght: ");
                l = input.nextDouble();

                Rectangle rectangle = new Rectangle(w, l);
                rectangle.display();
            }else{
                System.err.println("Invalid pick");
            }

            System.out.print("Would you like to go again(yes/no): ");
            tryAgain = input.next().toUpperCase();

        } while (tryAgain.contentEquals("YES"));
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
        System.out.println(" ");
        System.out.println("#################################");
    }
}
