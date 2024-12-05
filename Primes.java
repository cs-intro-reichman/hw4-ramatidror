public class Primes {
    public static void main(String[] args) {
int givvenNumber = Integer.parseInt(args [0]);
        System.out.println ("Prime numbers up to " + givvenNumber + ":");

boolean [] isPrime = new boolean [givvenNumber + 1];

    for (int i = 0; i <= givvenNumber; i++) {
        isPrime [i] = true;
        }

        isPrime [0] = false;
        isPrime [1] = false;

        for (int p = 2; p*p <= givvenNumber; p ++) {

            if (isPrime[p]) {

                for (int i = p * p; i <= givvenNumber; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i <= givvenNumber; i ++) {
            if (isPrime[i]) {
                counter++;
            }
        }


        for (int i = 0; i <= givvenNumber; i ++) {
            if (isPrime[i]) {
                System.out.println (i);
            }
        }
        int percent = (counter * 100) / givvenNumber;
        System.out.println("There are " + counter + " primes between 2 and " + givvenNumber + " (" + percent + "% are primes)");

    }
}
