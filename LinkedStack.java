public class LinkedStack {
    private int size ;
    private StackNode top ;

    class StackNode{
        private int data ;
        private StackNode next ;

        public StackNode(int data) {
            this.data = data;
        }

        public StackNode(int data, StackNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public int getSize(){
        int i = 0 ;
        for (StackNode p = top ; p != null ; p = p.next){
            i++ ;
        }

        return i ;
    }

    public int search(int element){
        int i = 0 ;
        for (StackNode p = top ; p != null ; p = p.next){
            i++ ;
            if (p.data == element){
                return i;
            }
        }

        return i;
    }

    public void push(int data){
        top = new StackNode(data, top) ;
        size++ ;
        System.out.println(data + " pushed successfully!");
    }

    public int peek(){
        if (top == null){
            System.out.println("No element to peek!");
            return -1 ;
        }else {
            return top.data ;
        }
    }

    public int pop(){
        if (top == null){
            return -1 ;
        }else {
            int oldTop = top.data ;
            top = top.next ;
            size-- ;
            return oldTop ;
        }
    }

    public void display(){
        if (top == null) System.out.println("Stack is empty!");
        else{
            for (StackNode p = top ; p != null ; p = p.next){
                System.out.println(p.data);
            }
        }
    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack() ;
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        linkedStack.push(5);
        linkedStack.push(6);
        linkedStack.push(7);
        linkedStack.push(8);
        linkedStack.push(9);
        linkedStack.push(10);

        System.out.println("\nSize of the stack is : " + linkedStack.getSize());
        System.out.println("\nTop element in the stack is : " + linkedStack.peek());
        System.out.println("\nDeleted Element is : " + linkedStack.pop());
        System.out.println("\nNew Top element is : " + linkedStack.peek());
        System.out.println("\nSize of updated Stack is : " + linkedStack.getSize());
    }
}
