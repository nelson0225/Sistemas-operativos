package logic;

/**
 * Esta clase define las posiciones donde se agregarán los procesos.
 * @author: Camilo Rodríguez
 * @author: Nelson Barreto
 * @version: 26/10/15
 */
public class SimpleList <E>{
	private NodeSl first;
	private NodeSl last;
	public SimpleList() {
		
		this.first=null;
		this.last=null;
	}	
	/**
        * Método que agrega procesos en el primer nodo.
        */
	public void addFirst(E info ){
		NodeSl aux=new NodeSl(info,first);
		if(isEmpty()){
			this.first=aux;	
			this.last=aux;
		}else{			
			this.first=aux;	
		}	
	}	
	/**
        * Método que agrega procesos en el último nodo.
        */ 
	public void addLast(E info){
		NodeSl auxNew=new NodeSl(info,null);
		NodeSl aux1=new NodeSl();
		if(isEmpty()){
			this.addFirst(info);
		}else{			
			NodeSl aux=first;
			while(aux!=null){
				aux1=aux;
				aux=aux.getNext();	
			}	
			aux1.setNext(auxNew);
		}		
	}
	/**
        * Método que agrega procesos en una posición especifica.
        */
	public void addBetween(String info,int pos){		
		NodeSl auxNew=new NodeSl(info,null);
			NodeSl aux=first;
			int cont=-1;
			while(aux!=null)				
			{cont++;
			if (cont==pos) {
				NodeSl aux2=aux.getNext();
				aux.setNext(auxNew);
				auxNew.setNext(aux2);
				break;
			}
			aux=aux.getNext();
		}	
	}

	public E get(int i){
		NodeSl aux=first;
		int cont=-1;
		E info=null;
		while(aux!=null){
			cont++;
			if(i==cont){
				info= (E) aux.getInfo();
				return info;
			}
			aux = aux.getNext();
		}
		return info;
	}
	
	public void list(){
//		NodeSl aux=first;
//		while(aux!=null){
//			System.out.print(((Persona)aux.getInfo()).getNombre() + "-");
//			aux = aux.getNext();
//		}
	}
	/**
        * Método que borra el primer nodo.
        */
	public void deleteFirst(){
		if(!isEmpty()) {
			NodeSl aux = this.first;
			NodeSl aux1 = this.first.getNext();
			this.first = aux1;
		}
	}
        /**
        * Método que borra todos los nodos.
        */
	public void deleteAll(){
		NodeSl aux=this.first;
		NodeSl aux2=aux;
		if(!isEmpty()) {
			while (aux.getNext() != null) {
				aux2 = aux.getNext();
				this.first = aux2;
				aux = aux.getNext();
			}
			this.first = null;
		}
	}
	/**
        * Método que borra el último nodo.
        */ 
	public void deleteLast(){
		NodeSl aux=this.first;
		NodeSl aux2=new NodeSl();
		while(aux.getNext()!=null){
			aux2=aux;
			aux=aux.getNext();
		}
		aux2.setNext(null);
		if(aux.getInfo()==this.first.getInfo())
			this.first=null;
	}
	/**
        * Método que borra nodos en la posición deseada.
        */
	public void delete(int pos){
		NodeSl aux4=this.first;
		NodeSl aux5=aux4.getNext();
		if(pos==0){			
			this.first=null;
			this.first=aux5;		
		}else{
			int cont=-1;
			NodeSl aux=first;
			NodeSl aux1=new NodeSl();
			while (aux!=null) {
				cont++;				
				if(cont==pos-1){
					aux1=aux;
				}				
				if(cont==pos){				
					NodeSl aux2=aux.getNext();
					aux1.setNext(aux2);					
				}
				aux=aux.getNext();				
			}			
		}				
	}
	/**
        * Método que modifica un nodo.
        */
	public void modifyNode(String newInfo,int pos){
		NodeSl aux=this.first;
		NodeSl auxNew=new NodeSl(newInfo,null);
		int cont=-1;
		NodeSl aux1=new NodeSl();
		while (aux!=null) {
			cont++;
			if(cont==pos-1){
				aux1=aux;			
			}
			if(cont==pos){
				NodeSl aux2=aux.getNext();
				aux1.setNext(auxNew);
				auxNew.setNext(aux2);
				}
			aux=aux.getNext();		
		}	
	}
	/**
        * Método que busca un nodo.
        */
	public NodeSl search(String infoSearch){
		NodeSl aux=this.first;
		NodeSl aux2=new NodeSl();
		String name="";
		while(aux!=null){
			name=(String) aux.getInfo();		
			if(name.equals(infoSearch)){				
				aux2=aux;	
				return aux2;
			}
			aux=aux.getNext();			
		}
		return aux2;
	}
	/**
        * Método que retorna la cantidad de nodos.
        */ 
	public int size(){
		NodeSl aux=first;
		int cont=0;
		while(aux!=null){
			cont++;
			aux=aux.getNext();
		}
		return cont;
	}
	
	public void orderList(){
		NodeSl aux=this.first;
	}
	public NodeSl getFirst() {
		return first;
	}
	public void setFirst(NodeSl first) {
		this.first = first;
	}
	public boolean isEmpty(){
		return first==null;
	}

	
}
