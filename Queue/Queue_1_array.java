public class Queue_1_array
{
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear = -1;
        //we don't need to make front as it will always be zero in array
        //

        Queue(int n) //size
        {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }

        //enqueue
        public static void add(int data)
        {
            if(rear == size - 1)
            {
                System.out.println("full queue");
                return;
            }

            rear++; 
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

            int front = arr[0];
            for(int i = 0; i < rear; i++)
            {
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }

            
            return arr[0];
        }


    }

    public static void main(String[] args) {
        
        Queue q = new Queue(7);

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}