package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager { //ProductManager.. ProductService...ProductImplın

	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) { //ProductManager newlendiğinde bana bir prodcut dao ver demek.
	this.productDao = productDao;
	this.loggers=loggers;
}
	
	
	public void add(Product product) throws Exception{ //Product ver iş kurallarını yazayım //Bu methodu çağırdında bir hata bağırabilir dikkat et demek. Hata gelirde program durur orada
		//iş kuralları
		if(product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz"); //Hata fırlat demek.
		}
		
		//ProductDao productDao = new JdbcProductDao();
		//productDao.add(product);
		
		productDao.add(product);
		
		for (Logger logger : loggers) { 
			logger.log(product.getNameString());
		}
	}
}


//Sisteme kayıt olurken doldurduğun kutucuklar buraya geliyor. Manager daki add.
//Parametreye girdiğimiz veriler geliyor buraya
//Bir kstm