package GenericAssignment;

public class HashMap<K,V> {
    private K key;
    private V value;

    public HashMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
         return value;
    }
}
