package mpr.repository.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import mpr.model.User;
import mpr.repository.IEntityBuilder;
import mpr.repository.IUserRepository;
import mpr.unitofwork.IUnitOfWork;

public class HsqlUserRepository extends Repository<User> implements IUserRepository{

	protected HsqlUserRepository(Connection connection, IEntityBuilder<User> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(User entity) throws SQLException {
		update.setString(1, entity.getLogin());
		update.setString(2, entity.getPassword());
		update.setInt(3, entity.getId());		
	}

	@Override
	protected void setUpInsertQuery(User entity) throws SQLException {
		insert.setString(1, entity.getLogin());
		insert.setString(2, entity.getPassword());
	}

	@Override
	protected String getTableName() {
		return "t_sys_users";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE t_sys_users SET (login, password) = (?, ?) WHERE id = ?";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO t_sys_users(login, password) VALUES(?, ?)";
	}

	@Override
	public List<User> withLogin(String login) {
		return null;
	}

	@Override
	public List<User> withLoginAndPassword(String login, String password) {
		return null;
	}

	@Override
	public void setupPermissions(User user) {

	}
}