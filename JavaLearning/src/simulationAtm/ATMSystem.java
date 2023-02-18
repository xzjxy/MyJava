package simulationAtm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    // 1 注册、2 登录、3 查询、4 存款、5 取款、6 转账、7 修改密码、8 注销账户
    public static void main(String[] args) {
        ArrayList<Account> atm = new ArrayList<>();
        System.out.println("==================ATM======================");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Out:
        while (true) {
            System.out.println("请选择进行的操作：1 注册、2 登录、3 退出");
            String operNum = sc.next();
            switch (operNum) {
                case "1":
                    // 注册
                    regist(atm, sc);
                    break;
                case "2":
                    // 登录：1 存款/ 2 取款/ 3 修改密码/4转账/ 5退出登录/ 6注销账户
//                    displayInfo(atm, sc);
                    logIn(atm, sc);
                    break;
                case "3":
                    // 退出
                    break Out;
                default:
                    System.out.println("输入命令错误，请重新输入（1-3）：");
                    break;

            }
        }
        for (int i = 0; i < atm.size(); i++) {
            System.out.println(atm.get(i).getCardId() + "\t" + atm.get(i).getUserName() + "\t" + atm.get(i).getMoney());
        }

    }

    private static void logIn(ArrayList<Account> atm, Scanner sc) {
        System.out.println("请输开户账号：");
        String cardId = sc.next();
        System.out.println("请输登陆密码：");
        String pW = sc.next();
        boolean log = false;
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getCardId().equals(cardId) && atm.get(i).getPassWrd().equals(pW)) {
                log = true;
            }
        }
        System.out.println(log);
        if (log) {
            Out:
            while (true) {
                System.out.println("登录成功，请选择操作类型：1 存款、2 取款、 3 修改密码、4 转账、 5 退出登录、 6 注销账户");
                String operNum = sc.next();
                switch (operNum) {
                    // 登录：
                    case "1":
                        // 1 存款
                        deposit(atm, cardId, sc);
                        break;

                    case "2":
                        // 2 取款
                        withdraw(atm, cardId, sc);
                        break;

                    case "3":
                        // 3 修改密码
                        changePw(atm, cardId, sc);
                        break;

                    case "4":
                        // 4 转账
//                        deposit(atm, sc);
                        break;
                    case "5":
                        // 5 退出登录
                        break Out;

                    case "6":
                        // 6 注销账户
                        cancellation(atm, cardId, sc);
                        break;

                    default:
                        System.out.println("输入结果有误（1-6）：");
                        break;
                }
            }

        }

    }

    private static void cancellation(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入登陆密码来注销账户：");
        String oldPw = sc.next();
        int index = 0;
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getCardId().equals(cardId)) {
                index = i;
//                break;
            }
        }
        while (atm.get(index).getPassWrd().equals(oldPw)) {
            System.out.println("密码输入错误，请重新输入：");
            oldPw = sc.next();
        }
        atm.remove(index);
        System.out.println(atm.get(index).getUserName()+"先生/女士，您的账户已经注销成功！");
    }

    private static void changePw(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入旧密码：");
        String oldPw = sc.next();
        Out:
        while (true) {
            for (int i = 0; i < atm.size(); i++) {
                if (atm.get(i).getCardId().equals(cardId) && atm.get(i).getPassWrd().equals(oldPw)) {
                    System.out.println("请输入新密码：");
                    String newPw1 = sc.next();
                    System.out.println("请再次输入新密码：");
                    String newPw2 = sc.next();
                    while (!newPw1.equals(newPw2)) {
                        System.out.println("两次密码输入不一致，请重新输入！");
                        System.out.println("请输入新密码：");
                        newPw1 = sc.next();
                        System.out.println("请再次输入新密码：");
                        newPw2 = sc.next();
                        atm.get(i).setPassWrd(newPw2);
                    }
                    atm.get(i).setPassWrd(newPw2);
                    System.out.println("密码修改成功！");
                    break Out;
                } else {
                    System.out.println("输入密码错误，请重新输入！");
                    break;
//                    oldPw = sc.next();
                }
            }

        }
    }


    // 1 注册 用户输入用户名及密码 1 判断两次密码不同 2 随机生成 6位 Id String 3 账户信息存入ATM
    private static void regist(ArrayList<Account> atm, Scanner sc) {
        System.out.println("请输入用户名：");
        String useName = sc.next();
        System.out.println("请输入登录密码：");
        String pW = sc.next();
        System.out.println("请再次输入登录密码：");
        String pWAgain = sc.next();
        Random r = new Random();
        while (!pW.equals(pWAgain)) {
            System.out.println("两次密码输入不一致，请重新输入：");
            System.out.println("请输入登录密码：");
            pW = sc.next();
            System.out.println("请再次输入登录密码：");
            pWAgain = sc.next();
        }
        Account acc = new Account();
        acc.setUserName(useName);
        acc.setPassWrd(pW);
        acc.setCardId(generateID(atm, r));
//        if (atm.size() == 0) {
//            atm.add(acc);
//            System.out.println(acc.getCardId() + "\t" + acc.getUserName() + "\t" + acc.getMoney());
//        } else {
//            for (int i = 0; i < atm.size(); i++) {
//                if (atm.get(i) == null) {
//                    atm.add(acc);
//                    System.out.println(acc.getCardId() + "\t" + acc.getUserName() + "\t" + acc.getMoney());
//                }
//            }
//
//        }
        atm.add(acc);
        System.out.println(acc.getCardId() + "\t" + acc.getUserName() + "\t" + acc.getMoney());

    }

    // 2 查询 查询ATM中账户信息, 根据密码及账户输出信息

    private static void displayInfo(ArrayList<Account> atm, Scanner sc) {
        String cardID;
        String passWord;
        System.out.println("请输入您的账户号：");
        cardID = sc.next();
        System.out.println("请输入您的密码：");
        passWord = sc.next();
        boolean checkRes = false;
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getCardId().equals(cardID) && atm.get(i).getPassWrd().equals(passWord)) {
                System.out.println("账号" + "\t" + "用户名" + "\t" + "余额");
                System.out.println(atm.get(i).getCardId() + "\t" + atm.get(i).getUserName() + "\t" + atm.get(i).getMoney());
                checkRes = true;
            }
        }
        if (!checkRes) {
            System.out.println("输入的账户或者密码错误！");
        }
    }

    // 3 存款
    private static void deposit(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
//        boolean checkRes = false;
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getCardId().equals(cardId)) {
                double nowMoney = atm.get(i).getMoney();
                nowMoney += money;
                atm.get(i).setMoney(nowMoney);
                System.out.println("账号" + "\t" + "用户名" + "\t" + "余额");
                System.out.println(atm.get(i).getCardId() + "\t" + atm.get(i).getUserName() + "\t" + atm.get(i).getMoney());
//                checkRes = true;
            }
        }
