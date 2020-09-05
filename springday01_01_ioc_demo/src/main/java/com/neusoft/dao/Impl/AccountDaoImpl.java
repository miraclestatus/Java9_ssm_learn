package com.neusoft.dao.Impl;

import com.neusoft.dao.IAccountDao;
import com.neusoft.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/9/5 11:10
 */
public class AccountDaoImpl  implements IAccountDao {


    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }


    @Override
    public List<Account> findAllAccount() {
        try {
            return runner.query("select * from account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        try {
            return runner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class), accountId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            runner.update("insert into account(name,money) values (?, ?)",account.getName(), account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {

        try {
            runner.update("update account set name= ? , money = ? where id=? ",account.getName(), account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteAccount(Integer accountId) {

        try {
            runner.update("delete from account where id = ?", accountId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}