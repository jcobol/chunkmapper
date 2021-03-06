package com.chunkmapper.gui.dialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URI;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.chunkmapper.admin.MyLogger;
import com.chunkmapper.security.MySecurityManager;
import com.chunkmapper.security.MySecurityManager.Status;
import java.awt.Dialog.ModalityType;

public class AccountDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton okButton, cancelButton;
	public boolean ok;
	JLabel lblToCreateA, lblChecking;
	private JLabel lblNewLabel;
	private JButton btnResetButton;
	private JButton sslButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AccountDialog dialog = new AccountDialog(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void openWebpage(String s, String alternative) {
		MyLogger.LOGGER.info("opening webpage " + s);
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				desktop.browse(new URI(s));
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(this, alternative);
	}
	private void verifyAccount() {
		Status s = MySecurityManager.getStatus(textField.getText(), new String(passwordField.getPassword()));
		if (s == null) {
			lblToCreateA.setText("<html>Chunkmapper could not connect online.  Please check your connection</html>");
			lblToCreateA.setForeground(Color.RED);
			return;
		}
		btnResetButton.setVisible(false);
		sslButton.setVisible(false);
		switch(s) {
		case OK:
			ok = true;
			dispose();
			return;
		case HACKED:
			lblToCreateA.setText("<html>Your account has been disabled because of suspicious activity.  Please email support@chunkmapper.com</html>");
			lblToCreateA.setForeground(Color.RED);
			return;
		case UNPAID:
			lblToCreateA.setText("<html>Your account has not been activated.  Please complete payment or email support@chunkmapper.com</html>");
			lblToCreateA.setForeground(Color.RED);
			return;
		case INVALID_PW:
			lblToCreateA.setText("<html>Email or password invalid.</html>");
			lblToCreateA.setForeground(Color.RED);
			btnResetButton.setVisible(true);
			return;
		case SSL_EXCEPTION:
			lblToCreateA.setText("SSL Exception");
			lblToCreateA.setForeground(Color.RED);
			sslButton.setVisible(true);
		}
	}


	/**
	 * Create the dialog.
	 */
	public AccountDialog(JFrame f) {
		super(f);
		MyLogger.LOGGER.info("opening Account Dialog");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);

		setResizable(false);
		setTitle("Verify Account");
		setBounds(100, 100, 450, 256);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		lblToCreateA = new JLabel("Chunkmapper account required");
//		lblToCreateA.setText("<html>Your account has not been activated.  Please complete payment or email support@chunkmapper.com</html>");
//		lblToCreateA.setForeground(Color.RED);
		
		JLabel lblEmail = new JLabel("Email");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");

		passwordField = new JPasswordField();

		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("https://secure.chunkmapper.com/forward-to-account",
						"Please visit www.chunkmapper.com to create an account."
						);
			}
		});

		lblNewLabel = new JLabel("Enter your details");
		
		btnResetButton = new JButton("Reset Password");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("https://secure.chunkmapper.com/forgot-password?email=" + textField.getText(),
						"Please visit www.chunkmapper.com to reset your password."
						);
			}
		});
		btnResetButton.setVisible(false);
		
		sslButton = new JButton("<HTML><U>How to fix...</U></HTML>");
		sslButton.setVisible(false);
		sslButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("http://www.chunkmapper.com/troubleshooting.html",
						"Please visit www.chunkmapper.com/troubleshooting.");
			}
		});
		sslButton.setForeground(Color.BLUE);
		sslButton.setBorderPainted(false);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField, 134, 134, 134))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblEmail)
							.addGap(112)
							.addComponent(lblPassword))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnCreateAccount)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnResetButton))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblToCreateA)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sslButton))
						.addComponent(lblNewLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblToCreateA, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(sslButton))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(lblPassword))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCreateAccount)
						.addComponent(btnResetButton))
					.addGap(66))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okButton.setEnabled(false);
						cancelButton.setEnabled(false);
						lblChecking.setVisible(true);
						Thread t = new Thread(new Runnable() {
							public void run() {
								verifyAccount();
								okButton.setEnabled(true);
								cancelButton.setEnabled(true);
								lblChecking.setVisible(false);
							}});
						t.start();
					}						
				});

				lblChecking = new JLabel("Checking...");
				lblChecking.setVisible(false);
				buttonPane.add(lblChecking);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
						dispose();
					}
				}
			});
			passwordField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
						dispose();
					}
				}
			});
		}
	}
}
