
public class Node {

	private Object info;
	private Node next;
	
	public Node(){
		info = null;
		next = null;
	}
	
	public Node(Object o, Node n){
		next = n;
		info = o;
	}
	
	public void setInfo(Object o){
		info = o;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public Object getInfo(){
		return info;
	}
	
	public Node getNext(){
		return next;
	}
	
	public boolean contain(Object o1){
		return info.equals(o1);
	}
	
	public boolean hasNext(){
		return (info==null);
	}
	
}
