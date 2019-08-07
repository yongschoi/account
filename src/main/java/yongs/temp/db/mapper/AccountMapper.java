package yongs.temp.db.mapper;

import yongs.temp.vo.Account;

public interface AccountMapper {
	public Account getAccount(String username) throws Exception;
}