import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora de Área y Perímetro");
            System.out.println("\n1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("\nElige una figura: ");
            int figura = scanner.nextInt();

            if (figura == 6) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.println("1. Calcular Área");
            System.out.println("2. Calcular Perímetro");
            System.out.print("Elige una operación: ");
            int operacion = scanner.nextInt();

            switch (figura) {
                case 1: // Círculo
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + area);
                    } else {
                        double perimetro = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo es: " + perimetro);
                    }
                    break;
                case 2: // Cuadrado
                    System.out.print("Ingresa el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = Math.pow(ladoCuadrado, 2);
                        System.out.println("El área del cuadrado es: " + area);
                    } else {
                        double perimetro = 4 * ladoCuadrado;
                        System.out.println("El perímetro del cuadrado es: " + perimetro);
                    }
                    break;
                case 3: // Triángulo
                    System.out.print("Ingresa la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = (base * altura) / 2;
                        System.out.println("El área del triángulo es: " + area);
                    } else {
                        System.out.print("Ingresa el lado 1 del triángulo: ");
                        double lado1 = scanner.nextDouble();
                        System.out.print("Ingresa el lado 2 del triángulo: ");
                        double lado2 = scanner.nextDouble();
                        System.out.print("Ingresa el lado 3 del triángulo: ");
                        double lado3 = scanner.nextDouble();
                        double perimetro = lado1 + lado2 + lado3;
                        System.out.println("El perímetro del triángulo es: " + perimetro);
                    }
                    break;
                case 4: // Rectángulo
                    System.out.print("Ingresa la longitud del rectángulo: ");
                    double longitud = scanner.nextDouble();
                    System.out.print("Ingresa el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = longitud * ancho;
                        System.out.println("El área del rectángulo es: " + area);
                    } else {
                        double perimetro = 2 * (longitud + ancho);
                        System.out.println("El perímetro del rectángulo es: " + perimetro);
                    }
                    break;
                case 5: // Pentágono
                    System.out.print("Ingresa el lado del pentágono: ");
                    double ladoPentagono = scanner.nextDouble();
                    System.out.print("Ingresa el apotema del pentágono: ");
                    double apotema = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = (5 * ladoPentagono * apotema) / 2;
                        System.out.println("El área del pentágono es: " + area);
                    } else {
                        double perimetro = 5 * ladoPentagono;
                        System.out.println("El perímetro del pentágono es: " + perimetro);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
