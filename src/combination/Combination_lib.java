package combination;

public class Combination_lib {

		
		public int getFactorial(int n) {
			int f=1;
			for(int m=1;m<=n;m++) {
				f=f*m;
			}
			return f;
		}
}
