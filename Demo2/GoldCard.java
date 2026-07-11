package Demo2;

import javax.swing.text.DefaultStyledDocument;

//金卡类，8折
public class GoldCard extends  Card{
    public GoldCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void pay(double money) {
        System.out.println("您当前消费的金额："+money);
        System.out.println("使用金卡");
        System.out.println("折后金额："+money*0.8);
        System.out.println("余额："+getMoney());
        if (money*0.8 <= getMoney()){
            System.out.println("支付成功！");
            setMoney(getMoney()- money*0.8);
            System.out.println("消费后余额："+getMoney());
        }
        else if (money*0.8 > getMoney()){
            System.out.println("支付失败！");
            return;
        }


        //判断消费金额是否大于200，调用一个独有功能，打印洗车票
        if (money*0.8 > 200) {
            printTicket();
        }
    }

    //打印洗车票
    public void printTicket(){
        System.out.println("洗车票");
    }
}
