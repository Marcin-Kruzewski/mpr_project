package mpr.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import mpr.repository.IRepositoryCatalog;
import mpr.unitofwork.IUnitOfWork;
import mpr.unitofwork.impl.HsqlUnitOfWork;

public class RepositoryCatalogProvider {
	private static String url = "jdbc:hsqldb:hsql://localhost";

	public static IRepositoryCatalog catalog() {

		try {
			Connection connection = DriverManager.getConnection(url);
			IUnitOfWork uow = new HsqlUnitOfWork(connection);
			IRepositoryCatalog catalog = new HsqlRepositoryCatalog(connection, uow);

			return catalog;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
