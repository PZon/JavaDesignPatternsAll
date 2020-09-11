package Abstract;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class GameDemo {
    public static void main(String[] args){
        MainFactory allies = new Allies();
        MainFactory enemies = new Enemies();

        UnitPiechota alliesCanon = allies.createPiechota(UnitType.CANON);
        UnitPiechota alliesRiffle = allies.createPiechota(UnitType.RIFLEMAN);
        UnitPiechota enemiesRiffle = enemies.createPiechota(UnitType.RIFLEMAN);
        UnitPiechota enemiesCannon = enemies.createPiechota(UnitType.CANON);

        UnitMarynarka alliesShip = allies.createMarynarka(UnitType.SHIP);
        UnitMarynarka enemiesShip = enemies.createMarynarka(UnitType.SHIP);

        UnitLotnictwo alliesPlane = allies.createLotnictwo(UnitType.PLANE);
        UnitLotnictwo enemiesPlane = enemies.createLotnictwo(UnitType.PLANE);

        System.out.println(alliesCanon+"\n"+alliesPlane+"\n"+alliesRiffle+"\n"+alliesShip+"\n");



    }
}
