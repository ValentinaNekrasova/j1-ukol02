package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

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

        /*zofka.turnLeft(150);
        nakresliRvnstTroj(150);
        zofka.turnRight(180);
        nakresliKruh(33);*/

        //ukol03-snehulak

        /*zofka.setLocation (zofka.getX()+0,zofka.getY()+100);
        zofka.turnLeft(90);
        nakresliKruh(28);
        zofka.setLocation(zofka.getX()-8, zofka.getY()-115);
        nakresliKruh(20);
        zofka.setLocation(zofka.getX()-10, zofka.getY()-85);
        nakresliKruh(15);
        zofka.setLocation(zofka.getX()+80, zofka.getY()+130);
        nakresliKruh(8);
        zofka.setLocation(zofka.getX()-155, zofka.getY()-0);
        nakresliKruh(8);*/

        //ukol03-lokomotiva

        nakresliCtverecObdelnik(100, 200);
        zofka.turnLeft(60);
        nakresliRvnstTroj(100);
        zofka.turnLeft(120);
        nakresliKruh(10);
        zofka.setLocation(zofka.getX()+145, zofka.getY()+0);
        nakresliKruh(10);
        zofka.setLocation(zofka.getX()+60, zofka.getY()+0);
        zofka.turnLeft(180);
        nakresliCtverecObdelnik(200,100);
        zofka.setLocation(zofka.getX()+0, zofka.getY()-22);
        zofka.turnRight(180);
        nakresliKruh(18);
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
    
    private void nakresliKruh ( double krok){
        for (int i = 0; i < 18; i++) {
            zofka.move(krok);
            zofka.turnLeft(20.0);
            
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }



}

