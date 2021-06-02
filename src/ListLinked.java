
public class ListLinked <T extends Comparable<T>> implements TDAList<T> 
//public class OrderListLinked <T extends Comparable<T>> extends ListLinked<T> 
{
	private Node<T> first;
	private int count;
	
	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ListLinked() {
		this.first = null;
		this.count = 0;
	}
	
	public boolean isEmptyList() {
		return this.first == null;
	}

	public int length() {
		return this.count;
	}

	public void destroyList() {
		//Eliminar todos los elementos, ir desde el inicio eliminando, pero antes desanlazor haciendo un puente hacia el segundo
		while(this.first!= null)
			this.first = this.first.getNext(); 
		this.count = 0;
	}

	public int search(T x) {
		// A partir de ir recorriendo, si es el primer elemento su posición es 0, esa es 0, inferencia. posc -1
		Node<T> aux = this.first;
		for(int i = 0 ;aux != null;aux = aux.getNext(),i++)
			if (aux.getData().equals(x))
				return i;		
		return -1;
	}

	public void insertFirst(T x) {
		//Cuando se inserta al inicio tiene que cambiar el first, el primero se convertiria en el segundo
		this.first = new Node<T>(x,this.first);
		this.count++;
		
	}

	public void insertLast(T x) 
	{
		//Se recorre todo, hasta llegar al nodo que tiene nulo y ahi es donde se elimina.
		if(this.isEmptyList())
			this.insertFirst(x);
		else {
			Node<T> last = getLastNode();
			last.setNext(new Node<T>(x));
			this.count++;
			
		}
	}

	private Node<T> getLastNode() 	//La lista no debe estar vacia, se debe verificar en el método que usara este método.
	{
		Node<T> aux = this.first;
		while (aux.getNext()!= null)
			aux = aux.getNext();
		return aux;
	}

	public void removeNode(T x) 
	{
	    //Para eliminar se tiene que desenlazar.
		Node<T> aux = this.first; //control
		Node<T> temp = null;
		
		if (this.first.getData() == x) //Procedimiento por si el elemento a eliminar es el primero
		{
			temp = this.first;
			this.first = this.first.getNext();
			temp = null;
			this.count--;
		}
		else { //Procedimiento para cualquier otro nodo 
			while(aux.getNext() != null){  
				if (aux.getNext().getData() == x){
					aux.setNext(aux.getNext().getNext());
					this.count--;
					return;
				}
				aux = aux.getNext();
			}
		}
	}

	public String toString() {
		String str = "";
		Node<T> aux = this.first;
		for (int i = 0; aux != null; aux = aux.getNext(), i++)
			str += "["+i+"] = " +aux.getData()+"\n";
		return str;
	}
}
