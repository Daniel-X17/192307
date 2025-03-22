import java.util.Scanner;

public class NominaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sueldoTotal = 0;
        int rangoJusticia = 0;
        int sueldoVIP = 0;

        for (int i = 1; i <= 10; i++) {
            double sueldo = -1; 
            boolean sueldoValido = false;

            while (sueldoValido) {
                System.out.print("Ingrese el sueldo del empleado " + i + ": ");
                sueldo = scanner.nextDouble();

                
                if (sueldo <= 0) {
                    System.out.println("Es invalido no puede ser cero ni negativo.");
                } else {
                    sueldoValido = true;
                }
                for (int i = 100; i <=300; i++) {
                    double sueldo <= 300;
                    boolean sueldoVIP;
                }   
                
                sueldoTotal += sueldo   


                System.out.println("Reporte Final:");
                System.out.println("Cantidad de sueldos en el rango de justicia ($100 - $300): " + sueldo);
                System.out.println("Cantidad de sueldos VIP (mayores a $300): " + sueldoVIP);
                
            }
        }
    }
}

    