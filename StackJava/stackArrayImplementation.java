package StackJava;

public class stackArrayImplementation {
    private int [] stack;
    private int top;
    private int capacity;

    public stackArrayImplementation(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top=-1;
    }

    public void push(int data){

        if(top == capacity-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public int Size(){
        return top+1;
    }

    public void printStack(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i] + " ");
        }

    }

    public static void main(String[] args) {
        stackArrayImplementation s = new stackArrayImplementation(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack(); // 30 20 10

        System.out.println("Popped: " + s.pop()); // 30
        System.out.println("Peek: " + s.peek());  // 20
        System.out.println("Size: " + s.Size());  // 2
        s.printStack(); 
    }
}