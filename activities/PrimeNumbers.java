public class PrimeNumbers {

    private static boolean isPrime(int input) {
	int counter = 2;
	if(input < counter) {
	    return false;
	}
	while(counter < input) {
	    if(input % counter == 0) {
		return false;
	    }
	    counter++;
	}
	return true;
    }

    private static void printPrime(int input) {
	int counter = 2;
	while(counter <= input) {
	    if(isPrime(counter)) {
		System.out.println(counter);
	    }
	    counter++;
	}
    }

    public static void main(String[] args) {
	System.out.println(isPrime(2));
	System.out.println(isPrime(1));
	System.out.println(isPrime(49));
	System.out.println(isPrime(47));

	printPrime(1);
	printPrime(2);
	printPrime(10);
	printPrime(11);
    }

}
