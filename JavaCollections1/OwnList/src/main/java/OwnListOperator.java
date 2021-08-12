public class OwnListOperator implements OwnList {

    int[] ownList = {1, 2, 3, 4, 5};

    @Override
    public int size() {
        return ownList.length;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (ownList.length == 0) {
            isEmpty = true;
            return isEmpty;
        } else {
            isEmpty = false;
            return isEmpty;
        }
    }

    @Override
    public void add(Integer element) {
        int n = 0;
        int newList[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newList[i] = ownList[i];
            newList[n] = element;
            return;
        }
    }

    @Override
    public Integer get(int index) {
        return ownList[index];
    }

    @Override
    public void add(int index, Integer element) {
        int n = 0;
        int newList[] = new int[index + 1];
        if (index <= ownList.length) {
            for (int i = 0; i < ownList.length + 1; i++) {
                newList[i] = ownList[i];
                newList[index] = element;
            }
        } else throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public void remove(int index) {
        if (index <= ownList.length) {
            for (int i = index; i < ownList.length - 1; i++) {
                ownList[i] = ownList[i + 1];
                return;
            }
        } else throw new ArrayIndexOutOfBoundsException();
    }
}