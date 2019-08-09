package com.BankApplication.Dao;

import java.util.List;    

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.BankApplication.beans.Accounts;


public class BankDao {
	@Autowired
	private JdbcTemplate template;

	
	@SuppressWarnings("deprecation")
	public Long getId() {
		Long rowid;
		String sql = "select account_seq.NEXTVAL from dual";
		rowid = (long) template.queryForInt(sql, Long.class);
		System.out.println(rowid);
		return rowid;
	}
	
	public int createAccount(Accounts act) {
		String sql = "insert into Accounts values(?,?,?,?,?)";
		Object args[] = {act.getAccountNumber(),act.getCustomerName(),act.getBalance(),act.getEmailId(),act.getContactNumber()};
		int rows = template.update(sql, args);
		return rows;

	}
	
	public List<Accounts> getAccounts(){
		String qry = "select * from Accounts";
		List<Accounts> list = template.query(qry,new BeanPropertyRowMapper<Accounts>(Accounts.class));
		return list;
	}
}
