package mpr.repository.impl;

import java.sql.Connection;

import mpr.repository.IEnumerationValueRepository;
import mpr.repository.IRepositoryCatalog;
import mpr.repository.IUserRepository;
import mpr.unitofwork.IUnitOfWork;

public class HsqlRepositoryCatalog implements IRepositoryCatalog {
	private Connection connection;
	private IUnitOfWork uow;
	
	public HsqlRepositoryCatalog(Connection connection, IUnitOfWork uow) {
		this.connection = connection;
		this.uow = uow;
	}

	@Override
	public IUserRepository users() {
		return new HsqlUserRepository(connection, new UserBuilder(), uow);
	}

	@Override
	public IEnumerationValueRepository enumerations() {
		return new HsqlEnumerationValuesRepository(connection, new EnumerationValueBuilder(), uow);
	}

	@Override
	public void commit(){
		uow.commit();
	}
}
