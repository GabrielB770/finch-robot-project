package com.project;
import com.birdbrain.Finch;

//Methods
public class Example {
    public static void letterN(){
        Finch birds = new Finch();
        birds.setMove("F", 20, 230);
        birds.setTurn("R", 150, 200);
        birds.setMove("F", 22, 230);
        birds.setTurn("L", 150, 200);
        birds.setMove("F", 20, 150);
        birds.setTurn("R", 90, 200);
    }
    public static void LetterA(){
        Finch birdss = new Finch();
        birdss.setMove("F", 10, 200);
        birdss.setTurn("R", 110,200);
        birdss.setMove("F", 20, 200);
        birdss.setTurn("R", 180, 200);
        birdss.setMove("F", 13, 200);
        birdss.setTurn("R", 75, 200);
        birdss.setMove("F", 8, 200);
        birdss.setTurn("L", 127, 200);
        birdss.setMove("F", 7, 200);
        
        birdss.setTurn("R", 180, 200);
        birdss.setMove("F", 21, 200);
        birdss.setTurn("L", 60, 200);
    }
    public static void letterS(){
        Finch birdo = new Finch();
        birdo.setMove("F", 15, 200);
        birdo.setTurn("L", 90, 200);
        birdo.setMove("F", 10, 200);
        birdo.setTurn("L", 90, 200);
        birdo.setMove("F", 10, 200);
        birdo.setTurn("R", 90, 200);
        birdo.setMove("F", 10, 200);
        birdo.setTurn("R", 95, 200);
        birdo.setMove("F", 10, 200);
    }
    public static void main(String[] args){
        
        Finch bird = new Finch();
        //Execute Methods
        
        letterN();
        LetterA();
        letterS();
        LetterA();
       
        bird.stop();
        bird.disconnect();
         
    }
    
    
}
