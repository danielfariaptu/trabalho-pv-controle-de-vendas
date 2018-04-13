

package tavv.controle.de.vendas;

import Interface.CadastrarCliente;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;


public class MenuPrincipal extends javax.swing.JFrame {

     private int b1,b2,b3,b4,b5,b6,b7; 
     
    public MenuPrincipal() {
       
        initComponents();
        
         URL caminhoIcone = getClass().getResource("/icons/icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(1280, 800);
        overlay.setVisible(false);
        overlay.setBackground(new Color(51,34,94,80));
        
        PainelCliente.setVisible(false);
        Navegation.setBackground(new Color(50,50,80,111));
        PainelCliente.setBackground(new Color(50,50,80,150));
        ClienteTitle.setBackground(new Color(41,30,35));
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Navegation = new javax.swing.JPanel();
        botaoPainelLogOut = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botaoPainelProduto = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botaoPainelPagamento = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        botaoPainelFatura = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        botaoPainelCompra = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        botaoPainelEndereco = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        botaoPainelCliente = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        botaoInicio = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PainelCliente = new javax.swing.JPanel();
        ClienteTitle = new javax.swing.JPanel();
        labelCliente = new javax.swing.JLabel();
        botaoIncluirC = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        botaoAlterarC = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        botaoRemoverC = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        botaoMostrarC = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        BotaoAlterar = new javax.swing.JLabel();
        overlay = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - TAVV ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navegation.setPreferredSize(new java.awt.Dimension(62, 500));
        Navegation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoPainelLogOut.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
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
                .addGap(59, 59, 59)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 240, -1));

