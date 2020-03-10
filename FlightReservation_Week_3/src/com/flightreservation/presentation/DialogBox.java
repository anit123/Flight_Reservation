package com.flightreservation.presentation;




import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogBox extends JDialog implements ActionListener {


private static final long serialVersionUID = -3462124563198885968L;

JButton button = new JButton("Ok");
JLabel label = new JLabel();

public DialogBox(String msgTitle, String msgGiven){
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setTitle(msgTitle);
label.setText(msgGiven);
componentInit();
setSize(400,300);
button.addActionListener(this);
button.setSize(50,20);
}

private void componentInit(){
label.setBounds(new Rectangle(100,35,200,100));
button.setBounds(new Rectangle(150, 100, 40, 20));
getContentPane().add(label);
getContentPane().add(button);
getContentPane().setLayout(null);
setSize(300,200);

}

@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
dispose();
}

}

}