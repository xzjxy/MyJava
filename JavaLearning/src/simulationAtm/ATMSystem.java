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

//        for (int i = 0; i < atm.size(); i++) {
//            System.out.println(atm.get(i).getCardId() + "\t" + atm.get(i).getUserName() + "\t" + atm.get(i).getMoney());
//        }

    }


    // 1 注册
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
        atm.add(acc);
        System.out.println(acc.getCardId() + "\t" + acc.getUserName() + "\t" + acc.getMoney());

    }
    // 2 登录：
    private static void logIn(ArrayList<Account> atm, Scanner sc) {
        System.out.println("请输开户账号：");
        String cardId = sc.next();
        boolean logStatus = false;
        int index = checkIdIndex(atm, cardId);
        String pW;
        if (index != -1) {
            System.out.println("请输入登录密码！");
            pW = sc.next();

//            while (!atm.get(index).getPassWrd().equals(pW)) {
//                System.out.println("登录密码错误，请重新输入，返回登录界面请输入-1。");
//                pW = sc.next();
//                if (pW.equals("-1")) {
//                    break;
//                }
//            }

            // 推荐使用while(true),解决死循环跳出问题
            while (true) {
                if (atm.get(index).getPassWrd().equals(pW)) {
                    logStatus = true;
                    break;
                } else {
                    System.out.println("登录密码错误，请重新输入，返回登录界面请输入-1。");
                    pW = sc.next();
                    if (pW.equals("-1")) {
                        break;
                    }
                }
            }

        } else {
            System.out.println("输入账号不存在！");
        }
//        logStatus = true;
        Out:
        while (true) {
            System.out.println("登录成功，请选择操作类型：1 存款、2 取款、 3 修改密码、4 转账、 5 退出登录、 6 注销账户、7 信息展示");
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
                    transferMoney(atm, cardId, sc);
                    break;
                case "5":
                    // 5 退出登录
                    break Out;

                case "6":
                    // 6 注销账户
                    cancellation(atm, cardId, sc);
                    break;
                case "7":
                    // 7 账户信息展示
                    displayInfo(atm);
                    break;

                default:
                    System.out.println("输入结果有误（1-6）：");
                    break;
            }
        }
    }


    // 2.1 存款
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

    // 2.2 取款
    private static void withdraw(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入提款金额：");
        double money = sc.nextDouble();
        int index = checkIdIndex(atm, cardId);
        double nowMoney = atm.get(index).getMoney();
        System.out.println("请输入登录密码执行取款操作,退出请输入-1：");
        String pW = sc.next();

        while (true) {
            if (atm.get(index).getPassWrd().equals(pW)) {
                if (money <= atm.get(index).getMoney()) {
                    nowMoney -= money;
                    atm.get(index).setMoney(nowMoney);
                    System.out.println("取款成功，当前账户状态：");
                    System.out.println(atm.get(index).getCardId() + "\t" + atm.get(index).getUserName() + "\t" + atm.get(index).getMoney());
                    break;
                } else {
                    System.out.println("余额不足，请重新输入取款金额：");
                    money = sc.nextDouble();
                }
            } else if (atm.get(index).getPassWrd().equals("-1")) {
                break;
            } else {
                System.out.println("密码错误，请重新输入，退出请输入-1：");
                pW = sc.next();
                if (pW.equals("-1")) {
                    break;
                }
            }

        }
    }
    // 2.3 修改密码
    private static void changePw(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入旧密码：");
        String oldPw = sc.next();
        int index = checkIdIndex(atm, cardId);
        if (atm.get(index).getPassWrd().equals(oldPw)) {

            while (true) {
                System.out.println("请输入新密码，返回请输入-1：");
                String newPw1 = sc.next();
                if (newPw1.equals("-1")) {
                    break;
                }
                System.out.println("再次请输入新密码：");
                String newPw2 = sc.next();
                if (newPw1.equals(newPw2)) {
                    atm.get(index).setPassWrd(newPw2);
                    System.out.println("密码修改成功,新密码为：" + atm.get(index).getPassWrd());
                    break;
                } else {
                    System.out.println("两次密码输入不一致，请重新输入，返回请输入-1");
                }

            }


        } else {
            System.out.println("密码输入错误！");
        }

//        Out:
//        while (true) {
//            for (int i = 0; i < atm.size(); i++) {
//                if (atm.get(i).getCardId().equals(cardId) && atm.get(i).getPassWrd().equals(oldPw)) {
//                    System.out.println("请输入新密码：");
//                    String newPw1 = sc.next();
//                    System.out.println("请再次输入新密码：");
//                    String newPw2 = sc.next();
//                    while (!newPw1.equals(newPw2)) {
//                        System.out.println("两次密码输入不一致，请重新输入！");
//                        System.out.println("请输入新密码：");
//                        newPw1 = sc.next();
//                        System.out.println("请再次输入新密码：");
//                        newPw2 = sc.next();
//                        atm.get(i).setPassWrd(newPw2);
//                    }
//                    atm.get(i).setPassWrd(newPw2);
//                    System.out.println("密码修改成功！");
//                    break Out;
//                } else {
//                    System.out.println("输入密码错误，请重新输入！");
//                    break;
////                    oldPw = sc.next();
//                }
//            }
//
//
//        }
    }

    // 2.4 转账
    private static void transferMoney(ArrayList<Account> atm, String cardId, Scanner sc) {
        int indexFrom = checkIdIndex(atm, cardId);
        if (atm.size() < 2) {
            System.out.println("系统中账户不足，请继续注册！");
        } else {
            while (true) {
                System.out.println("请重新输入收款方账户，取消转账输入-1：");
                String toCardId = sc.next();
                int indexTo = checkIdIndex(atm, toCardId);
                if (toCardId.equals("-1")) {
//                    System.out.println("该账户不存在，请重新输入：");
                    break;
                } else if (indexTo != -1) {
                    System.out.println("请输入转账金额：");
                    double money = sc.nextDouble();
                    System.out.println("请输入登录密码：");
                    String pW = sc.next();
                    while (true) {
                        if (atm.get(indexFrom).getPassWrd().equals(pW)) {
                            if(money <= atm.get(indexFrom).getMoney()){
                                atm.get(indexFrom).setMoney(atm.get(indexFrom).getMoney() - money);
                                atm.get(indexTo).setMoney(atm.get(indexTo).getMoney() + money);
                                System.out.println("转账成功！");
                                break;
                            }else{
                                System.out.println("您的账户没有那么多钱，请重新输入转账金额：");
                                money = sc.nextDouble();
                            }
                        } else {
                            System.out.println("密码输入错误，请重新输入：");
                            pW = sc.next();
                        }
                    }
                    break;
                } else {
                    System.out.println("输入账户不存在，请重新输入，取消转账输入-1：");
                }
            }
        }

    }

    // 2.6 账户注销
    private static void cancellation(ArrayList<Account> atm, String cardId, Scanner sc) {
        System.out.println("请输入登陆密码来注销账户：");
        String oldPw = sc.next();
        int index = checkIdIndex(atm, cardId);
        while (!atm.get(index).getPassWrd().equals(oldPw)) {
            System.out.println("密码输入错误，请重新输入：");
            oldPw = sc.next();
        }
        System.out.println(atm.get(index).getUserName() + "先生/女士，您的账户已经注销成功！");
        atm.remove(index);
    }

    // 2.7 查询 查询ATM中账户信息, 根据密码及账户输出信息
    private static void displayInfo(ArrayList<Account> atm) {
        for (int i = 0; i < atm.size(); i++) {
            System.out.println("账号" + "\t" + "用户名" + "\t" + "余额");
            System.out.println(atm.get(i).getCardId() + "\t" + atm.get(i).getUserName() + "\t" + atm.get(i).getMoney());
        }
    }


    // 生成随机账户id, 判断该Id是否存在
    private static String generateID(ArrayList<Account> atm, Random r) {
        String s = "0123456789";
        String cardId;
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
                if (id.equals(atm.get(i).getCardId())) {
                    res = true;
                    break;
                }
            }

        }
        return res;
    }

    // 由账户号返回atm中的index
    private static int checkIdIndex(ArrayList<Account> atm, String id) {
        int index = -1;
        if (atm.size() != 0) {
            for (int i = 0; i < atm.size(); i++) {
                if (atm.get(i).getCardId().equals(id)) {
                    index = i;
                }
            }

        }
        return index;
    }
}