package com.itbank.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ProductDTO;
import com.itbank.repository.ProductDAO;

@Service
public class ProductService {
	
	@Autowired private ProductDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public List<ProductDTO> getProductList() {
		List<ProductDTO> list = dao.selectList();
		return list;
	}

	public int add(ProductDTO dto) {
		String productImage = dto.getUpload().getOriginalFilename();
		
		File f = new File(saveDirectory, productImage);
		
		try {
			dto.getUpload().transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setProductImage(productImage);
		return dao.insert(dto);
	}

	public ProductDTO selectProduct(int idx) {
		return dao.selectOne(idx);
	}

	public int modify(ProductDTO dto) {
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}


}
