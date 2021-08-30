import java.util.LinkedHashMap;

public class Pair<K, V> {

    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.add("A", "B");
        pair.add(1, 2);
        pair.add("A1", "B2");
        pair.printElement(KeyOrValue.VALUES);

    }

    LinkedHashMap<K, V> pairList = new LinkedHashMap<>();

    enum KeyOrValue {
        KEYS,
        VALUES
    }

    public void add(K k, V v) {
        pairList.put(k, v);
    }

    public void printElement(KeyOrValue keyOrValue) {
        switch (keyOrValue) {
            case KEYS:
                System.out.println(pairList.keySet());
                break;

            case VALUES:
                System.out.println(pairList.values());
                break;
        }


    }

}
