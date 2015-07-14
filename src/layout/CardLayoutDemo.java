package layout;
import java.awt.*;
import java.applet.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class CardLayoutDemo extends Applet
implements ActionListener, MouseListener {
	Checkbox Win98, WinNT, solaris,mac;
	Panel osCards;
	CardLayout cardLO;
	Button Win,Other;
	
	public void init() {
		Win= new Button("Windows");
		Other= new Button("Other");
		add(Win);
		add(Other);
		
		cardLO= new CardLayout();
		osCards= new Panel();
		osCards.setLayout(cardLO);
		
		Win98= new Checkbox("Windows 98/XP",null,true);
		WinNT= new Checkbox("Windows NT/2000");
		solaris= new Checkbox("Solaris");
		mac= new Checkbox("MacOS");
		
		Panel winPan= new Panel();
		winPan.add(Win98);
		winPan.add(WinNT);
		
		Panel otherPan= new Panel();
		otherPan.add(solaris);
		otherPan.add(mac);
		
		osCards.add(winPan,"Windows");
		osCards.add(otherPan,"Other");
		
		add(osCards);
		
		Win.addActionListener(this);
		Other.addActionListener(this);
		
		addMouseListener(this);
	}
		
		

	
	

	
	public void mousePressed(MouseEvent me) {
		cardLO.next(osCards);
		
	}
	
	public void mouseClicked(MouseEvent me) {
			
	}
	
	public void mouseEntered(MouseEvent me) {
	
	}
	public void mouseExited(MouseEvent me) {
		
		
	}
	
	
	public void mouseReleased(MouseEvent me) {
		
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==Win){
			cardLO.show(osCards, "Windows");
		}
		else{
			cardLO.show(osCards, "Other");
		}
		
		
	}

}
