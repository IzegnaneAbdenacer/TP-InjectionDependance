package izeg.abdenacer.dao;

public class DaoImp implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double t = 34;
        return t;
    }
}
