
public class BSTree<E extends Comparable <E>> {
	class Node {
		protected E data;
		protected Node left, right;
		public Node (E data) {
			this (data, null, null);
		}
		public Node(E data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	private Node root;
	public BSTree (){
		this.root=null;
	}
	
	public boolean isEmpty(){
		return this.root==null;
	}
	
	public void insert(E x) throws ItemDuplicated {
		this.root = insertRec(x,this.root);
	}
	protected Node insertRec(E x, Node actual) throws ItemDuplicated{
		Node res = actual;
		if(actual==null)
			res=new Node(x);
		else {
			int resC = actual.data.compareTo(x);
			if(resC==0) throw new ItemDuplicated ("El elemento no se encontro");
			else if(resC<0)res.right=insertRec(x,actual.right);
			else res.left=insertRec(x,actual.left);
		}
		return res;
	}
	
	public E search (E x) throws ItemNoFound{
		Node aux=searchRec(x,this.root);
		if(aux==null)
			throw new ItemNoFound("El dato no fue encontrado....");
		return aux.data;
	}
	protected Node searchRec(E x, Node actual) throws ItemNoFound{
		if(actual==null)
			return null;
		else {
			int resC =actual.data.compareTo(x);
			if(resC<0)return searchRec(x,actual.right);
			else if(resC>0) return searchRec(x,actual.left);
			else return actual;
		}
	}
	public void remove (E x) throws ItemNoFound{
		this.root=removeRec(x,this.root);
	}
	
	public Node removeRec (E x, Node actual) throws ItemNoFound {
		Node res = actual;
		if(actual==null)
			throw new ItemNoFound ("El elemento no se encontro");
		int resC = actual.data.compareTo(x);
		if(resC<0) res.right = removeRec(x,actual.right);
		else if(resC>0) res.left = removeRec(x,actual.left);
		
		//Si lo encontramos vamos a eliminarlo
		else if(actual.left!=null && actual.right!=null) {
			res.data = minRecover(actual.right).data; //Sucesor
			res.right = minRemove(actual.right); 
			System.out.println("caso 3");
		}
		else {
			res = (actual.left!= null) ? actual.left:actual.right;
		}
		return res;
	}
	
	protected E minRemove() {
		E min =minRecover();
		this.root=minRemove(this.root);
		return min;
	}
	
	protected Node minRecover(Node actual) {
		while(actual.left!=null)
			actual=actual.left; //Devolvemos el menor dato de todo el arbol
		return actual;
	}
	private E minRecover() {
         return this.minRecover(this.root).data;
     }
	protected Node minRemove(Node actual){
		if(actual.left!=null) {
			actual.left=minRemove(actual.left);
		}
		else {
			actual=actual.right;
		}
		return actual;
	}
	

	@Override
	public String toString() {
		return "";
	}
	
	public void inOrden() {
		if(this.isEmpty())
			System.out.println("El arbol esta vacio....");
		else {
			inOrden(this.root);
			System.out.println();
		}
	}
	protected void inOrden(Node actual) {
		if(actual.left!= null) inOrden(actual.left);
		System.out.print(actual.data.toString()+", ");
		if(actual.right!=null)inOrden(actual.right);
	}

	
	
}
