package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);//Responsável em  no banco de dados o obj
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//Consultar obj pelo id
	List<Seller> findAll();
}

