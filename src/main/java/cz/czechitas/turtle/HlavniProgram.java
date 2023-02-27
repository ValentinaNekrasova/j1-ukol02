package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

import static java.awt.Color.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        /*nakresliRvnstTroj(40); // nakresli rovnostranny trojuhelnik
        zofka.setLocation(zofka.getX()+100, zofka.getY()+100);

        nakresliRvnstTroj(100); // nakresli rovnostranny trojuhelnik

        zofka.setLocation(zofka.getX()+50, zofka.getY()-100);

        nakresliCtverecObdelnik(50, 50); // nakresli ctverec

        zofka.setLocation(zofka.getX()-100, zofka.getY()-50);

        nakresliCtverecObdelnik(100, 50); // nakresli obdelnik

        zofka.setLocation(zofka.getX()-150, zofka.getY()-50);

        nakresliKruh(50);*/

        //ukol03-zmrzlina


        zofka.setLocation(180,160);

        nakresliZmrzlinu();

        //ukol03-snehulak

        zofka.setLocation(zofka.getX()+200, zofka.getY()+220);

        nakresliSnehulaka();

        //ukol03-lokomotiva

        zofka.setLocation(700,400);

        zofka.turnRight(60);

       nakresliLokomotivu();
    }

    private void nakresliLokomotivu() {
        nakresliCtverecObdelnik(100, 200);
        zofka.turnLeft(60);
        nakresliRvnstTroj(100);
        zofka.turnLeft(120);
        nakresliKruh(10, green);
        zofka.setLocation(zofka.getX()+145, zofka.getY()+0);
        nakresliKruh(10,green);
        zofka.setLocation(zofka.getX()+60, zofka.getY()+0);
        zofka.turnLeft(180);
        nakresliCtverecObdelnik(200,100);
        zofka.setLocation(zofka.getX()+0, zofka.getY()-22);
        zofka.turnRight(180);
        nakresliKruh(18, green );
    }

    private void nakresliSnehulaka() {
        zofka.turnLeft(90);
        nakresliKruh(28, orange);
        zofka.setLocation(zofka.getX()-8, zofka.getY()-115);
        nakresliKruh(20, orange);
        zofka.setLocation(zofka.getX()-10, zofka.getY()-85);
        nakresliKruh(15, orange);
        zofka.setLocation(zofka.getX()+70, zofka.getY()+90);
        nakresliKruh(8, orange);
        zofka.setLocation(zofka.getX()-160, zofka.getY()-0);
        nakresliKruh(8, orange);
    }

    private void nakresliZmrzlinu() {
        zofka.turnLeft(150);
        nakresliRvnstTroj(150);
        zofka.turnRight(180);
        nakresliKruh(33,pink);
    }

    private void nakresliRvnstTroj ( double delkaStrany ) {/* Rovnostranny trojuhelnik */
        for ( int i=0;i<3;i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120);
        }
    }

    private void nakresliCtverecObdelnik ( double delkaStranyA, double delkaStranyB){ /* Ctverec */
        for ( int i=0;i<2;i++){
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }
    
    private void nakresliKruh (double krok, Color mojeBarva){
        Color puvodniBarva = zofka.getPenColor();
        zofka.setPenColor( mojeBarva );
        for (int i = 0; i < 18; i++) {
            zofka.move(krok);
            zofka.turnLeft(20.0);
            
        }
        zofka.setPenColor(puvodniBarva);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }



}

