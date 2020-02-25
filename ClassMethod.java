class Class2{
    int var;
    String str;

    // Method 1: insertValues
    void insertValues(int v,String s){
        var = v;
        str = s;
    }

    // Method 2: displayValue
    void displayValue(){
        System.out.println(var);
        System.out.println(str);
    }
}

class ClassMethod {
    public static void main(String[] args) {
        Class2 object1 = new Class2();
        Class2 object2 = new Class2();

        object1.insertValues(100,"Programming in Java");
        // object.insertValues(500,"Java is OOP Language");
        object1.displayValue();
        // To display another value
        // We have to define another object so that second value doesn't overlap the first value

        System.out.println();
        object2.insertValues(200,"Java is an OOP language ");
        object2.displayValue();
    }
}