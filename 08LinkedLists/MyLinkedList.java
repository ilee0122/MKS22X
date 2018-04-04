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

    private Node getNode(int index){}

    public int size(){
	return size;
    }

    public void clear(){
	size = 0;
    }

    public Integer get(int index){}

    public Integer set(int index, Integer value){}

    public int indexOf(Integer value){}

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
