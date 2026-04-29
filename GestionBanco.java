import java.util.Scanner;

public class GestionBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       
        Metodos control = new Metodos(20); 
        int opcion = 0;

        do {
            System.out.println("\n GESTIÓN BANCARIA ");
            System.out.println("1. Registrar llegada");
            System.out.println("2. Atender turno");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cola actual ");
            System.out.println("5. Mostrar reporte de turnos ");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: "); String n = entrada.nextLine();
                    System.out.print("Servicio: "); String s = entrada.nextLine();
                    System.out.print("Hora: "); String h = entrada.nextLine();
                    control.encolar(n, s, h); 
                    break;

                case 2:
                    Banco atendido = control.atender();
                    if (atendido != null) {
                        System.out.println("Se atendió a: " + atendido.getNombre());
                    } else {
                        System.out.println("Fila vacía.");
                    }
                    break;

                case 3:
                    Banco sig = control.verSiguiente();
                    if (sig != null) {
                        System.out.println("Siguiente en turno: " + sig.getNombre());
                    } else {
                        System.out.println("Nadie en fila.");
                    }
                    break;

                case 4: 
                    System.out.println("\n FILA DE ESPERA ACTUAL ");
                    if (control.getFrente() == control.getUltimo()) System.out.println("No hay nadie.");
                    for (int i = control.getFrente(); i < control.getUltimo(); i++) {
                        System.out.println("Turno #" + control.getCola()[i].getId() + " - " + control.getCola()[i].getNombre());
                    }
                    break;

                case 5: 
                    System.out.println("\n REPORTE GENERAL DE TURNOS ");
                    for (int i = 0; i < control.getUltimo(); i++) {
                        Banco b = control.getCola()[i];
                        String estado = b.isAtendido() ? "[ATENDIDO]" : "[PENDIENTE]";
                        System.out.println(estado + " Turno #" + b.getId() + " - " + b.getNombre());
                    }
                    break;
            }
        } while (opcion != 6);
        entrada.close();
    }
}