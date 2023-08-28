
public class Main {
    public static void main(String[] args) {
        int[] array = {1, -2, 7, 5, 23, 14};
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
//        доп
        System.out.println(max);
        int n = 10;
        while (n > 0){
            n /= 2;
            System.out.println(n);
        }

    }
}
// Сложность Алгоритма - O(n)
