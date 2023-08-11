package ir.negoud.mysqltest.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;

import ir.negoud.mysqltest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
