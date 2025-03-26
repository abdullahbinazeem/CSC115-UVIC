import java.util.*;

public class BSTMap<K extends Comparable<K>, V > implements  Map<K, V>  {
    
	BinarySearchTree<K,V> bst;

	public BSTMap () {
		bst = new BinarySearchTree<K,V>();
	}

	public boolean containsKey(K key) {
		// TODO: implement this
		return false; // so it compiles
	}

	public V get (K key) throws KeyNotFoundException {
		// TODO: implement this
		return null; // so it compiles
	}

	public List<Entry<K,V> >	entryList() {
		// TODO: implement this
		return null; // so it compiles
	}

	public void put (K key, V value) {
		// TODO: implement this
	}

	public int size() {
		// TODO: implement this
		return -1; // so it compiles
	}

	public void clear() {
		// TODO: implement this
	}

}