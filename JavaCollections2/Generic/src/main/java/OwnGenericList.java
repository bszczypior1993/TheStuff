public class OwnGenericList<E> implements OwnList{

    E genericList[];

    OwnGenericList ownGenericList = new OwnGenericList();
    OwnGenericList(){
    }











    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
