import java.io.IOException;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        if(a[0].equals(b[0])){
            sb.append(c[0]+" ");
        } else {
            if(a[0].equals(c[0])){
                sb.append(b[0]+" ");
            } else {
                sb.append(a[0]+" ");
            }
        }
        if(a[1].equals(b[1])){
            sb.append(c[1]);
        } else {
            if(a[1].equals(c[1])){
                sb.append(b[1]);
            } else {
                sb.append(a[1]);
            }
        }
        System.out.println(sb.toString());
    }
}