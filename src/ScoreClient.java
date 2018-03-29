
public class ScoreClient {

	public static void main(String[] args) {
		CricketMatch match = new CricketMatch("IND","ENG",5);
		Scores score = new Scores(match);
		
		score.addScore(1);
		score.addScore(2);
		score.addScore(0);
		score.addScore(1);
		score.addScore(2);
		score.addScore(2);

		score.addScore(2);
		
		Debuger.Log("Current Over : "+match.getCurrentOver());
		Debuger.Log("Current Ball : "+match.getCurrentOverBall());
		Debuger.Log("Current Over Score "+score.getScoreInOver(match.getCurrentOver()));
		Debuger.Log("Total Score : "+score.getCurrentScore());
	}

}
