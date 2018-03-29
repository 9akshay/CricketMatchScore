
public class Scores {
	private CricketMatch match;
	private int totalScore=0;

	public Scores(CricketMatch m) {
		match = m;
	}

	public void addScore(int score) {
		totalScore += match.addScore(score);
	}
	
	public int getCurrentScore(){
		return totalScore;
	}
	
	public int getScoreInOver(int over){
		Over o = match.getOverAt(over);
		int s = 0;
		for(int i=0; i<o.getCurrentBall();i++){
			s += o.getScoreAtBall(i);
		}
		return s;
	}
	
	public int getTotalScore(){
		return totalScore;
	}
	
}
