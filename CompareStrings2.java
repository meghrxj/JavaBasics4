public class CompareStrings2 {
    public static void main(String[] args){

        String a = new String("dog");
        String b = new String("dog");

        if(a.equals(b)) {
            System.out.println("true because a and b are different object but .equals check if they have same string content but 'a == b' checks if the objects are same however when you create new object it is unique so it returns false because 'a' is different object");

        } else {
            System.out.println("false");
        }

        if(a.equals("dog")){
            System.out.println("true");
        }
        
    }
    
}
