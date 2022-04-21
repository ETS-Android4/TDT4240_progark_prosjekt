package com.mygdx.game.sprites;


public class Player {


    private int livesLeft;
    private int score;
    private String name;
    private int type;
    private int currentDifficulty;

    public Player(){
        livesLeft = 3;
        score = 0;
        type = 0;
        currentDifficulty = 0;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void loseLife() {
        if (livesLeft > 0) {
            livesLeft--;
        }
    }

    public void gainLife() {
        if (livesLeft > 0 && livesLeft < 3) {
            livesLeft++;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setType(int type){ this.type = type; }

    public int getType(){ return type; }

    /**
    * @return -1 if difficulty is not updated, otherwise the new difficulty score 0-10.
     **/
    public int increaseScoreAndDifficulty(double score) {
        this.score += score;
        int newDifficulty = getDifficulty();
        if(currentDifficulty != newDifficulty){
            currentDifficulty = newDifficulty;
            return newDifficulty;
        }
        else{
            return -1;
        }
    }

    private int getDifficulty() {
        for (int i = 100; i > 0; i -= 10) {
            if (score > i) {
                return i / 10;
            }
        }
        return 0;
    }
}
