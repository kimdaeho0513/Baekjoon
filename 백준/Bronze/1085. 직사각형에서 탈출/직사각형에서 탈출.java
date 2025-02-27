import java.io.IOException;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            numbers[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        System.out.println(Math.min(Math.min(numbers[0], numbers[2]-numbers[0]),Math.min(numbers[1], numbers[3]-numbers[1])));
    }
}
