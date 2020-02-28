public class Factorial1{
    int fact = 1;

    void factorial(int num){
        int i;
        for (i=1;i<=num;i++){
            fact = fact*i;

        }
        System.out.print("Factorial of " + num +": " + fact);

    }

    public static void main(String[] args){
        // Using Anonymous(nameless) object
        new Factorial1().factorial(4);

        // Anonymous object can be use only once
    }
}
