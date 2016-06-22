package algorithms.misc;

import java.util.Iterator;
import java.util.NoSuchElementException;

class ArrayIterator<T> implements Iterator<T> {

	T[] array;
	int counter = 0;

	public ArrayIterator(T[] a) {
		this.array = a;
	}

	@Override
	public boolean hasNext() {
		return counter < array.length;
	}

	@Override
	public T next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		T t = array[counter];
		counter++;
		return t;
	}

}

public class ArrayIteratorImplementation {

	public static void main(String args[]) {
		Integer[] array = new Integer[] { 1, null, 4, 3, 5 };
		ArrayIterator<Integer> it = new ArrayIterator<Integer>(array);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		String[] a = {"asd","vdf",null,"asdasd"};
		ArrayIterator<String> it1 = new ArrayIterator<String>(a);
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
	}
}
