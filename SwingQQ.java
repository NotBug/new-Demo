package Swing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SwingQQ extends JFrame implements ActionListener{
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;//定义JPanel容器
	JTextField t1,t2;//定义文本框
	JCheckBox c1,c2;//定义复选按钮
	JButton b1,b2,b3
	;//定义按钮
	JLabel j,j1,j2,j3,j4;//定义标签组件
	@SuppressWarnings("rawtypes")
	JComboBox jb;//定义下拉列表
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public
	SwingQQ(){
		super("QQ2011");//设置标题名
		j=new JLabel();//初始化标签组件j
		j.setIcon(new ImageIcon("src/1.jpg"));//添加图片到标签组件j
		this.add(j,BorderLayout.NORTH);//将标签添加到JFrame里并设置方位为北方
		t1=new JTextField("请输入账号",15);//设置文本框的长度，并在其内添加初始文字
		j2=new JLabel("注册账号");//设置j2标签组件内容
		j2.setFont(new Font("微软雅黑", Font.BOLD, 11));//设置J2的字体样式和字体大小
		t2=new JTextField("请输入密码",15);//设置文本框的长度，并在其内添加初始文字
		j3=new JLabel("找回密码");//设置j3标签组件内容
		j3.setFont(new Font("微软雅黑", Font.BOLD,11));//设置J3的字体样式和字体大小
		j1=new JLabel();//初始化标签组件j1
		j1.setIcon(new ImageIcon("src/2.jpg"));//添加图片到标签组件j1
		p1=new JPanel();
		p1.add(j1,BorderLayout.WEST);//将标签添加到p1里
		p2=new JPanel();
		p2.setLayout(new GridLayout(3,1));//设置P2容器为网格布局
		String []a={"在线","离线","隐身","忙碌"};//设置定义数组，为下拉列表的内容
		jb=new JComboBox(a);//将数组添加到下拉列表的内容里
		c1=new JCheckBox("记住密码");//初始化复选框并定义复选框的内容
		c2=new JCheckBox("自动登录");//初始化复选框并定义复选框的内容
		p3=new JPanel();
		p3.add(t1);
		p3.add(j2);
		p4=new JPanel();
		p4.add(t2);
		p4.add(j3);
		p5=new JPanel();
		p5.add(jb);
		p5.add(c1);
		p5.add(c2);
		p2.add(p3);
		p2.add(p4);
		p2.add(p5);
		p1.add(p2,BorderLayout.EAST);
		p1.setBackground(Color.white);//设置背景颜色
		p2.setBackground(Color.white);
		p3.setBackground(Color.white);
		p4.setBackground(Color.white);
		p5.setBackground(Color.white);
		jb.setBackground(Color.white);
		c1.setBackground(Color.white);
		c2.setBackground(Color.white);
		j2.setForeground(Color.BLUE);//设置j2的字体颜色
		j3.setForeground(Color.blue);		

		this.add(p1);//在类中添加P1，布局为中
		b1=new JButton("多账号");//定义按钮内容
		b2=new JButton("设置");
		b3=new JButton("登录");
		b3.addActionListener(this);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		j4=new JLabel("                           ");//设置下方登陆与其他按钮的间隙
		p6=new JPanel();//初始化p6容器
		p6.add(b1);//将按钮b1添加到p6内
		p6.add(b2);//将按钮b2添加到p6内
		p8=new JPanel();//初始化p8容器
		p8.add(j4);//将J4添加到p8内
		p8.add(b3,BorderLayout.EAST);//将按钮b3添加到p8内，布局为东
		p7=new JPanel(new GridLayout(1,2));//设置p7布局为网格布局，样式为1行2列
		p7.add(p6,BorderLayout.WEST);//将p6添加到p7，布局为西
		p7.add(p8,BorderLayout.EAST);//将p8添加到p7，布局为东
		this.add(p7,BorderLayout.SOUTH);//在类中添加P7，布局为南

		this.setBounds(700,400,347,270);//设置窗体的大小
		this.setResizable(false);//设置窗体不可调整大小
		this.setVisible(true);//设置窗体显示
	}
	public static void main(String[] args) {
		new SwingQQ();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int i=JOptionPane.showConfirmDialog(this,"确认登陆?");	
		if(i==0){
			JOptionPane.showMessageDialog(null,"智障,这是假的滚蛋");
		}else{
			JOptionPane.showMessageDialog(null,"智障,还是给我滚");
		}
	}
}