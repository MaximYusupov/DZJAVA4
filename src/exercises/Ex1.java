package exercises;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Ex1 
{
    public static void RunRev(int size) 
    {
        LinkedList<Integer> dataIn = GetRandomLL(size);
        System.out.println(dataIn);              // Выводим исходный список
        System.out.println(ReverseLL(dataIn));   // Выводим развернутый список
    }

    public static LinkedList<Integer> GetRandomLL(int size) 
    {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) 
        {
            result.add((int) (Math.random() * 100));
        }
        return result;
    }

    public static LinkedList<Integer> ReverseLL(LinkedList<Integer> inList) 
    {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Integer element : inList) result.add(0, element); // Добавляем новый элемент всегда в начало
        return result;
    }
}
