package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.Floating;

public class BillarBall extends Ball {
    public BillarBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        floatBehavior = new Floating();
        type = "Billar ball";
    }
}
