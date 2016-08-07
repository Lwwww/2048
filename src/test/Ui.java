package test;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ui extends JFrame {
	private JTextField time;
	private JButton confirm;
	private JButton cancel;
	private JComboBox method;
	private JComboBox showTime;
	private JTextArea showArea;
	private JLabel showResult;
	private JScrollPane JShowArea;

	public void startFrame() {
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.setTitle("�Զ��ػ�");
		this.setSize(500, 400);

		// �رհ�ť�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������һ������
		JPanel n1 = new JPanel();
		n1.setLayout(new BoxLayout(n1, BoxLayout.Y_AXIS));
		n1.add(new JLabel("������"));
		n1.add(new JLabel("ʱ�䣺"));
		// �����ڶ�������
		JPanel n2 = new JPanel();
		n2.setLayout(new BoxLayout(n2, BoxLayout.Y_AXIS));
		String[] items = { "�ػ�", "����" };
		method = new JComboBox(items);
		n2.add(method);
		String[] timeArr = { "10����", "20����", "30����" };
		showTime = new JComboBox(timeArr);
		n2.add(showTime);
		// ��������������
		JPanel n3 = new JPanel();
		n3.setLayout(new BoxLayout(n3, BoxLayout.PAGE_AXIS));
		confirm = new JButton("��ȷ��");
		cancel = new JButton("�Զ���");
		n3.add(confirm);
		n3.add(cancel);

		// ��������ˮƽ����
		JPanel outNorth = new JPanel();
		outNorth.setLayout(new BoxLayout(outNorth, BoxLayout.X_AXIS));
		outNorth.add(n1);
		outNorth.add(n2);
		outNorth.add(n3);

		// �в����
		showArea = new JTextArea(6, 12);
		JShowArea = new JScrollPane(showArea);

		// �ϲ����
		showResult = new JLabel("���");

		this.add(outNorth, "North");
		//this.add(JShowArea, "Center");
		this.add(showResult, "South");
		this.setVisible(true);
	}
	
	public void addCon(JPanel panel) {
		this.add(panel, "Center");
	}
}
