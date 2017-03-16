package Pi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aleatorios.Engine;


public class Grafica extends JFrame {
	int l = 1024;
	Engine e = new Engine(l);
	MonteCarlo m = new MonteCarlo(e.randoms());
	double p[][] = m.getArr();
	
	
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Grafica frame = new Grafica();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Grafica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Grafica puntos");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,400,400);
    }
    
    public void paint (Graphics g){
    	super.paint(g);
    	g.setColor(Color.GREEN);
    	for(double x = 0; x < (Math.PI/2);){ 
    		g.drawOval((int)(Math.cos(x)*350)+20, (int)(Math.sin(x)*350)+40, 2, 2);
    		x+=0.01;
    	}
    	g.setColor (Color.blue);
        g.drawRect (20, 40, 350, 350);
        g.drawOval (20, 40, 350, 350);
        g.setColor(Color.red);
        for(int a = 0; a < (l/2); a++){
        	g.drawOval ((int)(p[0][a]*350)+20, (int)(p[1][a]*350)+40, 2, 2);
        }
    }
}