package ss11_Stack_Queue.Thuc_hanh.Stack;

public class GenericStackClient {

    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<String>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");

        System.out.println("1.1 size of stack after push operations: " + stack.size());
        System.out.println("1.2 pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.println(" " + stack.pop());
        }
        System.out.println("1.3 size of stack after pop operations: " +  stack.size());

    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
        System.out.println("" + stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("stack of String: ");
        stackOfIString();
        System.out.println("stack of integer: ");
        stackOfInteger();
    }
}

