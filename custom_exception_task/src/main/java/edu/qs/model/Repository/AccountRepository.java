package edu.qs.model.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.qs.model.entity.Account;

public interface AccountRepository extends JpaRepository<Account,String>{

//	Account save(Optional<Account> account);

}
