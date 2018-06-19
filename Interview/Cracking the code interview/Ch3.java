//Didn't program all the questions, Some of them were straight forward, others were too long.
//TODO: Code the questions skipped.

import java.util.ArrayList;
import java.util.LinkedList;

// Revising stack and queue implementation with generic data types

class Data<T extends Comparable<T>>{
    T data;
    Data<T> next;
    Data(T data) {
        this.data=data;
    }
       
}

class Stack<T extends Comparable<T>>{
    Data<T> top;
    
    public boolean isEmpty() {
        return top==null;
    }
    
    public void push(T data) {
        if(isEmpty()) {
            Data<T> temp=new Data<T>(data);
            temp.next=top;
            top=temp;
        }
        else
            top=new Data<T>(data);

    }
    
    public T pop(){
        if(isEmpty()) {
            return null;
        }
        T temp=top.data;
        top=top.next;
        return temp;
    }
    
    public T peek(){
        if(isEmpty())
            return null;
        return top.data;
    }
}

class Queue<T extends Comparable<T>>{
    Data<T> front;
    Data<T> last;
    
    boolean isEmpty() {
        return front==null;
    }
    
    public void add(T item) {
        if(isEmpty()) {
            front=new Data<T>(item);
            last=new Data<T>(item);
        }
        else {
            last.next=new Data<T>(item);
            last=last.next;
        }

    }
    
    public T remove() {
        if(isEmpty())
            return null;
        T temp=front.data;
        front=front.next;
        return temp;
    }
    
    public T peek() {
        if(!isEmpty())
            return front.data;
        else
            return null;
    }
    
}

//CTCI Question begins here:

//1: Describe how you could use a single array to implement three stacks.
//Approach 1 - Fixed Division, divide the stack by Capacity/Number of stacks
class MultiStack {
    private int numberOfStacks;
    private int stackCapacity;
    private int[] values; //actual stack
    private int[] sizes; //top of all stacks
    
    MultiStack(int numb,int capacity){
        numberOfStacks=numb;
        stackCapacity=capacity;
        values=new int[stackCapacity*numberOfStacks];
        sizes=new int[numberOfStacks];
    }
    
    
    public boolean isEmpty(int stackNumber) {
        return sizes[stackNumber-1]==0;
    }
    
    public boolean isFull(int stackNumber) {
        return sizes[stackNumber-1]==stackCapacity;
    }
    
    public int indexOfTop(int stackNumber) {
        return (((stackNumber-1)*stackCapacity)+sizes[stackNumber-1]-1);
    }
    
    public void push(int stackNumber,int data) {
        if(isFull(stackNumber)) {
            System.out.println("Stack Full");
            return;
        }
        sizes[stackNumber-1]++;
        values[indexOfTop(stackNumber)]=data;
    }
    
    public int pop(int stackNumber) {
        if(isEmpty(stackNumber))
            return -1;
        int data=values[indexOfTop(stackNumber)];
        sizes[stackNumber-1]--;
        return data;
    }
    
}

//2 - MinStack
class MinStack extends Stack<Integer>{
    Stack<Integer> s2;
    
    
    public int min() {
        return s2.top.data;
    }
    
    public void push(int value) {
        if(s2==null) {
            s2=new Stack<Integer>();
        }
        if(value<min()) {
            s2.push(value);
        }
        super.push(value);
    }
    
    public Integer pop() {
        int value=super.pop();
        if(value==min()) {
            s2.pop();
        }
        return value;
    }
    
}

//6 - Animal Shelter
abstract class Animal{
    int order;
    String name;
    Animal(String a){
        this.name=a;
    }
    
    public boolean isOlderThan(Animal a) {
        return this.order>a.order;
    }
}

class Dog extends Animal{
    Dog(String a) {
        super(a);
    }
}

class Cat extends Animal{
    Cat(String a){
        super(a);
    }
}

class AnimalQueue{
    LinkedList<Dog> DogQueue = new LinkedList<Dog>();
    LinkedList<Cat> CatQueue = new LinkedList<Cat>();
    int order=0; 
    
    void enqueue(Animal a) {
        a.order=order;
        order++;
        if(a instanceof Dog) {
            DogQueue.add((Dog)a);
        }
        else if(a instanceof Cat){
            CatQueue.add((Cat) a);
        }
    }
    
    Animal dequeue() {
        if(CatQueue.isEmpty())
            return DogQueue.poll();
        else if(DogQueue.isEmpty())
            return CatQueue.poll();
        else {
            if(DogQueue.peek().isOlderThan(CatQueue.peek()))
                return DogQueue.poll();
            else
                return CatQueue.poll();
        }
    }
    
    Dog dequeueDog() {
        return DogQueue.poll();
    }
    
    Cat dequeueCat() {
        return CatQueue.poll();
    }
    
}




public class Ch3 {


    
    
    
    public static void main(String args[]) {
        Stack<Integer> stack=new Stack<>();
        for(int i=1;i<=10;i++) {
            stack.push(i);
        }
        
        MultiStack m1=new MultiStack(3,10);
        for(int i=1;i<=3;i++) {
            for(int j=1;j<=10;j++) {
                m1.push(i,j);
            }
        }
        
        for(int i=1;i<=3;i++) {
            for(int j=1;j<=10;j++) {
                System.out.println(i+ "." + m1.pop(i));
            }
        }
        
        
    }
}
