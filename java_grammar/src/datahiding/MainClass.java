package datahiding;

public class MainClass {
	public static void main(String[] args) {
		StudentScore s1 = new StudentScore("강신현",100);
		s1.Info();
		
		s1.setScore(200);
		s1.Info();
	}
}