//        if (!checkRes) {
//            System.out.println("输入的账户或者密码错误！");
//        }
    }

    //取款
    private static void withdraw(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入提款金额：");
        double money = sc.nextDouble();
//        boolean checkRes = false;
        for (int i = 0; i < atm.size(); i++) {
            if (atm.get(i).getCardId().equals(cardId)) {
                double nowMoney = atm.get(i).getMoney();
                if (nowMoney < money) {
                    System.out.println("余额不足！");
                } else {
                    nowMoney -= money;
                    atm.get(i).setMoney(nowMoney);
                }
                System.out.println("账号" + "\t" + "用户名" + "\t" + "余额");
                System.out.println(atm.get(i).getCardId() + "\t" + atm.get(i).getUserName() + "\t" + atm.get(i).getMoney());
//                checkRes = true;
            }
        }
//        if (!checkRes) {
//            System.out.println("输入的账户或者密码错误！");
//        }
    }

    // 生成随机账户id, 判断该Id是否存在
    private static String generateID(ArrayList<Account> atm, Random r) {
        String s = "0123456789";
        String cardId = "9527";
        do {
            cardId = "9527";
            for (int i = 0; i < 4; i++) {
                int num = r.nextInt(10);
                cardId += s.charAt(num);
            }
        } while (checkId(atm, cardId));
        return cardId;
    }

    // 由id判断对应账户是否存在，存在位true

    private static boolean checkId(ArrayList<Account> atm, String id) {
        boolean res = false;
        if (atm.size() != 0) {
            for (int i = 0; i < atm.size(); i++) {
                if (atm.get(i).getCardId().equals(id)) {
                    res = true;
                }
            }

        }
        return res;
    }
}
