package makeGenerics.makePair;

public class OrderedPair<K,V> implements Pair<K,V> {

	private K key;
	private V value;
	
	public OrderedPair(K key,V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() { 
		return this.key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	
	
}
