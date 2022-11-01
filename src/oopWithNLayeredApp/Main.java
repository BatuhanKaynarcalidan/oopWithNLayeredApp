package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.cor.logging.DataBaseLogger;
import oopWithNLayeredApp.cor.logging.FileLogger;
import oopWithNLayeredApp.cor.logging.Logger;
import oopWithNLayeredApp.cor.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception{
		Product product1 = new Product(1,"Iphone 11",90);
		Logger[] loggers = {new FileLogger(),new DataBaseLogger(),new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
	}

}
