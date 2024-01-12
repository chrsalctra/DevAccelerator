//program demonstrating linkedlist, 
package CA_java_udemy;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
class Data { // Using Object wrapper class
    private Object object;

    public Data(Object object) {
        this.object = object;
    }
    @Override
    public String toString() {
        return object.toString();
    }
}

/*  Generic Types
T - Type
E - Element
K - Key
N - Number
V - Value
*/

class Data2<K extends Integer, V extends String> { // Generics
    private K key;
    private V value;
   
    public Data2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    //Generic methods
    public <E , N extends Number> void display (E element , N number){ // extends: retrict value types
        System.out.println("Element" + element + "\n" + "Number" + number);
    }
}
public class Main1 {
    public static void main(String[] args){
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Chris"));
        elements.add(new Data('C'));
        elements.add(new Data(26));
        elements.add(new Data(5.8));

        System.out.println(elements);
        //elements.sort(null);
        System.out.println(elements);
        //Generics
        Data2<Integer, String> data = new Data2<>(10, "Chris");
        System.out.println(data.getKey() + "<_key , value_>" + data.getValue());
        data.display("Test", 26); // method
        // Queue (standard):
        //Queue queue = new LinkedBlockingDeque<>();
        //Integer type:
        Queue<Integer> queue = new LinkedBlockingDeque<>(); // add size in paranthesis
        queue.add(1); // cannot be null
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        //queue.offer(7) // skips if exception; returns boolean. adds to Q.
        //queue.poll() // return boolean if something can be removed

        //Dequeue
        System.out.println("\nde-Q\n");
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        deque.offer(1);
        deque.offer(2);
        System.out.println(deque);
        deque.addFirst(0);
        deque.removeLast();
        System.out.println(deque);

        //Maps
        System.out.println("\nHashMap\n");
        Map<String, String> map = new HashMap<>();
        map.put("a1", "Christian");
        map.put("a0", "John");
        map.put("a3", "Sam");
        System.out.println(map);
        //Iterating
        for (String key: map.keySet()){
            System.out.println("key" + key + " Value: " + map.get(key));
        }
        //or:
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.err.println("key" + entry.getKey() + " Value: " + entry.getValue());
        }
        //see notes for comparator notes
    }
}
