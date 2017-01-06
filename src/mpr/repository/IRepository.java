package mpr.repository;

import java.util.List;

public interface IRepository<TEntity> {
	void save(TEntity entity);
	void update(TEntity entity);
	void delete(TEntity entity);
	TEntity get(int id);
	List<TEntity> getAll();
}
