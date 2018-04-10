public class MyLinkedListImproved<T>{

    private class Node{

	private Node next, prev;
	private T data;

	public Node(T n){
	    data = n;
	}

	public Node(T value, Node nextN){
	    this(value);
	    next = nextN;
	}

	public Node getNextNode(){
	    if(next != null){
		return next;
	    }
	    return null;
	}

	public boolean setNextNode(Node value){
	    next = value;
	    return true;
	}

	public Node getPrevNode(){
	    if(prev != null){
		return prev;
	    }
	    return null;
	}

	public boolean setPrevNode(Node value){
	    prev = value;
	    return true;
	}

	public T getData(){
	    return data;
	}

	public boolean setData(T value){
	    data = value;
	    return true;
	}

	public String toString(){
	    return "[" + data + "]";
	}

    }

    private Node start, end;
    private int size;

    public MyLinkedListImproved(){}

    private Node getNode(int index){
	if(index >= size || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	Node ans = start;
        for (int i = 0; i < index; i++){
	    ans = ans.getNextNode();
	}
        return ans;
    }

    public int size(){
	return size;
    }

    public void clear(){
	size = 0;
	start = null;
	end = null;
    }

    public T get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return getNode(index).getData();
    }

    public T set(int index, T value){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	Integer temp = getNode(index).getData();
	getNode(index).setData(value);
	return temp;
    }

    public int indexOf(T value){
	for (int i = 0; i < size; i++){
	    if(getNode(i).getData().equals(value)){
		return i;
	    }
	}
	return -1;
    }

    public boolean add(T newData){
	if (size == 0){
	    start = new Node(newData);
	    end = start;
	    size++;
	    return true;
	}
	getNode(size - 1).setNextNode(new Node(newData));
	size++;
	end = getNode(size - 1);
	return true;
    }

    public void add(int index, T value){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	
	if(index == size){
	    add(value);
	}
	else if(index == 0){
	    Node temp = start;
	    start = new Node(value);
	    start.setNextNode(temp);
	    size++;
	}
	else{
	    Node temp = getNode(index);
	    getNode(index - 1).setNextNode(new Node(value));
	    getNode(index).setNextNode(temp);
	    size++;
	}
    }

    public boolean remove(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	if(size == 1){
	    start = null;
	    end = null;
	}
	else if(index == 0){
	    start = getNode(1);
	}
	else if(index == size - 1){
	    end = getNode(size - 2);
	    end.setNextNode(null);
	}
	else{
	    getNode(index - 1).setNextNode(getNode(index + 1));
	}
	size--;
	return true;
    }

    public boolean remove(T value){
	int index = indexOf(value);
	return remove(index);
    }

    public String toString(){
	String ans = "{ ";
	for (int i = 0; i < size; i++){
	    ans += getNode(i).toString() + " ";
	}
	ans = ans + "}";

	return ans;
    }


    public static void main(String[] args){
        MyLinkedListImproved<String> n = new MyLinkedListImproved<>();
        n.add("fish");
	System.out.println(n);
	
	MyLinkedListImproved<Integer> m = new MyLinkedListImproved<>();
        n.add(Integer.valueOf(0));
	System.out.println(m);

    }
    
    //Driver from Crystal Wang
    /*
    public static void main(String[] args){
	MyLinkedList a = new MyLinkedList();

	System.out.println("Testing add(Integer value)");
	for (int i = 0; i < 10; i++){
	    a.add(new Integer(i));
	    System.out.println("size: " + a.size() + " LinkedList: " + a.toString());
	} //adds the integers from 0 to 9 inclusive and prints out the LinkedList

	System.out.println("\nTesting get(int index)");
	for (int i = 0; i < 10; i++){
	    System.out.println("index: " + i + " data: " + a.get(i));
	} //prints the integers from 0 to 9 inclusive

	System.out.println("\nTesting exception for get(int index)");
	try{
	    System.out.println(a.get(10));
	    System.out.println(a.size());
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"
	try{
	    System.out.println(a.get(-1));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"

	for (int i = 0; i < 10; i++){
	    a.add(new Integer(i));
	}

	System.out.println("\nTesting indexOf(Integer value)");
	for (int i = 0; i < 10; i++){
	    System.out.println("Value: " + i + " Index: " + a.indexOf(i));
	} //prints 0 to 9 inclusive

	System.out.println("\nTesting remove(Integer value)");
	for(int i = 0; i < 10; i++){
	    a.remove(new Integer(i));
	    System.out.println(a);
	} //removes first half of the LinkedList

	System.out.println("\nTesting set(int index, Integer value)");
	for (int i = 0; i < 10; i++){
	    a.set(i, new Integer(i * 10));
	    System.out.println(a);
	} //sets the data of each node to 10 * index

	System.out.println("\nTesting exceptions for set(int index, Integer value)");
	try{
	    System.out.println(a.set(-1, new Integer(1)));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"
	try{
	    System.out.println(a.set(10, new Integer(1)));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"

	System.out.println("\nTesing add(int index, Integer value)");
	for (int i = 0; i < 9; i++){
	    a.add(i, new Integer(i * 3));
	    System.out.println("index added: " + i + " LinkedList: " + a.toString());
	} //adds multiples of 3 up to 24 to the LinkedList at the beginning
	a.add(19, new Integer(100)); //adds 100 to the LinkedList at the end
	System.out.println("index added: " + 19 + " LinkedList: " + a.toString());

	System.out.println("\nTesting exceptions for add(int index, Integer value)");
	try{
	    a.add(-1, new Integer(5));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"
	try{
	    a.add(21, new Integer(5));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"

	System.out.println("\nTesting remove(int index)");
	System.out.println("Original LinkedList: " + a.toString());
	System.out.println("data removed: " + a.remove(0) + " index removed: 0"); //removes 0
	System.out.println("LinkedList: " + a.toString());
	System.out.println("data removed: " + a.remove(a.size() - 1) + " index removed: 18"); //removes 100
	System.out.println("LinkedList: " + a.toString());
	System.out.println("data removed: " + a.remove(2) + " index removed: 2 "); //removes 9
	System.out.println("LinkedList: " + a.toString());

	System.out.println("\nTesting exceptions for remove(int index)");
	try{
	    System.out.println(a.remove(-1));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"
	try{
	    System.out.println(a.remove(17));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("This size is out of bounds");
	} //prints "This size is out of bounds"

	System.out.println("\nTesting clear()");
	a.clear();
	System.out.println("LinkedList: " + a.toString()); //prints an empty LinkedList
    }
    */
}
