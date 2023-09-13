public class MyLinkedList 
{
    Node head;
    private int size;

    MyLinkedList()
    {
        size = 0;
    }

    class Node
    {
        String data;
        Node next;
        int index;

        Node(String data)
        {
            this.data = data;
            next = null;
            size++;
        }

    }

    public void insertFirst(String a)
    {
        Node newNode = new Node(a);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        
    }

    public void insertLast(String a)
    {
        Node newNode = new Node(a);

        if(head == null)
        {
            head = newNode;
            return;
        }

        //Node secLast = head;
        //Node last = head.next;
        Node tempNode = head;
        while(tempNode.next != null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.index = size;
    }

    public void insertMid(String x, String a)
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }

        Node tempNode = new Node(a);
        Node currNode = head;
        Node temp2 = head;
        
        while(currNode.next != null)
        {
            if(currNode.data == x)
            {
                break;
            }
            temp2 = currNode;
            currNode = currNode.next;
        }
        tempNode.next = temp2.next;
        temp2.next = tempNode;
        
    }

    public int findOccur(String a)
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return -1;
        }

        //It is different to find multiple occurence of all elements
        //than multiple occurrence of a given element
        Node curNode = head;
        //Node temp = head;
        int occurence = 0;
        while(curNode != null)
        {
            if(curNode.data.equals(a))
            {
                occurence++;
            }
            
            curNode = curNode.next;
        }
        return occurence;
    }

    //Delete an element in a String
    //This will method will Delete first occurence
    public String delElemeOccurOnceString(String s)
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return null;
        }
        Node nnode = head;
        Node temp = head.next;
        String sstring = null;
        
        if(head.next.equals(null))
        {
            sstring = head.data;
            head = null;
            return sstring;
        }

        if(head.data.equals(s))
        {
            sstring = head.data;
            head = head.next;
            return sstring;
        }

        while(temp.next != null)
        {
            if(temp.data.equals(s))
            {
                sstring = temp.data;
                nnode.next = temp.next;
                break;
            }
            nnode = temp;
            temp = temp.next;
        }

        return sstring;
    }

    //Delete the first occurence of any element
    public String delAllOccur(String a)
    {
        if(findOccur(a) == 1)
        {
            System.out.println("The element has no multiple" +
            "ocurrence");
            return a;
        }
        else if(findOccur(a) == 0)
        {
            System.out.println("The list has no such element");
            return null;
        }

        Node n_Node = head;
        Node temp = head.next;
        String str = null;
        if(head.data.equals(a))
        {
            head = head.next;
        }

        while(temp != null) //it will reach last node 
        {                        //but will not be executed
            if(temp.data.equals(a))
            {
                str = temp.data;
                temp = temp.next;
                n_Node.next = temp;
            }
            else
            {
                n_Node = temp;
                temp = temp.next;
            }
        }
        return str;
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;

        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        
        MyLinkedList li = new MyLinkedList();

        li.insertFirst("5");
        li.insertLast("n");
        li.insertFirst("t");
        li.printList();
        li.insertMid("5", "y");
        li.printList();
        li.insertMid("5", "h");   //Position and string to be added
        li.insertFirst("n");
        li.insertLast("n");
        li.printList();
        // li.delElemeOccurOnceString("n");
        // li.printList();
        li.delAllOccur("n");
        li.printList();
        li.insertMid("y","c");
        li.insertMid("h", "c");
        li.insertMid("5", "c");
        li.printList();
        li.delAllOccur("c");
        li.printList();
        System.out.println(li.findOccur("n"));
        System.out.println(li.findOccur("c"));
    }
}
