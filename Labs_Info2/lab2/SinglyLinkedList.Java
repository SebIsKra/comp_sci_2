public class SinglyLinkedList<E>{
private Node<E> head = null;
private Node<E> next = null;
// How to make size faster add to size with each add and remove with each remove
private int size = 0;

    public void addFirstElement(E e){
        Node<E> newNode = newNode Node<E>();
        newNode.value = e;

        newNode.next = head;
        head = newNode;

    }

    public boolean contains(Object obj){
        SinglyLinkedList cursor = head;

        while(cursor.value == obj){
            if(cursor.value == e){
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }

    public int indexOf(Object obj){
        SinglyLinkedList<E> cursor = head;
        int counter = 0;

        while(cursor != 0){
            if(cursor.value == obj){
                return count;
            }
            count ++;
            cursor = cursor.next;
        }
        return -1;
    }


    // Check when is "i" necessary e.g. smaller/longer integers
    public void remove(int i){
        if(i < 0) throw new IndexOutOfBoundsException();
        if(i == 0) {
            if(head == null) throw new IndexOutOfBoundsException();
            head = head.next;
        }

        counter = 0;

        Node<E> prev = head;

        while(counter != i-1){
            if(prev.next == null) throw new IndexOutOfBoundsException();
            counter++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public SinglyLinkedList<E> tail(){
        if(head == null) throw new IndexOutOfBoundsException();

        SinglyLinkedList<E> tail = new SinglyLinkedList<E>;
        tail.head = head.next;
        return tail;  
    }

    public void addAtPos(int i; Object obj){
        Node<E> newNode = new Node<E>();
        newNode.value = obj;

        if(i < 0) throw new IndexOutOfBoundsException();
        if(i == 0){
            addFirst(e);
            return;
        }

        SinglyLinkedList<E> cursor = head;
        int count = 0;

        while(count != i){
            if(cursor == null) throw new IndexOutOfBoundsException();
            count ++;
            cursor = cursor.next;
        }
        newNode.next = cursor.next;
        cursor.next = newNode;
    }

    public void add(E e){
        Node<E> newNode = new Node<E>();
        newNode.value = e;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node<E> cursor = head;
            while(cursor.next != null){
                cursor = cursor.next;
            }
            //cursor.next == null
            cursor.next = newNode;

        }
        
    }

    public int size(){
        int counter = 0;
        
        Node<E> cursor = head;
            while(cursor.next != null){
                counter ++;
                cursor = cursor.next;
            }

        return counter;
    }

    public static void main(String[] args){
        SinglyLinkedList<String> names = new SinglyLinkedList<String>();

        SinglyLinkedList<Double> grades = new SinglyLinkedList<Double>();
    }
}