package onlineexamples;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainExperimentation extends JPanel{

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		Font font = new Font("Serif", Font.PLAIN, 96);
		g2.setColor(Color.white);
		g2.setFont(font);
		g2.drawString("Testing", 40, 120);
		g2.setColor(Color.blue);
		g2.draw(new Line2D.Double(10, 10, 100, 40));
	}

	public static void main(String[] args) throws Exception {
		JFrame f = new JFrame();
		JPanel jp = new JPanel();
		Color col = new Color(255, 100, 0);
		class g1 extends JPanel{
			public void paint(Graphics g){
				g.drawString("Testing", 40, 120);
			}
		}
		g1 G = new g1();
		f.setBackground(col);
		//f.setBackground(col);
		//f.getContentPane().add(new MainExperimentation());
		f.getContentPane().add(G);
		f.setSize(400, 320); // size of opened frame
		f.setLocation(700,400);
		f.setVisible(true);
		Thread.sleep(3000);
		f.setVisible(false);
	}

}
