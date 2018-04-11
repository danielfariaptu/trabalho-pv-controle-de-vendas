

package tavv.controle.de.vendas;

import java.awt.Color;
import javax.swing.JFrame;


public class MenuPrincipal extends javax.swing.JFrame {

     
    public MenuPrincipal() {
       
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        setSize(1280, 800);

        
        Navegation.setBackground(new Color(50,50,80,111));
        
        PainelCliente.setVisible(false);
       botaoPainelCli.setBackground(new Color(93,18,116,112));// cor normal
       
        
        PainelCliente.setBackground(new Color(50,50,80,111));
        ClienteTitle.setBackground(new Color(51,50,80,111));
        
    }

   
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Navegation = new javax.swing.JPanel();
        botaoPainelCli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoPainelEnd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botaoPainelCompra = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoPainelFat = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        botaoPainelPag = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        botaoPainelProd = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        botaoPainelLogOut = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botaoInicio = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        PainelCliente = new javax.swing.JPanel();
        ClienteTitle = new javax.swing.JPanel();
        labelCliente = new javax.swing.JLabel();
        CliIncluir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CliAlterar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CliRemover = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CliRemover1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navegation.setPreferredSize(new java.awt.Dimension(62, 500));

        botaoPainelCli.setBackground(new java.awt.Color(51, 0, 153));
        botaoPainelCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelCli.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelCliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelCliMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");

