
public class PongBall {
    private int x,y,xVelocity,yVelocity;
    PongBall(int initX, int initY, int initXVel, int initYVel){
        x = initX;
        y = initY;
        xVelocity = initXVel;
        yVelocity = initYVel;        
    }
    void bounceX(){
        xVelocity = -1 * xVelocity;
    }
    void bounceY(){
        yVelocity = -1 * yVelocity;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void move(){
        x += xVelocity;
        y += yVelocity;
    }
}
