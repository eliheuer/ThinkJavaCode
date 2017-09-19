import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Graphics Test
 */

public class GraphicsTest extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Test");
        Canvas GraphicsTest = new GraphicsTest();
        GraphicsTest.setSize(256, 256);
        frame.add(GraphicsTest);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 20; i < 256; i += 10) {
            g.fillOval(i, (i/2), 32, 32);
            g.fillRect((i/2), i, 32, 32);
        }
    }
}


//        double root = Math.sqrt(17.0);
//        double angle = 1.5;
//        double height = Math.sin(angle);

//        double degrees = 90;
//        double angle2 = degrees / 180.0 * Math.PI;
//        double radians = Math.toRadians(180.0);
//        double degrees2 = Math.toDegrees(Math.PI);
//        long x = Math.round(Math.PI * 20.0);

//        double x2 = Math.cos(angle + Math.PI / 2.0);
//        double x3 = Math.exp(Math.log(10.0));
//        double x4 = Math.pow(2.0, 10.0);
//        System.out.println(x4);

