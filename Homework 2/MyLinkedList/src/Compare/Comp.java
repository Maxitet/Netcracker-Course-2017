package Compare;

import java.util.*;

public class Comp {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long currentTime = System.nanoTime();
        long estimatedTime = System.nanoTime();
        long avgTime = 0;
        int size = 20000;

        for(int i = 0; i < size; i++) {
            int temp = random.nextInt(1000000);
            linkedList.add(temp);
            arrayList.add(temp);
        }

        currentTime = System.nanoTime();
        linkedList.add(15432,200);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedList.add(4321,201929);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedList.add(19312,19021);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время вставки по индексу LinkedList: " + (avgTime/3));

        avgTime = 0;

        currentTime = System.nanoTime();
        arrayList.add(15432,200);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        arrayList.add(4321,201929);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        arrayList.add(19312,19021);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время вставки по индексу ArrayList: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        linkedList.add(15432);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedList.add(4324343);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedList.add(1931211);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в LinkedList: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        arrayList.add(15432);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        arrayList.add(4324343);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        arrayList.add(1931211);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в ArrayList: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        linkedList.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedList.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedList.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления элемента из LinkedList: " + avgTime);
        avgTime = 0;

        currentTime = System.nanoTime();
        arrayList.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        arrayList.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        arrayList.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления элемента из ArrayList: " + avgTime);
        avgTime = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < size; i++) {
            int temp = random.nextInt(1000000);
            hashSet.add(temp);
            linkedHashSet.add(temp);
            treeSet.add(temp);
        }

        currentTime = System.nanoTime();
        linkedHashSet.add(1543221);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashSet.add(201929);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashSet.add(19312);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время вставки в LinkedHashSet: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        hashSet.add(1543221);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashSet.add(201929);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashSet.add(19312);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время вставки в HashSet: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        treeSet.add(1543221);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeSet.add(201929);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeSet.add(19312);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время вставки в TreeSet: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        linkedHashSet.add(15432);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashSet.add(4324343);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashSet.add(1931211);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в LinkedHashSet: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        hashSet.add(15432);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashSet.add(4324343);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashSet.add(1931211);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в HashSet: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        treeSet.add(15432);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeSet.add(4324343);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeSet.add(1931211);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в TreeSet: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        linkedHashSet.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashSet.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashSet.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления элемента из LinkedHashSet: " + avgTime);
        avgTime = 0;

        currentTime = System.nanoTime();
        hashSet.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashSet.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashSet.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления элемента из HashSet: " + avgTime);
        avgTime = 0;

        currentTime = System.nanoTime();
        treeSet.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeSet.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeSet.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления элемента из TreeSet: " + avgTime);
        avgTime = 0;

        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for(int i = 0; i < size; i++) {
            int temp = random.nextInt(1000000);
            hashMap.put(i, "String" + i);
            linkedHashMap.put(i, "String" + i);
            treeMap.put(i, "String" + i);
        }

        currentTime = System.nanoTime();
        hashMap.put(15432, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashMap.put(5231, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashMap.put(11432, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в HashMap: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        linkedHashMap.put(15432, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashMap.put(5231, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashMap.put(11432, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в LinkedHashMap: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        treeMap.put(15432, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeMap.put(5231, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeMap.put(11432, "NewString");
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время добавления в TreeMap: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        hashMap.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashMap.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        hashMap.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления из HashMap: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        linkedHashMap.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashMap.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        linkedHashMap.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления из LinkedHashMap: " + (avgTime/3));
        avgTime = 0;

        currentTime = System.nanoTime();
        treeMap.remove(9302);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeMap.remove(15032);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        currentTime = System.nanoTime();
        treeMap.remove(3412);
        estimatedTime = System.nanoTime();
        avgTime += estimatedTime - currentTime;

        System.out.println("Среднее время удаления из TreeMap: " + (avgTime/3));
        avgTime = 0;
    }
}
