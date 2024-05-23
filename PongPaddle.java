public class PongPaddle {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public PongPaddle(int top, int left, int w, int h){
        x = left;
        y = top;
        width = w;
        height = h;
    }
    int getBottomY(){
        return y + height - 1;
    }
    int getLeftX(){
        return x;
    }
    int getRightX(){
        return x + width - 1;
    }
    int getTopY(){
        return y;
    }
    void moveDown(int d){
        y += d;
    }
    void moveUp(int d){
        y -= d;
    }
}
