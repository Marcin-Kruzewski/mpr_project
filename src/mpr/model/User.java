package mpr.model;

import java.util.HashSet;
import java.util.Set;

public class User extends Entity {
	private String login;
	private String password;
	private Set<UserRole> userRoles;
	private Set<RolePermissions> userPermissions;

	public User() {
	}

	public User(String login, String password) {
		this.login = login;
		this.password = password;
		this.userRoles = new HashSet<UserRole>();
		this.userPermissions = new HashSet<RolePermissions>();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public void addUserRole(UserRole userRole) {
		this.userRoles.add(userRole);
	}

	public void addUserRoles(Set<UserRole> userRoles) {
		this.userRoles.addAll(userRoles);
	}

	public void clearUserRoles() {
		this.userRoles.clear();
	}


	public Set<RolePermissions> getUserPermissions() {
		return userPermissions;
	}

	public void setUserPermissions(Set<RolePermissions> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public void addUserPermission(RolePermissions permissions) {
		this.userPermissions.add(permissions);
	}

	public void addUserPermissions(Set<RolePermissions> userPermissions) {
		this.userPermissions.addAll(userPermissions);
	}

	public void removeUserPermission(RolePermissions permissions) {
		this.userPermissions.remove(permissions);
	}

	public void cleanUserPermissions() {
		this.userPermissions.clear();
	}
}
