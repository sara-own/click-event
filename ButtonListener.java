import java.applet.Applet;
import java.awt.*;
import java.awt.Button;

public class ButtonListener extends Applet 
{
    int x;
    Button b;
    MyListener li;
    public void init(){
    Button b = new Button("X++");
    MyListener li= new MyListener();
    x=0;
    b.addActionListener(li);
    add(b);
    }
    class MyListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e) {
        x++;
        repaint();  
    }}
 
    public void paint(Graphics g){
    g.drawString("X="+x,50,100);
 }
}