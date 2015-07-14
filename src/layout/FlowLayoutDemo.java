package layout;
import java.awt.*;
//import java.awt.Event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.applet.*;


public class FlowLayoutDemo extends Applet implements ItemListener {
	String msg="";
	Checkbox Win98,WinNT,solaris,mac;
	public void init(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		Win98=new Checkbox("Windows 98/XP",null,true);
		WinNT=new Checkbox("Windows NT/2000");
		solaris=new Checkbox("Solaris");
		mac=new Checkbox("MacOS");
		add(Win98);
		add(WinNT);
		add(solaris);
		add(mac);
		
		Win98.addItemListener(this);
		WinNT.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
		
	}

	
	public void itemStateChanged(ItemEvent ie) {
		repaint();
		
	}
	public void paint(Graphics g){
		msg="Current state";
		g.drawString(msg, 6, 80);
		msg="Windows 98/XP:"+ Win98.getState();
		g.drawString(msg,6,100);
		msg="Windows NT/2000:"+WinNT.getState();
		g.drawString(msg, 6, 120);
		msg="Solaris:"+ solaris.getState();
		g.drawString(msg, 6, 140);
		msg="Mac:"+mac.getState();
		g.drawString(msg, 6, 160);
		
	}

}
