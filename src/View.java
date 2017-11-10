import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class View {

	private JFrame frame;
	private JTextField ip1;
	private JTextField ip2;
	private JLabel dot1;
	private JTextField ip3;
	private JLabel dot2;
	private JTextField ip4;
	private JLabel SH_text;
	private JTextField sh;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	
	public View() {
		initialize();
	}
	
	public void run(){
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIp = new JLabel("IP: ");
		lblIp.setBounds(35, 28, 46, 14);
		frame.getContentPane().add(lblIp);
		
		ip1 = new JTextField();
		ip1.setBounds(91, 25, 53, 20);
		frame.getContentPane().add(ip1);
		ip1.setColumns(10);
		
		JLabel label = new JLabel(".");
		label.setBounds(154, 28, 11, 14);
		frame.getContentPane().add(label);
		
		ip2 = new JTextField();
		ip2.setColumns(10);
		ip2.setBounds(164, 25, 53, 20);
		frame.getContentPane().add(ip2);
		
		dot1 = new JLabel(".");
		dot1.setBounds(224, 28, 11, 14);
		frame.getContentPane().add(dot1);
		
		ip3 = new JTextField();
		ip3.setColumns(10);
		ip3.setBounds(237, 25, 53, 20);
		frame.getContentPane().add(ip3);
		
		dot2 = new JLabel(".");
		dot2.setBounds(300, 28, 11, 14);
		frame.getContentPane().add(dot2);
		
		ip4 = new JTextField();
		ip4.setColumns(10);
		ip4.setBounds(310, 25, 53, 20);
		frame.getContentPane().add(ip4);
		
		SH_text = new JLabel("Subnet/Host: ");
		SH_text.setBounds(10, 76, 81, 14);
		frame.getContentPane().add(SH_text);
		
		sh = new JTextField();
		sh.setBounds(92, 73, 271, 20);
		frame.getContentPane().add(sh);
		sh.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 101, 427, 149);
		frame.getContentPane().add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Subnet", "Subnet ID", "1st Add", "Last Add", "Broadcast"
			}
		));
		scrollPane.setViewportView(table_2);
		
		
	}
}




