package izeg.abdenacer.pres;

import izeg.abdenacer.dao.DaoImp;
import izeg.abdenacer.metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImp d= new DaoImp();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES= " + metier.calcul());
    }
}
