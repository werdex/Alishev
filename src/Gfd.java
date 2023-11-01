import java.util.Scanner;

public class Gfd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи возраст");
        int age = scanner.nextInt();
        switch(age){
            case 0 :
                System.out.println("ты родился");
                break;
            case 7 :  System.out.println("ты пошел в шк");
            break;
            case 18 :
                System.out.println("ты закочил школу");
            break;
                default:
                System.out.println("ни один из вариант");
        }
    }
}
