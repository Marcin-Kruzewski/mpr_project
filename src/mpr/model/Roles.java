package mpr.model;

public enum Roles {
	ADMIN(1), USER(0), OTHER(-1);
	
	private int roleID;
	
	Roles(int id){
		this.roleID = id;
	}
	
	public int getRoleID(){
		return this.roleID;
	}
}
