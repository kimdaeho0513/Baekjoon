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
        int minX;
        int minY;
        if(numbers[0]<numbers[2]-numbers[0]){
            minX = numbers[0];
        } else {
            minX = numbers[2]-numbers[0];
        }
        if(numbers[1]<numbers[3]-numbers[1]){
            minY = numbers[1];
        } else {
            minY = numbers[3]-numbers[1];
        }
        if(minX>minY){
            System.out.println(minY);
        } else {
            System.out.println(minX);
        }
    }
}