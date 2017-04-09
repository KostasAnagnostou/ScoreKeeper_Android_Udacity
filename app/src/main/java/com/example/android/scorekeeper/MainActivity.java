package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global Variables - Display the score for Panathinaikos & Fenerbahce
     */
    int panathinaikosScore = 0;
    int fenerbahceScore = 0;
    /**
     * Global Variables - Display the three pointers Attempted
     * & the 3 pointers succeeded for Panathinaikos & Fenerbahce
     */
    int threePointersPaoAttempted = 0;
    int threePointersPao = 0;
    int threePointersFenerAttempted = 0;
    int threePointersFener = 0;
    /**
     * Global Variables - Display the two pointers Attempted
     * & the 2 pointers succeeded for Panathinaikos & Fenerbahce
     */
    int twoPointersPaoAttempted = 0;
    int twoPointersPao = 0;
    int twoPointersFenerAttempted = 0;
    int twoPointersFener = 0;
    /**
     * * Global Variables - Display the Free Throws Attempted
     * & the Free Throws succeeded for Panathinaikos & Fenerbahce
     */
    int freeThrowsPaoAttempted = 0;
    int freeThrowsPao = 0;
    int freeThrowsFenerAttempted = 0;
    int freeThrowsFener = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Panathinaikos
     */
    public void displayForPanathinaikos(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_pao_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Fenerbahce
     */
    public void displayForFenerbahce(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_fener_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the three Pointers statistics (0/1, 1/2, etc) for Panathinaikos
     */
    public void threesPointersForPao(int threepointers) {
        TextView scoreView = (TextView) findViewById(R.id.three_pao_score);
        scoreView.setText("3 Pointers: " + (threepointers) + "/" + threePointersPaoAttempted);
    }

    /**
     * Displays the two Pointers statistics (0/1, 1/2, etc) for Panathinaikos
     */
    public void twoPointersForPao(int twopointers) {
        TextView scoreView = (TextView) findViewById(R.id.two_pao_score);
        scoreView.setText("2 Pointers: " + (twopointers) + "/" + twoPointersPaoAttempted);
    }

    /**
     * Displays the Free Throws statistics (0/1, 1/2, etc) for Panathinaikos
     */
    public void freeThrowsForPao(int ft) {
        TextView scoreView = (TextView) findViewById(R.id.free_pao_score);
        scoreView.setText("Free Throws: " + (ft) + "/" + freeThrowsPaoAttempted);
    }

     /**
      * Increase the score for Panathinaikos by three points
      * and counts the Succeeded & Attempted Three Pointers for Panathinaikos
     */
    public void addThreeForPanathinaikos(View v){
        panathinaikosScore = panathinaikosScore + 3;
        threePointersPao = threePointersPao + 1;
        threePointersPaoAttempted = threePointersPaoAttempted + 1;
        displayForPanathinaikos(panathinaikosScore);
        threesPointersForPao(threePointersPao);
    }

    /**
     * It counts the Attempted Three Pointers for Panathinaikos
     * and displays the number of three pointers that have succeeded the target
     */
    public void missedThreeForPanathinaikos(View v){
        threePointersPaoAttempted = threePointersPaoAttempted + 1;
        threesPointersForPao(threePointersPao);
    }

    /**
     * Increase the score for Panathinaikos by two points
     * and counts the Succeeded & Attempted Two Pointers for Panathinaikos
     */
    public void addTwoForPanathinaikos(View v){
        panathinaikosScore = panathinaikosScore + 2;
        twoPointersPao = twoPointersPao + 1;
        twoPointersPaoAttempted = twoPointersPaoAttempted + 1;
        displayForPanathinaikos(panathinaikosScore);
        twoPointersForPao(twoPointersPao);
    }

    /**
     * It counts the Attempted Two Pointers for Panathinaikos
     * and displays the number of two pointers that have succeeded the target
     */
    public void missedTwoForPanathinaikos(View v){
        twoPointersPaoAttempted = twoPointersPaoAttempted + 1;
        twoPointersForPao(twoPointersPao);
    }

    /**
     * Increase the score for Panathinaikos by 1 point
     * and counts the Succeeded & Attempted Free Throws for Panathinaikos
     */
    public void addOneForPanathinaikos(View v){
        panathinaikosScore = panathinaikosScore + 1;
        freeThrowsPao = freeThrowsPao + 1;
        freeThrowsPaoAttempted = freeThrowsPaoAttempted + 1;
        displayForPanathinaikos(panathinaikosScore);
        freeThrowsForPao(freeThrowsPao);
    }

    /**
     * It counts the Attempted Free Throws for Panathinaikos
     * and displays the number of Free Throws that have succeeded the target
     */
    public void missedOneForPanathinaikos(View v){
        freeThrowsPaoAttempted = freeThrowsPaoAttempted + 1;
        freeThrowsForPao(freeThrowsPao);
    }

    /**
     * Displays the three Pointers statistics (0/1, 1/2, etc) for Fenerbahce
     */
    public void threesPointersForFener(int threepointers) {
        TextView scoreView = (TextView) findViewById(R.id.three_fener_score);
        scoreView.setText("3 Pointers: " + (threepointers) + "/" + threePointersFenerAttempted);
    }

    /**
     * Displays the two Pointers statistics (0/1, 1/2, etc) for Fenerbahce
     */
    public void twoPointersForFener(int twopointers) {
        TextView scoreView = (TextView) findViewById(R.id.two_fener_score);
        scoreView.setText("2 Pointers: " + (twopointers) + "/" + twoPointersFenerAttempted);
    }

    /**
     * Displays the Free Throws statistics (0/1, 1/2, etc) for Fenerbahce
     */
    public void freeThrowsForFener(int ft) {
        TextView scoreView = (TextView) findViewById(R.id.free_fener_score);
        scoreView.setText("Free Throws: " + (ft) + "/" + freeThrowsFenerAttempted);
    }

    /**
     * Increase the score for Fenerbahce by three points
     * and counts the Succeeded & Attempted Three Pointers for Fener
     */
    public void addThreeForFenerbahce(View v){
        fenerbahceScore = fenerbahceScore + 3;
        threePointersFener = threePointersFener + 1;
        threePointersFenerAttempted = threePointersFenerAttempted + 1;
        displayForFenerbahce(fenerbahceScore);
        threesPointersForFener(threePointersFener);
    }

    /**
     * It counts the Attempted Three Pointers for Fenerbahce
     * and displays the number of three pointers that have succeeded the target
     */
    public void missedThreeForFenerbahce(View v){
        threePointersFenerAttempted = threePointersFenerAttempted + 1;
        threesPointersForFener(threePointersFener);
    }

    /**
     * Increase the score for Fenerbahce by two points
     * and counts the Succeeded & Attempted Two Pointers for Fener
     */
    public void addTwoForFenerbahce(View v){
        fenerbahceScore = fenerbahceScore + 2;
        twoPointersFener = twoPointersFener + 1;
        twoPointersFenerAttempted = twoPointersFenerAttempted + 1;
        displayForFenerbahce(fenerbahceScore);
        twoPointersForFener(twoPointersFener);
    }

    /**
     * It counts the Attempted Two Pointers for Fenerbahce
     * and displays the number of two pointers that have succeeded the target
     */
    public void missedTwoForFenerbahce(View v){
        twoPointersFenerAttempted = twoPointersFenerAttempted + 1;
        twoPointersForFener(twoPointersFener);
    }

    /**
     * Increase the score for Fenerbahce by 1 point
     * and counts the Succeeded & Attempted Free Throws for Fener
     */
    public void addOneForFenerbahce(View v){
        fenerbahceScore = fenerbahceScore + 1;
        freeThrowsFener = freeThrowsFener + 1;
        freeThrowsFenerAttempted = freeThrowsFenerAttempted + 1;
        displayForFenerbahce(fenerbahceScore);
        freeThrowsForFener(freeThrowsFener);
    }

    /**
     * It counts the Attempted Free Throws for Fenerbahce
     * and displays the number of Free Throws that have succeeded the target
     */
    public void missedOneForFenerbahce(View v){
        freeThrowsFenerAttempted = freeThrowsFenerAttempted + 1;
        freeThrowsForFener(freeThrowsFener);
    }

    /**
     * Resets the score for both teams to 0.
     */
    public void resetScore(View v){
        panathinaikosScore = 0;
        threePointersPao = 0;
        threePointersPaoAttempted = 0;
        twoPointersPao = 0;
        twoPointersPaoAttempted = 0;
        freeThrowsPao = 0;
        freeThrowsPaoAttempted = 0;
        fenerbahceScore = 0;
        threePointersFener = 0;
        threePointersFenerAttempted = 0;
        twoPointersFener = 0;
        twoPointersFenerAttempted = 0;
        freeThrowsFener = 0;
        freeThrowsFenerAttempted = 0;
        displayForPanathinaikos(panathinaikosScore);
        displayForFenerbahce(fenerbahceScore);
        threesPointersForPao(threePointersPao);
        threesPointersForFener(threePointersFener);
        twoPointersForPao(twoPointersPao);
        twoPointersForFener(twoPointersFener);
        freeThrowsForPao(freeThrowsPao);
        freeThrowsForFener(freeThrowsFener);
    }
}
