package quiz6;

public class Question1 {
	public static final int CACHE_SIZE = 42;
	private Boolean[] primeTable = new Boolean[CACHE_SIZE + 1];

	// requires: None
	// modifies: None
	// effects:  None
	// returns:  null if x < 0;
	//           otherwise true if x is prime and false if x is not prime;
	// throws:   Exception, if x = null
	Boolean isPrime(Integer x) {
//		for(int i=0; i<primeTable.length; i++) {
//			System.out.println(i);
//			System.out.println(primeTable[i]);
//		}
		if (x < 2) return null;
	    if (x >= CACHE_SIZE || primeTable[x] == null) {
			for (int i = 2; i < x / 2; i++) 
				if (x % i != 0) primeTable[x] = true;
			return true;
	    }
	    else return primeTable[x];
	}
}