        botaoPainelProduto.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
        botaoPainelProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelProdutoMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Produto");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Wine (3).png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelProdutoLayout = new javax.swing.GroupLayout(botaoPainelProduto);
        botaoPainelProduto.setLayout(botaoPainelProdutoLayout);
        botaoPainelProdutoLayout.setHorizontalGroup(
            botaoPainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelProdutoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelProdutoLayout.setVerticalGroup(
            botaoPainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Navegation.add(botaoPainelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 240, -1));

        botaoPainelPagamento.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
        botaoPainelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelPagamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelPagamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelPagamentoMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pagamento");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bank-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelPagamentoLayout = new javax.swing.GroupLayout(botaoPainelPagamento);
        botaoPainelPagamento.setLayout(botaoPainelPagamentoLayout);
        botaoPainelPagamentoLayout.setHorizontalGroup(
            botaoPainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelPagamentoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelPagamentoLayout.setVerticalGroup(
            botaoPainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelPagamentoLayout.createSequentialGroup()
                .addGroup(botaoPainelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botaoPainelPagamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(botaoPainelPagamentoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 240, -1));

        botaoPainelFatura.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelFatura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
        botaoPainelFatura.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelFatura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelFatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelFaturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelFaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelFaturaMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fatura");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-invoice-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelFaturaLayout = new javax.swing.GroupLayout(botaoPainelFatura);
        botaoPainelFatura.setLayout(botaoPainelFaturaLayout);
        botaoPainelFaturaLayout.setHorizontalGroup(
            botaoPainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelFaturaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelFaturaLayout.setVerticalGroup(
            botaoPainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, -1));

        botaoPainelCompra.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
        botaoPainelCompra.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Compra");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-buy-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelCompraLayout = new javax.swing.GroupLayout(botaoPainelCompra);
        botaoPainelCompra.setLayout(botaoPainelCompraLayout);
        botaoPainelCompraLayout.setHorizontalGroup(
            botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelCompraLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelCompraLayout.setVerticalGroup(
            botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(botaoPainelCompraLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, -1));

        botaoPainelEndereco.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
        botaoPainelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelEnderecoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelEnderecoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelEnderecoMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Endereço");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-address-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelEnderecoLayout = new javax.swing.GroupLayout(botaoPainelEndereco);
        botaoPainelEndereco.setLayout(botaoPainelEnderecoLayout);
        botaoPainelEnderecoLayout.setHorizontalGroup(
            botaoPainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelEnderecoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        botaoPainelEnderecoLayout.setVerticalGroup(
            botaoPainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(botaoPainelEnderecoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        botaoPainelCliente.setBackground(new java.awt.Color(41, 30, 35));
        botaoPainelCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 42, 36), 1, true));
        botaoPainelCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPainelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelClienteMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cliente");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-client-management-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelClienteLayout = new javax.swing.GroupLayout(botaoPainelCliente);
        botaoPainelCliente.setLayout(botaoPainelClienteLayout);
        botaoPainelClienteLayout.setHorizontalGroup(
            botaoPainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelClienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botaoPainelClienteLayout.setVerticalGroup(
            botaoPainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(botaoPainelClienteLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 70));

        botaoInicio.setBackground(new java.awt.Color(41, 30, 35));
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

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icone.png"))); // NOI18N

        javax.swing.GroupLayout botaoInicioLayout = new javax.swing.GroupLayout(botaoInicio);
        botaoInicio.setLayout(botaoInicioLayout);
        botaoInicioLayout.setHorizontalGroup(
            botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoInicioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        botaoInicioLayout.setVerticalGroup(
            botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)))
                .addGap(21, 21, 21))
        );

        Navegation.add(botaoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        getContentPane().add(Navegation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 960));

        PainelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClienteTitle.setBackground(new java.awt.Color(41, 30, 35));
        ClienteTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("CLIENTE");
        ClienteTitle.add(labelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 11, 137, 38));

        PainelCliente.add(ClienteTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        botaoIncluirC.setBackground(new java.awt.Color(41, 30, 35));
        botaoIncluirC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoIncluirC.setForeground(new java.awt.Color(255, 255, 255));
        botaoIncluirC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoIncluirC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirCMouseClicked(evt);
            }
        });
        botaoIncluirC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Incluir");
        botaoIncluirC.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incluir.png"))); // NOI18N
        botaoIncluirC.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelCliente.add(botaoIncluirC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 70));

        botaoAlterarC.setBackground(new java.awt.Color(41, 30, 35));
        botaoAlterarC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoAlterarC.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterarC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoAlterarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlterarCMouseClicked(evt);
            }
        });
        botaoAlterarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Alterar");
        botaoAlterarC.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar2.png"))); // NOI18N
        botaoAlterarC.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelCliente.add(botaoAlterarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, 70));

        botaoRemoverC.setBackground(new java.awt.Color(41, 30, 35));
        botaoRemoverC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoRemoverC.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoRemoverC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverCMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Remover");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove.png"))); // NOI18N

        javax.swing.GroupLayout botaoRemoverCLayout = new javax.swing.GroupLayout(botaoRemoverC);
        botaoRemoverC.setLayout(botaoRemoverCLayout);
        botaoRemoverCLayout.setHorizontalGroup(
            botaoRemoverCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverCLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoRemoverCLayout.setVerticalGroup(
            botaoRemoverCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoRemoverCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoRemoverCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel33)))
                .addGap(21, 21, 21))
        );

        PainelCliente.add(botaoRemoverC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 70));

        botaoMostrarC.setBackground(new java.awt.Color(41, 30, 35));
        botaoMostrarC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoMostrarC.setForeground(new java.awt.Color(255, 255, 255));
        botaoMostrarC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoMostrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMostrarCMouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Mostrar");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N

        javax.swing.GroupLayout botaoMostrarCLayout = new javax.swing.GroupLayout(botaoMostrarC);
        botaoMostrarC.setLayout(botaoMostrarCLayout);
        botaoMostrarCLayout.setHorizontalGroup(
            botaoMostrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoMostrarCLayout.setVerticalGroup(
            botaoMostrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoMostrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoMostrarCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addGap(21, 21, 21))
        );

        PainelCliente.add(botaoMostrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 70));

        getContentPane().add(PainelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        BotaoAlterar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BotaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thumb-1920-352596 - Copia.jpg"))); // NOI18N
        BotaoAlterar.setLabelFor(BotaoAlterar);
        getContentPane().add(BotaoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        overlay.setBackground(new java.awt.Color(41, 30, 35));
        overlay.setPreferredSize(new java.awt.Dimension(1280, 800));
        overlay.setRequestFocusEnabled(false);
        overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPainelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseEntered
        
        botaoPainelLogOut.setBackground(new Color(84,58,59));
        
    }//GEN-LAST:event_botaoPainelLogOutMouseEntered

    private void botaoPainelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseExited
        
        botaoPainelLogOut.setBackground(new Color(41,30,35));
       
    }//GEN-LAST:event_botaoPainelLogOutMouseExited

    private void botaoPainelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseClicked
         Login lg = new Login ();
              	lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                lg.setLocationRelativeTo(null);
		lg.setVisible(true);
                
                this.dispose();
    }//GEN-LAST:event_botaoPainelLogOutMouseClicked

    private void botaoPainelProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelProdutoMouseClicked

    private void botaoPainelProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdutoMouseEntered
       if (b7 != 1){
           botaoPainelProduto.setBackground(new Color(84,58,59));
       }
    }//GEN-LAST:event_botaoPainelProdutoMouseEntered

    private void botaoPainelProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdutoMouseExited
        if(b7 !=1 ){
            botaoPainelProduto.setBackground(new Color(41,30,35));
        }
    }//GEN-LAST:event_botaoPainelProdutoMouseExited

    private void botaoPainelPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelPagamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelPagamentoMouseClicked

    private void botaoPainelPagamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelPagamentoMouseEntered
        if(b6 !=1){
        botaoPainelPagamento.setBackground(new Color(84,58,59));
        }
    }//GEN-LAST:event_botaoPainelPagamentoMouseEntered

    private void botaoPainelPagamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelPagamentoMouseExited
        if(b6 != 1){
        botaoPainelPagamento.setBackground(new Color(41,30,35));
        }
    }//GEN-LAST:event_botaoPainelPagamentoMouseExited

    private void botaoPainelFaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelFaturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelFaturaMouseClicked

    private void botaoPainelFaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelFaturaMouseEntered
       
        if(b5 != 1){
            botaoPainelFatura.setBackground(new Color(84,58,59));
        }
    }//GEN-LAST:event_botaoPainelFaturaMouseEntered

    private void botaoPainelFaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelFaturaMouseExited
        if(b5 != 1){
            botaoPainelFatura.setBackground(new Color(41,30,35));
        }
    }//GEN-LAST:event_botaoPainelFaturaMouseExited

    private void botaoPainelCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPainelCompraMouseClicked

    private void botaoPainelCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseEntered
       if(b4 != 1){
           botaoPainelCompra.setBackground(new Color(84,58,59));
       }
    }//GEN-LAST:event_botaoPainelCompraMouseEntered

    private void botaoPainelCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseExited
       if(b4 != 1){
        botaoPainelCompra.setBackground(new Color(41,30,35));
    }
    }//GEN-LAST:event_botaoPainelCompraMouseExited

    private void botaoPainelEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEnderecoMouseClicked
       
    }//GEN-LAST:event_botaoPainelEnderecoMouseClicked

    private void botaoPainelEnderecoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEnderecoMouseEntered
       if(b3 != 1){
           botaoPainelEndereco.setBackground(new Color(84,58,59));
       }
    }//GEN-LAST:event_botaoPainelEnderecoMouseEntered

    private void botaoPainelEnderecoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEnderecoMouseExited
       if(b3 != 1){
           botaoPainelEndereco.setBackground(new Color(41,30,35));
       }
    }//GEN-LAST:event_botaoPainelEnderecoMouseExited

    private void botaoPainelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelClienteMouseClicked
       
        refazCor();
        botaoPainelCliente.setBackground(new Color(77,46,79));
        resetaMenu();
        zeraCount();
        b2 = 1;
        PainelCliente.setVisible(true);
    }//GEN-LAST:event_botaoPainelClienteMouseClicked

    private void botaoPainelClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelClienteMouseEntered
       if(b2 != 1){
           botaoPainelCliente.setBackground(new Color(84,58,59));
       }
    }//GEN-LAST:event_botaoPainelClienteMouseEntered

    private void botaoPainelClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelClienteMouseExited
       if(b2 != 1){
           botaoPainelCliente.setBackground(new Color(41,30,35));
       }
    }//GEN-LAST:event_botaoPainelClienteMouseExited

    private void botaoInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseExited
        if(b1 != 1){
            botaoInicio.setBackground(new Color(41,30,35));
        }
    }//GEN-LAST:event_botaoInicioMouseExited

    private void botaoInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseEntered
        if(b1 != 1){
            botaoInicio.setBackground(new Color(84,58,59));
        }
    }//GEN-LAST:event_botaoInicioMouseEntered

    private void botaoInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseClicked
        
        refazCor();
        botaoInicio.setBackground(new Color(77,46,79));
        resetaMenu();
        zeraCount();
        b1 = 1;
        //PainelInicio.setVisible(true);
    }//GEN-LAST:event_botaoInicioMouseClicked

    private void botaoMostrarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMostrarCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMostrarCMouseClicked

    private void botaoRemoverCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRemoverCMouseClicked

    private void botaoIncluirCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirCMouseClicked
        CadastrarCliente dialog = new CadastrarCliente(new javax.swing.JDialog(), true);
        dialog.setLocationRelativeTo(null);
        overlay.setVisible(true);
	dialog.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoIncluirCMouseClicked

    private void botaoAlterarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlterarCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlterarCMouseClicked

    
     public void resetaMenu(){
        PainelCliente.setVisible(false);
        //PainelEndereco.setVisible(false);
        //PainelCompra.setVisible(false);
        //PainelFatura.setVisible(false);
        //PainelPagamento.setVisible(false);
        //PainelProduto.setVisible(false);
    }
    public void refazCor(){        
        botaoInicio.setBackground(new Color(41,30,35));
        botaoPainelCliente.setBackground(new Color(41,30,35));
        botaoPainelEndereco.setBackground(new Color(41,30,35));
        botaoPainelCompra.setBackground(new Color(41,30,35));
        botaoPainelFatura.setBackground(new Color(41,30,35));
        botaoPainelPagamento.setBackground(new Color(41,30,35));
        botaoPainelProduto.setBackground(new Color(41,30,35));
    }
    public void zeraCount(){
        b1=0;
        b2=0;
        b3=0;
        b4=0;
        b5=0;
        b6=0;
        b7=0;
    }

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
    private javax.swing.JLabel BotaoAlterar;
    private javax.swing.JPanel ClienteTitle;
    private javax.swing.JPanel Navegation;
    private javax.swing.JPanel PainelCliente;
    private javax.swing.JPanel botaoAlterarC;
    private javax.swing.JPanel botaoIncluirC;
    private javax.swing.JPanel botaoInicio;
    private javax.swing.JPanel botaoMostrarC;
    private javax.swing.JPanel botaoPainelCliente;
    private javax.swing.JPanel botaoPainelCompra;
    private javax.swing.JPanel botaoPainelEndereco;
    private javax.swing.JPanel botaoPainelFatura;
    private javax.swing.JPanel botaoPainelLogOut;
    private javax.swing.JPanel botaoPainelPagamento;
    private javax.swing.JPanel botaoPainelProduto;
    private javax.swing.JPanel botaoRemoverC;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JPanel overlay;
    // End of variables declaration//GEN-END:variables
}
