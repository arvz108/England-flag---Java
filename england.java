import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class england extends PApplet {

//Variable Scope

//GLOBAL VARIABLE
int xspeed = 5;
int cX;
int cY;
int cX2;
int cY2;
int endX = 0;
int endY = 0;
float circleX;
float circleX2;

//SETUP
public void setup(){
  
    background(255);
}

//DRAW
public void draw(){
  
  //Circles
      fill(102,0,0);
      stroke(255);
      ellipse(cX,height/2,32,32);
      ellipse(cY,width/2,32,32);

      cX = cX + xspeed;
      cY = cY + xspeed;
      
      ellipse(height/2,cX2,32,32);
      ellipse(width/2,cY2,32,32);

      cX2 = cX2 + xspeed;
      cY2 = cY2 + xspeed;

//bounce back X
if(cX2 >width && cX2 >height){
  if(cY2 >width && cY2 > height){
  xspeed = -5;
}
}

if(cX2 <0 && cX2 <0){
  if(cY2 <0 && cY2 < 0){
  xspeed = 5;
}
}

  //Circles
  }
  public void settings() {  size(800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "england" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
