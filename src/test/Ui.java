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

		this.setTitle("自动关机");
		this.setSize(500, 400);

		// 关闭按钮退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 北部第一个容器
		JPanel n1 = new JPanel();
		n1.setLayout(new BoxLayout(n1, BoxLayout.Y_AXIS));
		n1.add(new JLabel("操作："));
		n1.add(new JLabel("时间："));
		// 北部第二个容器
		JPanel n2 = new JPanel();
		n2.setLayout(new BoxLayout(n2, BoxLayout.Y_AXIS));
		String[] items = { "关机", "重启" };
		method = new JComboBox(items);
		n2.add(method);
		String[] timeArr = { "10分钟", "20分钟", "30分钟" };
		showTime = new JComboBox(timeArr);
		n2.add(showTime);
		// 北部第三个容器
		JPanel n3 = new JPanel();
		n3.setLayout(new BoxLayout(n3, BoxLayout.PAGE_AXIS));
		confirm = new JButton("　确定");
		cancel = new JButton("自定义");
		n3.add(confirm);
		n3.add(cancel);

		// 北部外层的水平容器
		JPanel outNorth = new JPanel();
		outNorth.setLayout(new BoxLayout(outNorth, BoxLayout.X_AXIS));
		outNorth.add(n1);
		outNorth.add(n2);
		outNorth.add(n3);

		// 中部外层
		showArea = new JTextArea(6, 12);
		JShowArea = new JScrollPane(showArea);

		// 南部外层
		showResult = new JLabel("结果");

		this.add(outNorth, "North");
		//this.add(JShowArea, "Center");
		this.add(showResult, "South");
		this.setVisible(true);
	}
	
	public void addCon(JPanel panel) {
		this.add(panel, "Center");
	}
}
