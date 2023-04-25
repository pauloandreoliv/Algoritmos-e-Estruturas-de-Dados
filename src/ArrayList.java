
public class ArrayList implements List {
	
	private int[] array;
	private int size;
	
	public ArrayList() {
		this.array = new int[5];
		size = 0;
	}
	
	public int getIndex(int element) {
		for (int k = 0; k < this.size; k++) {
			if(this.array[k] == element) {
				return k;
			}
		}
		throw new IllegalArgumentException("Index out of range");
	}
	
	public int get(int index) {
		if (index > this.size && index < 0) {
			throw new IllegalArgumentException("Index out of range");
		} else {
			return this.array[index];
		}
	}
	
	public int[] duplicar(){
		int[] arrayAntigo = this.array;
		int[] array = new int[arrayAntigo.length * 2];
		for (int k = 0; k < arrayAntigo.length; k++) {
			array[k] = arrayAntigo[k];
		}
		return array;
	}

	public void add(int element) {
		if (this.size >= this.array.length) {
			duplicar();
		}
		this.array[this.size] = element;
		this.size++;
	}


	public void add(int element, int index) {

	}

	public void remove(int index) {

	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		} else {
			return false;
		}
	}
}
