public class Pair<K, V> {

    private K k;
    private V v;

    public void addK(K kAdd) {
        k = kAdd;
    }

    public void addV(V vAdd) {
        v = vAdd;
    }

    public void getK() {
        System.out.println(k);
    }

    public void getV() {
        System.out.println(v);
    }
}
