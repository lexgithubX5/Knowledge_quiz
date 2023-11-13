package Quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Quiz implements ActionListener {
	static ArrayList<String> questions() {
		 ArrayList<String> quest= new ArrayList<>();
		 String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
		 a = "What country has the highest life expectancy?";
		 b = "Which language has the more native speakers? ";
		 c = "What is the most common surname in the United States?";
		 d = "What disease commonly spread on pirate ships?";
		 e = "Who was the Ancient Greek God of the Sun?";
		 f = "What artist has the most streams on Spotify?";
		 g = "What software company is headquartered in Redmond, Washington?";
		 h = "What is a group of crows called? ";
		 i = "Compared to their body weight, what animal is the strongest?";
		 j = "Where is the strongest human muscle located?";
		 k = "What planet is closest to the sun? ";
		 l = "How many hearts does an octopus have?";
		 m = "What is the only continent with land in all four hemispheres? ";
		 n = "Which river flows through the Grand Canyon?";
		 o = "What is the capital of Ireland? ";
		 p = "What is the tallest type of tree?";
		 
		 quest.add(a);
		 quest.add(b);
		 quest.add(c);
		 quest.add(d);
		 quest.add(e);
		 quest.add(f);
		 quest.add(g);
		 quest.add(h);
		 quest.add(i);
		 quest.add(j);
		 quest.add(k);
		 quest.add(l);
		 quest.add(m);
		 quest.add(n);
		 quest.add(o);
		 quest.add(p);

		return quest;
	     }
	static ArrayList<String> answers(){
		ArrayList<String> answers =  new ArrayList<>();
		 String aa,ab,ac,ad,ae,af,ag,ah,ai,aj,ak,al,am,an,ao,ap;
		 aa = "Hong Kong";
		 ab = "English";
		 ac = "Smith";
		 ad = "Scurvy";
		 ae = "Apollo";
		 af = "Drake";
		 ag = "Microsoft";
		 ah = "Murder";
		 ai = "Dung Beetle";
		 aj = "Tongue";
		 ak = "Mercury";
		 al = "Three";
		 am = "Africa";
		 an = "Colorado River";
		 ao = "Dublin";
		 ap = "Redwood";
		 
// Adding answers to the 'answers' ArrayList
		 answers.add(aa);
		 answers.add(ab);
		 answers.add(ac);
		 answers.add(ad);
		 answers.add(ae);
		 answers.add(af);
		 answers.add(ag);
		 answers.add(ah);
		 answers.add(ai);
		 answers.add(aj);
		 answers.add(ak);
		 answers.add(al);
		 answers.add(am);
		 answers.add(an);
		 answers.add(ao);
		 answers.add(ap);

		return answers;	
	
}
	public static void main(String[] args) {
		Quiz quiz = new Quiz();
		
	}
	Quiz(){
		 proccessor();
	}
	
	String ans;
	public void proccessor() {
		int i = random.nextInt(questions().size());
		String randomQuestion = questions().get(i);
		String rightAnswer =answers().get(i);
		this.ans = rightAnswer;
		qus.setText(randomQuestion);
		String[] randOpts = {"Elvis Presley", "Nile", "Amazon", "Mississippi", "Yangtze", "Danube", "The Weeknd", "Beyoncé", "Leonardo DiCaprio", "Meryl Streep", "Paris", "Asia", "North America","United States", "Canada", "United Kingdom", "Australia", "Germany", "France",
	            "Brazil", "Japan", "China", "India", "Russia", "South Africa", "Mexico", "Argentina", "South America", "Europe", "New York", "Tokyo", "London", "Sydney","Charlie Chaplin", "Alice", "Bob","Charlie", "David", "Eve"};
		if(randOpt==0) {
			optA = rightAnswer;
			optB = randOpts[random.nextInt(randOpts.length)];
			optC =randOpts[random.nextInt(randOpts.length)];
			optD =randOpts[random.nextInt(randOpts.length)];
		}
		else if(randOpt==1) {
			optB = rightAnswer;
			optA = randOpts[random.nextInt(randOpts.length)];
			optC =randOpts[random.nextInt(randOpts.length)];
			optD =randOpts[random.nextInt(randOpts.length)];
		}
		else if(randOpt==2) {
			optC = rightAnswer;
			optA = randOpts[random.nextInt(randOpts.length)];
			optB = randOpts[random.nextInt(randOpts.length)];
			optD =randOpts[random.nextInt(randOpts.length)];
		}
		else if(randOpt==3) {
			optD = rightAnswer;
			optA = randOpts[random.nextInt(randOpts.length)];
			optB = randOpts[random.nextInt(randOpts.length)];
			optC = randOpts[random.nextInt(randOpts.length)];
			
		}
		a = new JButton(optA); b = new JButton(optB); c = new JButton(optC); d = new JButton(optD);
		frame();
	}
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();//This is the heading Label
	JTextField field = new JTextField();// This is the answer field
	JTextField qus = new JTextField();// This is the question field
	JButton a,b,c,d;
	JButton next;
	String optA ="", optB="", optC="", optD="";
	String [] list = {optA, optB, optC, optD};
	Random random = new Random();
	int randOpt = random.nextInt(list.length);
	public void frame(){
		//header
		label.setBounds(0, 0, 625, 40);
		label.setOpaque(true);
		label.setBackground(new Color(201, 187, 185));
		label.setFont(new Font("Calbiri",Font.ITALIC, 25));
		label.setText("Quiz App! Test your Knowledge Skillz!");
		
		//Buttons
		a.setBounds(5, 200, 600, 40);
		a.setFocusable(false);
		a.setBackground(Color.cyan);
		a.setHorizontalAlignment(SwingConstants.LEFT);
		a.addActionListener(this);
		b.setBounds(5, 250, 600, 40);
		b.setBackground(Color.cyan);
		b.setFocusable(false);
		b.setHorizontalAlignment(SwingConstants.LEFT);
		b.addActionListener(this);
		c.setBounds(5, 300, 600, 40);
		c.setFocusable(false);
		c.setBackground(Color.cyan);
		c.setHorizontalAlignment(SwingConstants.LEFT);
		c.addActionListener(this);
		d.setBounds(5, 350, 600, 40);
		d.setFocusable(false);
		d.setHorizontalAlignment(SwingConstants.LEFT);
		d.setBackground(Color.cyan);
		d.addActionListener(this);
		next = new JButton("Next");
		
		next.setBounds(180, 400, 200, 40);
		next.setFocusable(false);
		next.setHorizontalAlignment(SwingConstants.LEFT);
		
		next.addActionListener(this);
		
		
		
		//Question Field
		qus.setBounds(5, 44, 610, 150);
		qus.setOpaque(true);
		qus.setBackground(new Color(212, 249, 255));
		qus.setFont(new Font("Monospace",Font.BOLD, 20));
		qus.setEditable(false);
		
		//Frame
		frame.add(field);
		frame.add(a); frame.add(b); frame.add(c); frame.add(d);
		frame.add(label);
		frame.add(qus);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBounds(5,5,630,500);
		frame.setResizable(false);
		frame.add(next);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == a) {
		    if (a.getText().equals(ans)){
		        a.setBackground(Color.green);
		        a.setEnabled(false);b.setEnabled(false);c.setEnabled(false); d.setEnabled(false);
		    
		      
		    } else {
		        a.setBackground(Color.red);
		        JOptionPane.showMessageDialog(null, "Fail!" );
		        frame.dispose();
		        
		    }
		}

		if (e.getSource() == b) {
		    if (b.getText().equals(ans)) {
		        b.setBackground(Color.green);
		        a.setEnabled(false);b.setEnabled(false);c.setEnabled(false); d.setEnabled(false);
		       
		       
		    } else {
		        b.setBackground(Color.red);
		        JOptionPane.showMessageDialog(null, "Fail!");
		        frame.dispose();
		    }
		}

		if (e.getSource() == c) {
		    if (c.getText().equals(ans)) {
		        c.setBackground(Color.green);
		        a.setEnabled(false);b.setEnabled(false);c.setEnabled(false); d.setEnabled(false);
		     
		    } else {
		        c.setBackground(Color.red);
		        JOptionPane.showMessageDialog(null, "Fail!");
		        frame.dispose();
		    }
		}

		if (e.getSource() == d) {
		    if (d.getText().equals(ans)) {
		        d.setBackground(Color.green);
		        a.setEnabled(false);b.setEnabled(false);c.setEnabled(false); d.setEnabled(false);
		     
		    } else {
		        d.setBackground(Color.red);
		        JOptionPane.showMessageDialog(null, "Fail!");
		        frame.dispose();
		    }
		}
		if(e.getSource()==next) {
//	        score++;
			frame.dispose();
			a.setEnabled(true);b.setEnabled(true);c.setEnabled(true); d.setEnabled(true);
			Quiz q = new Quiz();
		
		}
		
	}
}



