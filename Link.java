

public class Link {
	private  Node first; //头结点
	public int N; //链表长度
	
	public Link() {
        first = null;
        N = 0;
    }
	
	//表头添加新节点
	public void addNode(int item){
		//原来的节点
		Node temp = first;
		first = new Node();
		first.setItem(item);
		first.setNext(temp);
		N++;
	}
	//删除尾节点
	public void deleteLastNode(){
		if (N == 0){
			return ;
		}else if(N == 1){
			first = null;
		}else{
			for (Node i = first;i != null; i = i.getNext()) {
				if(i.getNext().getNext() == null){
					i.setNext(null);
				}
			}
			N--;
		}
	}
	//删除制定位置的节点
	public void deleteNode(int index){
		if(index == 1){
			first = null;
			return ;
		}else if(index > N){
			System.out.println("index out of bonds");
		}else{
			int node = 1;
			for(Node i = first; i != null; i = i.getNext()){
				if(node + 1 == index){
					i.setNext(i.getNext().getNext());
					break;
				}
				index ++;
			}
			
		}
	}
	//指定位置添加节点
	public void addToIndex(int position,int item){
		if(position > N + 1 ){
			System.out.println("out of bonds");
		}else if( position == 1){
			addNode(item);
		}else{
			int index = 1;
            for (Node x = first; x != null; x = x.getNext()) {
                if (index + 1 == position) {
                    Node temp = new Node();			
                    temp.setItem(item);
                    temp.setNext(x.getNext());
                    x.setNext(temp);
                    break;
                }
                index++;
			}
		}
	}
	//查看链表是否存在某个值
	public boolean find(int key){
		for(Node i = first ; i != null ; i = i.getNext()){
			if(i.getItem() == key){
				return true;
			}
		}
		return false;
	}
	//toString
	public String toString(){
		StringBuilder str = new StringBuilder();
		for(Node i = first ; i != null ; i = i.getNext()){
			str.append(i.getItem());
			str.append(" ");
		}
		return str.toString();
	}
	//修改当前节点的值
	public void update(int index , int newValue){
		if(index > N + 1){
			System.out.println("out of bonds!");
		}else{
			int position = 1;
			for (Node i = first ; i != null; i = i.getNext()) {
				if(position  == index){
					i.setItem(newValue);
					break;
				}
				position ++;
			}
		}
	}
	public static void main(String[] args) {
		Link link = new Link();
		link.addNode(9);
		link.addNode(8);
		link.addNode(7);
		link.addNode(5);
		link.update(3, 88);
		link.addToIndex(2, 55);
		System.out.println(link);
	}
	
}
