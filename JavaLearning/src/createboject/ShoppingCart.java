package createboject;

import java.util.Scanner;

public class ShoppingCart {
    // 模拟购物车模块功能， 实现添加商品到购物车，同时修改商品的购物数量，结算商品价格
    // 每个商品是一个对象，需要定义一个商品类
    // 购物车本身是一个对象，使用数组对象表示
    // 完成界面架构，让用户选择操作功能
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        Goods good1 = new Goods();
        good1.id = 0;
        good1.name = "AppleWtch";
        good1.price = 3999.0;
        good1.buyNumber = 2;
        shopCar[0] = good1;
        while (true) {
            System.out.println("请您选择以下操作操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车商品：query");
//            System.out.println("修改商品购买数量：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购物车总金额：pay");
            System.out.println("请输入操作：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("无此功能！");
            }
        }

    }

    // 购物车结算
    private static void payGoods(Goods[] shopCar) {
        double sum = 0.0;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                sum += shopCar[i].price * shopCar[i].buyNumber;
            } else {
                break;
            }
        }
        System.out.println("您一共消费" + sum + "元。");
    }


    //修改购物车商品
    private static void updateGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请输入待修改商品编号：");
        int index = sc.nextInt();
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i].id == index) {
                System.out.println("请输入最新购买数量");
                int num = sc.nextInt();
                if (num == 0) {
                    shopCar[i] = null;
                } else {
                    shopCar[i].buyNumber = num;
                    queryGoods(shopCar);
                }
            }else{
                System.out.println("没有购买该商品！");
            }
            break;
        }
    }

    // 购物车内容查询
    private static void queryGoods(Goods[] shopCar) {
        System.out.println("--------您的购物车商品如下-----------");
        System.out.println("编号\t\t名称\t\t\t单价\t\t\t数量");
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                System.out.println(shopCar[i].id + "\t\t" + shopCar[i].name + "\t\t\t" + shopCar[i].price + "\t\t\t" + shopCar[i].buyNumber);
            } else {
                break;
            }
        }
    }


    // 添加商品到购物车
    private static void addGoods(Goods[] shopCar, Scanner sc) {
        Goods good = new Goods();
        System.out.println("请输入商品编号：");
        good.id = sc.nextInt();
        System.out.println("请输入商品名称：");
        good.name = sc.next();
        System.out.println("请输入商品单价：");
        good.price = sc.nextDouble();
        System.out.println("请输入购买数量：");
        good.buyNumber = sc.nextInt();

        for (int i = 0; i < shopCar.length; i++)
            if (shopCar[i] == null) {
                shopCar[i] = good;
                break;
            }
        System.out.println("您的商品" + good.name + "已经添加到购物车");
    }

}
