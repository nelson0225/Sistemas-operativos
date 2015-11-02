package logic;

/**
 * Esta clase define la información de los procesos ingresados.
 * @author: Camilo Rodríguez
 * @author: Nelson Barreto
 * @version: 26/10/15
 */
public class Proceso {
    private String nombre;
    private int tiempo;
    private int tiempoBloqueado;
    private int tiempoEjecutado;
    private byte interrupcion;
    /**
    * Constructor para inicializar la información de los procesos.
    */
    public Proceso(String nombre,int tiempo,int tiempoEjecutado,int tiempoBloqueado,byte interrupcion){
        setNombre(nombre);
        setTiempo(tiempo);
        setTiempoBloqueado(tiempoBloqueado);
        setTiempoEjecutado(tiempoEjecutado);
        setInterrupcion(interrupcion);

    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoBloqueado() {
        return tiempoBloqueado;
    }

    public void setTiempoBloqueado(int tiempoBloqueado) {
        this.tiempoBloqueado = tiempoBloqueado;
    }

    public int getTiempoEjecutado() {
        return tiempoEjecutado;
    }

    public void setTiempoEjecutado(int tiempoEjecutado) {
        this.tiempoEjecutado = tiempoEjecutado;
    }

    public byte getInterrupcion() {
        return interrupcion;
    }

    public void setInterrupcion(byte interrupcion) {
        this.interrupcion = interrupcion;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
