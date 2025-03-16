package izeg.abdenacer.metier;

import izeg.abdenacer.dao.DaoImp;
import izeg.abdenacer.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }

    /**
     * Constcructeur pour injecter l'attribut dao
     * un objet qui implement l'interface IDO
     * au moment d'instantiation
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 21.5;
        return res;
    }

    public void setDao(DaoImp d) {
    }
}
