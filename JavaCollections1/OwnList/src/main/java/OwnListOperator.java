import java.util.ArrayList;
import java.util.List;

public class OwnListOperator implements OwnList {

    List<Integer> newList = new ArrayList<>();

    @Override
    public int size() {
        return newList.size();
    }

    @Override
    public boolean isEmpty() {
        return newList.isEmpty();
    }

    @Override
    public void add(Integer element) {
        newList.add(element);
    }

    @Override
    public Integer get(int i) {
        return newList.get(i);
    }

    @Override
    public void add(int index, Integer element) {
        if (index <= newList.size()) {
            newList.add(index, element);
        } else throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public void remove(int index) {
        if (index <= newList.size()) {
            newList.remove(index);
        } else throw new ArrayIndexOutOfBoundsException();
    }
}
