import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws IOException {
        StringBuilder y = new StringBuilder("for:   ");
        StringBuilder z = new StringBuilder("while: ");
        StringBuilder y1 = new StringBuilder("enhancedFor:   ");
        final String x = "0".repeat(200000);
        final String[] x1=new String[1];
        x1[0]=x;

        StringBuilder l = new StringBuilder();

        final long q = System.nanoTime();//start time of entire calculation program

        double g;
        for (g = 0; g < 1000000; g++) l.append(g * (.00001 / 8));//to "warm up" the JVM
        for (g = 0; g < 5000; g++) {
            final long a = System.nanoTime();
            for (double i = 0; i < x.length(); i++) {
                if(i%121==0&&x.charAt((int) i)=='0')System.out.print("");//so it doesn't flood the console
            }
            final long b = System.nanoTime();
            y.append((b - a)/1000).append(" us, ");
        }

            System.out.println();//seperate between loop results
        for (g = 0; g < 5000; g++) {
            final char[] len=x.toCharArray();
            final long j = System.nanoTime();
            for (char c:len) {
                if(c%121==0&&x.charAt((int) c)=='0')System.out.print("");

            }
            final long k = System.nanoTime();
            y1.append((k - j)/1000).append(" us, ");
        }
        System.out.println();
        for (g = 0; g < 5000; g++) {
            double e = 0;
            final long d = System.nanoTime();
            while (e < x.length()) {
                if(Double.parseDouble(String.valueOf(e))%121==0&&(Double.parseDouble(String.valueOf(e))/1000000)>1)System.out.print(Double.parseDouble(String.valueOf(e))/1000000);else;
                e++;
            }
            final long f = System.nanoTime();
            z.append((f - d)/1000).append(" us, ");
        }

        final long v = System.nanoTime();//end time of entire calculation program
        System.out.println();
        System.out.println(y.toString());
        System.out.println(y1.toString());
        System.out.println(z.toString());
        System.out.println((v - q) / (1000*1000*1000)+" s");
    }
}
