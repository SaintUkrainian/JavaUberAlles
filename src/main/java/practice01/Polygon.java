package practice01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Polygon {
     private int numOfAngles;

     public abstract int calculatePerimetr();
}
