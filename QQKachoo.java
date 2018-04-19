/*
  PublicEnemy -- P. Ben, T. Stephen, A. Calvin
  APCS2 pd01
  Lab 02 -- All Hands on Deque!
  2018 - 04 - 19
*/

import java.util.ArrayList;

public class QQKachoo<T> implements Deque<T>{

    private ArrayList<T> _Deque;

    public QQKachoo(){
	_Deque = new ArrayList<T>();
    }

    public void addFirst(T x){
	_Deque.add(0,x);
    }

    public void addLast(T x){
	_Deque.add(x);
    }

    public T removeFirst(){
	return _Deque.remove(0);
    }
    
    public T removeLast(){
	return _Deque.remove(_Deque.size() - 1);
    }

    public T getFirst(){
	return _Deque.get(0);
    }

    public T getLast(){
	return _Deque.get(_Deque.size() - 1);
    }

    public static void main(String[] args){

	//Thanks to Colin Hosking !
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
	}
}
