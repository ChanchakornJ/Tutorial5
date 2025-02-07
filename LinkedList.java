//Chanchakorn Jullapech
//672115007
class Node {
    CovidVaccine data;
    Node next;

    public Node(CovidVaccine data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

  
    public void insert(CovidVaccine data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  
            }
            current.next = newNode;  
        }
    }

   
    public void delete(int SID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data.SID == SID) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data.SID != SID) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("SID " + SID + " has been deleted.");
        } else {
            System.out.println("SID not found.");
        }
    }

  
    public void deleteAll() {
        head = null;
        System.out.println("All applicants have been deleted.");
    }

  
    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

  
    public void traversal() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);  
            current = current.next;  
        }
    }
}
