//program demonstrating linkedlist, 
package CA_java_udemy;
import java.util.LinkedList;
import java.util.List;

class Data {
    private Object object;

    public Data(Object object) {
        this.object = object;
    }
    @Override
    public String toString() {
        return object.toString();
    }
}

public class Main {
    public static void main(String[] args){
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Chris"));
        elements.add(new Data('C'));
        elements.add(new Data(26));
        elements.add(new )
    }
}
