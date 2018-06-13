

public class Link {
	private  Node first; //ͷ���
	public int N; //������
	
	public Link() {
        first = null;
        N = 0;
    }
	
	//��ͷ����½ڵ�
	public void addNode(int item){
		//ԭ���Ľڵ�
		Node temp = first;
		first = new Node();
		first.setItem(item);
		first.setNext(temp);
		N++;
	}
	//ɾ��β�ڵ�
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
	//ɾ���ƶ�λ�õĽڵ�
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
	//ָ��λ����ӽڵ�
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
	//�鿴�����Ƿ����ĳ��ֵ
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

	public static void main(String[] args) {
		Link link = new Link();
		link.addNode(9);
		link.addNode(8);
		link.addNode(7);
		link.addNode(5);
//		System.out.println(link.toString());
		System.out.println(link);
	}
}
