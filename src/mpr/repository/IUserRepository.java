package mpr.repository;

import java.util.List;

import mpr.model.User;

public interface IUserRepository extends IRepository<User> {
	List<User> withLogin(String login);

	List<User> withLoginAndPassword(String login, String password);

	void setupPermissions(User user);
}
