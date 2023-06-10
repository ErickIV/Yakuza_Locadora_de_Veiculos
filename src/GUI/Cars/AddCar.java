/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Cars;

import GUI.Cancel.Cancel;
import GUI.Customers.DisplayCustomer;
import GUI.RentingCar.RentingInformation;
import classes.ComfortCar;
import classes.EconomicCar;
import classes.LuxuryCar;
import classes.SystemClass;
import server.ServiceInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.awt.Color;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Erick
 * @author Rafael
 */
public class AddCar extends javax.swing.JFrame {

    /**
     * Creates new form AddCar
     */
    public AddCar() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonRentCar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonCustomers = new javax.swing.JButton();
        jButtonCars = new javax.swing.JButton();
        jPanelImportant = new javax.swing.JPanel();
        jLabelImportant = new javax.swing.JLabel();
        jLabelNewCar = new javax.swing.JLabel();
        jPanelNewCar = new javax.swing.JPanel();
        jLabelBrand = new javax.swing.JLabel();
        jTextFieldBrand = new javax.swing.JTextField();
        jLabelModel = new javax.swing.JLabel();
        jTextFieldModel = new javax.swing.JTextField();
        jLabelFuelType = new javax.swing.JLabel();
        jTextFieldFuelType = new javax.swing.JTextField();
        jLabelGearType = new javax.swing.JLabel();
        jLabelCarType = new javax.swing.JLabel();
        jComboBoxCarType = new javax.swing.JComboBox<>();
        jLabelModelYear = new javax.swing.JLabel();
        jTextFieldModelYear = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelTL = new javax.swing.JLabel();
        jButtonAddCar = new javax.swing.JButton();
        jRadioButtonAuto = new javax.swing.JRadioButton();
        jRadioButtonManuel = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRentCar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonRentCar.setText("Alugar um carro");
        jButtonRentCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jButtonRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentCarActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCancel.setText("Cancelar a reserva");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCustomers.setText("Clientes");
        jButtonCustomers.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomersActionPerformed(evt);
            }
        });

        jButtonCars.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCars.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCars.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCars.setText("Veículos");
        jButtonCars.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarsActionPerformed(evt);
            }
        });

        jPanelImportant.setBackground(new java.awt.Color(0, 0, 0));

        jLabelImportant.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jLabelImportant.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImportant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImportant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/alert.png"))); // NOI18N
        jLabelImportant.setText(" Dirijam com cuidado e preservem o veículo para uma viagem segura e confortável.");

        javax.swing.GroupLayout jPanelImportantLayout = new javax.swing.GroupLayout(jPanelImportant);
        jPanelImportant.setLayout(jPanelImportantLayout);
        jPanelImportantLayout.setHorizontalGroup(
            jPanelImportantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImportant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelImportantLayout.setVerticalGroup(
            jPanelImportantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImportant, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jLabelNewCar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabelNewCar.setText("Adicionar novo veículo");

        jPanelNewCar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNewCar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelBrand.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabelBrand.setText("Marca");

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        jTextFieldBrand.setBorder(BorderFactory.createCompoundBorder(border,
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelModel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelModel.setText("Modelo");

    jTextFieldModel.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelFuelType.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelFuelType.setText("Tipo de combustível");

jTextFieldFuelType.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelGearType.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelGearType.setText("Tipo de câmbio");

    jLabelCarType.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelCarType.setText("Tipo de Veículo");

    jComboBoxCarType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economic", "Comfort", "Luxury" }));
    jComboBoxCarType.setSelectedIndex(-1);

    jLabelModelYear.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelModelYear.setText("Ano do modelo");

    jTextFieldModelYear.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelPrice.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelPrice.setText("Valor");

jTextFieldPrice.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelTL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelTL.setText("R$/dia");
    jLabelTL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jButtonAddCar.setBackground(new java.awt.Color(0, 0, 0));
    jButtonAddCar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
    jButtonAddCar.setForeground(new java.awt.Color(255, 255, 255));
    jButtonAddCar.setText("Adicionar Veículo");
    jButtonAddCar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddCarActionPerformed(evt);
        }
    });

    jRadioButtonAuto.setBackground(new java.awt.Color(255, 255, 255));
    jRadioButtonAuto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jRadioButtonAuto.setText("Automático");
    jRadioButtonAuto.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonAutoActionPerformed(evt);
        }
    });

    jRadioButtonManuel.setBackground(new java.awt.Color(255, 255, 255));
    jRadioButtonManuel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jRadioButtonManuel.setText("Manual");
    jRadioButtonManuel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonManuelActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelNewCarLayout = new javax.swing.GroupLayout(jPanelNewCar);
    jPanelNewCar.setLayout(jPanelNewCarLayout);
    jPanelNewCarLayout.setHorizontalGroup(
        jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelNewCarLayout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelModel)
                    .addComponent(jTextFieldModel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabelGearType)
                    .addGroup(jPanelNewCarLayout.createSequentialGroup()
                        .addComponent(jRadioButtonAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonManuel))
                    .addComponent(jLabelCarType)
                    .addComponent(jComboBoxCarType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelNewCarLayout.createSequentialGroup()
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelTL))
                .addComponent(jLabelPrice))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
            .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelModelYear)
                        .addComponent(jTextFieldModelYear, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelBrand, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldBrand, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelFuelType, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldFuelType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
            .addGap(36, 36, 36))
    );
    jPanelNewCarLayout.setVerticalGroup(
        jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelNewCarLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelBrand)
                .addComponent(jLabelCarType))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNewCarLayout.createSequentialGroup()
                    .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNewCarLayout.createSequentialGroup()
                            .addComponent(jLabelModel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelNewCarLayout.createSequentialGroup()
                            .addComponent(jLabelFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jComboBoxCarType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelNewCarLayout.createSequentialGroup()
                    .addComponent(jLabelGearType)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButtonManuel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelNewCarLayout.createSequentialGroup()
                    .addComponent(jLabelModelYear)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldModelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jLabelPrice)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelNewCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelTL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(30, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelImportant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jButtonRentCar)
            .addGap(29, 29, 29)
            .addComponent(jButtonCancel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCustomers)
            .addGap(30, 30, 30)
            .addComponent(jButtonCars)
            .addGap(31, 31, 31))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(240, Short.MAX_VALUE)
            .addComponent(jPanelNewCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(211, 211, 211))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(368, 368, 368)
            .addComponent(jLabelNewCar)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanelImportant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonCars)
                .addComponent(jButtonCustomers)
                .addComponent(jButtonCancel)
                .addComponent(jButtonRentCar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
            .addComponent(jLabelNewCar)
            .addGap(28, 28, 28)
            .addComponent(jPanelNewCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(75, 75, 75))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarActionPerformed

        try {
            
        Registry registry = LocateRegistry.getRegistry("localhost");
        Object obj = registry.lookup("Yakuza Locadora de Veiculos");
        ServiceInterface serviceInterface = (ServiceInterface) obj;

        int carID = SystemClass.id;
        String brand = jTextFieldBrand.getText();
        String model = jTextFieldModel.getText();
        String fuelType = jTextFieldFuelType.getText();
        String gearType = "";
        if(jRadioButtonAuto.isSelected()){
            gearType = "Automático";
        }
        if(jRadioButtonManuel.isSelected()){
            gearType = "Manual";
        }
        
        if(!SystemClass.isNumeric(jTextFieldModelYear.getText())){
            JOptionPane.showMessageDialog(this, "Digite um valor numérico para o campo ano.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE); 
        } else if (!SystemClass.isNumeric(jTextFieldPrice.getText())){
            JOptionPane.showMessageDialog(this, "Digite um valor numérico para o campo de preço.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE); 
        } else if(SystemClass.isNumeric(jTextFieldModelYear.getText()) && SystemClass.isNumeric(jTextFieldPrice.getText())){
            int modelYear = Integer.parseInt(jTextFieldModelYear.getText());
            double price = Double.parseDouble(jTextFieldPrice.getText());
            
            if(!brand.equals("") && !model.equals("") && !fuelType.equals("") && !gearType.equals("") && !String.valueOf(modelYear).equals("") && !String.valueOf(price).equals("")){
                if (jComboBoxCarType.getSelectedItem() == null){
                    JOptionPane.showMessageDialog(this, "Por favor, escolha um tipo de carro.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE); 
                } else if(jComboBoxCarType.getSelectedItem().equals("Economic")){
                    serviceInterface.addCar(brand, model);
                    EconomicCar economicCar = new EconomicCar(carID, brand, model, fuelType, gearType, modelYear, price);
                    
                    if(SystemClass.addCar(economicCar)){
                        JOptionPane.showMessageDialog(this, "O carro foi adicionado.", "BEM-SUCEDIDO", JOptionPane.INFORMATION_MESSAGE);
                        DisplayCar displayCar = new DisplayCar();
                        displayCar.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "O carro não pode ser adicionado.", "ERRO", JOptionPane.ERROR_MESSAGE); 
                    }
                } else if (jComboBoxCarType.getSelectedItem().equals("Comfort")){
                    serviceInterface.addCar(brand, model);
                    ComfortCar comfortCar = new ComfortCar(carID, brand, model, fuelType, gearType, modelYear, price);
                    
                    if(SystemClass.addCar(comfortCar)){
                        JOptionPane.showMessageDialog(this, "O carro foi adicionado.", "BEM-SUCEDIDO", JOptionPane.INFORMATION_MESSAGE);
                        DisplayCar displayCar = new DisplayCar();
                        displayCar.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "O carro não pode ser adicionado.", "ERRO", JOptionPane.ERROR_MESSAGE); 
                    }
                } else if (jComboBoxCarType.getSelectedItem().equals("Luxury")){
                    serviceInterface.addCar(brand, model);
                    LuxuryCar luxuryCar = new LuxuryCar(carID, brand, model, fuelType, gearType, modelYear, price);
                    
                    if(SystemClass.addCar(luxuryCar)){
                        JOptionPane.showMessageDialog(this, "O carro foi adicionado.", "BEM-SUCEDIDO", JOptionPane.INFORMATION_MESSAGE);
                        DisplayCar displayCar = new DisplayCar();
                        displayCar.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "O carro não pode ser adicionado.", "ERRO", JOptionPane.ERROR_MESSAGE); 
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE); 
            }
        }

    }catch (RemoteException ree){
        System.out.println("Excecao: " + ree.getMessage());
    }catch(NotBoundException nbe){
        System.out.println("Excecao: " + nbe.getMessage());
    }
        
        
        
        
        
    }//GEN-LAST:event_jButtonAddCarActionPerformed

    private void jButtonCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarsActionPerformed
        DisplayCar displayCar = new DisplayCar();
        displayCar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCarsActionPerformed

    private void jButtonCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomersActionPerformed
        DisplayCustomer displayCustomer = new DisplayCustomer();
        displayCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCustomersActionPerformed

    private void jButtonRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentCarActionPerformed
        RentingInformation RentingInformation = new RentingInformation();
        RentingInformation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRentCarActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Cancel cancel = new Cancel();
        cancel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jRadioButtonAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAutoActionPerformed
        if(jRadioButtonAuto.isSelected()){
            jRadioButtonManuel.setEnabled(false);
        } else {
            jRadioButtonManuel.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonAutoActionPerformed

    private void jRadioButtonManuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonManuelActionPerformed
        if(jRadioButtonManuel.isSelected()){
            jRadioButtonAuto.setEnabled(false);
        } else {
            jRadioButtonAuto.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonManuelActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCars;
    private javax.swing.JButton jButtonCustomers;
    private javax.swing.JButton jButtonRentCar;
    private javax.swing.JComboBox<String> jComboBoxCarType;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelCarType;
    private javax.swing.JLabel jLabelFuelType;
    private javax.swing.JLabel jLabelGearType;
    private javax.swing.JLabel jLabelImportant;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelModelYear;
    private javax.swing.JLabel jLabelNewCar;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelTL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImportant;
    private javax.swing.JPanel jPanelNewCar;
    private javax.swing.JRadioButton jRadioButtonAuto;
    private javax.swing.JRadioButton jRadioButtonManuel;
    private javax.swing.JTextField jTextFieldBrand;
    private javax.swing.JTextField jTextFieldFuelType;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldModelYear;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration//GEN-END:variables
}
