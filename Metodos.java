public class Metodos {
    
    private Banco[] cola;
    private int frente;
    private int ultimo;
    private int contadorTurnos;

    public Metodos(int capacidad) {
        this.cola = new Banco[capacidad];
        this.frente = 0;
        this.ultimo = 0;
        this.contadorTurnos = 1;
    }

  
    public Metodos encolar(String nombre, String servicio, String hora) {
        if (ultimo < cola.length) {
           
            cola[ultimo] = new Banco(contadorTurnos++, nombre, servicio, hora, false);
            ultimo++;
            System.out.println(">>> Cliente registrado en la cola.");
        } else {
            System.out.println(">>> Error: La fila está llena.");
        }
        return this; 
    }

    public Banco atender() {
        if (frente < ultimo) {
            Banco clienteAtendido = cola[frente];
            clienteAtendido.setAtendido(true); 
            frente++; 
            return clienteAtendido; 
        }
        return null; 
    }

    public Banco verSiguiente() {
        if (frente < ultimo) {
            return cola[frente]; 
        }
        return null;
    }

   
    public Metodos mostrarReporte() {
        System.out.println("\n REPORTE GENERAL DE TURNOS ");
        
        for (int i = 0; i < ultimo; i++) {
            Banco b = cola[i];
           
            String estado = b.isAtendido() ? "[ATENDIDO]" : "[PENDIENTE]";
            System.out.println(estado + " Turno #" + b.getId() + " - " + b.getNombre());
        }
        if (ultimo == 0) {
            System.out.println("No hay registros el día de hoy.");
        }
        return this;
    }

    
    public int getFrente() { return frente; }
    public int getUltimo() { return ultimo; }
    public Banco[] getCola() { return cola; }
}

   