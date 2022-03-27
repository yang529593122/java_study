package classrelationships;

public class MachineRoom {

    public Computer[] computers = new Computer[5];


    {
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i + 1);
        }
    }

    public void welcomeStudent(Student student) {
        String studentName = student.getName();
        System.out.println("欢迎" + studentName + "学生进入机房");
        for (int i = 0; i < computers.length; i++) {
            boolean computerStatus = computers[i].getStatus();
            if (!computerStatus) {
                student.useComouter(computers[i]);
                break;
            }
        }
    }
}
