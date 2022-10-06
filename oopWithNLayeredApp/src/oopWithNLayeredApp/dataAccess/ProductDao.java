package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao { // sadece methot imzanısı barındırır

	void add(Product product);
}

//interfaceler onu implements eden sınıfların refini tutar
//bir katman başka bir katmanın clasını kllanırken sadece interfacesinden erişim kurmalıdır