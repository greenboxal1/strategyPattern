package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.Floating;

public class VolleyballBall extends Ball {
    public VolleyballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        floatBehavior = new Floating();
        type = "Volley ball";
    }
}
