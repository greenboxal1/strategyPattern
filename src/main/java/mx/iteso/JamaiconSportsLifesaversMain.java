package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.FoamFloats;
import mx.iteso.strategy.lifesavers.LifeVests;
import mx.iteso.strategy.lifesavers.SwimBelts;
import mx.iteso.strategy.lifesavers.SwimRing;
import mx.iteso.strategy.lifesavers.WaterTubes;
import mx.iteso.strategy.lifesavers.SwimSeat;
import mx.iteso.strategy.Candies.LifesaversCandies;

public class JamaiconSportsLifesaversMain {
    public static void main (String[] args) {
        ArmBands armBands = new ArmBands();
        FoamFloats foamFloats = new FoamFloats();
        LifeVests lifeVests = new LifeVests();
        SwimBelts swimBelts = new SwimBelts();
        SwimRing swimRing = new SwimRing();
        SwimSeat swimSeat = new SwimSeat();
        WaterTubes waterTubes = new WaterTubes();
        LifesaversCandies lifesavers = new LifesaversCandies();

        System.out.println(armBands.inflating());
        System.out.println(armBands.deflating());
        System.out.println(armBands.floating());
        System.out.println(armBands.display());

        System.out.println();

        System.out.println(lifeVests.inflating());
        System.out.println(lifeVests.deflating());
        System.out.println(lifeVests.floating());
        System.out.println(lifeVests.display());

        System.out.println();

        System.out.println(swimRing.inflating());
        System.out.println(swimRing.deflating());
        System.out.println(swimRing.floating());
        System.out.println(swimRing.display());

        System.out.println();

        System.out.println(swimSeat.inflating());
        System.out.println(swimSeat.deflating());
        System.out.println(swimSeat.floating());
        System.out.println(swimSeat.display());

        System.out.println();

        System.out.println(waterTubes.inflating());
        System.out.println(waterTubes.deflating());
        System.out.println(waterTubes.floating());
        System.out.println(waterTubes.display());

        System.out.println();

        System.out.println(foamFloats.notInflating());
        System.out.println(foamFloats.notDeflating());
        System.out.println(foamFloats.floating());
        System.out.println(foamFloats.display());

        System.out.println();

        System.out.println(swimBelts.notInflating());
        System.out.println(swimBelts.notDeflating());
        System.out.println(swimBelts.floating());
        System.out.println(swimBelts.display());

        System.out.println();

        System.out.println(lifesavers.performInflate());
        System.out.println(lifesavers.performDeflate());
        System.out.println(lifesavers.performFloat());
        System.out.println(lifesavers.display());
    }
}
