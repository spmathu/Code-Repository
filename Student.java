public class Student {

    private String name;
    private int registerNo;

    private String getName() {
        return name;
    }

    private int getRegisterNo() {
        return registerNo;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Deva");
        student1.setRegisterNo(123);

        student2.setName("Madhu");
        student2.setRegisterNo(124);

        System.out.println(student1.getName() + " " + student1.getRegisterNo());
        System.out.println(student2.getName() + " " + student2.getRegisterNo());
    }
}

