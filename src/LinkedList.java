
public class LinkedList {

	protected Node first;
	protected static int elements=0;
	
	public LinkedList(){
		first=null;
	}
	
	public void insert(Object o){
		if(isEmpty()){
			first = new Node(o,null);
			elements++;
		}
		else{
			Node aux=new Node(o,first);
			first=aux;
			elements++;
		}
	}
	
	public Object extract(){
			return first.getInfo();
	}
	
	public Object get (int n){
		if(!isEmpty()&&(n<elements)){
			Node aux=first;
			int count=0;
			while(aux.getNext()!=null&&(count!=n)){
				aux.getInfo().toString();
				aux=aux.getNext();
				count++;
			}
			return aux.getInfo();
		}
		else 
			return null;
	}
	
	public void print(){
		Node aux=first;
		while(aux!=null){
			System.out.println(aux.getInfo().toString());
			aux=aux.getNext();
		}
	}
	
	private void printElement(Node n){
		System.out.println(n.getInfo().toString());
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
	public int size(){
		return elements;
	}
	
	private Node searchElement(Object o1){
		return searchElement(o1, first);
	}
	
	/**
	 * Search a Node in the List, the Object must implement the method equals()
	 * @param o1 
	 * @param n1
	 * @return
	 */
	private Node searchElement(Object o1, Node n1){
		if(!n1.contain(o1)&&n1.hasNext()){
			return searchElement(o1,n1.getNext());
		}
		if(n1.contain(o1)){
			return n1;
		}
		else{ 
			return null;
		}
	}
}
