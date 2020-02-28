public class Factorial {

    int fact = 1;

    // factorial method
    void factorial(int num){
        int i;
        for (i=1;i<=num;i++){
            fact = fact*i;
        }
        // Printing factorial
        System.out.print(fact);
    }

    public static void main(String[] args){
        Factorial obj = new Factorial();
        obj.factorial(4);

    }
}
