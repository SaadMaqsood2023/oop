public class Queue_1_LL 
{
    
    static class Node
    {
        int data;
        Node next;

        Node(int a)
        {
            data = a;
            next = null;
        }

    }

    static class Queue
    {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty()
        {
            return head == null && tail == null;
        }

        //We will not check that if linked list is full because it's size 
        //is variable it will be full when program memory will be full
        //we assume that memory of the program is very big.

        public static void add(int data)
        {
            Node nNode = new Node(data);
            if(tail == null)
            {
                tail = head = nNode;
                return;
            }

            tail.next = nNode;
            tail = nNode;

        }

        public static int remove()
        {
            if(head == null)
            {
                System.out.println("The Queue is Empty");
                return -1;
            }

            if(head == tail)
            {
                int front = head.data;
                head = null;
                tail = null;
                return front;
            }

            int front = head.data;
            head = head.next;

            return front;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {
        
        // Queue_1_LL.Queue q = new Queue_1_LL.Queue();

        Queue.add(1);
        //Queue.add(2);
        //Queue.add(3);
        //Queue.add(4);
        //Queue.add(5);
        System.out.println(Queue.remove());

        while(!Queue.isEmpty())
        {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }

}
