public class Node<K extends Comparable<K>, V> {
	protected final K key;
	protected V value;
	protected Node<K,V> next;

	public Node() {
		this (null,null);
	}
	public Node(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue(V newValue) {
		this.value = newValue;
	}
	
	public String toString() {
		return "{" + key + ": " + value + "}";
	}

}