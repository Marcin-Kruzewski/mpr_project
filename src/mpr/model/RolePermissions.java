package mpr.model;

public class RolePermissions extends Entity{
	private int roleID;
    private int permissionID;
	
	public RolePermissions(int id, EntityState state, int permissionID, int roleID) {
		super(id, state);
		this.permissionID = permissionID;
		this.roleID = roleID;
		
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public int getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}
	
	
}
