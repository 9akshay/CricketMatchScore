
public class Scores {
	
	private CricketMatchInning match;
	private int totalScore=0;

	public Scores(CricketMatchInning m) {
		match = m;
	}

	public void addScore(int score) {
		if(score<=6 && score>=0)
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
