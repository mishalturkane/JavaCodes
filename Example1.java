package basic;
import java.awt.*;


class MyFrame extends Frame{
    public  MyFrame(){
         setTitle("Mishal's Frame");
         setSize(400,400);
         setLocation(200,200);
         setVisible(true);
         setBackground(Color.cyan);
    }
}

public class Example1 {
    public static void main(String[] args) {

        MyFrame fr=new MyFrame();

    }
}
