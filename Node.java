
public class Node {
	private Node next; // һ��ͷ���
    private int item;            // ����
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(Node next, int item) {
		super();
		this.next = next;
		this.item = item;
	}

}
