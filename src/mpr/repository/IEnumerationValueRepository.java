package mpr.repository;

import mpr.model.EnumerationValue;

public interface IEnumerationValueRepository extends IRepository<EnumerationValue> {
	
	EnumerationValue withName(String name);

	EnumerationValue withKey(int key, String name);

	EnumerationValue withStringKey(String key, String name);
}
