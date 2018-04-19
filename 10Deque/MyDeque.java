public class MyDeque{

    public MyDeque(){}

    public MyDeque(int initialCapacity){
	if(initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	
    }

    public int size(){
	//return size
    }

    public void addFirst(E){
	//NullPointerException
	if(E == null){
	    throw new NullPointerException();
	}
    }

    public void addLast(E){
	//NullPointerException
	if(E == null){
	    throw new NullPointerException();
	}
    }

    public E removeFirst(){
	//NoSuchElementException
	if(size == 0){
	    throw new NoSuchElementException();
	}
    }

    public E removeLast(){
	//NoSuchElementException
	if(size == 0){
	    throw new NoSuchElementException();
	}
    }

    public E getFirst(){
	//NoSuchElementException
	if(size == 0){
	    throw new NoSuchElementException();
	}
    }

    public E getLast(){
	//NoSuchElementException
	if(size == 0){
	    throw new NoSuchElementException();
	}
    }

    
    



}
