import java.util.Arrays;

public class jkbin {
    public static void main(String[] args) {
        final char[] x = ("0".repeat(199999)).concat("7").toCharArray();
        final char[] y = ("0".repeat(199999)).concat("8").toCharArray();
jkbin a=new jkbin();a.sameWhile(x,y);
    }

    StringBuilder y2 = new StringBuilder("For:   ");

    public boolean sameFor(char[] x, char[] y) {
        if (x.length == y.length) {
            long j = System.nanoTime();
            for (int i = 0; i < x.length; ++i) {
                if (x[i] != y[i]) {
                    long k = System.nanoTime();
                    y2.append((k - j) / 1000).append(" us, ");
                    return false;//not the same
                }
            }
            return true;
        } else {
            return false;

        }
    }
    public boolean sameWhile(char[] x, char[] y) {
            if (x.length == y.length) {
                long j = System.nanoTime();
                int i=0;
                while(i< x.length) {
                    if (x[i] != y[i]) {
                        long k = System.nanoTime();
                        y2.append((k - j) / 1000).append(" us, ");
                        return false;//not the same
                    }
                    i++;
                }
                return true;
            } else {
                return false;

            }
    }
    public boolean sameforEach(char[] x, char[] y) {
        if (x.length == y.length) {
            String x11=Arrays.toString(x);
            String y11=Arrays.toString(y);
            long j = System.nanoTime();
            for (char xi:x) {
//if(){}
                if (xi!= y11.charAt(y11.indexOf(xi))) {
                    long k = System.nanoTime();
                    y2.append((k - j) / 1000).append(" us, ");
                    return false;//not the same
                }
            }
            return true;
        } else {
            return false;

        }
    }
}
