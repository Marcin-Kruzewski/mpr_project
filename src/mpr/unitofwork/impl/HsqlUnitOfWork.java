package mpr.unitofwork.impl;

import mpr.model.Entity;
import mpr.model.EntityState;
import mpr.unitofwork.IUnitOfWork;
import mpr.unitofwork.IUnitOfWorkRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class HsqlUnitOfWork implements IUnitOfWork {

	private Connection connection;
	private Map<Entity, IUnitOfWorkRepository> entities = new HashMap<>();

	public HsqlUnitOfWork(Connection connection) {
		this.connection = connection;

		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void commit() {
		for (Entity entity : entities.keySet()) {
			switch (entity.getState()) {
				case MODIFIED:
					entities.get(entity).persistUpdate(entity);
					break;
				case DELETED:
					entities.get(entity).persistRemove(entity);
					break;
				case NEW:
					entities.get(entity).persistAdd(entity);
					break;
				case UNCHANGED:
					break;
				default:
					break;
			}
		}
	}

	@Override
	public void rollback() {
		entities.clear();
	}

	@Override
	public void markAsNew(Entity entity, IUnitOfWorkRepository repository) {
		entity.setState(EntityState.NEW);
		entities.put(entity, repository);
	}

	@Override
	public void markAsDeleted(Entity entity, IUnitOfWorkRepository repository) {
		entity.setState(EntityState.DELETED);
		entities.put(entity, repository);
	}

	@Override
	public void markAsChanged(Entity entity, IUnitOfWorkRepository repository) {
		entity.setState(EntityState.MODIFIED);
		entities.put(entity, repository);
	}

	public void setEntity(Entity entity, IUnitOfWorkRepository repo) {
		this.entities.put(entity, repo);
	}
}
