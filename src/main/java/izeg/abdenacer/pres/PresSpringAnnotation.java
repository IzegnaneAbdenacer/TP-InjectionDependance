package izeg.abdenacer.pres;

import izeg.abdenacer.dao.IDao;
import izeg.abdenacer.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("izeg.abdenacer");
        IMetier metier =applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
        IDao dao = applicationContext.getBean(IDao.class);
        System.out.println(dao.getData());
    }
}
