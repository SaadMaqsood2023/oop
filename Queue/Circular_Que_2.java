public class Circular_Que_2 
{
    static class Queue
    {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        Queue(int n)
        {
            arr = new int[n];
            size = n;
        }

        //check if the Circular Queue is empty
        static boolean isEmpty()
        {
            return front == -1 && rear == -1;
        }

        //check if the Circular Queue is full
        static boolean isFull()
        {
            return (rear + 1) % size == front;
        }

        //add elements to Circular Queue
        static void add(int a)
        {
            if(isFull())
            {
                System.out.println("The queue is full.");
                return;
            }

            if(rear == -1)
            {
                front = 0;
                // arr[front] = a;
            }
            rear = (rear + 1) % size;
            arr[rear] = a;

        }

        // remove elements from Circular Queue
        static int remove()
        {
            if(isEmpty())
            {
                System.out.println("The Queue is Empty");
                return -1;
            }

            int temp = arr[front];
            if(rear == front)
            {   
                // arr[front] = 0;
                rear = front = -1;
            }
            else
            {
                // int temp = arr[front];
                // arr[front] = 0;
                front = (front + 1) % size;
            }
            return temp;

        }

        // get the peek element 
        static int peek()
        {
            if(isEmpty())
            {
                System.out.println("The list is empty.");
                return -1;
            }

            return arr[front];
        }

        // static void print_C_Queue()
        // {
        //     if(isEmpty())
        //     {
        //         System.out.println("The Queue is empty.");
        //         return;
        //     }

        //     int i = 0;
        //     while(i <= rear)
        //     {

        //     }
        // }

    }
    public static void main(String[] args) {
        
        new Queue(6);
        Queue.add(6);
        Queue.add(7);
        Queue.add(8);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.remove();
        Queue.remove();
        Queue.add(11);
        Queue.add(12);


        while(!Queue.isEmpty())
        {
            System.out.print(Queue.remove() + " ");
        }



    }
}
