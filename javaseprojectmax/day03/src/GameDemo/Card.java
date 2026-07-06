package GameDemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String color;
    private String size;
    private int sizeNum;

    public String toString() {
        if (size.isEmpty()) {
            return "[" + color + "]";
        }
        return "[" + color + size + "]";
    }

}
