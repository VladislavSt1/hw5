public class Pair<K, V> {

    private K key;
    private V value;


    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair(){
        
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> winLicense = new Pair<Integer, String>(100, "win10");
        int price = winLicense.getKey();
        String version = winLicense.getValue();

        System.out.println("1 copy " + version + " for a price of " + price + "$");
    }

}