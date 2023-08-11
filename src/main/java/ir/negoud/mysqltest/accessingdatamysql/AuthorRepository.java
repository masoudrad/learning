package ir.negoud.mysqltest.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;

import ir.negoud.mysqltest.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
