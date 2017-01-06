package mpr.repository.impl;

import java.sql.Connection;
import java.sql.SQLException;

import mpr.model.EnumerationValue;
import mpr.repository.IEntityBuilder;
import mpr.repository.IEnumerationValueRepository;
import mpr.unitofwork.IUnitOfWork;

public class HsqlEnumerationValuesRepository extends Repository<EnumerationValue> implements IEnumerationValueRepository {
	
	public HsqlEnumerationValuesRepository(Connection connection, IEntityBuilder<EnumerationValue> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(EnumerationValue entity) throws SQLException {
		update.setInt(1, entity.getIntKey());
		update.setString(2, entity.getStringKey());
		update.setString(3, entity.getValue());
		update.setString(4, entity.getEnumerationName());
	}

	@Override
	protected void setUpInsertQuery(EnumerationValue entity) throws SQLException {
		insert.setInt(1, entity.getIntKey());
		insert.setString(2, entity.getStringKey());
		insert.setString(3, entity.getValue());
		insert.setString(4, entity.getEnumerationName());
	}

	@Override
	protected String getTableName() {
		return "t_sys_enums";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE t_sys_enums SET (intKey, stringKey, value, enumerationName) = (?, ?, ?, ?) WHERE id = ?;";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO t_sys_enums (intKey, stringKey, value, enumerationName) VALUES (?, ?, ?, ?);";
	}
	
	@Override
	public EnumerationValue withName(String name) {
		return null;
	}

	@Override
	public EnumerationValue withKey(int key, String name) {
		return null;
	}

	@Override
	public EnumerationValue withStringKey(String key, String name) {
		return null;
	}
}
