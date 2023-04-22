package exercises;
import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Ex2 
{
    public Ex2(int size)
    {
        database = Ex1.GetRandomLL(size);
        listSize = size;
    }
    private LinkedList<Integer> database = new LinkedList<Integer>();    // Сам список
    private int listSize = 0;             // Размер списка, чтобы не проходить по нему каждый раз
    public void enqueue(int element)      // помещает элемент в конец очереди
    {
        database.add(element);
        listSize++;
    }

    public int dequeue()                  // возвращает первый элемент из очереди и удаляет его
    {
        if(listSize > 0) 
        {
            listSize--;
            return database.remove(0);
        }
        else 
        {
            throw new RuntimeException("Список пустой!");
        }
    }
 
    public int first()                    // возвращает первый элемент из очереди, не удаляя
    {
        return database.get(0);
    }
    
    public void print()
    {
        System.out.println(database);
    }
}
