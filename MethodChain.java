class Student {

    String name;
    int grade;

    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}

public class MethodChain {
    public static void main(String[] args){

        
        Student s = new Student();
        s.setName("meg").setGrade(96);

        System.out.println(s.name);
        System.out.println(s.grade);
        


    }
    
}