        javax.swing.GroupLayout botaoPainelCliLayout = new javax.swing.GroupLayout(botaoPainelCli);
        botaoPainelCli.setLayout(botaoPainelCliLayout);
        botaoPainelCliLayout.setHorizontalGroup(
            botaoPainelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        botaoPainelCliLayout.setVerticalGroup(
            botaoPainelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelCliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        botaoPainelEnd.setBackground(new java.awt.Color(51, 0, 153));
        botaoPainelEnd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelEnd.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelEndMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelEndMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Endereço");

        javax.swing.GroupLayout botaoPainelEndLayout = new javax.swing.GroupLayout(botaoPainelEnd);
        botaoPainelEnd.setLayout(botaoPainelEndLayout);
        botaoPainelEndLayout.setHorizontalGroup(
            botaoPainelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelEndLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelEndLayout.setVerticalGroup(
            botaoPainelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        botaoPainelCompra.setBackground(new java.awt.Color(51, 0, 153));
        botaoPainelCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelCompra.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compra");

        javax.swing.GroupLayout botaoPainelCompraLayout = new javax.swing.GroupLayout(botaoPainelCompra);
        botaoPainelCompra.setLayout(botaoPainelCompraLayout);
        botaoPainelCompraLayout.setHorizontalGroup(
            botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(110, 110, 110))
        );
        botaoPainelCompraLayout.setVerticalGroup(
            botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        botaoPainelFat.setBackground(new java.awt.Color(51, 0, 153));
        botaoPainelFat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelFat.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelFat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelFat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelFatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelFatMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fatura");

        javax.swing.GroupLayout botaoPainelFatLayout = new javax.swing.GroupLayout(botaoPainelFat);
        botaoPainelFat.setLayout(botaoPainelFatLayout);
        botaoPainelFatLayout.setHorizontalGroup(
            botaoPainelFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelFatLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelFatLayout.setVerticalGroup(
            botaoPainelFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelFatLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        botaoPainelPag.setBackground(new java.awt.Color(51, 0, 153));
        botaoPainelPag.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelPag.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelPag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelPagMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelPagMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pagamento");

        javax.swing.GroupLayout botaoPainelPagLayout = new javax.swing.GroupLayout(botaoPainelPag);
        botaoPainelPag.setLayout(botaoPainelPagLayout);
        botaoPainelPagLayout.setHorizontalGroup(
            botaoPainelPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelPagLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(102, 102, 102))
        );
        botaoPainelPagLayout.setVerticalGroup(
            botaoPainelPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelPagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        botaoPainelProd.setBackground(new java.awt.Color(51, 0, 153));
        botaoPainelProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelProd.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelProdMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Produto");

        javax.swing.GroupLayout botaoPainelProdLayout = new javax.swing.GroupLayout(botaoPainelProd);
        botaoPainelProd.setLayout(botaoPainelProdLayout);
        botaoPainelProdLayout.setHorizontalGroup(
            botaoPainelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(110, 110, 110))
        );
        botaoPainelProdLayout.setVerticalGroup(
            botaoPainelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        botaoPainelLogOut.setBackground(new java.awt.Color(0, 0, 0));
        botaoPainelLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoPainelLogOut.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelLogOutMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LOGOUT");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelLogOutLayout = new javax.swing.GroupLayout(botaoPainelLogOut);
        botaoPainelLogOut.setLayout(botaoPainelLogOutLayout);
        botaoPainelLogOutLayout.setHorizontalGroup(
            botaoPainelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelLogOutLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel13)
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelLogOutLayout.setVerticalGroup(
            botaoPainelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelLogOutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(botaoPainelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        botaoInicio.setBackground(new java.awt.Color(51, 0, 153));
        botaoInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoInicio.setForeground(new java.awt.Color(255, 255, 255));
        botaoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoInicioMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Início");

        javax.swing.GroupLayout botaoInicioLayout = new javax.swing.GroupLayout(botaoInicio);
        botaoInicio.setLayout(botaoInicioLayout);
        botaoInicioLayout.setHorizontalGroup(
            botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(115, 115, 115))
        );
        botaoInicioLayout.setVerticalGroup(
            botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoInicioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NavegationLayout = new javax.swing.GroupLayout(Navegation);
        Navegation.setLayout(NavegationLayout);
        NavegationLayout.setHorizontalGroup(
            NavegationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoPainelCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoPainelEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoPainelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoPainelFat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoPainelPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoPainelProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoPainelLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NavegationLayout.setVerticalGroup(
            NavegationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavegationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelFat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        getContentPane().add(Navegation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 960));

        PainelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("CLIENTE");

        javax.swing.GroupLayout ClienteTitleLayout = new javax.swing.GroupLayout(ClienteTitle);
        ClienteTitle.setLayout(ClienteTitleLayout);
        ClienteTitleLayout.setHorizontalGroup(
            ClienteTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteTitleLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        ClienteTitleLayout.setVerticalGroup(
            ClienteTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        PainelCliente.add(ClienteTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 80));

        CliIncluir.setBackground(new java.awt.Color(51, 0, 153));
        CliIncluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 2, true));
        CliIncluir.setForeground(new java.awt.Color(255, 255, 255));
        CliIncluir.setAutoscrolls(true);
        CliIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CliIncluir.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        CliIncluir.setEnabled(false);
        CliIncluir.setFocusCycleRoot(true);
        CliIncluir.setInheritsPopupMenu(true);
        CliIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CliIncluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CliIncluirMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Incluir");

        javax.swing.GroupLayout CliIncluirLayout = new javax.swing.GroupLayout(CliIncluir);
        CliIncluir.setLayout(CliIncluirLayout);
        CliIncluirLayout.setHorizontalGroup(
            CliIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CliIncluirLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        CliIncluirLayout.setVerticalGroup(
            CliIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CliIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelCliente.add(CliIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 50));

        CliAlterar.setBackground(new java.awt.Color(51, 0, 153));
        CliAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 2, true));
        CliAlterar.setForeground(new java.awt.Color(255, 255, 255));
        CliAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CliAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CliAlterarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alterar");

        javax.swing.GroupLayout CliAlterarLayout = new javax.swing.GroupLayout(CliAlterar);
        CliAlterar.setLayout(CliAlterarLayout);
        CliAlterarLayout.setHorizontalGroup(
            CliAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CliAlterarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        CliAlterarLayout.setVerticalGroup(
            CliAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CliAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelCliente.add(CliAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 160, 50));

        CliRemover.setBackground(new java.awt.Color(51, 0, 153));
        CliRemover.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 2, true));
        CliRemover.setForeground(new java.awt.Color(255, 255, 255));
        CliRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CliRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CliRemoverMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Remover");

        javax.swing.GroupLayout CliRemoverLayout = new javax.swing.GroupLayout(CliRemover);
        CliRemover.setLayout(CliRemoverLayout);
        CliRemoverLayout.setHorizontalGroup(
            CliRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CliRemoverLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(42, 42, 42))
        );
        CliRemoverLayout.setVerticalGroup(
            CliRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CliRemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelCliente.add(CliRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 160, 50));

        CliRemover1.setBackground(new java.awt.Color(51, 0, 153));
        CliRemover1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 2, true));
        CliRemover1.setForeground(new java.awt.Color(255, 255, 255));
        CliRemover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CliRemover1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CliRemover1MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mostrar");

        javax.swing.GroupLayout CliRemover1Layout = new javax.swing.GroupLayout(CliRemover1);
        CliRemover1.setLayout(CliRemover1Layout);
        CliRemover1Layout.setHorizontalGroup(
            CliRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CliRemover1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(52, 52, 52))
        );
        CliRemover1Layout.setVerticalGroup(
            CliRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CliRemover1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PainelCliente.add(CliRemover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 160, 50));

        getContentPane().add(PainelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 800, 530));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thumb-1920-352596 - Copia.jpg"))); // NOI18N
        Background.setLabelFor(Background);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPainelCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCliMouseEntered
         botaoPainelCli.setBackground(new Color(18,0,43,120));
    }//GEN-LAST:event_botaoPainelCliMouseEntered

