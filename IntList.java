import java.util.*;

public class IntList {

        List<Integer> numbers = new ArrayList<>();

    public void add(Integer integer) {
        numbers.add(integer);
    }
    public void remove(Integer integer) {
        numbers.remove(integer);
    }
    public boolean isEmpty(){

        return numbers.isEmpty();
    }
    public int count() {
        return numbers.size();
    }
    public void clear(){
        numbers.clear();
    }
}