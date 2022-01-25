package com.assessment.web.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.assessment.web.model.Product;
import com.assessment.web.repository.ProductRepository;
import com.assessment.web.service.ProductService;



@DataJpaTest
public class ProductTest {
	@Autowired
	private TestEntityManager entityManager;
	
	//@MockBean
	//private ProductService service;
	
	@Autowired
	private ProductRepository prtdrepo;
	
	@Test
	public void testSaveNewProduct() {
		entityManager.persist(new Product(10, 12, "Squishy", 5));
		
		Product product = prtdrepo.findByProductName("Squishy");
		
		assertThat(product.getProductName()).isEqualTo("Squishy");
		
		
	}

}
