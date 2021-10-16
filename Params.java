public class Params {

    public static void main(String[] args){
        saySomething("yo mom");
        saySomething("is");
        saySomething("fat"); 

        printInfo("your mom", 69);

        System.out.println(add(4, 20));

        int result1 = add(6, 9);
        System.out.println(result1);
    }

    public static void saySomething(String s) {
        System.out.println(s);
    }

    public static void printInfo(String name, int age){
        System.out.println(name + " is " + age + " years old.");
    }

    public static int add(int x, int y){
        return x + y;
    }
    
}
