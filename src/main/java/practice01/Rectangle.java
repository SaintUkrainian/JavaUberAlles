package practice01;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
public class Rectangle extends Polygon {
    private static final int NUMBER_OF_ANGLES = 4;

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        super(NUMBER_OF_ANGLES);
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculatePerimetr() {
        return (a + b) * 2;
    }
}
