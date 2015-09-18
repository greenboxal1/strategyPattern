package mx.iteso.strategy.Candies;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.Floating;

public class LifesaversCandies extends Ball{
    public LifesaversCandies() {
        floatBehavior = new Floating();
        deflateBehavior = new NotDeflatable();
        type = "Lifesavers Candies";
    }
}
