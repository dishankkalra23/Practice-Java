public class Constructor {
    int num;
    String var;

    // Constructor name must be the same as its class name
    Constructor(int no, String variable){
        num = no;
        var = variable;

        System.out.println(var + ": " + num);
    }

    public static void main(String[] args){
        Constructor obj = new Constructor(5,"Value");
        Constructor obj1 = new Constructor(60,"Value1");
    }
}