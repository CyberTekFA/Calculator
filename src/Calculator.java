public class Calculator {

    public static void main(String[] args) {
        for (int i = 1; i <11 ; i++) {
            System.out.printf("%d x %d = %d ",5,i,i*5).println();
        }
        addition(22,44);

    }
    public static void addition(int num1 , int num2){
        System.out.println(num1 + num2);
    }
    public static void minis(int num1,int num2){
        System.out.println(num1 - num2);
    }
    public static void multi(int num1, int num2){
        int result = num1 *num2;
        System.out.println(result);
    }
}
