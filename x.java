/**
 * x
 */
public class x {
    public static void main(String[] args) {
    }

    //https://www.codewars.com/kata/556e0fccc392c527f20000c5/train/java

    public double[] xbonacci(double[] signature, int n) {
    double[] result = new double[n];
    int length = signature.length;
    for (int i = 0; i < length; i++) {
        result[i] = signature[i];
    }
    for (int i = length; i < n; i++) {
        for (int j = i - length; j < i; j++) {
            result[i] += result[j];
        }
    }
    return result;
}
}