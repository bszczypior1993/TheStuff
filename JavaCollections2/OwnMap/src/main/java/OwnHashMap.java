import java.util.ArrayList;
import java.util.List;

public class OwnHashMap implements OwnMap {

    public static void main(String[] args) {
        OwnHashMap ownHashMap = new OwnHashMap();
        ownHashMap.put("1", "Basia");
        ownHashMap.put("2", "Cebula");
        ownHashMap.put("3", "Szczypior");
        System.out.println(ownHashMap.get("3"));
        ownHashMap.put("3", "Cebulion");
        System.out.println(ownHashMap.get("1"));
        System.out.println(ownHashMap.get("3"));
        System.out.println(ownHashMap.get("8"));
        System.out.println(ownHashMap.remove("2"));
        System.out.println(ownHashMap.containsKey("9"));
        System.out.println(ownHashMap.containsValue("Basia"));
    }

    class Node {

        String key;
        String value;

        public void insert(String key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    private Node temp;
    private List<Node> hashMap;
    public int length;

    public OwnHashMap() {
        this.hashMap = new ArrayList<Node>();
    }

    @Override
    public boolean put(String key, String value) {
        boolean putResult = false;
        this.temp = new Node();
        temp.insert(key, value);
        for (int i = 0; i < hashMap.size(); i++) {
            Node temp2 = hashMap.get(i);
            if (temp2.key.equals(key)) {
                hashMap.remove(i);
                putResult = true;
                break;
            }
        }
        hashMap.add(temp);
        length++;
        return putResult;
    }

    @Override
    public boolean containsKey(String key) {
        boolean containsKey = false;
        for (int i = 0; i < this.hashMap.size(); i++) {
            Node temp = hashMap.get(i);
            if (key == temp.key) {
                containsKey = true;
            }
        }
        return containsKey;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean containsValue = false;
        for (int i = 0; i < this.hashMap.size(); i++){
            Node temp = hashMap.get(i);
            if (value == temp.value){
                containsValue = true;
            }
        }
        return containsValue;
    }

    @Override
    public String remove(String key) {
        String removedValue = "";
        for (int i = 0; i < this.hashMap.size(); i++) {
            Node temp = hashMap.get(i);
            if (key == temp.key) {
                removedValue = temp.value;
                hashMap.remove(i);
                length--;
                return removedValue;
            }
        }
        return removedValue;

    }

    @Override
    public String get(String key) {
        for (int i = 0; i < this.hashMap.size(); i++) {
            Node temp = hashMap.get(i);
            if (key == temp.key) {
                return temp.value;
            }
        }
        return null;
    }
}