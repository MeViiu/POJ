
public class Main {
    public static void main(String[] args) {
        int result = compare(10, 5);
        System.out.println(result);
    }
    public static int compare(int a, int b) {
        if(a > b){
            return -1;
        } else if (a == b) {
            return 0;
        }else{
            return 1;
        }
    }
}