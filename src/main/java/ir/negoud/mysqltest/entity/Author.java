package ir.negoud.mysqltest.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Author {
	
	@OneToOne()
	private Long id;

}
