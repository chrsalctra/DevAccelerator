//program demonstrating linkedlist, 
package CA_java_udemy;
import java.util.LinkedList;
import java.util.List;

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
public class Main {
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
    }
}
