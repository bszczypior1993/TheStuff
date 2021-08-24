public class OwnHashMap implements OwnMap {

    public static void main(String[] args) {
        OwnHashMap ownHashMap = new OwnHashMap();
        ownHashMap.put("2", "Cebula");
        ownHashMap.put("3", "Szczypior");
        System.out.println(ownHashMap.get("3"));
        ownHashMap.put("3", "Cebulion");
        System.out.println(ownHashMap.get("1"));
        System.out.println(ownHashMap.get("3"));
        System.out.println(ownHashMap.get("8"));
        System.out.println(ownHashMap.remove("2"));
//        System.out.println(ownHashMap.containsKey("9"));
        System.out.println(ownHashMap.containsValue("Basia"));
    }


    public String[] hashMapKey;
    public String[] hashMapValue;
    public int arrayLength=0;

    public OwnHashMap() {
    this.arrayLength = 0;
    this.hashMapKey = new String[arrayLength];
    this.hashMapValue = new String[arrayLength];
    }

    @Override
    public boolean put(String key, String value) {
        boolean putResult = false;
        arrayLength++;
        hashMapKey[arrayLength] = key;
        hashMapValue[arrayLength] = value;
        putResult = true;
        return putResult;
    }

    @Override
    public boolean containsKey(String key) {
        boolean containsKey = false;
        for (int i = 0; i < hashMapKey.length; i++) {
            if (hashMapKey[i] == key) {
                containsKey = true;
            }
        }
        return containsKey;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean containsValue = false;
        for (int i = 0; i < hashMapValue.length; i++) {
            if (hashMapValue[i] == value) {
                containsValue = true;
            }
        }
        return containsValue;
    }

    @Override
    public String remove(String key) {
        String removedValue = "";
        for (int i = 0; i < hashMapKey.length; i++) {
            if (hashMapKey[i] == key) {
                for (int z = 0; z > hashMapKey.length - 1; z++) {
                    hashMapKey[z] = hashMapKey[i + z];
                    hashMapValue[z] = hashMapValue[i + z];
                }
                return removedValue;
            }
        }
        return removedValue;
    }

    @Override
    public String get(String key) {
        String valueToDisplay = "";
        for (int i = 0; i < hashMapKey.length; i++) {
            if (hashMapKey[i] == key) {
                valueToDisplay = hashMapValue[i];
                return valueToDisplay;
            }
        }
        return valueToDisplay;
    }
}