package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FloatingBehavior;
import mx.iteso.strategy.behaviors.impl.Crash;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public FloatingBehavior floatBehavior;
    public Crash crashingBehavior;
    public String type;

    public Ball() {
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() { return deflateBehavior.deflate(); }

    public String performInflate() { return deflateBehavior.inflate(); }

    public String performFloat() { return floatBehavior.floating(); }

    public String performSubmerge() { return floatBehavior.submerging(); }

    public String performCrash() { return crashingBehavior.bounce(); }

    public String display() { return "I'm a " + type; }

}
