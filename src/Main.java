//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("administración de consultorio");
            System.out.println("1 Registrar paciente");
            System.out.println("2 Registrar Doctor");
            System.out.println("3 Registrar Cita");
            System.out.println("4 ...");
            System.out.println("5 Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Registrar paciente");
                case 2:
                    System.out.println("Registrar doctor");
                case 3:
                    System.out.println("Registrar cita");
                case 5:
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Opcion Incorrecta");
            }


        }while( opcion !=5);

        }
    }
