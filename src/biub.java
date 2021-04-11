import java.io.IOException;
import java.util.Arrays;

public class biub {
    public static void main(String[] args) throws IOException {
        final String x = ("0".repeat(199998)).concat("72");
        final String[] x1=new String[1];
        x1[0]=x;
        System.out.println("n".equals("n"));
        StringBuilder y1 = new StringBuilder("enhancedFor1:   ");
        StringBuilder y2 = new StringBuilder("enhancedFor2:   ");
            final char[] len= x.toCharArray();
/*
        for (double g = 0; g < 5000; g++) {
            long j= System.nanoTime();
            for (char c : len) {
                if (x.charAt(x.indexOf(c)) == '2') {
                    System.out.print(".");
                }
            }
            long k= System.nanoTime();
            y1.append((k - j) / 1000).append(" us, ");
        }
*/
        for (double g = 0; g < 500; g++) {
            long j= System.nanoTime();
            for (String c : x1) {
                if ((x1[0].charAt(x1[0].lastIndexOf(c))) == '2') {
                    System.out.print(".");System.out.println(".");System.out.println(".");System.out.print(".");System.out.print(".");
                }

            }
            long k= System.nanoTime();
            y2.append((k - j) / 1000).append(" us, ");
        }
        System.out.println();
        System.out.println(y1.toString());
//        System.out.println(y2.toString());
//        System.out.println(Arrays.toString(x1));
//        System.out.println(x1[0]);
    }
}
