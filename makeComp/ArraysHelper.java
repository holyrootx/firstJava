package makeComp;

import java.util.Arrays;

public class ArraysHelper<T extends Number> implements Comparable<T>{
	
	
	private T[] box;
	
	public ArraysHelper(T[] box) {
		this.box = box;
	}
	
	public T[] swapArray(int idx1, int idx2) throws Exception{
		T tmp;
		if (Integer.compare(idx1, idx2) == 0) {
			return this.box;
		}
		
		if (idx1 >= box.length || idx2 >= box.length) {
			throw new Exception("인덱스보다 큰 숫자를 입력하였습니다.");
		} else if(box[idx1] == null || box[idx2] == null) {
			throw new Exception("null을 주면 어떡하냐?");
		} else {
			tmp = box[idx1];
			box[idx1] = box[idx2];
			box[idx2] = tmp;
			return box;
		}

	} 
	@Override
	public int compareTo(T o) {
		 
		return 0;
	}
	
	public void sort() {
		int idx = 0;
		
	}
	@Override
	public String toString() {
		return "ArraysHelper [box=" + Arrays.toString(box) + "]";
	}

	
	
	
}
