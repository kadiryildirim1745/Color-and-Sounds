package Renkler;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;


class görev implements Runnable{
	
	JLabel etiket;
	boolean devam= false;
	
	görev(JLabel x){
		etiket=x;
	}
	
	
	public void run() {
		while(devam) {
			int x= (int) (Math.random()*11)+1;
			switch(x){
			case 1:
				etiket.setBackground(Color.red);
				break;
			case 2:
				etiket.setBackground(Color.blue);
				break;
			case 3:
				etiket.setBackground(Color.yellow);
				break;
			case 4:
				etiket.setBackground(Color.green);
				break;
			case 5:
				etiket.setBackground(Color.cyan);
				break;
			case 6:
				etiket.setBackground(Color.orange);
				break;
			case 7:
				etiket.setBackground(Color.white);
				break;
			case 8:
				etiket.setBackground(Color.black);
				break;
			case 9:
				etiket.setBackground(Color.gray);
				break;
			case 10:
				etiket.setBackground(Color.pink);
				break;
			case 11:
				etiket.setBackground(Color.magenta);
				break;
				
			}
			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {}
		}
	}	
}
public class Renkler extends JFrame implements ActionListener {
	JButton buttons[];
	JLabel jlb;
	Border border= BorderFactory.createLineBorder(Color.black, 3);
	görev g;
	Thread t1,t2;

			
	
	Renkler(){
		super("Renkler");
		
		buttons= new JButton[13];
		buttons[0]=new JButton("red");		buttons[1]=new JButton("blue");		buttons[2]=new JButton("yellow");		buttons[3]=new JButton("green");
		buttons[4]=new JButton("cyan");		buttons[5]=new JButton("orange");		buttons[6]=new JButton("white");		buttons[7]=new JButton("black");
		buttons[8]=new JButton("gray");		buttons[9]=new JButton("pink");	buttons[10]=new JButton("magenta");		buttons[11]=new JButton("random");
		buttons[12]=new JButton("random iptal");
		buttons[0].setBounds(100, 700, 75, 50); buttons[1].setBounds(190, 700, 75, 50); buttons[2].setBounds(280, 700, 75, 50);
		buttons[3].setBounds(370, 700, 75, 50); buttons[4].setBounds(460, 700, 75, 50); buttons[5].setBounds(550, 700, 75, 50);
		buttons[6].setBounds(640, 700, 75, 50); buttons[7].setBounds(730, 700, 75, 50); buttons[8].setBounds(820, 700, 75, 50);
		buttons[9].setBounds(910, 700, 75, 50); buttons[10].setBounds(1000, 700, 75, 50);  buttons[11].setBounds(440, 770, 110, 50);
		buttons[12].setBounds(560, 770, 110, 50);
		
		for(int i=0; i<buttons.length;i++) {
			this.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		jlb=new JLabel("");
		jlb.setBounds(100, 100, 975, 500);
		this.add(jlb);
		
		jlb.setBackground(Color.white);
		jlb.setOpaque(true);
		jlb.setBorder(border);
		
		g=new görev(jlb);
		t1=new Thread(g);
		t2=new Thread(g);


		
		this.setBounds(360, 90, 1200, 900);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args)  {
		Renkler obj=new Renkler();
	}

	@Override
	public void actionPerformed(ActionEvent e)  {
		String komut=e.getActionCommand();
		if(komut.equals("red")) {
			jlb.setBackground(Color.red);
			
			try {
				File red =new File("red--_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(red);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
				
}
		else if(komut.equals("blue")) {
			jlb.setBackground(Color.blue);
			
			try {
				File blue =new File("blue-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(blue);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("yellow")) {
			jlb.setBackground(Color.yellow);
			
			try {
				File yellow =new File("yellow--_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(yellow);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("green")) {
			jlb.setBackground(Color.green);
			
			try {
				File green =new File("green-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(green);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("cyan")) {
			jlb.setBackground(Color.cyan);
			
			try {
				File cyan =new File("cyan-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(cyan);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("orange")) {
			jlb.setBackground(Color.orange);
			
			try {
				File orange =new File("orange-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(orange);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("white")) {
			jlb.setBackground(Color.white);
			
			try {
				File white =new File("white--_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(white);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("black")) {
			jlb.setBackground(Color.black);
			
			try {
				File black =new File("black-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(black);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("gray")) {
			jlb.setBackground(Color.gray);
			
			try {
				File gray =new File("gray-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(gray);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("pink")) {
			jlb.setBackground(Color.pink);
			
			try {
				File pink =new File("pink-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(pink);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("magenta")) {
			jlb.setBackground(Color.magenta);
			
			try {
				File magenta =new File("magenta-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(magenta);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("random")) {
			t1.start();
			g.devam=!g.devam;
			
			try {
				File random =new File("random-_gb_1.wav");
				AudioInputStream Ais= AudioSystem.getAudioInputStream(random);
				Clip clip1 = AudioSystem.getClip();
				clip1.open(Ais);
				clip1.start();

			} catch (LineUnavailableException  | UnsupportedAudioFileException | IOException e1) {}
}
		else if(komut.equals("random iptal")) {
			t1.stop();
			g.devam=!g.devam;
			t2.start();
		}
		

	}

}
