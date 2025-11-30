package edu.qs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.qs.model.Repository.AccountRepository;
import edu.qs.model.entity.Account;
import edu.qs.model.exception.AccountNotExistException;
import edu.qs.model.exception.InvalidBalanceInputException;

@Service
public class AccountServiceImpl implements AccountService {

	AccountRepository accRepo;

	public AccountServiceImpl(@Autowired AccountRepository accRepo) {
		// TODO Auto-generated constructor stub
		this.accRepo = accRepo;

	}

	public Integer accountCount() {

		return accRepo.findAll().size();

	}

	public boolean addAccount(Account account) {
		// TODO Auto-generated method stub
		int before = accountCount();

		if (account.getBalance() < 0) {
			
			throw new InvalidBalanceInputException("Please enter some valid ammount");

		} else {
			accRepo.save(account);
			return true;

		}

	}
	
	//=====Find Account By Id
	
	@Override
	public Account findAccountByID(String id) {
		
		Optional<Account> account =  accRepo.findById(id);
		if(account.isPresent()) {
			return account.get();
			
			
		}
		
		throw new AccountNotExistException("Unable to find the account with id "+id);
		
		
	}
	
	// ======== Find All Account 
	
	@Override
	public List<Account> findAllAccount() {
		
		List<Account>accounts = accRepo.findAll();
		if(!accounts.isEmpty()) {
			return accounts;
			
		}
		
		throw new AccountNotExistException("Account does not exists !");
	}
	
	// delete account by id
	
	@Override
	public boolean deleteAccountById(String id) {
	
		Account account = findAccountByID(id);
		
		if(account.getAccId() != null) {
		accRepo.deleteById(id);
		return true;
		}
		throw new AccountNotExistException("Account does not exists !");
	}
	
	

}
