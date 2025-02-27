import java.io.IOException;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x<xMin) xMin = x;
            if(x>xMax) xMax = x;
            if(y<yMin) yMin = y;
            if(y>yMax) yMax = y;
        }
        System.out.println(Math.abs(xMax-xMin)*Math.abs(yMax-yMin));
        
    }
}