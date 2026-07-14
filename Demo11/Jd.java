package Demo11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//家电
public class Jd implements Switch {
    private String name;
    private boolean isOn;//false

    @Override
    public void press() {
        isOn = !isOn;
        if (isOn)
            System.out.println(name + "开机");
        else
            System.out.println(name + "关机");
    }
}
