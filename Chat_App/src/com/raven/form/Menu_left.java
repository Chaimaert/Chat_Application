
package com.raven.form;

import com.raven.component.Item_people;
import net.miginfocom.swing.MigLayout;

public class Menu_Left extends javax.swing.JPanel {

    public Menu_Left() {
        initComponents();
        init();
    }
    
    private void init() {
        menuList.setLayout(new MigLayout());
        ShowPeople();
    }

    private void ShowPeople() {
        for(int i=0;i<10;i++){
            menuList.add(new Item_people("People " + i), "wrap");
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuButton1 = new com.raven.component.MenuButton();
        menuButton2 = new com.raven.component.MenuButton();
        menuButton3 = new com.raven.component.MenuButton();
        menuList = new javax.swing.JLayeredPane();

        menuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/group.png"))); // NOI18N
        menuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton1ActionPerformed(evt);
            }
        });

        menuButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/message.png"))); // NOI18N
        menuButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton2ActionPerformed(evt);
            }
        });

        menuButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/box.png"))); // NOI18N
        menuButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton3ActionPerformed(evt);
            }
        });

        menu.setLayer(menuButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu.setLayer(menuButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu.setLayer(menuButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(menuButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menuButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(menuButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(menuButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu)
            .addComponent(menuList)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuList)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButton1ActionPerformed

    private void menuButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButton2ActionPerformed

    private void menuButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane menu;
    private com.raven.component.MenuButton menuButton1;
    private com.raven.component.MenuButton menuButton2;
    private com.raven.component.MenuButton menuButton3;
    private javax.swing.JLayeredPane menuList;
    // End of variables declaration//GEN-END:variables
}
