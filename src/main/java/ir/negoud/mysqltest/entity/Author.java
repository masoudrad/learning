package ir.negoud.mysqltest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {
	
	@Id
	private Long id;
	
	@OneToOne(mappedBy="id")
	private Long userId;
	
	@OneToMany
	private Book book;

}
