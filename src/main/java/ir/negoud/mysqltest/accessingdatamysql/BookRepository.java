package ir.negoud.mysqltest.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ir.negoud.mysqltest.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{

}
