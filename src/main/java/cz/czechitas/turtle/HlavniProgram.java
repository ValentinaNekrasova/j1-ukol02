package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        nakresliRvnstTroj(40); // nakresli rovnostranny trojuhelnik
        zofka.setLocation(zofka.getX()+100, zofka.getY()+100);

        nakresliRvnstTroj(100); // nakresli rovnostranny trojuhelnik

        zofka.setLocation(zofka.getX()+50, zofka.getY()-100);

        nakresliCtverecObdelnik(50, 50); // nakresli ctverec

        zofka.setLocation(zofka.getX()-100, zofka.getY()-50);

        nakresliCtverecObdelnik(100, 50); // nakresli obdelnik

        zofka.setLocation(zofka.getX()-150, zofka.getY()-50);

        nakresliKruh(50);

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

