package izeg.abdenacer.pres;

import izeg.abdenacer.dao.IDao;
import izeg.abdenacer.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext springContext =
                new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) springContext.getBean("metier");
        System.out.println(metier.calcul());
        IDao dao =(IDao) springContext.getBean("d");
        System.out.println(dao.getData());
    }
}
