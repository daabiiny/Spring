package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itbank.model.ProductDTO;

@Repository
public interface ProductDAO {
	
	@Select("select * from product order by idx")
	List<ProductDTO> selectList();
	
	@Insert("insert into product (productName, productImage, price, amount)"
			+ "values ( #{productName}, #{productImage}, #{price}, #{amount} )")
	int insert(ProductDTO dto);
	
	@Select("select * from product where idx = #{idx}")
	ProductDTO selectOne(int idx);
	
	@Update("update product set amount = #{amount}")
	int update(ProductDTO dto);
	
	@Delete("delete product where idx = #{idx}")
	int delete(int idx);
}
