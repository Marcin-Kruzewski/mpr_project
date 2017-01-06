package mpr.repository.impl;

import mpr.model.EnumerationValue;
import mpr.repository.IEntityBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EnumerationValueBuilder implements IEntityBuilder<EnumerationValue>{

	@Override
	public EnumerationValue build(ResultSet rs) throws SQLException {
		EnumerationValue ev = new EnumerationValue();
		ev.setIntKey(rs.getInt("intKey"));
		ev.setStringKey(rs.getString("stringKey"));
		ev.setValue(rs.getString("value"));
		ev.setEnumerationName(rs.getString("enumerationName"));

		return ev;
	}
}
