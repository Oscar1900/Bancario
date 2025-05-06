import java.util.Scanner;

public class Desafiobancario {

    public static void main(String[] args) {
        double saldo = 1599.99;
        double retiro;
        double deposito;
        int opcion = 0;
        boolean salir = false;

                System.out.println("**************************************");
                        System.out.println("Nombre de Cliente : Tony Stark");
                        System.out.println("Tipo de Cuenta : Corriente");
                        System.out.println("Saldo disponible:" + saldo + "$");
                        System.out.println("**************************************");

                String menu = """
                          ** Escriba el número de la opción deseada **
                          1 - Cosultar Saldo
                          2 - Retirar
                          3 - Depositar
                          9 - Salir
                        """;
                Scanner teclado = new Scanner(System.in);

        while(!salir) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es " + saldo + "$");
                    break;
                case 2:
                    System.out.print("Cuál es el monto a retirar:");
                    retiro = teclado.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                        System.out.println("El saldo actualizado es " + saldo + "$");
                    } else {
                        saldo -= retiro;
                        System.out.println("El saldo actualizado es " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.print("Cuál es el monto a depositar:");
                    deposito = teclado.nextDouble();
                    if (deposito > (double)0.0F) {
                        saldo += deposito;
                        System.out.println("El saldo actualizado es " + saldo + "$");
                    } else {
                        System.out.println("error en monto");
                        System.out.println("El saldo actualizado es " + saldo + "$");
                    }
                    break;
                case 9:
                    salir = true;
                    System.out.println("Finalizando el programa. Muchas gracias por utilizar nuestros servicios");
            }
        }

    }
}