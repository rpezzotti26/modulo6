import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú de figuras geométricas
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int opcionFigura = scanner.nextInt();

        // Mostrar menú de operación
        System.out.println("Seleccione la operación:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
        int opcionOperacion = scanner.nextInt();

        // Variables para almacenar el resultado
        double resultado = 0;

        // Calcular según la figura y la operación seleccionadas
        switch (opcionFigura) {
            case 1: // Círculo
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    resultado = Math.PI * Math.pow(radio, 2); // Área
                } else if (opcionOperacion == 2) {
                    resultado = 2 * Math.PI * radio; // Perímetro
                }
                break;

            case 2: // Cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    resultado = Math.pow(ladoCuadrado, 2); // Área
                } else if (opcionOperacion == 2) {
                    resultado = 4 * ladoCuadrado; // Perímetro
                }
                break;

            case 3: // Triángulo (equilátero)
                System.out.print("Ingrese el lado del triángulo: ");
                double ladoTriangulo = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    resultado = (Math.sqrt(3) / 4) * Math.pow(ladoTriangulo, 2); // Área
                } else if (opcionOperacion == 2) {
                    resultado = 3 * ladoTriangulo; // Perímetro
                }
                break;

            case 4: // Rectángulo
                System.out.print("Ingrese la longitud del rectángulo: ");
                double longitud = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectángulo: ");
                double ancho = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    resultado = longitud * ancho; // Área
                } else if (opcionOperacion == 2) {
                    resultado = 2 * (longitud + ancho); // Perímetro
                }
                break;

            case 5: // Pentágono
                System.out.print("Ingrese el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                System.out.print("Ingrese el apotema del pentágono: ");
                double apotema = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    resultado = (5 * ladoPentagono * apotema) / 2; // Área
                } else if (opcionOperacion == 2) {
                    resultado = 5 * ladoPentagono; // Perímetro
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerrar el escáner
        scanner.close();
    }
}
