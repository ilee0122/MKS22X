public class MyLinkedList implements Iterable<String>{

    //field variables
    private Node start, end;
    private int size;

    private class MyLinkedListIterator implements Iterator<String>{


    }
    
    public Iterator<String> iterator(){
	return new MyLinkedListIterator(this);
    }
    
    private class Node{

	//field variables
	private int data;
	private Node next, prev;

	private Node{}
	
	//methods
	//
	//method: get/set value

	private int getValue(int index){}
	private void setValue(int index, int num){}

	//method: get/set next

	private Node getNext(int index){}
	private void setNext(int index, int num){}

	//method: get/set prev

	private Node getPrev(int index){}
	private void setPrev(int index, int num){}

	//toString

	private String toString(){}
	

    }

    //constructor
    public MyLinkedList{} //makes an empty list

    
    //methods
    //
    //method: add

    public boolean add(Integer newData){} //adds the value to end
    public void add(int index, Integer value){}

    //method: remove

    public boolean remove(Integer value){}
    public boolean remove(int index){}

    //method: indexOf and clear

    public int indexOf(int value){} //returns the index of the 1st occurence of the value in the linked list

    public void clear(){}
    
    //method: get & set

    private Node getNode(int index){}
    
    public Integer set(int index, int value){}
    public Integer get(int index){}

    //method: size

    public int size(){} //returns number of elements in the list

    //toString

    public String toString(){}
    
    

}
