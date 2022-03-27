package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true){
            System.out.println("========欢迎来到学生系统========");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出系统");
            System.out.println("请输入选择");

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line){
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    delStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    findStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }

    }

    // 添加学生
    public static void addStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生编号:");
        String sid = scanner.nextLine();
        System.out.println("请输入学生姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄:");
        String age = scanner.nextLine();
        System.out.println("请输入学生居住地址:");
        String address = scanner.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(Integer.parseInt(age));
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功");
    }
    // 查看学生
    public static void findStudent(ArrayList<Student> array) {
        if(array.size() == 0){
            System.out.println("没有数据,请先添加信息在查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t" +s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }
    // 删除学生
    public static void delStudent(ArrayList<Student> array) {
        if(array.size() == 0){
            System.out.println("没有数据,请先添加信息再删除");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生编号:");
        String sid = scanner.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                array.remove(i);
                break;
            }
        }
        System.out.println("删除成功");
    }
}
