import java.util.Arrays;

public class ob {
    public static void main(String[] args) {
        final char[] x = ("0".repeat(200000)).concat("124200000000").toCharArray();
        final char[] yz = ("0".repeat(200000)).concat("124200000000").toCharArray();
        Yes:
        for(char y:x){
            if(y=='1'){
                System.out.println("yes");
                System.out.println(y);
                System.out.println(y);
                System.out.println(Arrays.toString(x).indexOf(y));
                break;
            }
        }
    }
}
