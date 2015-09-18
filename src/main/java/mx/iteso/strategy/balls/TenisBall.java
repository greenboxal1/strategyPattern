package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.Floating;

public class TenisBall extends Ball {
    public TenisBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        floatBehavior = new Floating();
        type = "Tenis ball";
    }
}
