# PublicEnemy
#### Ben Platt, Stefan Tan, Calvin Aw
#### APCS2 pd1
#### L02 -- All Hands on Deque!

## To-Do List
- [x] Consult the Java API for queue and deque and plan on the methods that we should have.  
- [x] Implement the methods that we wrote in the Dequeue interface in class QQKachoo.
- [x] Include comments for both classes.
- [x] Test and robustify the code!
- [x] Update the ReadMe!
- [x] Add exceptions to be thrown (added 4/25/18)

## Development Plan
1. Plan on the methods that we should implement based on the Java API entries. 
    1. **Think about which ones are easy to implement and which one are crucial.**
1. Put the methods we decide on into the Dequeue interface.
1. Create class QQKachoo which implements the Dequeue interface.
    1. **Which underlying data structure should we use?**
1. Test each method individually. Prioritize functionality. 
1. Update the ReadMe to provide the list of methods we decided to implement and rationality why we chose this underlying data structure.
1. UPDATE: We also added exceptions to our QQKachoo.java because of suggestions by Yahoo Search. These included null pointer expcetions.

## Methods
* public void addFirst(Card x);
* public void addLast(Card x);
* public Card removeFirst();
* public Card removeLast();
* public Card getFirst();
* public Card getLast();

Based on the Java API for Deque and Queue, we decided that these were the essential methods to implement. According to it, a deque should have methods that accesses elements at the front and at the end of the list. The methods should be able to add, remove, and get elements at either end of the list. As a result, we narrowed down the list of methods to the methods that perform these functions.    

## Rationale for Choosing ArrayList as the Underlying Data Structure
We decided to use ArrayList as the underlying data structure because after reading the Java API for deque, we realized that to implement the methods required for Deque, we would need to be able to reference the first element and the last element of the data structure for all of the methods. With ArrayList, we were able to reference the first and last element easily by using the index 0 and the method from ArrayList size() - 1 respectively. The only downside we could see from using an ArrayList as the underlying structure was the runtime of the methods that removed and added the first element. 
