package izeg.abdenacer.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double t = 14;
        return t;
    }
}
