import java.util.*;

public class B10815 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrN = new int[N];
        for(int i = 0 ; i < N ; i++)
            arrN[i] = sc.nextInt();

        int M =  sc.nextInt();
        int[] arrM = new int[M];
        for(int i = 0 ; i < M ; i++)
            arrM[i] = sc.nextInt();

        Arrays.sort(arrN);

        int low = 0;
        int high = M - 1;
        int mid = (low + high) / 2;
        
        System.out.println(arrN[0]);
    }
}
