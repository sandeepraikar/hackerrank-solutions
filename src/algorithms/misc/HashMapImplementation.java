package algorithms.misc;

class CustomHashMap<K, V> {

	private CustomEntry<K, V>[] table;
	private int initalCapacity = 16;

	class CustomEntry<K, V> {
		private K key;
		private V value;
		private CustomEntry<K, V> next;

		public CustomEntry(K key, V value, CustomEntry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public CustomHashMap() {
		table = new CustomEntry[initalCapacity];
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % initalCapacity;
	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		}
		CustomEntry<K, V> temp = table[hash];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean remove(K deleteKey) {
		int hash = hash(deleteKey);
		if (table[hash] == null) {
			return false;
		} else {
			CustomEntry<K, V> previous = null;
			CustomEntry<K, V> current = table[hash];
			while (current != null) {
				if (previous == null) {
					table[hash] = table[hash].next;
				} else {
					previous.next = current.next;
				}
				previous = current;
				current = current.next;
			}
			return false;
		}

	}

	public void put(K key, V value) {

		if (key == null) {
			return;
		}
		int hash = hash(key);
		CustomEntry<K, V> newEntryObj = new CustomEntry(key, value, null);
		if (table[hash] == null) {
			table[hash] = newEntryObj;
		} else {
			CustomEntry<K, V> previous = null;
			CustomEntry<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(key)) {
					if (previous == null) {
						newEntryObj.next = current.next;
						table[hash] = newEntryObj;
						return;
					} else {
						newEntryObj.next = current.next;
						previous.next = newEntryObj;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntryObj;
		}
	}
}

public class HashMapImplementation {

	public static void main(String[] args) {
		CustomHashMap<Integer, Integer> mapper = new CustomHashMap();
		mapper.put(1, 1);
		mapper.put(2, 50);
		mapper.put(3, 100);
		System.out.println(mapper.get(3));

	}
}
