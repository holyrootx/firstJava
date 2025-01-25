package object;

public class ArrayInfo {

	int count;
	int max;
	int min;
	int sum;
	double average;
	
	public ArrayInfo(int... arrayInt) {
		
		count = arrayInt.length;
		max = arrayInt[0];
		min = arrayInt[0];
		
		for(int num : arrayInt) {
			max = num < max ? max : num;
			min = num > min ? max : num;
			sum += num;
			
		}
		
		average = (double)(sum / count);
		
	}
	
	public String introArray() {
		return ("배열의 크기  : [%03d칸]%n"
				+"합계 :[%05d] 최대값 : [%05d] 최소값 [%05d] %n"
				+"평균 : [%04.2f]").formatted(count,sum,max,min,average);
	}
	
}
