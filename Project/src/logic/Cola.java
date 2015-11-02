package logic;

import java.util.ArrayList;

/**
 * Esta clase define la lista de procesos a simular.
 * @author: Camilo Rodríguez
 * @author: Nelson Barreto
 * @version: 26/10/15
 */
public class Cola {
private SimpleList<Proceso>listaProcesos;
    /**
    * Constructor para inicializar la lista de procesos.
    */
    public Cola(){
        listaProcesos=new SimpleList<Proceso>();
    }
    /**
     * Método que agrefa procesos a la lista.
     */
    public void addProcesos(Proceso proceso){
        listaProcesos.addFirst(proceso);
    }
    /**
     * Método que muestra los procesos listados.
     */
    public void mostrarProcesos(){
		NodeSl aux=listaProcesos.getFirst();
		while(aux!=null){
			System.out.print(((Proceso)aux.getInfo()).getNombre() + "-");
			aux = aux.getNext();
		}
    }
    /**
     * Método que borra procesos de la lista.
     */
    public void elimnarProceso(){
        listaProcesos.deleteFirst();
    }
    public SimpleList<Proceso> getListaProcesos() {
        return listaProcesos;
    }
    public void setListaProcesos(SimpleList<Proceso> listaProcesos) {
        this.listaProcesos = listaProcesos;
    }
}
