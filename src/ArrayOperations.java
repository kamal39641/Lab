public class ArrayOperations {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 17;
        a[9] = 29;
        for (int i = 1; i < 9; i++) {
            a[i] = -1;
        }
        for(int i=0; i<10; i++){
            a[i]+=1;
        }
        for(int i=0; i<10; i++){
            System.out.println(a[i]);
        }
        for(int i=0; i<10; i++){
            System.out.println(a[i]);
            if(i<9){
                System.out.println(",");
            }
        }
    }
}
