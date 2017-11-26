package com.example.android.scorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int shotsTeam1 = 0;
    int shotsOnTargetTeam1 = 0;
    int cornersTeam1 = 0;
    int offsidesTeam1 = 0;
    int foulsTeam1 = 0;
    int yellowCardsTeam1 = 0;
    int redCardsTeam1 = 0;
    int scoreTeam2 = 0;
    int shotsTeam2 = 0;
    int shotsOnTargetTeam2 = 0;
    int cornersTeam2 = 0;
    int offsidesTeam2 = 0;
    int foulsTeam2 = 0;
    int yellowCardsTeam2 = 0;
    int redCardsTeam2= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * Button presses for Team 1.
     */

    public void add1PointsTeam1 (View view) {
        scoreTeam1 = scoreTeam1 + 1;
        shotsTeam1 = shotsTeam1 + 1;
        shotsOnTargetTeam1 = shotsOnTargetTeam1 + 1;
        displayForTeam1(scoreTeam1);
        displayForTeam1small(scoreTeam1);
        displayForTeam1Shots(shotsTeam1);
        displayForTeam1ShotsOnTarget(shotsOnTargetTeam1);
    }

    public void add1ShotTeam1 (View view) {
        shotsTeam1 = shotsTeam1 + 1;
        displayForTeam1Shots(shotsTeam1);
    }

    public void add1ShotOnTargetTeam1 (View view) {
        shotsTeam1 = shotsTeam1 + 1;
        shotsOnTargetTeam1 = shotsOnTargetTeam1 + 1;
        displayForTeam1Shots(shotsTeam1);
        displayForTeam1ShotsOnTarget(shotsOnTargetTeam1);
    }

    public void add1CornerTeam1 (View view) {
        cornersTeam1 = cornersTeam1 + 1;
        displayForTeam1Corners(cornersTeam1);
    }

    public void add1OffsideTeam1 (View view) {
        offsidesTeam1 = offsidesTeam1 + 1;
        displayForTeam1Offsides(offsidesTeam1);
    }

    public void add1FoulTeam1 (View view) {
        foulsTeam1 = foulsTeam1 + 1;
        displayForTeam1Fouls(foulsTeam1);
    }

    public void add1YellowCardTeam1 (View view) {
        yellowCardsTeam1 = yellowCardsTeam1 + 1;
        displayForTeam1YellowCards(yellowCardsTeam1);
    }

    public void add1RedCardTeam1 (View view) {
        redCardsTeam1 = redCardsTeam1 + 1;
        displayForTeam1RedCards(redCardsTeam1);
    }

    public void resetTeam1 (View view) {
        scoreTeam1 = 0;
        shotsTeam1 = 0;
        shotsOnTargetTeam1 = 0;
        cornersTeam1 = 0;
        offsidesTeam1 = 0;
        foulsTeam1 = 0;
        yellowCardsTeam1 = 0;
        redCardsTeam1 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam1small(scoreTeam1);
        displayForTeam1Shots(shotsTeam1);
        displayForTeam1ShotsOnTarget(shotsOnTargetTeam1);
        displayForTeam1Corners(cornersTeam1);
        displayForTeam1Offsides(offsidesTeam1);
        displayForTeam1Fouls(foulsTeam1);
        displayForTeam1YellowCards(yellowCardsTeam1);
        displayForTeam1RedCards(redCardsTeam1);
    }

    /**
     *
     * Button presses for Team 2.
     */

    public void add1PointsTeam2 (View view) {
        scoreTeam2 = scoreTeam2 + 1;
        shotsTeam2 = shotsTeam2 + 1;
        shotsOnTargetTeam2 = shotsOnTargetTeam2 + 1;
        displayForTeam2(scoreTeam2);
        displayForTeam2small(scoreTeam2);
        displayForTeam2Shots(shotsTeam2);
        displayForTeam2ShotsOnTarget(shotsOnTargetTeam2);
    }

    public void add1ShotTeam2 (View view) {
        shotsTeam2 = shotsTeam2 + 1;
        displayForTeam2Shots(shotsTeam2);
    }

    public void add1ShotOnTargetTeam2 (View view) {
        shotsTeam2 = shotsTeam2 + 1;
        shotsOnTargetTeam2 = shotsOnTargetTeam2 + 1;
        displayForTeam2Shots(shotsTeam2);
        displayForTeam2ShotsOnTarget(shotsOnTargetTeam2);
    }

    public void add1CornerTeam2 (View view) {
        cornersTeam2 = cornersTeam2 + 1;
        displayForTeam2Corners(cornersTeam2);
    }

    public void add1OffsideTeam2 (View view) {
        offsidesTeam2 = offsidesTeam2 + 1;
        displayForTeam2Offsides(offsidesTeam2);
    }

    public void add1FoulTeam2 (View view) {
        foulsTeam2 = foulsTeam2 + 1;
        displayForTeam2Fouls(foulsTeam2);
    }

    public void add1YellowCardTeam2 (View view) {
        yellowCardsTeam2 = yellowCardsTeam2 + 1;
        displayForTeam2YellowCards(yellowCardsTeam2);
    }

    public void add1RedCardTeam2 (View view) {
        redCardsTeam2 = redCardsTeam2 + 1;
        displayForTeam2RedCards(redCardsTeam2);
    }

    public void resetTeam2 (View view) {

        scoreTeam2 = 0;
        shotsTeam2 = 0;
        shotsOnTargetTeam2 = 0;
        cornersTeam2 = 0;
        offsidesTeam2 = 0;
        foulsTeam2 = 0;
        yellowCardsTeam2 = 0;
        redCardsTeam2 = 0;
        displayForTeam2(scoreTeam2);
        displayForTeam2small(scoreTeam2);
        displayForTeam2Shots(shotsTeam2);
        displayForTeam2ShotsOnTarget(shotsOnTargetTeam2);
        displayForTeam2Corners(cornersTeam2);
        displayForTeam2Offsides(offsidesTeam2);
        displayForTeam2Fouls(foulsTeam2);
        displayForTeam2YellowCards(yellowCardsTeam2);
        displayForTeam2RedCards(redCardsTeam2);
    }

    /**
     *
     * Reset button for both teams.
     */
    public void resetBothTeams (View view) {
        scoreTeam1 = 0;
        shotsTeam1 = 0;
        shotsOnTargetTeam1 = 0;
        cornersTeam1 = 0;
        offsidesTeam1 = 0;
        foulsTeam1 = 0;
        yellowCardsTeam1 = 0;
        redCardsTeam1 = 0;
        scoreTeam2 = 0;
        shotsTeam2 = 0;
        shotsOnTargetTeam2 = 0;
        cornersTeam2 = 0;
        offsidesTeam2 = 0;
        foulsTeam2 = 0;
        yellowCardsTeam2 = 0;
        redCardsTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam1small(scoreTeam1);
        displayForTeam1Shots(shotsTeam1);
        displayForTeam1ShotsOnTarget(shotsOnTargetTeam1);
        displayForTeam1Corners(cornersTeam1);
        displayForTeam1Offsides(offsidesTeam1);
        displayForTeam1Fouls(foulsTeam1);
        displayForTeam1YellowCards(yellowCardsTeam1);
        displayForTeam1RedCards(redCardsTeam1);
        displayForTeam2(scoreTeam2);
        displayForTeam2small(scoreTeam2);
        displayForTeam2Shots(shotsTeam2);
        displayForTeam2ShotsOnTarget(shotsOnTargetTeam2);
        displayForTeam2Corners(cornersTeam2);
        displayForTeam2Offsides(offsidesTeam2);
        displayForTeam2Fouls(foulsTeam2);
        displayForTeam2YellowCards(yellowCardsTeam2);
        displayForTeam2RedCards(redCardsTeam2);
    }
    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team 1 but for the small one.
     */
    public void displayForTeam1small(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_1_small);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team 1.
     */
    public void displayForTeam1Shots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots on target for Team 1.
     */
    public void displayForTeam1ShotsOnTarget(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_team_1_on_target);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corners for Team 1.
     */
    public void displayForTeam1Corners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given offsides for Team 1.
     */
    public void displayForTeam1Offsides(int score) {
        TextView scoreView = (TextView) findViewById(R.id.offsides_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team 1.
     */
    public void displayForTeam1Fouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cars for Team 1.
     */
    public void displayForTeam1YellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_cards_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cars for Team 1.
     */
    public void displayForTeam1RedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_cards_team_1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team 2 but for the small one.
     */
    public void displayForTeam2small(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_2_small);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team 2.
     */
    public void displayForTeam2Shots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_team_2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots on target for Team 1.
     */
    public void displayForTeam2ShotsOnTarget(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_team_2_on_target);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corners for Team 2.
     */
    public void displayForTeam2Corners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_team_2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given offsides for Team 2.
     */
    public void displayForTeam2Offsides(int score) {
        TextView scoreView = (TextView) findViewById(R.id.offsides_team_2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team 2.
     */
    public void displayForTeam2Fouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cars for Team 2.
     */
    public void displayForTeam2YellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_cards_team_2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cars for Team 2.
     */
    public void displayForTeam2RedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_cards_team_2);
        scoreView.setText(String.valueOf(score));
    }


}
