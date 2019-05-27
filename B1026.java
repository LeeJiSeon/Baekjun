import java.util.*;

public class B1026 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0 ; i < N ; i++)
            A[i] = sc.nextInt();
        for(int i = 0 ; i < N ; i++)
            B[i] = sc.nextInt();

        HashMap<Integer, Integer> Bindex = new HashMap<>();
        for(int i = 0 ; i < B.length ; i++)
            Bindex.put(B[i], i);

        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < N ; i++)
            list.add(B[i]);
        Collections.sort(list);
        Collections.reverse(list);

//        for(int i = 0 ; i < N ; i++)
//            System.out.println(list.get(i));
        int[] result = new int[N];
        int sum = 0;

//        for(int i = 0 ; i < N ; i++)
//            System.out.println(B[i]);

        for(int i = 0 ; i < A.length ; i++){
            result[Bindex.get(list.get(i))] = A[i];
        }

        for(int i = 0 ; i < N ; i++){
            sum += result[i] * B[i];
        }

        System.out.println(sum);

    }
}
