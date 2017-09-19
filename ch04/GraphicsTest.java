import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
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
        double angle = 0.0;
        for (int x = 0; x <= 1024; x += 8) {
            double y = 150 + (Math.sin(angle) * 35.0);
            System.out.println("y = " +  y);
            Color rainbow = new Color(x/2, 200, 200);
            g.setColor(rainbow);
            g.fillRect(x, (int) y, 4, 64);
            angle += Math.PI/40.0;
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

