package izeg.abdenacer.pres;

import izeg.abdenacer.dao.DaoImpl;
import izeg.abdenacer.metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImpl d= new DaoImpl();
        MetierImpl metier = new MetierImpl(d);//l'injection via constructeur
        System.out.println("RES= " + metier.calcul());
    }
}
