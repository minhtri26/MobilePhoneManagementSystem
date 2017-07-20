/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import order.model.OrderCustomer;

/**
 *
 * @author Hoang
 */
public class OrderCustomerComboBoxRenderer extends JPanel implements ListCellRenderer<OrderCustomer> {

    /**
     * Creates new form NewJPanel
     */
    public OrderCustomerComboBoxRenderer() {
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

        lbId = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(800, 30));

        lbId.setText("123");

        lbName.setText("Nguyen Le Minh Hoang");

        lbPhone.setText("0936031044");

        lbAddress.setText("121/23 Ly Te Xuyen, KP 4, P Linh Dong, Q Thu Duc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(lbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPhone;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList<? extends OrderCustomer> list, OrderCustomer value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value != null) {
            if (isSelected) {
                setBackground(Color.ORANGE);
                lbId.setForeground(Color.BLACK);
                lbName.setForeground(Color.BLACK);
                lbPhone.setForeground(Color.BLACK);
                lbAddress.setForeground(Color.BLACK);
            } else {
                setBackground(new java.awt.Color(51, 51, 51));
                lbId.setForeground(list.getForeground());
                lbName.setForeground(list.getForeground());
                lbPhone.setForeground(list.getForeground());
                lbAddress.setForeground(list.getForeground());
            }
            
            lbId.setText(value.getCusID() + "");
            lbName.setText(value.getCusName());
            lbPhone.setText(value.getCusPhone());
            lbAddress.setText(value.getCusAddress());
            
            if (index == -1) {
                lbId.setForeground(Color.ORANGE);
                lbName.setForeground(Color.ORANGE);
                lbPhone.setForeground(Color.ORANGE);
                lbAddress.setForeground(Color.ORANGE);
            }
        }
        return this;
    }
}
