package mpr.unitofwork;

import mpr.model.Entity;

public interface IUnitOfWorkRepository {
    void persistAdd(Entity entity);
    void persistRemove(Entity entity);
    void persistUpdate(Entity entity);
}
