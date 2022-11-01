package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.cor.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	
	public void add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10)
		{
			throw new Exception("Ürün Fiyati 10 dan kücük olamaz");
		}
		
		
		productDao.add(product);
		for (Logger logger : loggers ) {
			logger.log(product.getName());
			
		}
	}
}
