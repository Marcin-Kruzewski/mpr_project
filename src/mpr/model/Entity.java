package mpr.model;

public abstract class Entity {
	private int id;
	private EntityState state;

	public Entity(){
		this(0);
	}
	
	public Entity(int id) {
		this.id = id;
		this.state = EntityState.NEW;
	}
	
	public Entity(int id, EntityState state){
		this.id = id;
		this.state = state;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntityState getState() {
		return state;
	}

	public void setState(EntityState state) {
		this.state = state;
	}
}
