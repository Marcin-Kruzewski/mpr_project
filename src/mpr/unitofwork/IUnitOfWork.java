package mpr.unitofwork;

import mpr.model.Entity;

public interface IUnitOfWork {
	void commit();

	void rollback();

	void markAsNew(Entity entity, IUnitOfWorkRepository repository);

	void markAsDeleted(Entity entity, IUnitOfWorkRepository repository);

	void markAsChanged(Entity entity, IUnitOfWorkRepository repository);
}
