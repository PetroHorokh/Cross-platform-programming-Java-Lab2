import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static double task1(Scanner scanner){

        System.out.println("Завдання №1");

        double S1, S2, p1, p2, S;

        System.out.print("Введіть суму для задіяння першої знижки S1: ");
        S1 = scanner.nextDouble();

        do{
            System.out.print("Введіть суму для задіяння другої знижки S2( S1 < S2): ");
            S2 = scanner.nextDouble();
        }while(S2 <= S1);

        do{
            System.out.print("Введіть першу знижку p1( 0 <= p1 <= 1): ");
            p1 = scanner.nextDouble();
        }while(p1 >= 1 || p1 <= 0);

        do{
            System.out.print("Введіть першу знижку p2( 0 <= p2 <= 1): ");
            p2 = scanner.nextDouble();
        }while(p2 >= 1 || p2 <= 0);

        System.out.print("Введіть другу знижку p2: ");
        p2 = scanner.nextDouble();

        System.out.println("Введіть суму цін продуктів: ");
        S = scanner.nextDouble();

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

        double a, b, c, delta;

        System.out.print("Введіть коефіцієнт а: ");
        a = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт b: ");
        b = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт c: ");
        c = scanner.nextDouble();

        delta = a * a * c * c + 4 * b * c;

        if(delta > 0){
            System.out.println(
                    "Інтервал, що буде розв'язком: [-inf;"
                            + ((a*c - sqrt(delta))/2)
                            + "]U["
                            + ((a*c + sqrt(delta))/2)
                            + ";inf]");
        }
        else if(delta <= 0){
            System.out.println("Інтервал, що буде розв'язком: [-inf;inf]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сума цін продуктів: " + task1(scanner));

        task2(scanner);
    }
}
