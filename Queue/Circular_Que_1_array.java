public class Circular_Que_1_array 
{
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        //we don't need to make front as it will always be zero in array
        

        Queue(int n) //size
        {
            arr = new int[n];
            // this.size = n;
            size = n;
        }

        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }

        public static boolean isFull()
        {
            return (rear + 1) % size == front;
        }

        //enqueue
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("full queue");
                return;
            }

            if(front == -1)
            {
                front = 0;
            }
            rear = (rear + 1) % size; 
            arr[rear] = data;
        }

        //dequeue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }

            int result = arr[front];
            if(rear == front)
            {
                rear = front = -1;
            }
            else{
                front = (front + 1) % size;
            }

            return result;
        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }

            
            return arr[front];
        }

    }

    public static void main(String[] args) {
        
        new Queue(5);

        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        System.out.println(Queue.remove());
        Queue.add(6);
        System.out.println(Queue.remove());
        Queue.add(7);

        while(!Queue.isEmpty())
        {
            System.out.print(Queue.peek() + " ");
            Queue.remove();
        }

    }
}
