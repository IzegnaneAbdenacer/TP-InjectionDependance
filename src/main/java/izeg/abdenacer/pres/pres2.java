package izeg.abdenacer.pres;

import izeg.abdenacer.dao.IDao;
import izeg.abdenacer.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();//Instantiation par constructeur sana param
        System.out.println(dao.getData());


        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao) ;
        System.out.println(metier.calcul());
    }
}
