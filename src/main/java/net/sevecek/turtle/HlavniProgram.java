package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;
    public void main(String[] args) {
        zofka = new Turtle();

          zofka.setLocation(40,100);

          zofka.turnRight(165);
          nakresliRovnoramennyTrojuhelnik(180,30);
          double prumerKruhu = vypocitejDelkuTretiStrany(180, 30);
          nakresliKruh(prumerKruhu / 2 + 2);
          zofka.turnLeft(165);

          zofka.setLocation(350,250);


           nakresliKruh(50);
           zofka.turnLeft(180);
           nakresliKruh(20);
           zofka.turnRight(90);
           zofka.penUp();
           zofka.move(50);
           zofka.turnLeft(90);
           zofka.move(50 + 150);
           zofka.penDown();
           zofka.turnLeft(90);
           nakresliKruh(75);
           zofka.turnLeft(90);
           zofka.penUp();
           zofka.move(150 + 50);
           zofka.turnLeft(90);
           zofka.move(50);
           zofka.turnRight(90);
           zofka.penDown();
           nakresliKruh(20);
           zofka.turnRight(90);
           zofka.penUp();
           zofka.move(50);
           zofka.turnLeft(90);
           zofka.move(50);
           zofka.turnRight(90);
           zofka.penDown();
           nakresliKruh(30);
           zofka.turnLeft(90);

           zofka.setLocation(600,250);

           nakresliObdelnik(100, 200);
           zofka.turnRight(180);
           zofka.penUp();
           zofka.move(20);
           zofka.turnRight(90);
           zofka.move(100);
           zofka.turnRight(180);
           zofka.penDown();
           nakresliRovnoramennyTrojuhelnik(100, 90);
           zofka.penUp();
           zofka.move(100 + 50);
           zofka.turnLeft(90);
           zofka.move(20);
           zofka.turnLeft(90);
           zofka.penDown();
           nakresliKruh(30);
           zofka.turnLeft(180);
           zofka.move(100);
           zofka.turnLeft(180);
           nakresliKruh(30);
           zofka.turnLeft(180);
           zofka.move(50);
           zofka.turnLeft(90);
           nakresliObdelnik(200,150);
           zofka.turnRight(180);
           nakresliKruh(75);

    }

    public void nakresliObdelnik(double a, double b) {
        double angle = 90;
        for (int i = 0; i < 2; i++) {
            zofka.move(a);
            zofka.turnRight(angle);
            zofka.move(b);
            zofka.turnRight(angle);
        }
    }

    public void nakresliRovnostrannyTrojuhelnik (double delkaStrany) {
        double angle = 120;
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(angle);
        }
    }

    public double vypocitejDelkuTretiStrany(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2.0))
                * 2.0);
        return tretiStrana;
    }

    public void nakresliKruh (double polomer) {
        double obvodKruhu = 2 * Math.PI * polomer;
        double jedenKrok = obvodKruhu / 360;
        int obvodKruhuInt = (int) obvodKruhu;
        for (int i = 0; i < 360; i++) {
            zofka.move(jedenKrok);
            zofka.turnLeft(1);
        }
    }

    public void nakresliRovnoramennyTrojuhelnik(double rameno, double uhelMeziRameny) {
        zofka.move(rameno);
        zofka.turnLeft(180 - uhelMeziRameny);
        zofka.move(rameno);
        double uhelUZakladny = (180 - uhelMeziRameny) / 2;
        zofka.turnLeft(180 - uhelUZakladny);
        double delkaTretiStrany = vypocitejDelkuTretiStrany(rameno, uhelMeziRameny);
        zofka.move(delkaTretiStrany);
        zofka.turnLeft(180 - uhelUZakladny);
    }

}
