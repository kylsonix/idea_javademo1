package Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：加油站支付小程序
        //1、创建卡片类，以便创建金卡或者银卡对象，封装车主信息
        //2、定义一个卡片父类Card
        //3、定义一个金卡类，继承卡片类
        //4、办一张金卡：创建一个金卡对象，交给一个独立业务（支付机）：存款，消费
        GoldCard goldCard = new GoldCard("京A88888","张三","13888888888",5000);
        pay(goldCard);
        //5、办一张银卡：创建一个银卡对象，交给一个独立业务（支付机）：存款，消费
        SilverCard silverCard = new SilverCard("京A666666","李四","13888666888",8000);
        pay(silverCard);

    }

    //支付机
    public static void pay(Card card){
        System.out.println("欢迎使用");
        System.out.println("请输入金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.pay(money);
    }
}
