package verify.exam04;

public interface DataAccessObject {
	//public은 안붙여도 자동으로 붙인 효과 나긴 함
	public void select();
	public void insert();
	public void update();
	public void delete();
}
