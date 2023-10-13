package pac.NineProgramsJAVA;

import java.util.Arrays;

public class BigNumberInArray {
	
	public static void main(String[] args) {
		ArrayBigNumMethod();
	}
	static void ArrayBigNumMethod() {
		int input[] = {10,6,9,28,75,39,87};
		int temp,arrayLength;
		arrayLength = input.length;
		for(int i=0;i<arrayLength;i++) {
			for(int j=i+1;j<arrayLength;j++) {
				if(input[i]>input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(input));
		System.out.println("The largest number in the given array is"+" "+input[arrayLength-1]);
	}
}

	


