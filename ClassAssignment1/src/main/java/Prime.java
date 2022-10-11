
public class Prime {
	public boolean PrimeNo(int n) {
		boolean flag = true;
		if(n<=2) {flag= true;}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag= false;
				break;
			}
		}
		return flag;
	}

}
