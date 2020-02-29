public class ConstructorOver {
    int num;
    int num1;
    String var;

    ConstructorOver(int no,String variable){
        num = no;
        var = variable;
    }
    // Constructor Overloading
    ConstructorOver(int no,String variable,int no1){
        num = no;
        var = variable;
        num1 = no1;
    }

    ConstructorOver(int no,int no1){
        num = no;
        num1 = no1;
    }

    // Method
    void display(){
        System.out.println(var + ": " + num + " and " + num1);
    }

    public static void main(String[] args) {
        ConstructorOver obj = new ConstructorOver(5,"Value");
        ConstructorOver obj1 = new ConstructorOver(5,"Values",10);
        ConstructorOver obj2 = new ConstructorOver(5,10);

        // if any integer value is not present then it will be "0"
        obj.display();

        obj1.display();

        // if any string is not present then it will show "null"
        obj2.display();
    }
}
