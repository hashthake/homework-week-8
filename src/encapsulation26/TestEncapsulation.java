package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Hardik");
        obj.setAge(40);
        obj.setRollNo(16);
        System.out.println("My name is : "+obj.getName());
        System.out.println("My Age is : "+obj.getAge());
        System.out.println("My Roll number is : "+obj.getRollNo());
    }

}
