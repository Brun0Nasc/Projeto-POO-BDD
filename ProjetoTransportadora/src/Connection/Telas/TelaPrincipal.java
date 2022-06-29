package Connection.Telas;


import Connection.Classes.Armazem;
import Connection.Classes.Caminhao;
import Connection.Classes.Viagem;
import Connection.MySql.DAO.ArmazemDAO;
import Connection.MySql.DAO.CaminhoesDAO;
import Connection.MySql.DAO.ViagemDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno do Nascimento de Brito
 */
public class TelaPrincipal extends javax.swing.JFrame {
    Armazem a = new Armazem();
    Caminhao c = new Caminhao();
    Viagem v = new Viagem();
    
    ArmazemDAO m = new ArmazemDAO();
    CaminhoesDAO mc = new CaminhoesDAO();
    ViagemDAO mv = new ViagemDAO();
    
    public TelaPrincipal() {
        initComponents();
        listarArmazem();
        listarCaminhoes();
        listarViagens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnArmazens = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblNCaminhoes = new javax.swing.JLabel();
        lblCapacidade = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCaminhoes = new javax.swing.JTextField();
        txtCapacidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbArmazem = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jpnCaminhoes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarCaminhao = new javax.swing.JButton();
        btnLimparCaminhao = new javax.swing.JButton();
        lblId1 = new javax.swing.JLabel();
        lblEndereco1 = new javax.swing.JLabel();
        lblCapacidade1 = new javax.swing.JLabel();
        txtIdCaminhao = new javax.swing.JTextField();
        txtCodCaminhao = new javax.swing.JTextField();
        txtCapacidadeCaminhao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCaminhoes = new javax.swing.JTable();
        btnPesquisarCaminhao = new javax.swing.JButton();
        btnAlterarCaminhao = new javax.swing.JButton();
        btnExcluirCaminhao = new javax.swing.JButton();
        lblCapacidade2 = new javax.swing.JLabel();
        jpnViagens = new javax.swing.JPanel();
        pnCaminhao = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbCaminhoes1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btConf = new javax.swing.JButton();
        btCancCam = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSalvarViagem = new javax.swing.JButton();
        btnLimparViagem = new javax.swing.JButton();
        lblIdCaminhao = new javax.swing.JLabel();
        lblCodLicenca = new javax.swing.JLabel();
        txtIdCaminhaoViagem = new javax.swing.JTextField();
        txtCodCaminhaoViagem = new javax.swing.JTextField();
        txtNumViagem = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbViagens = new javax.swing.JTable();
        btnPesquisarViagem = new javax.swing.JButton();
        btnAlterarViagem = new javax.swing.JButton();
        btnExcluirViagem = new javax.swing.JButton();
        lblNumViagem = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtPesoViagem = new javax.swing.JTextField();
        lblTon = new javax.swing.JLabel();
        lblEnderecoViagem = new javax.swing.JLabel();
        txtEnderecoViagem = new javax.swing.JTextField();
        btSelCam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(34, 64, 104));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(201, 204, 223));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jpnArmazens.setBackground(new java.awt.Color(126, 133, 176));
        jpnArmazens.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gerenciamento de Armazéns");
        jpnArmazens.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setMaximumSize(new java.awt.Dimension(79, 25));
        btnSalvar.setMinimumSize(new java.awt.Dimension(79, 25));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpnArmazens.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 80, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Limpar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpnArmazens.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        lblId.setBackground(new java.awt.Color(255, 255, 255));
        lblId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID:");
        jpnArmazens.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, -1));

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço:");
        jpnArmazens.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        lblNCaminhoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNCaminhoes.setForeground(new java.awt.Color(255, 255, 255));
        lblNCaminhoes.setText("Nº Caminhões:");
        jpnArmazens.add(lblNCaminhoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));

        lblCapacidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCapacidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidade.setText("Capacidade:");
        jpnArmazens.add(lblCapacidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnArmazens.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 70, -1));

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnArmazens.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 210, -1));

        txtCaminhoes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnArmazens.add(txtCaminhoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 70, -1));

        txtCapacidade.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnArmazens.add(txtCapacidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 70, -1));

        tbArmazem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbArmazem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Endereço", "Nº Caminhões", "Capacidade"
            }
        ));
        tbArmazem.setToolTipText("");
        tbArmazem.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        tbArmazem.getTableHeader().setResizingAllowed(false);
        tbArmazem.getTableHeader().setReorderingAllowed(false);
        tbArmazem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbArmazemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbArmazem);

        jpnArmazens.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 620, 280));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jpnArmazens.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 90, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jpnArmazens.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 80, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jpnArmazens.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 80, -1));

        jTabbedPane1.addTab("Armazéns", jpnArmazens);

        jpnCaminhoes.setBackground(new java.awt.Color(126, 133, 176));
        jpnCaminhoes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpnCaminhoesFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gerenciamento de Caminhões");

        btnSalvarCaminhao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvarCaminhao.setText("Salvar");
        btnSalvarCaminhao.setToolTipText("Salvar");
        btnSalvarCaminhao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarCaminhao.setMaximumSize(new java.awt.Dimension(79, 25));
        btnSalvarCaminhao.setMinimumSize(new java.awt.Dimension(79, 25));
        btnSalvarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCaminhaoActionPerformed(evt);
            }
        });

        btnLimparCaminhao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimparCaminhao.setText("Limpar");
        btnLimparCaminhao.setToolTipText("Cancelar");
        btnLimparCaminhao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCaminhaoActionPerformed(evt);
            }
        });

        lblId1.setBackground(new java.awt.Color(255, 255, 255));
        lblId1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setText("ID:");

        lblEndereco1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereco1.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco1.setText("Código da Licença:");

        lblCapacidade1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblCapacidade1.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidade1.setText("ton");

        txtIdCaminhao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtCodCaminhao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtCapacidadeCaminhao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        tbCaminhoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbCaminhoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código de Licença", "Capacidade"
            }
        ));
        tbCaminhoes.setToolTipText("");
        tbCaminhoes.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        tbCaminhoes.getTableHeader().setResizingAllowed(false);
        tbCaminhoes.getTableHeader().setReorderingAllowed(false);
        tbCaminhoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCaminhoesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCaminhoes);

        btnPesquisarCaminhao.setText("Pesquisar");
        btnPesquisarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCaminhaoActionPerformed(evt);
            }
        });

        btnAlterarCaminhao.setText("Alterar");
        btnAlterarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCaminhaoActionPerformed(evt);
            }
        });

        btnExcluirCaminhao.setText("Excluir");
        btnExcluirCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCaminhaoActionPerformed(evt);
            }
        });

        lblCapacidade2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCapacidade2.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidade2.setText("Capacidade:");

        javax.swing.GroupLayout jpnCaminhoesLayout = new javax.swing.GroupLayout(jpnCaminhoes);
        jpnCaminhoes.setLayout(jpnCaminhoesLayout);
        jpnCaminhoesLayout.setHorizontalGroup(
            jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCaminhoesLayout.createSequentialGroup()
                .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCaminhoesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lblEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnCaminhoesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnCaminhoesLayout.createSequentialGroup()
                                .addComponent(btnPesquisarCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238)
                                .addComponent(btnSalvarCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterarCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluirCaminhao, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btnLimparCaminhao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnCaminhoesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblCapacidade2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCapacidadeCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCapacidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnCaminhoesLayout.setVerticalGroup(
            jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCaminhoesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnLimparCaminhao))
                .addGap(9, 9, 9)
                .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId1)
                        .addComponent(txtIdCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndereco1)
                        .addComponent(txtCodCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidade2)
                    .addComponent(txtCapacidadeCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapacidade1))
                .addGap(34, 34, 34)
                .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarCaminhao)
                    .addGroup(jpnCaminhoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterarCaminhao)
                        .addComponent(btnSalvarCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirCaminhao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Caminhões", jpnCaminhoes);

        jpnViagens.setBackground(new java.awt.Color(126, 133, 176));
        jpnViagens.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpnViagensFocusGained(evt);
            }
        });
        jpnViagens.setLayout(null);

        pnCaminhao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbCaminhoes1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbCaminhoes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código de Licença", "Capacidade"
            }
        ));
        tbCaminhoes1.setToolTipText("");
        tbCaminhoes1.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        tbCaminhoes1.getTableHeader().setResizingAllowed(false);
        tbCaminhoes1.getTableHeader().setReorderingAllowed(false);
        tbCaminhoes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCaminhoes1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbCaminhoes1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Selecionar Caminhão");

        btConf.setText("Confirmar");
        btConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfActionPerformed(evt);
            }
        });

        btCancCam.setText("Cancelar");
        btCancCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancCamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCaminhaoLayout = new javax.swing.GroupLayout(pnCaminhao);
        pnCaminhao.setLayout(pnCaminhaoLayout);
        pnCaminhaoLayout.setHorizontalGroup(
            pnCaminhaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCaminhaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCaminhaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnCaminhaoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(pnCaminhaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCancCam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnCaminhaoLayout.setVerticalGroup(
            pnCaminhaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCaminhaoLayout.createSequentialGroup()
                .addGroup(pnCaminhaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCaminhaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addComponent(btCancCam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btConf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btConf.setEnabled(false);

        jpnViagens.add(pnCaminhao);
        pnCaminhao.setBounds(110, 70, 420, 210);
        pnCaminhao.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Viagens");
        jpnViagens.add(jLabel4);
        jLabel4.setBounds(10, 11, 71, 22);

        btnSalvarViagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvarViagem.setText("Salvar");
        btnSalvarViagem.setToolTipText("Salvar");
        btnSalvarViagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarViagem.setMaximumSize(new java.awt.Dimension(79, 25));
        btnSalvarViagem.setMinimumSize(new java.awt.Dimension(79, 25));
        btnSalvarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarViagemActionPerformed(evt);
            }
        });
        jpnViagens.add(btnSalvarViagem);
        btnSalvarViagem.setBounds(338, 171, 80, 21);

        btnLimparViagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimparViagem.setText("Limpar");
        btnLimparViagem.setToolTipText("Cancelar");
        btnLimparViagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparViagemActionPerformed(evt);
            }
        });
        jpnViagens.add(btnLimparViagem);
        btnLimparViagem.setBounds(522, 14, 80, 21);

        lblIdCaminhao.setBackground(new java.awt.Color(255, 255, 255));
        lblIdCaminhao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdCaminhao.setForeground(new java.awt.Color(255, 255, 255));
        lblIdCaminhao.setText("ID(Caminhão)");
        jpnViagens.add(lblIdCaminhao);
        lblIdCaminhao.setBounds(30, 47, 84, 15);

        lblCodLicenca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodLicenca.setForeground(new java.awt.Color(255, 255, 255));
        lblCodLicenca.setText("Código da Licença");
        jpnViagens.add(lblCodLicenca);
        lblCodLicenca.setBounds(217, 47, 110, 15);

        txtIdCaminhaoViagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnViagens.add(txtIdCaminhaoViagem);
        txtIdCaminhaoViagem.setBounds(123, 44, 38, 21);

        txtCodCaminhaoViagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnViagens.add(txtCodCaminhaoViagem);
        txtCodCaminhaoViagem.setBounds(333, 44, 210, 21);
        txtCodCaminhaoViagem.setEnabled(false);

        txtNumViagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnViagens.add(txtNumViagem);
        txtNumViagem.setBounds(123, 78, 76, 21);

        tbViagens.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbViagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID(Caminhão)", "Cod. Licença", "Num. Viagem", "Peso", "Destino"
            }
        ));
        tbViagens.setToolTipText("");
        tbViagens.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        tbViagens.getTableHeader().setResizingAllowed(false);
        tbViagens.getTableHeader().setReorderingAllowed(false);
        tbViagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbViagensMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbViagens);

        jpnViagens.add(jScrollPane3);
        jScrollPane3.setBounds(0, 204, 620, 253);

        btnPesquisarViagem.setText("Pesquisar");
        btnPesquisarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarViagemActionPerformed(evt);
            }
        });
        jpnViagens.add(btnPesquisarViagem);
        btnPesquisarViagem.setBounds(10, 170, 90, 22);

        btnAlterarViagem.setText("Alterar");
        btnAlterarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarViagemActionPerformed(evt);
            }
        });
        jpnViagens.add(btnAlterarViagem);
        btnAlterarViagem.setBounds(430, 170, 80, 22);

        btnExcluirViagem.setText("Excluir");
        btnExcluirViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirViagemActionPerformed(evt);
            }
        });
        jpnViagens.add(btnExcluirViagem);
        btnExcluirViagem.setBounds(522, 170, 80, 22);

        lblNumViagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumViagem.setForeground(new java.awt.Color(255, 255, 255));
        lblNumViagem.setText("Nº da Viagem");
        jpnViagens.add(lblNumViagem);
        lblNumViagem.setBounds(36, 81, 81, 15);

        lblPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("Peso");
        jpnViagens.add(lblPeso);
        lblPeso.setBounds(298, 81, 29, 15);

        txtPesoViagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnViagens.add(txtPesoViagem);
        txtPesoViagem.setBounds(333, 78, 76, 21);

        lblTon.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblTon.setForeground(new java.awt.Color(255, 255, 255));
        lblTon.setText("ton");
        jpnViagens.add(lblTon);
        lblTon.setBounds(415, 83, 90, 13);

        lblEnderecoViagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnderecoViagem.setForeground(new java.awt.Color(255, 255, 255));
        lblEnderecoViagem.setText("Destino");
        jpnViagens.add(lblEnderecoViagem);
        lblEnderecoViagem.setBounds(70, 114, 47, 15);

        txtEnderecoViagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpnViagens.add(txtEnderecoViagem);
        txtEnderecoViagem.setBounds(123, 111, 420, 21);

        btSelCam.setText("...");
        btSelCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelCamActionPerformed(evt);
            }
        });
        jpnViagens.add(btSelCam);
        btSelCam.setBounds(167, 43, 22, 22);

        jTabbedPane1.addTab("Viagens", jpnViagens);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 620, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        excluirArmazem();
        listarArmazem();
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        alterarArmazem();
        pesquisaIdArmazem();
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().equals("")){
            listarArmazem();
        } else {
            pesquisaIdArmazem();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tbArmazemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbArmazemMouseClicked
        // TODO add your handling code here:
        carregarCampos();
    }//GEN-LAST:event_tbArmazemMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        cadastrarArmazem();
        listarArmazem();
        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCaminhaoActionPerformed
        // TODO add your handling code here:
        excluirCaminhao();
        listarCaminhoes();
        limparCamposCaminhoes();
    }//GEN-LAST:event_btnExcluirCaminhaoActionPerformed

    private void btnAlterarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCaminhaoActionPerformed
        // TODO add your handling code here:
        alterarCaminhao();
        pesquisaIdCaminhao();
        limparCamposCaminhoes();
    }//GEN-LAST:event_btnAlterarCaminhaoActionPerformed

    private void btnPesquisarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCaminhaoActionPerformed
        // TODO add your handling code here:
        if(txtIdCaminhao.getText().equals("")){
            listarCaminhoes();
        } else {
            pesquisaIdCaminhao();
        }
    }//GEN-LAST:event_btnPesquisarCaminhaoActionPerformed

    private void tbCaminhoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCaminhoesMouseClicked
        // TODO add your handling code here:
        carregarCamposCaminhao();
    }//GEN-LAST:event_tbCaminhoesMouseClicked

    private void btnLimparCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCaminhaoActionPerformed
        // TODO add your handling code here:
        limparCamposCaminhoes();
    }//GEN-LAST:event_btnLimparCaminhaoActionPerformed

    private void btnSalvarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {
        cadastrarCaminhao();
        listarCaminhoes();
        limparCamposCaminhoes();
    }

    private void btnPesquisarViagemActionPerformed(java.awt.event.ActionEvent evt) {
        listarViagens();
    }

    private void tbCaminhoes1MouseClicked(java.awt.event.MouseEvent evt) {
        btConf.setEnabled(true);
    }

    private void btSelCamActionPerformed(java.awt.event.ActionEvent evt) {
        pnCaminhao.setVisible(true);
        listarCaminhoes();
    }

    private void btCancCamActionPerformed(java.awt.event.ActionEvent evt) {
        pnCaminhao.setVisible(false);
    }

    private void btConfActionPerformed(java.awt.event.ActionEvent evt) {
        carregarCamposCaminhao1();
        pnCaminhao.setVisible(false);
        btConf.setEnabled(false);
    }
    
    private boolean validaCamposObrigatorios() {
        return !(this.txtCapacidade.getText().equals("") || this.txtEndereco.getText().equals("") ||
                 this.txtCaminhoes.getText().equals(""));
    }
    private boolean validaCamposCaminhoes() {
        return !(this.txtCodCaminhao.getText().equals("") || this.txtCapacidadeCaminhao.getText().equals(""));
    }
    //Funções de Cadastro
    private void cadastrarArmazem(){
        if (validaCamposObrigatorios()){
                a.setEndereco(txtEndereco.getText());
                a.setnCaminhoes(Integer.parseInt(txtCaminhoes.getText()));
                a.setCapacidade(Double.parseDouble(txtCapacidade.getText()));
                m.salvarDados(a);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    private void cadastrarCaminhao(){
        if (validaCamposCaminhoes()){
                c.setCod_licenca(Integer.parseInt(txtCodCaminhao.getText()));
                c.setCapacidade(Double.parseDouble(txtCapacidadeCaminhao.getText()));
                mc.salvarDados(c);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    //Funções de Listagem
    private void listarArmazem(){
        try {
           DefaultTableModel model = (DefaultTableModel) tbArmazem.getModel();
           model.setNumRows(0);
           
           ArrayList<Armazem> lista = m.pesquisarArmazem();
           
           for(int i = 0; i < lista.size(); i++){
                   model.addRow(new Object[]{
                   lista.get(i).getId(),
                   lista.get(i).getEndereco(),
                   lista.get(i).getnCaminhoes(),
                   lista.get(i).getCapacidade() 
               });
           }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Armazéns: " + e);
        }
    }
    private void listarCaminhoes(){
        try {
           DefaultTableModel model = (DefaultTableModel) tbCaminhoes.getModel();
           DefaultTableModel model1 = (DefaultTableModel) tbCaminhoes1.getModel();
           model.setNumRows(0);
           model1.setNumRows(0);
           
           ArrayList<Caminhao> lista = mc.pesquisarCaminhoes();
           
           for(int i = 0; i < lista.size(); i++){
                   model.addRow(new Object[]{
                   lista.get(i).getId(),
                   lista.get(i).getCod_licenca(),
                   lista.get(i).getCapacidade() 
               });
           }
           
           for(int i = 0; i < lista.size(); i++){
                   model1.addRow(new Object[]{
                   lista.get(i).getId(),
                   lista.get(i).getCod_licenca(),
                   lista.get(i).getCapacidade() 
               });
           }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Caminhões: " + e);
        }
    }
    private void listarViagens(){
        try {
           DefaultTableModel model = (DefaultTableModel) tbViagens.getModel();
           model.setNumRows(0);
           
           ArrayList<Viagem> lista = mv.pesquisarViagens();
           
           for(int i = 0; i < lista.size(); i++){
                   model.addRow(new Object[]{
                   lista.get(i).getId_caminhao(),
                   lista.get(i).getCod_licenca(),
                   lista.get(i).getNumero_viagem(),
                   lista.get(i).getPeso(),
                   lista.get(i).getEndereco()
               });
           }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Viagens: " + e);
        }
    }
    //Funções de Pesquisa por ID
    private void pesquisaIdArmazem(){
        try {
            DefaultTableModel model = (DefaultTableModel) tbArmazem.getModel();
            model.setNumRows(0);
            
            ArrayList<Armazem> lista = m.pesquisarArmazemId(Integer.parseInt(txtId.getText()));
            
            for(int i = 0; i < lista.size(); i++){
                   model.addRow(new Object[]{
                   lista.get(i).getId(),
                   lista.get(i).getEndereco(),
                   lista.get(i).getnCaminhoes(),
                   lista.get(i).getCapacidade() 
               });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar valoresID: " + e);
        }
    }
    private void pesquisaIdCaminhao(){
        try {
            DefaultTableModel model = (DefaultTableModel) tbCaminhoes.getModel();
            model.setNumRows(0);
            
            ArrayList<Caminhao> lista = mc.pesquisarCaminhao(Integer.parseInt(txtIdCaminhao.getText()));
            
            for(int i = 0; i < lista.size(); i++){
                   model.addRow(new Object[]{
                   lista.get(i).getId(),
                   lista.get(i).getCod_licenca(),
                   lista.get(i).getCapacidade() 
               });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar CaminhaoId: " + e);
        }
    }
    //Funções para carregar campos
    private void carregarCampos(){
        int setar = tbArmazem.getSelectedRow();
        
        txtId.setText(tbArmazem.getModel().getValueAt(setar, 0).toString());
        txtEndereco.setText(tbArmazem.getModel().getValueAt(setar, 1).toString());
        txtCaminhoes.setText(tbArmazem.getModel().getValueAt(setar, 2).toString());
        txtCapacidade.setText(tbArmazem.getModel().getValueAt(setar, 3).toString());
    }
    private void carregarCamposCaminhao(){
        int setar = tbCaminhoes.getSelectedRow();
        
        txtIdCaminhao.setText(tbCaminhoes.getModel().getValueAt(setar, 0).toString());
        txtCodCaminhao.setText(tbCaminhoes.getModel().getValueAt(setar, 1).toString());
        txtCapacidadeCaminhao.setText(tbCaminhoes.getModel().getValueAt(setar, 2).toString());
    }
    private void carregarCamposCaminhao1(){
        int setar = tbCaminhoes1.getSelectedRow();
        
        txtIdCaminhaoViagem.setText(tbCaminhoes.getModel().getValueAt(setar, 0).toString());
        txtCodCaminhaoViagem.setText(tbCaminhoes.getModel().getValueAt(setar, 1).toString());
    }
    //Funções para limpar campos
    private void limparCampos(){
        txtId.setText("");
        txtEndereco.setText("");
        txtCaminhoes.setText("");
        txtCapacidade.setText("");
    }
    private void limparCamposCaminhoes(){
        txtIdCaminhao.setText("");
        txtCodCaminhao.setText("");
        txtCapacidadeCaminhao.setText("");
    }
    //Funções para alteração
    private void alterarArmazem(){
        int id_armazem;
        String endereco_armazem;
        int numCaminhoes;
        double capacidade;
        
        id_armazem = Integer.parseInt(txtId.getText());
        endereco_armazem = txtEndereco.getText();
        numCaminhoes = Integer.parseInt(txtCaminhoes.getText());
        capacidade = Double.parseDouble(txtCapacidade.getText());
        
        a.setId(id_armazem);
        a.setEndereco(endereco_armazem);
        a.setnCaminhoes(numCaminhoes);
        a.setCapacidade(capacidade);
        
        m.alterarArmazem(a);
    }
    private void alterarCaminhao(){
        int id_caminhao;
        int codCaminhao;
        double capacidade;
        
        id_caminhao = Integer.parseInt(txtIdCaminhao.getText());
        codCaminhao = Integer.parseInt(txtCodCaminhao.getText());
        capacidade = Double.parseDouble(txtCapacidadeCaminhao.getText());
        
        c.setId(id_caminhao);
        c.setCod_licenca(codCaminhao);
        c.setCapacidade(capacidade);
        
        mc.alterarCaminhao(c);
    }
    //Funções para excluir
    private void excluirArmazem(){
        int id_armazem;
        
        id_armazem = Integer.parseInt(txtId.getText());
        
        m.excluirArmazem(id_armazem);
    }
    private void excluirCaminhao(){
        int id_caminhao;
        
        id_caminhao = Integer.parseInt(txtIdCaminhao.getText());
        
        mc.excluirCaminhao(id_caminhao);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancCam;
    private javax.swing.JButton btConf;
    private javax.swing.JButton btSelCam;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarCaminhao;
    private javax.swing.JButton btnAlterarViagem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirCaminhao;
    private javax.swing.JButton btnExcluirViagem;
    private javax.swing.JButton btnLimparCaminhao;
    private javax.swing.JButton btnLimparViagem;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarCaminhao;
    private javax.swing.JButton btnPesquisarViagem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarCaminhao;
    private javax.swing.JButton btnSalvarViagem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnArmazens;
    private javax.swing.JPanel jpnCaminhoes;
    private javax.swing.JPanel jpnViagens;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblCapacidade1;
    private javax.swing.JLabel lblCapacidade2;
    private javax.swing.JLabel lblCodLicenca;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEnderecoViagem;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblIdCaminhao;
    private javax.swing.JLabel lblNCaminhoes;
    private javax.swing.JLabel lblNumViagem;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTon;
    private javax.swing.JPanel pnCaminhao;
    private javax.swing.JTable tbArmazem;
    private javax.swing.JTable tbCaminhoes;
    private javax.swing.JTable tbCaminhoes1;
    private javax.swing.JTable tbViagens;
    private javax.swing.JTextField txtCaminhoes;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtCapacidadeCaminhao;
    private javax.swing.JTextField txtCodCaminhao;
    private javax.swing.JTextField txtCodCaminhaoViagem;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEnderecoViagem;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCaminhao;
    private javax.swing.JTextField txtIdCaminhaoViagem;
    private javax.swing.JTextField txtNumViagem;
    private javax.swing.JTextField txtPesoViagem;
    // End of variables declaration//GEN-END:variables
}
