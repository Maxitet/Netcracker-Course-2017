import java.util.Iterator;

interface ILinkedList<E> extends Iterable<E> {
    void add(E element);
    void add(int index, E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    E set(int index, E element);
    int size();
    Object[] toArray();
    String toString();

    Iterator<E> iterator();
}

public class MyLinkedList<E> implements ILinkedList<E> {
    private int size;
    private MyLinkedList.Node<E> first;
    private MyLinkedList.Node<E> last;

    public MyLinkedList() {
        this.size = 0;
    }

    private static class Node<E> {
        E element;
        MyLinkedList.Node<E> nextNode;

        Node(E item, MyLinkedList.Node<E> node) {
            this.nextNode = node;
            this.element = item;
        }
    }

    @Override
    public void add(Object element) {
        MyLinkedList.Node var2 = this.last;

        MyLinkedList.Node var = new Node(element, null);
        this.last = var;
        if(var2 == null) {
            this.first = var;
        }
        else {
            var2.nextNode = var;
        }
        this.size++;
    }

    @Override
    public void add(int index, E element) {

        if(index == this.size) {
            this.add(element);
        }
        else {
            MyLinkedList.Node var = new Node(element, null);
            MyLinkedList.Node currentIndex = first;
            if (currentIndex != null) {
                for (int i = 0; i < index-1 && currentIndex.nextNode != null; i++) {
                    currentIndex = currentIndex.nextNode;
                }
            }
            var.nextNode = currentIndex.nextNode;
            currentIndex.nextNode = var;

        }

    }



    @Override
    public void clear() {
        MyLinkedList.Node var2;

        for(MyLinkedList.Node var1 = this.first; var1 != null; var1 = var2) {
            var2 = var1.nextNode;
            var1.element = null;
            var1.nextNode = null;
        }

        this.first = this.last = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        MyLinkedList.Node<E> currentNode = first;
        int currentIndex = 0;

        while(currentNode != null) {
            if (currentIndex == index) {
                return currentNode.element;
            }
            currentIndex++;
            currentNode = currentNode.nextNode;
        }
        return null;
    }

    @Override
    public int indexOf(E element) {
        MyLinkedList.Node var = first;
        int currentIndex = 0;

        while(var != null) {
            if(var.element.equals(element)) {
                return currentIndex;
            }
            currentIndex++;
            var = var.nextNode;
        }

        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is: " + index + ", but size is only: " + size);
        }

        MyLinkedList.Node<E> currentNode = first;
        MyLinkedList.Node<E> lastNode = null;
        Object value = null;
        int currentIndex = 0;
        while (currentNode != null) {
            if (currentIndex == index) {
                 value = currentNode.element;

                if (lastNode != null) {
                    lastNode.nextNode = currentNode.nextNode;

                    if (currentNode.nextNode == null) {
                        last = lastNode;
                    }
                } else {
                    first = currentNode.nextNode;

                    if(first == null) {
                        last = null;
                    }
                }
                currentNode.element = null;
                currentNode.nextNode = null;

            }
            currentIndex++;
            lastNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        this.size--;
        return (E) value;
    }

    @Override
    public E set(int index, E element) {
        MyLinkedList.Node<E> currentNode = first;
        E value = null;
        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index) {
                currentNode.element = element;
                value = currentNode.element;
            }

            currentIndex++;
            currentNode = currentNode.nextNode;
        }
        return value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object[] toArray() {
        MyLinkedList.Node currentNode = first;
        int currentIndex = 0;
        Object[] array = new Object[this.size];

        while(currentNode != null) {
            array[currentIndex++] = currentNode.element;
            currentNode = currentNode.nextNode;
        }
        return array;
    }

    @Override
    public String toString() {
        MyLinkedList.Node<E> currentNode = first;
        StringBuilder str = new StringBuilder();

        while(currentNode != null) {
            str.append(currentNode.element.toString()).append(" ");
            currentNode = currentNode.nextNode;
        }
        return str.toString();
    }

    @Override
    public Iterator<E> iterator() {

        Iterator<E> iterator = new Iterator<E>() {
            private int currentIndex;

            @Override
            public boolean hasNext() {
                return (currentIndex < size) && (last != null);
            }

            @Override
            public E next() {
                return get(currentIndex++);
            }
        };

       return iterator;
    }

}
