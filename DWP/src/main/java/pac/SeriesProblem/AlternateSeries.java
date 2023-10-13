package pac.SeriesProblem;

public class AlternateSeries {
	void alternateSeriesMethod(float range) {
		float value = 1;
		for(int i = 1;i<range;i+=4) {
			value += 1.0/i;
		}
		for(int j = 3;j<range;j+=4) {
			value -= 1.0/j;
		}
		
		System.out.println(value);
		
	}
	void printAlternateSeries(int n) {
		int temp = 1;
		System.out.print(1);
		for(int i = 1;i<=n;i+=2) {
			if(temp%2==0) {
			System.out.print("-(1/"+i+")");
			}
			else {
				System.out.print("+(1/"+i+")");
			}
			temp++;
		}
		System.out.print(" : ");
		alternateSeriesMethod(n);
		}

}
