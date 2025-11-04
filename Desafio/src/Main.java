import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su DNI ");
        int dni= datos.nextInt();
        String tipoDeCuenta= "Corriente";
        double saldo = 2540.00;
        // podria agregar un JSON de la lista de nombres completos con DNI para identificar usuario.
        if (dni==51173683) {
            String nombre = "Melany Ascencio";
            System.out.println("****************************************************");
            System.out.println("\n Nombre del Cliente: " + nombre);
            System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
            System.out.println("El saldo es: " + saldo + "$");

            String menu = """
                           *** Escriba el nùmero de la opcion  deseada ***
                           1- Consultar saldo
                           2- Retirar 
                           3- Depositar 
                           4- Salir
                            """;
            Scanner teclado = new Scanner(System.in);

        while(opcion !=4){
        System.out.println(menu);
        opcion= teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el monto que desea retirar?");
                    double monto= teclado.nextDouble();
                    if(monto>saldo) {
                        System.out.println("El saldo insuficiente");
                    }else{
                        saldo-= monto;
                        System.out.println("El saldo actual es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("cuanto desea depositar?");
                    double deposito= teclado.nextDouble();
                    if(deposito<=0) {
                        System.out.println("Por favor ingrese un monto mayor.Intente otra vez");
                    } else  {
                        saldo+= deposito;
                        System.out.println("El saldo actual es: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        System.out.println("Salió con exito!");
        }

        } else {
            System.out.println("Usuario no encontrado, vuelva a intentar. Gracias.");
        }
    }
}