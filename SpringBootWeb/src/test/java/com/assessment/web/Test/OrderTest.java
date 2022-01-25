package com.assessment.web.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.hibernate.criterion.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.assessment.web.model.Orrder;
import com.assessment.web.repository.OrderRepository;



@DataJpaTest
public class OrderTest {
	
	@Autowired
	private TestEntityManager entity;
	
	@Autowired
	private OrderRepository repo;
	
	@Test
	public void testSaveNewOrder() {
		entity.persist(new Orrder(1,1,3,"12-March-21","14-March-21","16-March-21","delivered","Paytm","Success"));
				
		Orrder ordered = repo.findByProductIdAndCustomerId(3,1);
		
		assertThat(ordered.getProductId()).isEqualTo(3);
		assertThat(ordered.getCustomerId()).isEqualTo(1);
	}

}
