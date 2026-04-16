import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Paginaweb[] pila = new Paginaweb[20];
        int top = -1; 
        int opcion = 0;

        do {
            System.out.println("\n NAVEGADOR");
            System.out.println("1. Nueva Pagina ");
            System.out.println("2. Atras ");
            System.out.println("3. Historial");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
                case 1:
                    if (top < pila.length - 1) {
                        System.out.print("URL: "); String u = entrada.nextLine();
                        System.out.print("Titulo: "); String t = entrada.nextLine();
                        System.out.print("Fecha: "); String f = entrada.nextLine();
                        
                        top++;
                       
                        pila[top] = new Paginaweb(u, t, f);
                        System.out.println("Apilado.");
                    }
                    break;

                case 2:
                    if (top >= 0) {
                        System.out.println("Saliendo de: " + pila[top].getTitulo());
                        pila[top] = null;
                        top--;
                    } else {
                        System.out.println("Pila vacia.");
                    }
                    break;

                case 3:
                    System.out.println("\n HISTORIAL ");
                    for (int i = top; i >= 0; i--) {
                        System.out.println(pila[i].getTitulo() + " (" + pila[i].getUrl() + ")");
                    }
                    break;
            }
        } while (opcion != 4);
        
        entrada.close();
    }
}