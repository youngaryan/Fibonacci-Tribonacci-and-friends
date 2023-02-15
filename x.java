/**
 * x
 */
public class x {
    public static void main(String[] args) {
    }


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