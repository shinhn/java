package datahiding;

public class StudentScore {
	private String name;
	private int score;
	
	public StudentScore(String n, int s){
		this.name = n;
		this.score = s;
	}
	
	public void Info() {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}
	
	// getter
	public int getScore() {
		return score;
	}
	
	// setter
	public void setScore(int score){
		this.score = score;
	}
}
