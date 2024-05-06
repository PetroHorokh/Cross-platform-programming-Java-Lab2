import java.util.Scanner;

public class Main {

    public static double task1(Scanner scanner){

        System.out.println("Завдання №1");

        float S1, S2, p1, p2, S;

        System.out.print("Введіть суму для задіяння першої знижки S1: ");
        S1 = scanner.nextFloat();

        do{
            System.out.print("Введіть суму для задіяння другої знижки S2( S1 < S2): ");
            S2 = scanner.nextFloat();
        }while(S2 <= S1);

        do{
            System.out.print("Введіть першу знижку p1( 0 < p1 < 1): ");
            p1 = scanner.nextFloat();
        }while(p1 <= 0 || 1 <= p1);

        do{
            System.out.print("Введіть другу знижку p2( 0 < p2 < 1): ");
            p2 = scanner.nextFloat();
        }while(p2 <= 0 || 1 <= p2 );

        System.out.println("Введіть суму цін продуктів: ");
        S = scanner.nextFloat();

        if(S >= S1){
            if(S >= S2){
                return S * (1 - p2);
            }
            return S * (1 - p1);
        }
        return S;
    }

    public static void task2(Scanner scanner){

        System.out.println("Завдання №2");

        double a, b, c, delta, l, x1, x2;

        do{
            System.out.print("Введіть коефіцієнт а: ");
            a = scanner.nextDouble();

            System.out.print("Введіть коефіцієнт b: ");
            b = scanner.nextDouble();
        }while(a == 0 && b == 0);

        l = - b/a;

        System.out.print("Введіть коефіцієнт c: ");
        c = scanner.nextDouble();

        delta = a * a * c * c + 4 * b * c;

        if(delta <= 0){
            System.out.println("Solution:(" + l + ";inf)");
        }
        else{
            x1 = ( a * c - Math.sqrt(delta))/2;
            x2 = ( a * c + Math.sqrt(delta))/2;

            if(l < x1){
                System.out.println("Solution:(" + l + ";" + x1 + "]U[" + x2 + ";inf)");
            }
            else if(l == x1){
                System.out.println("Solution:[" + x2 + ";inf)");
            }
            else if(x1 < l && l < x2){
                System.out.println("Solution:[" + x1 + ";" + l + ")U[" + x2 + ";inf)");
            }
            else if(l == x2){
                System.out.println("Solution:[" + x1 + ";" + x2 + ")U(" + x2 + ";inf)");
            }
            else if(x2 < l){
                System.out.println("Solution:[" + x1 + ";" + x2+ "]U(" + l + ";inf)");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сума цін продуктів: " + task1(scanner));

        task2(scanner);
    }
}
