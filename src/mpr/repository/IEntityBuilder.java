package mpr.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import mpr.model.Entity;

public interface IEntityBuilder<TEntity extends Entity> {

	 TEntity build(ResultSet rs) throws SQLException;
	
}