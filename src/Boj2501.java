import java.util.Scanner;

public class Boj2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 약수
        int cnt = 0;
        for(int i = 1; i <= N; i++){
            if(N%i == 0){
                cnt += 1;
                if (cnt == K){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);

    }
}
