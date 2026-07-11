package Demo2;

public class SilverCard extends  Card{
    public SilverCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void pay(double money) {
        System.out.println("您当前消费的金额："+money);
        System.out.println("使用银卡");
        System.out.println("折后金额："+money*0.9);
        System.out.println("余额："+getMoney());
        if (money*0.9 <= getMoney()){
            System.out.println("支付成功！");
            System.out.println("消费后余额："+getMoney());
            setMoney(getMoney()- money*0.9);
        }
        else if (money*0.9 > getMoney()){
            System.out.println("支付失败！");
        }
    }
}
