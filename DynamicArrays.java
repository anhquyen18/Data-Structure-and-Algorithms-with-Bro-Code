import java.util.*;
public class DynamicArrays {
	
	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArrays() {
		this.array = new Object[capacity];
	}
	
	public DynamicArrays(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void add(Object data) {
		if (size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;	
	}
	
	public void insert(int index, Object data) {
		if (size >= capacity) {
			grow();
		}
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		size++;
	}
	
	public void delete(Object data) {
		for (int i = 0; i < size; i++) {
			if (array[i] == data) {
				for (int j  = 0; j < (size - i - 1); j++) {
					array[i + j] = array[i+j+1];
				}
				array[size - 1] = null;
				size--;
				if (size <=(int) (capacity/3)) {
					shrink();
				}
				break;
			}
		}
	}
	
	public int search(Object data) {
		for (int i = 0; i < size; i++) {
			if (array[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	private void grow() {
		int newCapacity =(int) (capacity*2);
		Object[] newArray = new Object[newCapacity];
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i]; 
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public void shrink() {
		int newCapacity =(int) (capacity/2);
		Object[] newArray = new Object[newCapacity];
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i]; 
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String string = "";
		
		for (int i = 0; i < size; i++) {
			string += array[i] + ", ";
		}
		
		if (string != "") {
			string = "["+ string.substring(0,string.length() - 2)+"]";
		}
		else {
			string = "[]";
		}
		
		return string;
	}
	
	
	public static void main(String[] args) {
		DynamicArrays dynamicArray = new DynamicArrays();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		
//		dynamicArray.insert(0, "X");
//		dynamicArray.delete("A");
//		
//		System.out.println(dynamicArray.search("B"));
		
		System.out.println(dynamicArray);
		System.out.println(dynamicArray.isEmpty());
		System.out.println(dynamicArray.size);
		System.out.println(dynamicArray.capacity);

	}

}
