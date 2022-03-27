package stringdome;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {


        String userName = "yang";
        String passworld = "123";

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = scanner.nextLine();
            System.out.println("请输入密码");
            String pwd = scanner.nextLine();

            if(name.equals(userName) && pwd.equals(passworld)){
                System.out.println("登录成功");
            }else{
                if(2-i == 0 ){
                    System.out.println("你的账户被锁，请与管理员联系！");

                }else{
                    System.out.println("登录失败，你还有"+(2-i)+"机会");

                }
            }

        }

    }
}
