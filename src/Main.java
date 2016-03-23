
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.insert("Primero");
		list.insert("Segundo");
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.print();
	}

}
