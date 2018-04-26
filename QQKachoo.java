/*
  PublicEnemy -- P. Ben, T. Stephen, A. Calvin
  APCS2 pd01
  Lab 02 -- All Hands on Deque!
  2018 - 04 - 19
*/

import java.util.ArrayList;

//start class
public class QQKachoo<T> implements Deque<T>{

    private ArrayList<T> _Deque;

    //constructor
    public QQKachoo(){
	_Deque = new ArrayList<T>();
    }
    
    //adds x to the beginning of _Deque
    //runs in O(n) time because we need to add in the beginning and shift every other element
    public void addFirst(T x){
	_Deque.add(0,x);
    }

    //adds x to the end of _Deque
    //runs in O(1) time
    public void addLast(T x){
	_Deque.add(x);
    }

    //removes the first element of _Deque and returns it
    //runs in O(n) time because we remove the first element and shift every other element
    public T removeFirst(){
	if (_Deque.size() == 0)
	     return null;
	return _Deque.remove(0);
    }

    //removes the last element of _Deque and returns it
    //runs in O(1) time because we only remove the last element
    public T removeLast(){
	    if (_Deque.size() == 0)
	     return null;
	return _Deque.remove(_Deque.size() - 1);
    }
    
    //returns the first element of _Deque without changing it
    //runs in O(1) time
    public T getFirst(){
	    if (_Deque.size() == 0)
	     return null;
	return _Deque.get(0);
    }

    //returns the last element of _Deque without changing it
    //runs in O(1) time
    public T getLast(){
	    if (_Deque.size() == 0)
	     return null;
	return _Deque.get(_Deque.size() - 1);
    }

    //main method
    public static void main(String[] args){

	//Set up is thanks to Colin Hosking and his QAF post !
	QQKachoo<String> test = new QQKachoo<String>();
        
        test.addFirst("apple");
        test.addFirst("brick");
        test.addFirst("sky");

	test.addLast("Dequeue");
        test.addLast("Deque");
        test.addLast("Deke");
        
        System.out.println(test.getFirst()); //sky
	System.out.println(test.removeFirst()); //sky
	System.out.println(test.getLast()); //Deke
	System.out.println(test.removeLast()); //Deke
        
	System.out.println(test.getFirst()); //brick
	System.out.println(test.removeFirst()); //brick
	System.out.println(test.getLast()); //Deque
	System.out.println(test.removeLast()); //Deque

	System.out.println(test.getFirst()); //apple
	System.out.println(test.removeFirst()); //apple
	System.out.println(test.getLast()); //Dequeue
	System.out.println(test.removeLast()); //Dequeue
    } //end main
} //end class
