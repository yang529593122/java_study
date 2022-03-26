package classrelationships;

public class Test {
    public static void main(String[] args) {
        MachineRoom machineRoom = new MachineRoom();
        Student student1 = new Student("杨鹏飞");
        Student student2 = new Student("艳龙");
        Student student3 = new Student("李龙飞");
        Student student4 = new Student("宝宝");
        Student student5 = new Student("李四");
        Student student6 = new Student("你才");
        machineRoom.welcomeStudent(student1);
        machineRoom.welcomeStudent(student2);
        machineRoom.welcomeStudent(student3);
        machineRoom.welcomeStudent(student4);
        machineRoom.welcomeStudent(student5);
        machineRoom.welcomeStudent(student6);
    }
}
