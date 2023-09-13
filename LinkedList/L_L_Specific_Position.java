public class L_L_Specific_Position 
{
    Node head;
    private int size;

    L_L_Specific_Position()
    {
        size = 0;
    }

    class Node
    {
        int data;
        int index;
        Node next;
        Node(int a)
        {
            data = a;
            next = null;
            index = 0;
            size++;
        }

    }

    //Insert at the begining of the list
    public void addFirst(int a)
    {
        Node newNode = new Node(a);
        if(head == null)
        {
            head = newNode;
            head.index = 1;
            return;
        }

        newNode.next = head;
        head = newNode;
        head.index = 1;
        Node cuNode = head.next;
        while(cuNode != null)
        {
            cuNode.index += 1;
            cuNode = cuNode.next;
        }
    }

    //Insert at the end of the list
    public void addLast(int a)
    {
        Node newNode = new Node(a);
        if(head == null)
        {
            head = newNode;
            head.index = 1;
            return;
        }

        Node curNode = head;
        while(curNode.next != null)
        {
            curNode = curNode.next;
        }
        curNode.next = newNode;
        newNode.index = size;
    }

    public void addMid(int x, int a)
    {
        Node node = new Node(a);
        if(head == null || x == 1 || x == size)
        {
            head = node;
            head.index = 1;
            return;
        }

        int i = 1;
        Node curNode = head;
        while(i < x-1)
        {
            curNode = curNode.next;
            i++;
        }
        node.next = curNode.next;
        curNode.next = node;

        //node.index = node.next.index;
        curNode = curNode.next;
        while(curNode.next != null)
        {
            curNode.index = curNode.next.index;
            curNode = curNode.next;
        }
        //if we add curNode.next in the condition last node's index will remain same
        curNode.index++;
    }

    //Print size of linked list
    public void getSize()
    {
        System.out.println(size);
    }

    //Printing index number of the linked list
    public void printIndexNo()
    {
        Node cNode = head;

        while(cNode != null)
        {
            System.out.print(cNode.index + " ");
            cNode = cNode.next;
        }
        System.out.println();
    }

    //Printing the list of numbers
    public void printList()
    {
        Node cuNode = head;

        while(cuNode != null)
        {
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) 
    {
        
        L_L_Specific_Position list = new L_L_Specific_Position();

        list.addFirst(5);
        list.addLast(8);
        list.addFirst(7);
        list.addMid(2, 13);
        list.printList();
        list.printIndexNo();
        list.addFirst(3);
        list.addFirst(11);
        list.addMid(3, 9);
        list.printList();
        list.printIndexNo();
        list.getSize();
    }

}
