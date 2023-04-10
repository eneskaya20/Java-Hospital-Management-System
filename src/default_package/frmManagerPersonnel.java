package default_package;


import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

class frmManagerPersonnel extends javax.swing.JFrame {
	DefaultListModel model;
	static frmMain frmMain;
	private int index;

	public frmManagerPersonnel(frmMain frmMain) {
		initComponents();
		model = new DefaultListModel();
		this.frmMain = frmMain;
		getContentPane().setBackground(frmMain.getContentPane().getBackground());
		getContentPane().setForeground(frmMain.getContentPane().getForeground());
		pnlAdd.setOpaque(false);
		pnlChange.setOpaque(false);
		lblStartDate.setOpaque(false);
		jPanel1.setOpaque(false);
		lstPersonnel.setModel(model);
		frmMain.PersonnelManager.sortID();
		for (int i = 0; i < frmMain.PersonnelManager.getSize(); i++) {
			model.addElement(frmMain.PersonnelManager.Personnels[i].getName() + " "
					+ frmMain.PersonnelManager.Personnels[i].getSurname());
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		btnBackMenu = new javax.swing.JButton();
		pnlAdd = new javax.swing.JPanel();
		fieldName = new javax.swing.JTextField();
		lblName = new javax.swing.JLabel();
		lblSurname = new javax.swing.JLabel();
		fieldSurname = new javax.swing.JTextField();
		lblSalary = new javax.swing.JLabel();
		fieldSalary = new javax.swing.JTextField();
		btnAddDoctor = new javax.swing.JButton();
		btnAddNurse = new javax.swing.JButton();
		btnAddIntern = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		pnlChange = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		lstPersonnel = new javax.swing.JList<>();
		jLabel2 = new javax.swing.JLabel();
		btnRemove = new javax.swing.JButton();
		lblName2 = new javax.swing.JLabel();
		txtName2 = new javax.swing.JTextField();
		lblSurname2 = new javax.swing.JLabel();
		txtSurname2 = new javax.swing.JTextField();
		lblSalary2 = new javax.swing.JLabel();
		txtSalary2 = new javax.swing.JTextField();
		lblPosition = new javax.swing.JLabel();
		txtPosition2 = new javax.swing.JTextField();
		btnChangePersonnel = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		lblStartDate = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setForeground(java.awt.Color.white);

		btnBackMenu.setText("Back Main Menu");
		btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBackMenuActionPerformed(evt);
			}
		});

		lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblName.setText("Name :");

		lblSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblSurname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblSurname.setText("Surname : ");

		lblSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblSalary.setText("Salary :");

		btnAddDoctor.setText("Doctor Add");
		btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddMDoctorActionPerformed(evt);
			}
		});

		btnAddNurse.setText("Nurse Add");
		btnAddNurse.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddNurseActionPerformed(evt);
			}
		});

		btnAddIntern.setText("Intern Add");
		btnAddIntern.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddInternActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Add an Personnel");

		javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
		pnlAdd.setLayout(pnlAddLayout);
		pnlAddLayout.setHorizontalGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlAddLayout.createSequentialGroup().addContainerGap()
						.addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlAddLayout.createSequentialGroup()
										.addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlAddLayout.createSequentialGroup()
										.addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(fieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlAddLayout.createSequentialGroup()
										.addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(fieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(pnlAddLayout.createSequentialGroup().addComponent(btnAddDoctor)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(btnAddNurse)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(btnAddIntern)))
						.addContainerGap(38, Short.MAX_VALUE))
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		pnlAddLayout.setVerticalGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlAddLayout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(46, 46, 46)
						.addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(fieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(fieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(66, 66, 66)
						.addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnAddIntern).addComponent(btnAddNurse).addComponent(btnAddDoctor))
						.addGap(26, 26, 26)));

		pnlChange.setToolTipText("");
		pnlChange.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				pnlChangeMouseMoved(evt);
			}
		});

		lstPersonnel.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		lstPersonnel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lstPersonnelMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(lstPersonnel);

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Personnel List");

		btnRemove.setText("Remove Personnel");
		btnRemove.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRemoveActionPerformed(evt);
			}
		});

		lblName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblName2.setText("Name :");

		txtName2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtName2ActionPerformed(evt);
			}
		});

		lblSurname2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblSurname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblSurname2.setText("Surname :");

		lblSalary2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblSalary2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblSalary2.setText("Salary :");

		lblPosition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblPosition.setText("Position :");

		txtPosition2.setOpaque(false);

		btnChangePersonnel.setText("Change Personnel");
		btnChangePersonnel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnChangePersonnelActionPerformed(evt);
			}
		});

		jPanel1.setOpaque(false);

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Start Date :");
		jLabel3.setOpaque(true);

		lblStartDate.setBackground(new java.awt.Color(255, 255, 255));
		lblStartDate.setOpaque(true);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 215,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
								.addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		javax.swing.GroupLayout pnlChangeLayout = new javax.swing.GroupLayout(pnlChange);
		pnlChange.setLayout(pnlChangeLayout);
		pnlChangeLayout.setHorizontalGroup(pnlChangeLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlChangeLayout.createSequentialGroup().addGroup(pnlChangeLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlChangeLayout.createSequentialGroup().addGap(39, 39, 39).addComponent(jLabel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(pnlChangeLayout.createSequentialGroup().addContainerGap()
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(pnlChangeLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(pnlChangeLayout.createSequentialGroup().addGroup(pnlChangeLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(pnlChangeLayout.createSequentialGroup().addGap(13, 13, 13)
														.addGroup(pnlChangeLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(lblSurname2,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 101,
																		Short.MAX_VALUE)
																.addComponent(lblSalary2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)))
												.addGroup(pnlChangeLayout.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE,
																98, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(pnlChangeLayout.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(lblPosition,
																javax.swing.GroupLayout.PREFERRED_SIZE, 101,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGap(10, 10, 10)
												.addGroup(pnlChangeLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtSurname2).addComponent(txtName2)
														.addComponent(txtSalary2, javax.swing.GroupLayout.DEFAULT_SIZE,
																215, Short.MAX_VALUE)
														.addComponent(txtPosition2,
																javax.swing.GroupLayout.DEFAULT_SIZE, 215,
																Short.MAX_VALUE)))
										.addGroup(pnlChangeLayout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlChangeLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(pnlChangeLayout.createSequentialGroup()
																.addComponent(btnRemove,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 140,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		62, Short.MAX_VALUE)
																.addComponent(btnChangePersonnel,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 140,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pnlChangeLayout.setVerticalGroup(pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlChangeLayout.createSequentialGroup().addContainerGap().addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
						.addGroup(pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(pnlChangeLayout.createSequentialGroup()
										.addGroup(pnlChangeLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(txtName2, javax.swing.GroupLayout.DEFAULT_SIZE, 33,
														Short.MAX_VALUE)
												.addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(23, 23, 23)
										.addGroup(pnlChangeLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(txtSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(23, 23, 23)
										.addGroup(pnlChangeLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(txtSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(23, 23, 23)
										.addGroup(pnlChangeLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(txtPosition2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnRemove).addComponent(btnChangePersonnel))
						.addGap(54, 54, 54)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(btnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pnlChange, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(22, 22, 22)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(
						btnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(24, 24, 24)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlChange, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(53, Short.MAX_VALUE)));

		pnlChange.getAccessibleContext().setAccessibleName("");

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackMenuActionPerformed

		frmMain.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_btnBackMenuActionPerformed

	private void btnAddMDoctorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddMDoctorActionPerformed
		int salary = Integer.parseInt(fieldSalary.getText());
		if (salary < 7000) {
			JOptionPane.showMessageDialog(this,
					"Doctor Personnel  can not have little than 7000,so It was set as 7000");
		}
		frmMain.PersonnelManager.AddDoctorPersonnel(fieldName.getText(), fieldSurname.getText(), salary);
		model.addElement(frmMain.PersonnelManager.Personnels[frmMain.PersonnelManager.getSize() - 1].getName() + " "
				+ frmMain.PersonnelManager.Personnels[frmMain.PersonnelManager.getSize() - 1].getSurname());
		fieldName.setText(" ");
		fieldSurname.setText(" ");
		fieldSalary.setText(" ");

	}// GEN-LAST:event_btnAddMDoctorActionPerformed

	private void btnAddNurseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddNurseActionPerformed
		int salary = Integer.parseInt(fieldSalary.getText());
		if (salary > 7000 || salary < 3000) {
			JOptionPane.showMessageDialog(this,
					"Nurse Personnel can not have little than 3000 or more than 7000 ,so It was set as default");
		}
		frmMain.PersonnelManager.AddNursePersonnel(fieldName.getText(), fieldSurname.getText(), salary);
		model.addElement(frmMain.PersonnelManager.Personnels[frmMain.PersonnelManager.getSize() - 1].getName() + " "
				+ frmMain.PersonnelManager.Personnels[frmMain.PersonnelManager.getSize() - 1].getSurname());
		fieldName.setText(" ");
		fieldSurname.setText(" ");
		fieldSalary.setText(" ");
	}// GEN-LAST:event_btnAddNurseActionPerformed

	private void btnAddInternActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddInternActionPerformed
		int salary = Integer.parseInt(fieldSalary.getText());
		if (salary > 3000) {
			JOptionPane.showMessageDialog(this,
					"Part Time Personnel can not have more than 3000,so It was set as 3000");
		}
		frmMain.PersonnelManager.AddInternPersonnel(fieldName.getText(), fieldSurname.getText(), salary);
		model.addElement(frmMain.PersonnelManager.Personnels[frmMain.PersonnelManager.getSize() - 1].getName() + " "
				+ frmMain.PersonnelManager.Personnels[frmMain.PersonnelManager.getSize() - 1].getSurname());
		fieldName.setText(" ");
		fieldSurname.setText(" ");
		fieldSalary.setText(" ");
	}// GEN-LAST:event_btnAddInternActionPerformed

	private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRemoveActionPerformed
		System.out.println(lstPersonnel.getSelectedIndex());
		frmMain.PersonnelManager.Remove(lstPersonnel.getSelectedIndex() + 1);
		model.removeElementAt(lstPersonnel.getSelectedIndex());
		JOptionPane.showMessageDialog(this, "REMOVED");

	}// GEN-LAST:event_btnRemoveActionPerformed

	private void txtName2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtName2ActionPerformed

	}// GEN-LAST:event_txtName2ActionPerformed

	private void pnlChangeMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pnlChangeMouseMoved
		// TODO add your handling code here
	}// GEN-LAST:event_pnlChangeMouseMoved

	private void lstPersonnelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lstPersonnelMouseClicked
		// TODO add your handling code here:

		index = lstPersonnel.getSelectedIndex();
		setTexts(index);

	}// GEN-LAST:event_lstPersonnelMouseClicked

	private void setTexts(int index) {

		int salary = frmMain.PersonnelManager.Personnels[index].getSalary();
		txtName2.setText(frmMain.PersonnelManager.Personnels[index].getName());
		txtSurname2.setText(frmMain.PersonnelManager.Personnels[index].getSurname());
		txtSalary2.setText(Integer.toString(salary));
		txtPosition2.setText(frmMain.PersonnelManager.Personnels[index].getPosition());
		lblStartDate.setText(frmMain.PersonnelManager.Personnels[index].getStartDate());
	}

	private void btnChangePersonnelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangePersonnelActionPerformed
		try {
			// TODO add your handling code here:

			int salary = Integer.parseInt(txtSalary2.getText());
			frmMain.PersonnelManager.Personnels[index].setName(txtName2.getText());
			frmMain.PersonnelManager.Personnels[index].setSurname(txtSurname2.getText());
			frmMain.PersonnelManager.Personnels[index].setSalary(salary);
			switch (txtPosition2.getText()) {
			case "Doctor":
				frmMain.PersonnelManager.changePosition(frmMain.PersonnelManager.Personnels[index], "Manager");
				model.removeElementAt(index);
				model.add(frmMain.PersonnelManager.Personnels[index].getId() - 1,
						frmMain.PersonnelManager.Personnels[index].getName() + " "
								+ frmMain.PersonnelManager.Personnels[index].getSurname());
				setTexts(index);
				break;
			case "Nurse":
				frmMain.PersonnelManager.changePosition(frmMain.PersonnelManager.Personnels[index], "Nurse");
				model.removeElementAt(index);
				model.add(frmMain.PersonnelManager.Personnels[index].getId() - 1,
						frmMain.PersonnelManager.Personnels[index].getName() + " "
								+ frmMain.PersonnelManager.Personnels[index].getSurname());
				setTexts(index);
				break;
			case "Intern":
				frmMain.PersonnelManager.changePosition(frmMain.PersonnelManager.Personnels[index], "Intern");
				model.removeElementAt(index);
				model.add(frmMain.PersonnelManager.Personnels[index].getId() - 1,
						frmMain.PersonnelManager.Personnels[index].getName() + " "
								+ frmMain.PersonnelManager.Personnels[index].getSurname());
				setTexts(index);
				break;
			default:
				JOptionPane.showMessageDialog(this, "Undefined Position,You can choose only Manager Nurse Intern");
				break;

			}

		} catch (ParseException ex) {
			Logger.getLogger(frmManagerPersonnel.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(this, "HATA!!!");
		}

	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(frmManagerPersonnel.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(frmManagerPersonnel.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(frmManagerPersonnel.class.getName()).log(Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(frmManagerPersonnel.class.getName()).log(Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmManagerPersonnel(frmMain).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAddDoctor;
	private javax.swing.JButton btnAddIntern;
	private javax.swing.JButton btnAddNurse;
	private javax.swing.JButton btnBackMenu;
	private javax.swing.JButton btnChangePersonnel;
	private javax.swing.JButton btnRemove;
	private javax.swing.JTextField fieldName;
	private javax.swing.JTextField fieldSalary;
	private javax.swing.JTextField fieldSurname;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lblName;
	private javax.swing.JLabel lblName2;
	private javax.swing.JLabel lblPosition;
	private javax.swing.JLabel lblSalary;
	private javax.swing.JLabel lblSalary2;
	private javax.swing.JLabel lblStartDate;
	private javax.swing.JLabel lblSurname;
	private javax.swing.JLabel lblSurname2;
	private javax.swing.JList<String> lstPersonnel;
	private javax.swing.JPanel pnlAdd;
	private javax.swing.JPanel pnlChange;
	private javax.swing.JTextField txtName2;
	private javax.swing.JTextField txtPosition2;
	private javax.swing.JTextField txtSalary2;
	private javax.swing.JTextField txtSurname2;
	// End of variables declaration//GEN-END:variables
}