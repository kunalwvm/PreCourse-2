// time complexity 0(logn)
// space complexity 0(n)
class LinkedList
{
    Node head; // head of linked list

    /* Linked list node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to print middle of linked list */
    //Complete this function
    // two pointer incr slow by 1 and fast by two when fast reaches to the end of to the end retrun slow position
    void printMiddle()
    {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null  )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Midle Node is :"+ slow.data);

        //Write your code here
        //Implement using Fast and slow pointers
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        for (int i=15; i>0; --i)
        {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}