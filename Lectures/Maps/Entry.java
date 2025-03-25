
public class Entry<K extends Comparable<K>, V> {
	protected final K key;
	protected V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public String toString() {
		return "[k:" + key + ", v:" + value + "]";
	}
	
	public boolean equals(Object other) {
		if (other instanceof Entry) {
			Entry o = (Entry) other;
			return this.key.equals(o.key) && this.value.equals(o.value);
		}
		return false;
	}
}