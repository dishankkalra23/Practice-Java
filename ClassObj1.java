class ClassObj1{
    String str = "Hi";

    public static void main(String[] args) {
        // Initialise object for that class
        // from which you want to access its variable or method

        // Accessing 'var' variable present in 'classobj2'
        Classobj2 object = new Classobj2();
        System.out.println("Variable var from outer class 'ClassObj2': "+ object.var);

        // Accessing string 'str' present in 'Classobj1'
        ClassObj1 obj = new ClassObj1();
        System.out.println("String str from ClassObj1: " + obj.str);

    }
}

class Classobj2{
    // A class is not able to access fields of another class if
    // fields are present inside main method

    // Wrong: public static void main(String[] args) {
        int var = 500;
    }