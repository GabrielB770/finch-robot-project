package com.project;
import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args){
        
        Finch bird = new Finch();
        
           
        bird.setMove("F", 20, 200);
       
        bird.stop();
        bird.disconnect();
         
    }
    
    
}

