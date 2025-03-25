import java.util.*;

public class ListMap<K extends Comparable<K>, V > implements Map<K, V> {

	Node<K, V> head;
	int numElements;
	
	public ListMap() {

	}
	
	public void put (K key, V value) {

	}
	
	public int size() {
		return -1;
	}
	
	public void remove (K key) {

	}

	public void clear() {

	}
	
	public boolean containsKey(K key) {
		Node<K,V> cur = head;
		boolean found = false;
		while (cur != null && found == false) {
			if (cur.key.compareTo(key) == 0) {
				found = true;
			}
			cur = cur.next;
		}
		return found;
	}

	public V get (K key) throws KeyNotFoundException {
		Node<K,V> cur = head;
		boolean found = false;
		while (cur != null && found == false) {
			if (cur.key.compareTo(key) == 0) {
				found = true;
			} else {
				cur = cur.next;
			}
		}
		if (found) {
			return cur.value;
		} else {
			throw new KeyNotFoundException();
		}
	}
	
	public List<Entry<K,V>> entryList() {
		return null;
	}
	
}