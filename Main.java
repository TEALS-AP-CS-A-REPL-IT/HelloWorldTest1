import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

class Main {
  public static void main(String[] args) {
    // this is a single line
    /*
     * multi line 
     */
    System.out.print("Hello \nworld!\n");
        JFrame frmMain = new JFrame();
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setSize(400, 400);

        Canvas cnvs = new Canvas();
        cnvs.setSize(400, 400);

        frmMain.add(cnvs);
        frmMain.setVisible(true);

        Graphics g = cnvs.getGraphics();
        g.setColor(new Color(255, 0, 0));
        g.drawString("Hello", 200, 200);
    System.out.print("Good \"bye\\ World!\n");
  }
}