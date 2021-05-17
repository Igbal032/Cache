import java.lang.reflect.Array;
import java.util.Iterator;

public class Cashe<T> implements Iterable<T> {

    Node<T> head;
    int capacity;

    public Cashe() {
        this.capacity = 10;
    }

    public void addElement(T data) {
        Node<T> addedNode = new Node(data);
        if(head == null) {
            head = addedNode;
        }else {
            if (count() >= capacity) head = head.next;

            Node<T> currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = addedNode;
        }
    }

    public int count()
    {
        int count = 0;
        Node<T> current = head;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }


    public T get(int index) {
        if (index > count()){
            return null;
        }
        Node<T> currentNode = head;
        for(int i = 0; i < index; i ++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void print(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    Node<T> node = current;
                    current = current.next;
                    return node.data;
                }
                return null;
            }
        };
    }


}
