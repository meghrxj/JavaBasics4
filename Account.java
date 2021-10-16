public class Account {

    String name;
    int age;

    public static void main(String[] args){

        Account a = new Account();

        a.setName("Meghraj");
        a.setAge(18);
        a.printDetails();

        System.out.println(a.getName());
        System.out.println(a.getAge());

//setters (set value to variables)
    }
    public void setName(String name) {
        this.name = name; 
    }

    public void setAge(int age){
        this.age = age;
    }

//getters (get value to variables)
    public String getName() {
        return this.name;

    }

    public Integer getAge() {
        return this.age;
    }


    public void printDetails() {
        System.out.println(name + ", " + age);
    }
    
}
