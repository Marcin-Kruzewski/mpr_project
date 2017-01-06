package mpr.repository;

public interface IRepositoryCatalog {
	IUserRepository users();
	IEnumerationValueRepository enumerations();
	void commit();
}