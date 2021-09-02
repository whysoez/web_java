package bt3;

public class City<I, S> {
	private I id;
	private S name;
	private boolean status;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(I id, S name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public I getId() {
		return id;
	}
	public void setId(I id) {
		this.id = id;
	}
	public S getName() {
		return name;
	}
	public void setName(S name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
