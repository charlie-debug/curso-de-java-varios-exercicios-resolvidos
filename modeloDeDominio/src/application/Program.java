package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	//Department obj = new Department(1,"computadores");
    Scanner sc = new Scanner(System.in);
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	//Seller seller = new Seller(50, "charlie", "charlie@gmail.com", new Date(), 6000.0, obj);
    System.out.println("=== find by id ===");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("\n=== find by department ===");
	Department department = new Department(2, null);
	List<Seller> list = sellerDao.findByDepartment(department);
	for (Seller obj : list) {
		System.out.println(obj);
	}
	
	System.out.println("\n=== find all ===");
	
	 list = sellerDao.findAll();
	for (Seller obj : list) {
		System.out.println(obj);
	}
	
	System.out.println("\n=== insert ===");
	Seller newSeller = new Seller(null, "joaquim santos", "jq@gmail.com", new Date(), 6000.0, department);
	sellerDao.insert(newSeller);
	System.out.println("inserido, linha: "+newSeller.getId());
	
	System.out.println("\n=== update ===");
	seller = sellerDao.findById(15);
	seller.setName("Luiza Souza");
	sellerDao.update(seller);
	System.out.println("atualizado com sucesso!");
	
	System.out.println("\n=== delete ===");
	System.out.println("digite um id para delecao:");
	int id = sc.nextInt();
	sellerDao.deleteById(id);
	System.out.println("deletado com sucesso!");
	
	sc.close();
	}

}
