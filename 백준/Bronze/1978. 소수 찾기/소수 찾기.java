import java.io.IOException;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int chkVal = 0;
        for(int i=0;i<a;i++){
            int count = 0;
            int num = Integer.parseInt(s[i]);
            if(num>=2){
                for(int j=2;j*j<=num;j++){
                    if(num%j==0){count++;}
                }

                if(count==0){chkVal++;}
            }
        }
        System.out.println(chkVal);
    }
}