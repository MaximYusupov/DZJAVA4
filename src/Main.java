import exercises.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер case: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                System.out.println("Метод возвращает перевернутый список: ");      
                Ex1.RunRev(20);
                break;
            case 2:
                Ex2 queue = new Ex2(20);
                queue.print();                         
                System.out.println("Метод enqueue, помещает элемент в конец очереди:");
                queue.enqueue(123);
                queue.print();
                System.out.println("Метод dequeue, возвращает первый элемент из очереди и удаляет его:");
                System.out.println("Первый элемент очереди был: " + queue.dequeue() + ", после его удалили!");
                queue.print();
                System.out.println("Метод first, возвращает первый элемент из очереди, не удаляя:");
                System.out.println("Первый элемент очереди: " + queue.first() + ", его оставили!");
                queue.print();
                break;
        }
    }
}