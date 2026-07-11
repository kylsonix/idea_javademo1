package Demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok技术可以实现为类添加getter和setter方法，无参构造器，toString方法等
@Data//@Data注解会为类添加getter和setter方法，无参构造器，toString方法等
@NoArgsConstructor//无参构造器
@AllArgsConstructor//有参构造器
public class Card {
    private String carId ;//车牌号码
    private String name;
    private String phone;
    private double money;//账户余额

    //充值
    public void recharge(double money){
        this.money += money;
    }

    //消费
    public void pay(double money){
        this.money -= money;
    }
}
