package page;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExibirTela extends JDialog {
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel titulo = new JLabel("Login");
	private JLabel emailText = new JLabel("E-mail");
	private JButton emailInput = new JButton("Email");
	private JLabel messageText = new JLabel("Mensagem");
	private JButton messageInput = new JButton("Mensagem");
	
	public ExibirTela() {		
		
		setTitle("Multi Threads");
		setSize(new Dimension(500, 500));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		titulo.setPreferredSize(new Dimension(200, 25));
		jPanel.add(titulo, gridBagConstraints);
		
		emailText.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(emailText, gridBagConstraints);
		
		emailInput.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(emailInput, gridBagConstraints);
		
		messageText.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(messageText, gridBagConstraints);
		
		messageInput.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(messageInput, gridBagConstraints);
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}
}
