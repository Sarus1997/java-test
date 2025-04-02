import java.util.Scanner;

class Land {
    int h;
    int w;

    public Land(Scanner scanner) {
        System.out.print("Land Height: ");
        this.h = scanner.nextInt();
        System.out.print("Land Width: ");
        this.w = scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Land myObj = new Land(scanner);
        scanner.close();
        
        System.out.println("Sum: " + (myObj.h + myObj.w) + " cm");
    }
}
