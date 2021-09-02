package bt3;

public interface IMap<I,S> {
	public void inputData(I id, S name, Boolean status);
	public void displayData();
	public void sortUp();
}
