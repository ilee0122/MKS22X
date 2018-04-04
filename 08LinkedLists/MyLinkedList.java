public class MyLinkedList{

    private class Node{

	Node next, prev;
	Integer data;

	public Node(Integer n){
	    data = n;
	}

	public Node getNext(){
	    return next;
	}

	public void setNext(Node value){
	    next = value;
	}

	public Node getPrev(){
	    return prev;
	}

	public void setPrev(Node value){
	    prev = value;
	}

	public Integer getValue(){
	    return data;
	}

	public setValue(Integer value){
	    data = value;
	}

	public Strng toString(){
	    return data + "";
	}

    }

    private Node start, end;
    private int size;

    public MyLinkedList(){
	size = 0; //empty list
    }

    private Node getNode(int index){
	Node current = start;
	int c = 0;
	while (current != null){
	    if (c == index){
		return current;
	    }
	    c = c + 1;
	    current = current.getNext();
	}
	return current;
    }

    public int size(){
	return size;
    }

    public void clear(){
	size = 0;
    }

    public Integer get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	
	int c = -1;
	Node current = start;
	while (current != null){
	    c = c + 1;
	    if (c == index){
		return current.getValue();
	    }
	    current = current.getNext();
	}
	return 1;
    }

    public Integer set(int index, Integer value){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	
	int c = -1;
	int oldValue = 0;
	Node current = start;
	while (current != null){
	    c = c + 1;
	    if (c == index){
		oldValue = current.getValue();
		current.setValue(value);
		return oldValue;
	    }
	    current = current.getNext();
	}
	return 1;
    }

    public int indexOf(Integer value){
	int c = 0;
	Node current = start;
	while (current != null){
	    if (current.getValue().equals(value)){
		return CT;
	    }
	    c = c + 1;
	    current = current.getNext();
	}
	return 1;
    }

    public boolean add(Integer newData){}

    public void add(int index, Integer value){}

    public Integer remove(int index){}

    public boolean remove(Integer value){}

    public String toString(){
	if (size() == 0){
	    return "[]";
	}
	String ans = "[";
	Node current = start;
	while (current != null){
	    if (current.getNext() == null){
		ans = ans + current.getValue() + "]";
	    }
	    else {
		ans = ans + current.getValue() + ", ";
	    }
	    current = current.getNext();
	}
	return ans;
    }
}