    private void botaoPainelCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCliMouseExited
         botaoPainelCli.setBackground(new Color(93,18,116,120));
    }//GEN-LAST:event_botaoPainelCliMouseExited

    private void CliAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliAlterarMouseEntered
        CliAlterar.setBackground(new Color(83,118,116));
    }//GEN-LAST:event_CliAlterarMouseEntered

    private void CliAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliAlterarMouseExited
        CliAlterar.setBackground(new Color(93,18,116));
    }//GEN-LAST:event_CliAlterarMouseExited

    private void CliIncluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliIncluirMouseEntered
       CliIncluir.setBackground(new Color(83,118,116,80));
    }//GEN-LAST:event_CliIncluirMouseEntered

    private void CliIncluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliIncluirMouseExited
       CliIncluir.setBackground(new Color(93,18,116,80));
    }//GEN-LAST:event_CliIncluirMouseExited

    private void CliRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliRemoverMouseEntered
        CliRemover.setBackground(new Color(83,118,116));
    }//GEN-LAST:event_CliRemoverMouseEntered

    private void CliRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliRemoverMouseExited
       CliRemover.setBackground(new Color(93,18,116));
    }//GEN-LAST:event_CliRemoverMouseExited

    private void CliRemover1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliRemover1MouseEntered
       
    }//GEN-LAST:event_CliRemover1MouseEntered

    private void CliRemover1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CliRemover1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CliRemover1MouseExited

    private void botaoPainelEndMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEndMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelEndMouseEntered

    private void botaoPainelEndMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEndMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelEndMouseExited

    private void botaoPainelCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelCompraMouseEntered

    private void botaoPainelCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelCompraMouseExited

    private void botaoPainelFatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelFatMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelFatMouseEntered

    private void botaoPainelFatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelFatMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelFatMouseExited

    private void botaoPainelPagMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelPagMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelPagMouseEntered

    private void botaoPainelPagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelPagMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelPagMouseExited

    private void botaoPainelProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelProdMouseEntered

    private void botaoPainelProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelProdMouseExited

    private void botaoPainelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseEntered
        botaoPainelLogOut.setBackground(new Color(77,46,79,80));
    }//GEN-LAST:event_botaoPainelLogOutMouseEntered

    private void botaoPainelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseExited
        botaoPainelLogOut.setBackground(new Color(0,0,0,80));
    }//GEN-LAST:event_botaoPainelLogOutMouseExited

    private void botaoPainelCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCliMouseClicked
         PainelCliente.setVisible(true);
    }//GEN-LAST:event_botaoPainelCliMouseClicked

    private void botaoInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoInicioMouseClicked

    private void botaoInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoInicioMouseEntered

    private void botaoInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoInicioMouseExited

    private void botaoPainelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseClicked
         Login lg = new Login ();
              	lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                lg.setLocationRelativeTo(null);
		lg.setVisible(true);
                
                this.dispose();
    }//GEN-LAST:event_botaoPainelLogOutMouseClicked


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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel CliAlterar;
    private javax.swing.JPanel CliIncluir;
    private javax.swing.JPanel CliRemover;
    private javax.swing.JPanel CliRemover1;
    private javax.swing.JPanel ClienteTitle;
    private javax.swing.JPanel Navegation;
    private javax.swing.JPanel PainelCliente;
    private javax.swing.JPanel botaoInicio;
    private javax.swing.JPanel botaoPainelCli;
    private javax.swing.JPanel botaoPainelCompra;
    private javax.swing.JPanel botaoPainelEnd;
    private javax.swing.JPanel botaoPainelFat;
    private javax.swing.JPanel botaoPainelFat2;
    private javax.swing.JPanel botaoPainelLogOut;
    private javax.swing.JPanel botaoPainelPag;
    private javax.swing.JPanel botaoPainelProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCliente;
    // End of variables declaration//GEN-END:variables
}
