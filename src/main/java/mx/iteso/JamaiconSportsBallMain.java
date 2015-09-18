package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.balls.BaseballBall;
import mx.iteso.strategy.balls.SoccerBall;
import mx.iteso.strategy.balls.TenisBall;
import mx.iteso.strategy.balls.VolleyballBall;
import mx.iteso.strategy.balls.BasketballBall;
import mx.iteso.strategy.balls.BillarBall;
import mx.iteso.strategy.balls.HandballBall;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball tenis = new TenisBall();
        Ball basket = new BasketballBall();
        Ball billar = new BillarBall();
        Ball handball = new HandballBall();
        Ball volley = new VolleyballBall();


        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performFloat());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performFloat());

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performSubmerge());

        System.out.println();

        System.out.println(tenis.roll());
        System.out.println(tenis.performBounce());
        System.out.println(tenis.performDeflate());
        System.out.println(tenis.performInflate());
        System.out.println(tenis.performFloat());

        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.performFloat());

        System.out.println();

        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performFloat());

        System.out.println();

        System.out.println(billar.roll());
        System.out.println(billar.performBounce());
        System.out.println(billar.performDeflate());
        System.out.println(billar.performInflate());
        System.out.println(billar.performSubmerge());

        System.out.println();

        System.out.println(handball.roll());
        System.out.println(handball.performBounce());
        System.out.println(handball.performDeflate());
        System.out.println(handball.performInflate());
        System.out.println(handball.performFloat());
    }
}
