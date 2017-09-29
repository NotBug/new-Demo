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
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;//����JPanel����
	JTextField t1,t2;//�����ı���
	JCheckBox c1,c2;//���帴ѡ��ť
	JButton b1,b2,b3
	;//���尴ť
	JLabel j,j1,j2,j3,j4;//�����ǩ���
	@SuppressWarnings("rawtypes")
	JComboBox jb;//���������б�
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public
	SwingQQ(){
		super("QQ2011");//���ñ�����
		j=new JLabel();//��ʼ����ǩ���j
		j.setIcon(new ImageIcon("src/1.jpg"));//���ͼƬ����ǩ���j
		this.add(j,BorderLayout.NORTH);//����ǩ��ӵ�JFrame�ﲢ���÷�λΪ����
		t1=new JTextField("�������˺�",15);//�����ı���ĳ��ȣ�����������ӳ�ʼ����
		j2=new JLabel("ע���˺�");//����j2��ǩ�������
		j2.setFont(new Font("΢���ź�", Font.BOLD, 11));//����J2��������ʽ�������С
		t2=new JTextField("����������",15);//�����ı���ĳ��ȣ�����������ӳ�ʼ����
		j3=new JLabel("�һ�����");//����j3��ǩ�������
		j3.setFont(new Font("΢���ź�", Font.BOLD,11));//����J3��������ʽ�������С
		j1=new JLabel();//��ʼ����ǩ���j1
		j1.setIcon(new ImageIcon("src/2.jpg"));//���ͼƬ����ǩ���j1
		p1=new JPanel();
		p1.add(j1,BorderLayout.WEST);//����ǩ��ӵ�p1��
		p2=new JPanel();
		p2.setLayout(new GridLayout(3,1));//����P2����Ϊ���񲼾�
		String []a={"����","����","����","æµ"};//���ö������飬Ϊ�����б������
		jb=new JComboBox(a);//��������ӵ������б��������
		c1=new JCheckBox("��ס����");//��ʼ����ѡ�򲢶��帴ѡ�������
		c2=new JCheckBox("�Զ���¼");//��ʼ����ѡ�򲢶��帴ѡ�������
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
		p1.setBackground(Color.white);//���ñ�����ɫ
		p2.setBackground(Color.white);
		p3.setBackground(Color.white);
		p4.setBackground(Color.white);
		p5.setBackground(Color.white);
		jb.setBackground(Color.white);
		c1.setBackground(Color.white);
		c2.setBackground(Color.white);
		j2.setForeground(Color.BLUE);//����j2��������ɫ
		j3.setForeground(Color.blue);		

		this.add(p1);//���������P1������Ϊ��
		b1=new JButton("���˺�");//���尴ť����
		b2=new JButton("����");
		b3=new JButton("��¼");
		b3.addActionListener(this);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		j4=new JLabel("                           ");//�����·���½��������ť�ļ�϶
		p6=new JPanel();//��ʼ��p6����
		p6.add(b1);//����ťb1��ӵ�p6��
		p6.add(b2);//����ťb2��ӵ�p6��
		p8=new JPanel();//��ʼ��p8����
		p8.add(j4);//��J4��ӵ�p8��
		p8.add(b3,BorderLayout.EAST);//����ťb3��ӵ�p8�ڣ�����Ϊ��
		p7=new JPanel(new GridLayout(1,2));//����p7����Ϊ���񲼾֣���ʽΪ1��2��
		p7.add(p6,BorderLayout.WEST);//��p6��ӵ�p7������Ϊ��
		p7.add(p8,BorderLayout.EAST);//��p8��ӵ�p7������Ϊ��
		this.add(p7,BorderLayout.SOUTH);//���������P7������Ϊ��

		this.setBounds(700,400,347,270);//���ô���Ĵ�С
		this.setResizable(false);//���ô��岻�ɵ�����С
		this.setVisible(true);//���ô�����ʾ
	}
	public static void main(String[] args) {
		new SwingQQ();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int i=JOptionPane.showConfirmDialog(this,"ȷ�ϵ�½?");	
		if(i==0){
			JOptionPane.showMessageDialog(null,"����,���ǼٵĹ���");
		}else{
			JOptionPane.showMessageDialog(null,"����,���Ǹ��ҹ�");
		}
	}
}