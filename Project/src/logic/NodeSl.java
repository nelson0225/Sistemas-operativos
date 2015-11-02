package logic;


/**
 * Esta clase define el nodo donde se va a realizar cambios.
 * @author: Camilo Rodríguez
 * @author: Nelson Barreto
 * @version: 26/10/15
 */
public class NodeSl<E> {
	private E info;
	private NodeSl<E> next;
	
	/**
        * Constructor para inicializar la informacion de los procesos.
        */
	public NodeSl() {
		// TODO Auto-generated constructor stub
		this.info=null;
		this.next=null;
	}
	public NodeSl(E info,NodeSl<E> next){
		
		this.info=info;
		this.next=next;
	
		
	}

	public NodeSl<E> getNext() {
		return next;
	}

	public void setNext(NodeSl<E> next) {
		this.next = next;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}
}
