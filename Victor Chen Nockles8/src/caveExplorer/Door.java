package caveExplorer;

public class Door {
	private boolean open;
	private boolean locked;
	private String description;
	private String details;
	
	public Door() {
		open = true; 
		locked = false;
		description = "door";
		details = "";
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
