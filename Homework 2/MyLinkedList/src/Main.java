import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        LinkedList<Integer> javaLinkedList = new LinkedList<>();
        Random random = new Random();
        long currentTime = System.nanoTime();
        long estimatedTime = System.nanoTime();
        Iterator iterator = myLinkedList.iterator();
        int temp; //Для хранения случайных значений
        int index;


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элемнтов в списках :");
        int size = scan.nextInt();


        System.out.println("Введите индекс для операций:");
        index = scan.nextInt();

        // Добавляем рандомные элементы в оба списка
        for(int i = 0; i < size; i++) {
            temp = random.nextInt(1000000);
            myLinkedList.add(temp);
            javaLinkedList.add(temp);
        }

        if(iterator.hasNext()) {
            System.out.println("Демонстрация работы итератора, первые 2 элемента через next(): " + iterator.next() + " " + iterator.next());
        }


        currentTime = System.nanoTime();
        javaLinkedList.add(index,200);
        estimatedTime = System.nanoTime();
        System.out.println("Время вставки по индексу LinkedList: " + (estimatedTime - currentTime));

        currentTime = System.nanoTime();
        myLinkedList.add(index,200);
        estimatedTime = System.nanoTime();
        System.out.println("Время вставки по индексу MyLinkedList: " + (estimatedTime - currentTime));

        currentTime = System.nanoTime();
        javaLinkedList.get(index);
        estimatedTime = System.nanoTime();
        System.out.println("Время поиска элемента в LinkedList: " + (estimatedTime - currentTime));

        currentTime = System.nanoTime();
        myLinkedList.get(index);
        estimatedTime = System.nanoTime();
        System.out.println("Время поиска элемента в MyLinkedList: " + (estimatedTime - currentTime));

        currentTime = System.nanoTime();
        javaLinkedList.remove(index);
        estimatedTime = System.nanoTime();
        System.out.println("Время удаления элемента в LinkedList: " + (estimatedTime - currentTime));

        currentTime = System.nanoTime();
        myLinkedList.remove(index);
        estimatedTime = System.nanoTime();
        System.out.println("Время удаления элемента в MyLinkedList: " + (estimatedTime - currentTime));

        System.out.println("**********************");
        System.out.println("Просто демонстрация методов");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("This is test");
        list.add("Element2");
        list.add("Strange");
        list.add("Super");
        list.add("Design");
        System.out.println(list);
        System.out.println("IndexOf: " + list.indexOf("Design"));
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.set(1, "NewElement2"));
        System.out.println(list);
        list.clear();
        System.out.println("После clear(): " + list);

    }
}
