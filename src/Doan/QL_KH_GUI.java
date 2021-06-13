/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doan;

import BLL.QuanLyKH_BLL;
import DataTranferObject.KhachHangDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author MSI2
 */
public class QL_KH_GUI extends javax.swing.JFrame {

    private String tentk;

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }
    
    
    
    /**
     * Creates new form QL_KH_GUI
     */
    public QL_KH_GUI() {
        initComponents();
        setDefaultKH();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgnv = new javax.swing.JPanel();
        bg_thoat = new javax.swing.JPanel();
        text_trangchu7 = new javax.swing.JLabel();
        icon_trangchu7 = new javax.swing.JLabel();
        button_thoat = new javax.swing.JButton();
        bg_chuquan = new javax.swing.JPanel();
        bg_cafeomely = new javax.swing.JPanel();
        icon_cafe = new javax.swing.JLabel();
        icon_cafe1 = new javax.swing.JLabel();
        text_cafeomely1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ttKH = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        bt_refresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboGt = new javax.swing.JComboBox<>();
        btnHuy = new javax.swing.JButton();
        txtTenkh = new javax.swing.JTextField();
        txtDtl = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        bt_dy = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_tracuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgnv.setBackground(new java.awt.Color(255, 255, 255));
        bgnv.setMaximumSize(new java.awt.Dimension(1280, 1000));
        bgnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_thoat.setBackground(new java.awt.Color(85, 65, 118));

        text_trangchu7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        text_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        text_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_trangchu7.setText("Quản lý khách hàng");

        icon_trangchu7.setBackground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_trangchu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_customer_26px_1.png"))); // NOI18N
        icon_trangchu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_trangchu7.setOpaque(true);

        button_thoat.setBackground(new java.awt.Color(255, 255, 255));
        button_thoat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_thoat.setForeground(new java.awt.Color(204, 51, 0));
        button_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_back_arrow_30px.png"))); // NOI18N
        button_thoat.setText("Thoát");
        button_thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        button_thoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_thoatLayout = new javax.swing.GroupLayout(bg_thoat);
        bg_thoat.setLayout(bg_thoatLayout);
        bg_thoatLayout.setHorizontalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(text_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 719, Short.MAX_VALUE)
                .addComponent(button_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_thoatLayout.setVerticalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(button_thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(icon_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bgnv.add(bg_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 60));

        bg_chuquan.setBackground(new java.awt.Color(54, 33, 89));
        bg_chuquan.setToolTipText("");
        bg_chuquan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_cafeomely.setBackground(new java.awt.Color(85, 65, 118));
        bg_cafeomely.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_cafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_address_50px_1.png"))); // NOI18N
        bg_cafeomely.add(icon_cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 79, 56));

        icon_cafe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_cafe_50px.png"))); // NOI18N
        bg_cafeomely.add(icon_cafe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 79, 56));

        text_cafeomely1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        text_cafeomely1.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely1.setText("OMELY QUÁN ");
        bg_cafeomely.add(text_cafeomely1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 275, 56));

        bg_chuquan.add(bg_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1180, -1));

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_ttKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "SĐT", "Điểm Tính Lũy"
            }
        ));
        jScrollPane1.setViewportView(table_ttKH);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 810, 340));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Thông tin khách hàng");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 250, 40));

        bt_refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_refresh_16px.png"))); // NOI18N
        bt_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });
        jPanel2.add(bt_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 50, 40));

        bg_chuquan.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 830, 390));

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên Khách Hàng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 21));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Giới Tính");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 89, 21));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SĐT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 89, 21));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Điểm Tích Lũy");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 80, 21));

        cboGt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboGt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel1.add(cboGt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 30));

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_cancel_24px.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, 40));

        txtTenkh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtTenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, 30));

        txtDtl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDtl.setToolTipText("0");
        txtDtl.setEnabled(false);
        jPanel1.add(txtDtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 60, 30));

        txtSdt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 30));

        bt_dy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_dy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_cancel_24px.png"))); // NOI18N
        bt_dy.setText("Đồng Ý");
        bt_dy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        bt_dy.setEnabled(false);
        bt_dy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dyActionPerformed(evt);
            }
        });
        jPanel1.add(bt_dy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 40));

        bg_chuquan.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 340, 280));

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Chức năng");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_them.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_add_30px.png"))); // NOI18N
        bt_them.setText("Thêm");
        bt_them.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });

        bt_xoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/delete.png"))); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });

        bt_sua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/sửa .png"))); // NOI18N
        bt_sua.setText("Cập nhật");
        bt_sua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });

        bt_tracuu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_tracuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_google_web_search_50px.png"))); // NOI18N
        bt_tracuu.setText("Tra cứu");
        bt_tracuu.setAlignmentY(0.0F);
        bt_tracuu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        bt_tracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tracuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(bt_tracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_tracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        bg_chuquan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 600, 80));

        bgnv.add(bg_chuquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1200, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgnv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtTenkh.setText(null);
        txtSdt.setText(null);
        cboGt.setSelectedItem("Nam");
        txtDtl.setText(null);
        bt_dy.setEnabled(false);
        return;
    }//GEN-LAST:event_btnHuyActionPerformed

    private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
        // TODO add your handling code here:
        this.setDefaultKH();
        return;
    }//GEN-LAST:event_bt_refreshActionPerformed

    private void button_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_thoatActionPerformed
        // TODO add your handling code here:
        Chu_Quan cq = new Chu_Quan();
        cq.setTaiKhoan(tentk);
        cq.setVisible(true);
        this.dispose();
        return;
    }//GEN-LAST:event_button_thoatActionPerformed

    private void bt_dyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dyActionPerformed
        // TODO add your handling code here:
        QuanLyKH_BLL ql = new QuanLyKH_BLL();
        int choose = this.table_ttKH.getSelectedRow();
        KhachHangDTO kh = ql.getKhachHang(table_ttKH.getModel().getValueAt(choose, 0).toString());
       
        
        kh.setTenKH(this.txtTenkh.getText());
        kh.setGioiTinhKH(this.cboGt.getSelectedItem().toString());
        kh.setSDT(this.txtSdt.getText());
        kh.setDTL(Integer.parseInt(this.txtDtl.getText()));
        
        boolean kq = ql.CapNhatKH(kh);
        if(kq)
        {
            JOptionPane.showMessageDialog(rootPane, "Bạn vừa cập nhật thông tin 1 khách hàng thành công !", "Thông báo", JOptionPane.NO_OPTION);
            txtTenkh.setText(null);
            txtTenkh.setEnabled(true);
            txtSdt.setText(null);
            cboGt.setSelectedItem("Nam");
            txtDtl.setText("0");
            this.bt_dy.setEnabled(false);
            this.setDefaultKH();
            return;
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thông tin khách hàng thất bại !", "Thông báo", JOptionPane.NO_OPTION);
            return;
        }
    }//GEN-LAST:event_bt_dyActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        // TODO add your handling code here:
        QuanLyKH_BLL ql_kh = new QuanLyKH_BLL();
        String Ten_kh = txtTenkh.getText();
        String gioitinh = "";
        String sdt = txtSdt.getText();
        this.txtDtl.setText("0");
        this.txtDtl.setEnabled(false);
        String dtl = txtDtl.getText();
        
        if(this.bt_dy.isEnabled() == true)
        {   
            JOptionPane.showMessageDialog(rootPane, "khách hàng này đã có trong dữ liệu !", "Thông báo", JOptionPane.NO_OPTION);
            return;
        }
        if (cboGt.getSelectedItem().equals("Nam"))
           gioitinh = "Nam";
        else gioitinh = "Nữ";
         
        
        if(Ten_kh.equals("") || sdt.equals("") || dtl.equals(""))   
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin của khách hàng !", "Thông báo", JOptionPane.NO_OPTION);
            return;
        }
        else 
        {
            boolean kq = ql_kh.ThemKH(new KhachHangDTO(Ten_kh, gioitinh, sdt, Integer.parseInt(dtl)));
            if (kq == true)
            {   
                JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng mới thành công !", "Thông báo", JOptionPane.NO_OPTION);
                this.setDefaultKH();
                return;
            } 
            else 
            {
                JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng mới thất bại !", "Thông báo", JOptionPane.NO_OPTION);
                return;
            }
        } 
        
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_tracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tracuuActionPerformed
        // TODO add your handling code here:
        Form_tracuu tc = new Form_tracuu();
        tc.setStr("Tim khach hang");
        tc.setTentk(tentk);
        tc.setVisible(true);
        this.dispose();
        return;
    }//GEN-LAST:event_bt_tracuuActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        // TODO add your handling code here:
        
        int choose = this.table_ttKH.getSelectedRow();
        if(choose < 0){
            
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một khách hàng trước khi muốn xóa !", "Thông báo", JOptionPane.NO_OPTION);
            return;

        }
        else{
            if(JOptionPane.showConfirmDialog(rootPane, "Bạn có thực sự muốn xóa khách hàng này !", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                QuanLyKH_BLL ql = new QuanLyKH_BLL();
                String makh = table_ttKH.getModel().getValueAt(choose, 0).toString();
//                System.out.println(manv);
                String tenkh = table_ttKH.getModel().getValueAt(choose, 1).toString();
                boolean kq = ql.XoaKH(makh, tenkh);
                if(kq == true)
                {
                    JOptionPane.showMessageDialog(rootPane, "Khách hàng đã được xóa bỏ !", "Thông báo", JOptionPane.NO_OPTION);
                    this.setDefaultKH();
                    return;
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Xóa khách hàng không thành công !", "Thông báo", JOptionPane.NO_OPTION);
                    return;
                }
        
            }
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        // TODO add your handling code here:
        int choose = this.table_ttKH.getSelectedRow();
        if(choose < 0){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 khách hàng có trong danh sách để cập nhật thông tin !", "Thông báo", JOptionPane.NO_OPTION);
            return;
        }
        else{
            QuanLyKH_BLL ql = new QuanLyKH_BLL();
            KhachHangDTO kh = ql.getKhachHang(table_ttKH.getModel().getValueAt(choose, 0).toString());
            
            this.txtTenkh.setText(kh.getTenKH());
            this.txtSdt.setText(kh.getSDT());
            this.txtDtl.setText(String.valueOf(kh.getDTL()));
            String gt = kh.getGioiTinhKH();
            if(gt.equals("Nam"))
                this.cboGt.setSelectedIndex(0);
            else this.cboGt.setSelectedIndex(1);
            this.bt_dy.setEnabled(true);
            return;
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    public void setDefaultKH()
    {
        BLL.QuanLyKH_BLL ql = new BLL.QuanLyKH_BLL();
        DefaultTableModel model = new DefaultTableModel();
        String[] title = {"Mã khách hàng", "Tên khách hàng", "Giới tính", "SDT", "DTL"};
        model.setColumnIdentifiers(title);
        ArrayList<KhachHangDTO> ar = ql.getALLKhachHang();
        for(int i=0;i < ar.size();i++)
        {
            KhachHangDTO kh = ar.get(i);
            String Makh = kh.getMaKH();
            String Ten_kh = kh.getTenKH();
            String gioitinh = kh.getGioiTinhKH();
            String sdt = kh.getSDT();
            String dtl = String.valueOf(kh.getDTL());
            
            Object[]temp={Makh, Ten_kh, gioitinh,sdt ,dtl};
            model.addRow(temp);
        }
        this.table_ttKH.setModel(model);
        return;
    }
    public void setTable_tracuu(KhachHangDTO kh)
    {
        DefaultTableModel model = new DefaultTableModel();
        String[] title = {"Mã khách hàng", "Tên khách hàng", "Giới tính", "SDT", "DTL"};
        model.setColumnIdentifiers(title);
        String Makh = kh.getMaKH();
        String Ten_kh = kh.getTenKH();
        String gioitinh = kh.getGioiTinhKH();
        String sdt = kh.getSDT();
        String dtl = String.valueOf(kh.getDTL());

        Object[]temp={Makh, Ten_kh, gioitinh,sdt ,dtl};
        model.addRow(temp);
        
        Object value = model.getValueAt(0,0);
        if (value ==null)
        {
                JOptionPane.showMessageDialog(null, "Không có kết quả cần tìm!");
                return;
        }
        this.table_ttKH.setModel(model);
        return;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_KH_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_cafeomely;
    private javax.swing.JPanel bg_chuquan;
    private javax.swing.JPanel bg_thoat;
    private javax.swing.JPanel bgnv;
    private javax.swing.JButton bt_dy;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_tracuu;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton button_thoat;
    private javax.swing.JComboBox<String> cboGt;
    private javax.swing.JLabel icon_cafe;
    private javax.swing.JLabel icon_cafe1;
    private javax.swing.JLabel icon_trangchu7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ttKH;
    private javax.swing.JLabel text_cafeomely1;
    private javax.swing.JLabel text_trangchu7;
    private javax.swing.JTextField txtDtl;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenkh;
    // End of variables declaration//GEN-END:variables
}
