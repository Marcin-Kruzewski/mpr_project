package mpr.model;

public enum Permission {
	ADD(1), DELETE(2), EDIT(3);

	private int permissionID;
	
	Permission(int id) {
		this.permissionID = id;
	}
	public int getPermissionID(){
		return this.permissionID;
	}
}
