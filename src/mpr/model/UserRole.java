package mpr.model;

public class UserRole extends Entity {
	private int userID;
	private int roleID;

	public UserRole(int id, EntityState state, int userID, int roleID){
		super(id, state);
		this.userID = userID;
		this.roleID = roleID;
	}
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
}
