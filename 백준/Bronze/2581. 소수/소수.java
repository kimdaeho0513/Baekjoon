import java.io.IOException;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        for(int i=a;i<=b;i++){
            if(i>=2){
                boolean chk = isPrime(i);
                if(chk){
                    sum+=i;
                    if(min==0){
                        min = i;
                    }
                }
            }
        }
        if(min==0){
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    private static boolean isPrime(int x){
        for(int y=2;y*y<=x;y++){
            if(x%y==0){
                return false;
            }
        }
        return true;
    }
}