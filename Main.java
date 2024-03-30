// unit тесты находятся в файле MyArrayListTest
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println("Элемент по индексу 0: " + myList.get(0)); // Должно вывести 10
        System.out.println("Элемент по индексу 1: " + myList.get(1)); // Должно вывести 20
        System.out.println("Элемент по индексу 2: " + myList.get(2)); // Должно вывести 30
        myList.remove(1); // Удаляем элемент 20
        System.out.println("Элемент по индексу 0 после удаления: " + myList.get(0)); // Должно вывести 10
        System.out.println("Элемент по индексу 1 после удаления: " + myList.get(1)); // Должно вывести 30
        System.out.println("Размер списка: " + myList.size()); // Должно вывести 2
    }
}
// особенности arraylist:
// динамический размер
// доступ к элементам по индексу
// поддержка generics
// резервирование памяти
// неэффективное добавление и удаление элементов в середину