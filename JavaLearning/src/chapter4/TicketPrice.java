package chapter4;

public class TicketPrice {
    // 机票价格计算 旺季（5-10月）头等舱9折 经济仓 8.5折 / （11-4月）淡季 头等舱 7折，经济仓6.5折
    public static void main(String[] args) {
        System.out.println(price(1000.0,8,"头等舱"));
        System.out.println(price(1000.0,1,"头等舱"));
        System.out.println(price(1000.0,9,"经济舱"));
        System.out.println(price(1000.0,12,"经济舱"));
        System.out.println(price(1000.0,18,"经济舱"));
        System.out.println(price(1000.0,12,"VIP"));
    }

    // type: 头等舱  经济舱
    public static double price(double org, int month, String type ){
        double res = 0.0;
        if (month < 1 || month > 12){
            System.out.println("输入月份有误");
            return -1;
        }else if (month >= 5 && month <= 10) {
            switch (type){
                case "头等舱":
                    res = 0.9 * org;
                    break;
                case "经济舱":
                    res = 0.85 * org;
                    break;
                default:
                    System.out.println("输入舱位类型有误");
                    return -1;
            }
        }else{
            switch (type){
                case "头等舱":
                    res = 0.7 * org;
                    break;
                case "经济舱":
                    res = 0.65 * org;
                    break;
                default:
                    System.out.println("输入舱位类型有误");
                    return -1;
            }
        }
        return res;
    }
}
