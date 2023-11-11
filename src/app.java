import java.util.Scanner;

public class app {
    private int num1;
    private int num2;
    private char operator;

    public app() {
    }

    public double calcular(){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                    return 0;
                }
                result = (double)(num1) / (double)(num2);
                break;
            default:
                System.out.println("Operación inválida");
                return 0;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        return result;
    }

    public void saludar(){
        System.out.println("Hola mundoooo :D");
    }
    public void repetir(){
        System.out.println("Desea volver a hacer una operacion? \n Presione S para si y cualquier letra para salir");
        Scanner input = new Scanner(System.in);
        char respuesta = input.next().charAt(0);
        if(respuesta == 'S' || respuesta == 's'){
            calcular();
            repetir();
        }

    public void despedidad(){
        System.out.println("Gracias por usar el programa");
    }
    }
}
