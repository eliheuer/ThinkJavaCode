import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * Graphics Test
 */

public class GraphicsTest extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Test");
        Canvas GraphicsTest = new GraphicsTest();
        GraphicsTest.setSize(256, 256);
        GraphicsTest.setBackground(Color.BLACK);
        frame.add(GraphicsTest);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        double angle = 0.0;
        for (int x = 0; x <= 1024; x += 8) {

            // Set y-position from sin of angle.
            double y = 64 + (Math.sin(angle) * 55.0);

            // generate a random color with HSB.
            Random r = new Random();
            double hue = r.nextDouble();
            float h = (float) hue; // hue
            float s = (float) 1.0; // saturation
            float b = (float) 1.0; // brightness

            // Set color and draw rectangle.
            Color rainbow = Color.getHSBColor(h, s, b);
            g.setColor(rainbow);
            g.fillRect(x, (int)y, 5, 100);
            g.fillOval(x * 2, ((int)y+200), 32, 32);

            // Update angle for next ineration.
            angle += Math.PI/12.0;

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

