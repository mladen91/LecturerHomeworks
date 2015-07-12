package ba.bitcamp.task2;

/**
 * This whole class represents copy of DynamicDouble class that we did on lectures.
 * @author Mladen13
 *
 */
public class DynamicString {

	private String[] myArray;
	private int count;

	public DynamicString(int size, String value) {
		super();
		count = size;
		myArray = new String[size];
		for (int i = 0; i < count; i++) {
			myArray[i] = value;
		}
	}

	public DynamicString(int size) {
		this(size, null);
		count = 0;
	}

	public DynamicString() {
		this(0, null);
	}

	public String[] getMyArray() {
		return myArray;
	}

	public void setMyArray(String[] myArray) {
		this.myArray = myArray;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(String value) {
		if (count == myArray.length) {
			String[] temp = new String[2 * myArray.length + 1];
			for (int i = 0; i < myArray.length; i++) {
				temp[i] = myArray[i];
			}
			myArray = temp;
		}
		myArray[count] = value;
		count++;
	}

	public void addArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
	}

	public int getSize() {
		return count;
	}

	public int getTotalSize() {
		return myArray.length;
	}

	public void remove(int index) {
		if (index >= count) {
			throw new IllegalArgumentException();
		}
		myArray[index] = myArray[count - 1];
		count--;
		if (count <= myArray.length / 3) {
			String[] temp = new String[myArray.length / 2];
			for (int i = 0; i < count; i++) {
				temp[i] = myArray[i];
			}
			myArray = temp;
		}
	}

	public void removeSlowly(int index) {
		if (index >= count) {
			throw new IllegalArgumentException();
		}
		for (int i = index; i < count - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		count--;
		if (count <= myArray.length / 3) {
			String[] temp = new String[myArray.length / 2];
			for (int i = 0; i < count; i++) {
				temp[i] = myArray[i];
			}
			myArray = temp;
		}
	}
	
	@Override
	public String toString() {
		String s = count + "\t[";
		for (int i = 0; i < count; i++) {
			s += myArray[i];
			if (i != count - 1)
				s += ", ";
		}
		s += "]\n" + myArray.length + "\t[";
		for (int i = 0; i < myArray.length; i++) {
			s += myArray[i];
			if (i != myArray.length - 1)
				s += ", ";
		}
		return s + "]";
	}

}
