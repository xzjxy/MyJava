package simulationAtm;

public class Account {
    // 卡号、姓名、密码、余额、取现额度
    private String cardId;
    private String userName;
    private String passWrd;
    private double money;//余额
    private double qutoMoney; //取现额度

    public Account() {
    }

    public Account(String cardId, String userName, String passWrd, double money, double qutoMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWrd = passWrd;
        this.money = money;
        this.qutoMoney = qutoMoney;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWrd() {
        return passWrd;
    }

    public void setPassWrd(String passWrd) {
        this.passWrd = passWrd;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQutoMoney() {
        return qutoMoney;
    }

    public void setQutoMoney(double qutoMoney) {
        this.qutoMoney = qutoMoney;
    }
}
