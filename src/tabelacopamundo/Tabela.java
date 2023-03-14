package tabelacopamundo;

public class Tabela extends javax.swing.JFrame {
            Selecoes grupoA[] = new Selecoes[4];
            Selecoes grupoB[] = new Selecoes[4];
            Selecoes grupoC[] = new Selecoes[4];
            Selecoes grupoD[] = new Selecoes[4];
            Selecoes grupoE[] = new Selecoes[4];
            Selecoes grupoF[] = new Selecoes[4];
            Selecoes grupoG[] = new Selecoes[4];
            Selecoes grupoH[] = new Selecoes[4];
            Jogos jogo = new Jogos();
            int resultado;
    public Tabela() {
        initComponents();
        grupoA[0] = new Selecoes("Holanda");
        grupoA[1] = new Selecoes("Equador");
        grupoA[2] = new Selecoes("Senegal");
        grupoA[3] = new Selecoes("Qatar");
        grupoB[0] = new Selecoes("Inglaterra");
        grupoB[1] = new Selecoes("Irã");
        grupoB[2] = new Selecoes("EUA");
        grupoB[3] = new Selecoes("País de Gales");
        grupoC[0] = new Selecoes("Polônia");
        grupoC[1] = new Selecoes("Argentina");
        grupoC[2] = new Selecoes("Arábia Saudita");
        grupoC[3] = new Selecoes("México");
        grupoD[0] = new Selecoes("França");
        grupoD[1] = new Selecoes("Austrália");
        grupoD[2] = new Selecoes("Dinamarca");
        grupoD[3] = new Selecoes("Tunísia");
        grupoE[0] = new Selecoes("Espanha");
        grupoE[1] = new Selecoes("Japão");
        grupoE[2] = new Selecoes("Costa Rica");
        grupoE[3] = new Selecoes("Alemanha");
        grupoF[0] = new Selecoes("Croácia");
        grupoF[1] = new Selecoes("Marrocos");
        grupoF[2] = new Selecoes("Bélgica");
        grupoF[3] = new Selecoes("Canadá");
        grupoG[0] = new Selecoes("Brasil");
        grupoG[1] = new Selecoes("Suíça");
        grupoG[2] = new Selecoes("Camarões");
        grupoG[3] = new Selecoes("Sérvia");
        grupoH[0] = new Selecoes("Portugal");
        grupoH[1] = new Selecoes("Coreia do Sul");
        grupoH[2] = new Selecoes("Uruguai");
        grupoH[3] = new Selecoes("Gana");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblSe = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        spnSe3 = new javax.swing.JSpinner();
        spnEq1 = new javax.swing.JSpinner();
        spnQa1 = new javax.swing.JSpinner();
        spnSe1 = new javax.swing.JSpinner();
        spnHo1 = new javax.swing.JSpinner();
        spnSe2 = new javax.swing.JSpinner();
        spnQa2 = new javax.swing.JSpinner();
        spnEq2 = new javax.swing.JSpinner();
        spnHo2 = new javax.swing.JSpinner();
        spnHo3 = new javax.swing.JSpinner();
        spnQa3 = new javax.swing.JSpinner();
        spnEq3 = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        btnQaEq = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblSe1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        spnEua3 = new javax.swing.JSpinner();
        spnIra1 = new javax.swing.JSpinner();
        spnIn1 = new javax.swing.JSpinner();
        spnEua1 = new javax.swing.JSpinner();
        spnGal1 = new javax.swing.JSpinner();
        spnEua2 = new javax.swing.JSpinner();
        spnIn2 = new javax.swing.JSpinner();
        spnIra2 = new javax.swing.JSpinner();
        spnGal2 = new javax.swing.JSpinner();
        spnGal3 = new javax.swing.JSpinner();
        spnIn3 = new javax.swing.JSpinner();
        spnIra3 = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lblSe2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        spnMex3 = new javax.swing.JSpinner();
        spnAra1 = new javax.swing.JSpinner();
        spnArg1 = new javax.swing.JSpinner();
        spnMex1 = new javax.swing.JSpinner();
        spnPol1 = new javax.swing.JSpinner();
        spnMex2 = new javax.swing.JSpinner();
        spnArg2 = new javax.swing.JSpinner();
        spnAra2 = new javax.swing.JSpinner();
        spnPol2 = new javax.swing.JSpinner();
        spnPol3 = new javax.swing.JSpinner();
        spnArg3 = new javax.swing.JSpinner();
        spnAra3 = new javax.swing.JSpinner();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        lblSe3 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        spnFra3 = new javax.swing.JSpinner();
        spnTun1 = new javax.swing.JSpinner();
        spnDin1 = new javax.swing.JSpinner();
        spnFra1 = new javax.swing.JSpinner();
        spnAus1 = new javax.swing.JSpinner();
        spnFra2 = new javax.swing.JSpinner();
        spnDin2 = new javax.swing.JSpinner();
        spnTun2 = new javax.swing.JSpinner();
        spnAus2 = new javax.swing.JSpinner();
        spnAus3 = new javax.swing.JSpinner();
        spnDin3 = new javax.swing.JSpinner();
        spnTun3 = new javax.swing.JSpinner();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        lblSe4 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        spnEsp3 = new javax.swing.JSpinner();
        spnJap1 = new javax.swing.JSpinner();
        spnAle1 = new javax.swing.JSpinner();
        spnEsp1 = new javax.swing.JSpinner();
        spnCos1 = new javax.swing.JSpinner();
        spnEsp2 = new javax.swing.JSpinner();
        spnAle2 = new javax.swing.JSpinner();
        spnJap2 = new javax.swing.JSpinner();
        spnCos2 = new javax.swing.JSpinner();
        spnCos3 = new javax.swing.JSpinner();
        spnAle3 = new javax.swing.JSpinner();
        spnJap3 = new javax.swing.JSpinner();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        lblSe5 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        spnMar3 = new javax.swing.JSpinner();
        spnCro1 = new javax.swing.JSpinner();
        spnMar1 = new javax.swing.JSpinner();
        spnBel1 = new javax.swing.JSpinner();
        spnCan1 = new javax.swing.JSpinner();
        spnMar2 = new javax.swing.JSpinner();
        spnBel2 = new javax.swing.JSpinner();
        spnCro2 = new javax.swing.JSpinner();
        spnCan2 = new javax.swing.JSpinner();
        spnBel3 = new javax.swing.JSpinner();
        spnCro3 = new javax.swing.JSpinner();
        spnCan3 = new javax.swing.JSpinner();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        lblSe6 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        spnCam3 = new javax.swing.JSpinner();
        spnCam1 = new javax.swing.JSpinner();
        spnSui1 = new javax.swing.JSpinner();
        spnBra1 = new javax.swing.JSpinner();
        spnSer1 = new javax.swing.JSpinner();
        spnBra2 = new javax.swing.JSpinner();
        spnSui2 = new javax.swing.JSpinner();
        spnCam2 = new javax.swing.JSpinner();
        spnSer2 = new javax.swing.JSpinner();
        spnSer3 = new javax.swing.JSpinner();
        spnSui3 = new javax.swing.JSpinner();
        spnBra3 = new javax.swing.JSpinner();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        lblSe7 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        spnPor3 = new javax.swing.JSpinner();
        spnKor1 = new javax.swing.JSpinner();
        spnUru1 = new javax.swing.JSpinner();
        spnPor1 = new javax.swing.JSpinner();
        spnGan1 = new javax.swing.JSpinner();
        spnPor2 = new javax.swing.JSpinner();
        spnUru2 = new javax.swing.JSpinner();
        spnKor2 = new javax.swing.JSpinner();
        spnGan2 = new javax.swing.JSpinner();
        spnGan3 = new javax.swing.JSpinner();
        spnUru3 = new javax.swing.JSpinner();
        spnKor3 = new javax.swing.JSpinner();
        jLabel154 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaGA = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGH = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaGB = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaGC = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaGD = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaGE = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaGF = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaGG = new javax.swing.JTable();
        jLabel155 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel5.setText("Tabela da Copa do Mundo 2022 Qatar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText("Grupo A");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("Grupo B");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("Grupo C");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("Grupo D");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setText("Grupo E");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setText("Grupo F");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setText("Grupo G");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setText("Grupo H");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 580, -1, -1));

        jLabel10.setText("Qatar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel11.setText("Senegal");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel12.setText("Qatar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel13.setText("Equador");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel14.setText("Qatar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel15.setText("Equador");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Jogos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jLabel17.setText("Equador");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel18.setText("Holanda");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        lblSe.setText("Senegal");
        getContentPane().add(lblSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel20.setText("Holanda");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel21.setText("Holanda");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel22.setText("Senegal");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel24.setText("X");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel25.setText("X");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel26.setText("X");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel27.setText("X");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel28.setText("X");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel29.setText("X");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        spnSe3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSe3StateChanged(evt);
            }
        });
        getContentPane().add(spnSe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 50, -1));

        spnEq1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEq1StateChanged(evt);
            }
        });
        getContentPane().add(spnEq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, -1));

        spnQa1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQa1StateChanged(evt);
            }
        });
        getContentPane().add(spnQa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, -1));

        spnSe1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSe1StateChanged(evt);
            }
        });
        getContentPane().add(spnSe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, -1));

        spnHo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnHo1StateChanged(evt);
            }
        });
        getContentPane().add(spnHo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, -1));

        spnSe2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSe2StateChanged(evt);
            }
        });
        getContentPane().add(spnSe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 50, -1));

        spnQa2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQa2StateChanged(evt);
            }
        });
        getContentPane().add(spnQa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 50, -1));

        spnEq2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEq2StateChanged(evt);
            }
        });
        getContentPane().add(spnEq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 50, -1));

        spnHo2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnHo2StateChanged(evt);
            }
        });
        getContentPane().add(spnHo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 50, -1));

        spnHo3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnHo3StateChanged(evt);
            }
        });
        getContentPane().add(spnHo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, -1));

        spnQa3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQa3StateChanged(evt);
            }
        });
        getContentPane().add(spnQa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 50, -1));

        spnEq3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEq3StateChanged(evt);
            }
        });
        getContentPane().add(spnEq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 50, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Grupo A");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        btnQaEq.setText("OK");
        btnQaEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQaEqActionPerformed(evt);
            }
        });
        getContentPane().add(btnQaEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel19.setText("Inglaterra");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel23.setText("EUA");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel31.setText("Inglaterra");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel32.setText("Irã");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel33.setText("Inglaterra");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel34.setText("Irã");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jLabel35.setText("Irã");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel36.setText("Gales");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        lblSe1.setText("EUA");
        getContentPane().add(lblSe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabel37.setText("Gales");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel38.setText("Gales");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel39.setText("EUA");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel40.setText("X");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel41.setText("X");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel42.setText("X");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jLabel43.setText("X");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jLabel44.setText("X");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel45.setText("X");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        spnEua3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEua3StateChanged(evt);
            }
        });
        getContentPane().add(spnEua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 50, -1));

        spnIra1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIra1StateChanged(evt);
            }
        });
        getContentPane().add(spnIra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 50, -1));

        spnIn1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIn1StateChanged(evt);
            }
        });
        getContentPane().add(spnIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 50, -1));

        spnEua1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEua1StateChanged(evt);
            }
        });
        getContentPane().add(spnEua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 50, -1));

        spnGal1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGal1StateChanged(evt);
            }
        });
        getContentPane().add(spnGal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 50, -1));

        spnEua2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEua2StateChanged(evt);
            }
        });
        getContentPane().add(spnEua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 50, -1));

        spnIn2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIn2StateChanged(evt);
            }
        });
        getContentPane().add(spnIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 50, -1));

        spnIra2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIra2StateChanged(evt);
            }
        });
        getContentPane().add(spnIra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 50, -1));

        spnGal2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGal2StateChanged(evt);
            }
        });
        getContentPane().add(spnGal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 50, -1));

        spnGal3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGal3StateChanged(evt);
            }
        });
        getContentPane().add(spnGal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 50, -1));

        spnIn3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIn3StateChanged(evt);
            }
        });
        getContentPane().add(spnIn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 50, -1));

        spnIra3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIra3StateChanged(evt);
            }
        });
        getContentPane().add(spnIra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 50, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setText("Grupo B");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        jLabel47.setText("Argentina");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        jLabel48.setText("México");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jLabel49.setText("Argentina");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        jLabel50.setText("Ar.Saudita");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        jLabel51.setText("Argentina");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel52.setText("Ar.Saudita");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        jLabel53.setText("Ar.Saudita");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        jLabel54.setText("Polônia");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, -1, -1));

        lblSe2.setText("México");
        getContentPane().add(lblSe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        jLabel55.setText("Polônia");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        jLabel56.setText("Polônia");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        jLabel57.setText("México");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        jLabel58.setText("X");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel59.setText("X");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        jLabel60.setText("X");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        jLabel61.setText("X");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        jLabel62.setText("X");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel63.setText("X");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        spnMex3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMex3StateChanged(evt);
            }
        });
        getContentPane().add(spnMex3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 50, -1));

        spnAra1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAra1StateChanged(evt);
            }
        });
        getContentPane().add(spnAra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 50, -1));

        spnArg1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnArg1StateChanged(evt);
            }
        });
        getContentPane().add(spnArg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 50, -1));

        spnMex1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMex1StateChanged(evt);
            }
        });
        getContentPane().add(spnMex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 50, -1));

        spnPol1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPol1StateChanged(evt);
            }
        });
        getContentPane().add(spnPol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 50, -1));

        spnMex2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMex2StateChanged(evt);
            }
        });
        getContentPane().add(spnMex2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 50, -1));

        spnArg2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnArg2StateChanged(evt);
            }
        });
        getContentPane().add(spnArg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 50, -1));

        spnAra2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAra2StateChanged(evt);
            }
        });
        getContentPane().add(spnAra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 50, -1));

        spnPol2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPol2StateChanged(evt);
            }
        });
        getContentPane().add(spnPol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 50, -1));

        spnPol3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPol3StateChanged(evt);
            }
        });
        getContentPane().add(spnPol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 50, -1));

        spnArg3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnArg3StateChanged(evt);
            }
        });
        getContentPane().add(spnArg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 50, -1));

        spnAra3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAra3StateChanged(evt);
            }
        });
        getContentPane().add(spnAra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 50, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel64.setText("Grupo C");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabel65.setText("Dinamarca");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        jLabel66.setText("França");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        jLabel67.setText("Dinamarca");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, -1, -1));

        jLabel68.setText("Tunísia");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, -1, -1));

        jLabel69.setText("Dinamarca");
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, -1, -1));

        jLabel70.setText("Tunísia");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, -1, -1));

        jLabel71.setText("Tunísia");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 180, -1, -1));

        jLabel72.setText("Austrália");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, -1, -1));

        lblSe3.setText("França");
        getContentPane().add(lblSe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 240, -1, -1));

        jLabel73.setText("Austrália");
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, -1, -1));

        jLabel74.setText("Austrália");
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 300, -1, -1));

        jLabel75.setText("França");
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 330, -1, -1));

        jLabel76.setText("X");
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, -1, -1));

        jLabel77.setText("X");
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, -1, -1));

        jLabel78.setText("X");
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, -1, -1));

        jLabel79.setText("X");
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, -1, -1));

        jLabel80.setText("X");
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, -1, -1));

        jLabel81.setText("X");
        getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        spnFra3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnFra3StateChanged(evt);
            }
        });
        getContentPane().add(spnFra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 50, -1));

        spnTun1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTun1StateChanged(evt);
            }
        });
        getContentPane().add(spnTun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 50, -1));

        spnDin1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDin1StateChanged(evt);
            }
        });
        getContentPane().add(spnDin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 40, -1));

        spnFra1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnFra1StateChanged(evt);
            }
        });
        getContentPane().add(spnFra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 50, -1));

        spnAus1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAus1StateChanged(evt);
            }
        });
        getContentPane().add(spnAus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 50, -1));

        spnFra2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnFra2StateChanged(evt);
            }
        });
        getContentPane().add(spnFra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 50, -1));

        spnDin2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDin2StateChanged(evt);
            }
        });
        getContentPane().add(spnDin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 50, -1));

        spnTun2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTun2StateChanged(evt);
            }
        });
        getContentPane().add(spnTun2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 50, -1));

        spnAus2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAus2StateChanged(evt);
            }
        });
        getContentPane().add(spnAus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 50, -1));

        spnAus3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAus3StateChanged(evt);
            }
        });
        getContentPane().add(spnAus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 50, -1));

        spnDin3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDin3StateChanged(evt);
            }
        });
        getContentPane().add(spnDin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 40, -1));

        spnTun3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTun3StateChanged(evt);
            }
        });
        getContentPane().add(spnTun3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 50, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setText("Grupo D");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, -1, -1));

        jLabel83.setText("Alemanha");
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel84.setText("Espanha");
        getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel85.setText("Alemanha");
        getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel86.setText("Japão");
        getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jLabel87.setText("Alemanha");
        getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        jLabel88.setText("Japão");
        getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        jLabel89.setText("Japão");
        getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jLabel90.setText("C.Rica");
        getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        lblSe4.setText("Espanha");
        getContentPane().add(lblSe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jLabel91.setText("C.Rica");
        getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));

        jLabel92.setText("C.Rica");
        getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        jLabel93.setText("Espanha");
        getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, -1));

        jLabel94.setText("X");
        getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, -1, -1));

        jLabel95.setText("X");
        getContentPane().add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jLabel96.setText("X");
        getContentPane().add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jLabel97.setText("X");
        getContentPane().add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        jLabel98.setText("X");
        getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        jLabel99.setText("X");
        getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        spnEsp3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEsp3StateChanged(evt);
            }
        });
        getContentPane().add(spnEsp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 50, -1));

        spnJap1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnJap1StateChanged(evt);
            }
        });
        getContentPane().add(spnJap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 50, -1));

        spnAle1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAle1StateChanged(evt);
            }
        });
        getContentPane().add(spnAle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 40, -1));

        spnEsp1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEsp1StateChanged(evt);
            }
        });
        getContentPane().add(spnEsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 50, -1));

        spnCos1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCos1StateChanged(evt);
            }
        });
        getContentPane().add(spnCos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 50, -1));

        spnEsp2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEsp2StateChanged(evt);
            }
        });
        getContentPane().add(spnEsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 50, -1));

        spnAle2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAle2StateChanged(evt);
            }
        });
        getContentPane().add(spnAle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 40, -1));

        spnJap2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnJap2StateChanged(evt);
            }
        });
        getContentPane().add(spnJap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 50, -1));

        spnCos2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCos2StateChanged(evt);
            }
        });
        getContentPane().add(spnCos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 50, -1));

        spnCos3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCos3StateChanged(evt);
            }
        });
        getContentPane().add(spnCos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 50, -1));

        spnAle3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAle3StateChanged(evt);
            }
        });
        getContentPane().add(spnAle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 40, -1));

        spnJap3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnJap3StateChanged(evt);
            }
        });
        getContentPane().add(spnJap3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 50, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel100.setText("Grupo E");
        getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        jLabel101.setText("Croácia");
        getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        jLabel102.setText("Canadá");
        getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, -1));

        jLabel103.setText("Croácia");
        getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        jLabel104.setText("Bélgica");
        getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        jLabel105.setText("Croácia");
        getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, -1));

        jLabel106.setText("Bélgica");
        getContentPane().add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel107.setText("Bélgica");
        getContentPane().add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        jLabel108.setText("Marrocos");
        getContentPane().add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        lblSe5.setText("Canadá");
        getContentPane().add(lblSe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, -1));

        jLabel109.setText("Marrocos");
        getContentPane().add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        jLabel110.setText("Marrocos");
        getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, -1, -1));

        jLabel111.setText("Canadá");
        getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jLabel112.setText("X");
        getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, -1, -1));

        jLabel113.setText("X");
        getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jLabel114.setText("X");
        getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jLabel115.setText("X");
        getContentPane().add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        jLabel116.setText("X");
        getContentPane().add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        jLabel117.setText("X");
        getContentPane().add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        spnMar3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMar3StateChanged(evt);
            }
        });
        getContentPane().add(spnMar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, 50, -1));

        spnCro1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCro1StateChanged(evt);
            }
        });
        getContentPane().add(spnCro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 50, -1));

        spnMar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMar1StateChanged(evt);
            }
        });
        getContentPane().add(spnMar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 50, -1));

        spnBel1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBel1StateChanged(evt);
            }
        });
        getContentPane().add(spnBel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 50, -1));

        spnCan1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCan1StateChanged(evt);
            }
        });
        getContentPane().add(spnCan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 50, -1));

        spnMar2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMar2StateChanged(evt);
            }
        });
        getContentPane().add(spnMar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 50, -1));

        spnBel2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBel2StateChanged(evt);
            }
        });
        getContentPane().add(spnBel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 50, -1));

        spnCro2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCro2StateChanged(evt);
            }
        });
        getContentPane().add(spnCro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 50, -1));

        spnCan2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCan2StateChanged(evt);
            }
        });
        getContentPane().add(spnCan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 50, -1));

        spnBel3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBel3StateChanged(evt);
            }
        });
        getContentPane().add(spnBel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 50, -1));

        spnCro3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCro3StateChanged(evt);
            }
        });
        getContentPane().add(spnCro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 50, -1));

        spnCan3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCan3StateChanged(evt);
            }
        });
        getContentPane().add(spnCan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 50, -1));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel118.setText("Grupo F");
        getContentPane().add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        jLabel119.setText("Camarões");
        getContentPane().add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, -1, -1));

        jLabel120.setText("Brasil");
        getContentPane().add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, -1));

        jLabel121.setText("Suíça");
        getContentPane().add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        jLabel122.setText("Camarões");
        getContentPane().add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, -1));

        jLabel123.setText("Suíça");
        getContentPane().add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        jLabel124.setText("Brasil");
        getContentPane().add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, -1, -1));

        jLabel125.setText("Suíça");
        getContentPane().add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        jLabel126.setText("Sérvia");
        getContentPane().add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, -1, -1));

        lblSe6.setText("Brasil");
        getContentPane().add(lblSe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, -1, -1));

        jLabel127.setText("Sérvia");
        getContentPane().add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, -1, -1));

        jLabel128.setText("Sérvia");
        getContentPane().add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, -1, -1));

        jLabel129.setText("Camarões");
        getContentPane().add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, -1, -1));

        jLabel130.setText("X");
        getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, -1, -1));

        jLabel131.setText("X");
        getContentPane().add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, -1));

        jLabel132.setText("X");
        getContentPane().add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, -1, -1));

        jLabel133.setText("X");
        getContentPane().add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, -1, -1));

        jLabel134.setText("X");
        getContentPane().add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        jLabel135.setText("X");
        getContentPane().add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, -1, -1));

        spnCam3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCam3StateChanged(evt);
            }
        });
        getContentPane().add(spnCam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 50, -1));

        spnCam1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCam1StateChanged(evt);
            }
        });
        getContentPane().add(spnCam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 50, -1));

        spnSui1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSui1StateChanged(evt);
            }
        });
        getContentPane().add(spnSui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 50, -1));

        spnBra1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBra1StateChanged(evt);
            }
        });
        getContentPane().add(spnBra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 50, -1));

        spnSer1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSer1StateChanged(evt);
            }
        });
        getContentPane().add(spnSer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 50, -1));

        spnBra2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBra2StateChanged(evt);
            }
        });
        getContentPane().add(spnBra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 50, -1));

        spnSui2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSui2StateChanged(evt);
            }
        });
        getContentPane().add(spnSui2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 50, -1));

        spnCam2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCam2StateChanged(evt);
            }
        });
        getContentPane().add(spnCam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 50, -1));

        spnSer2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSer2StateChanged(evt);
            }
        });
        getContentPane().add(spnSer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 50, -1));

        spnSer3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSer3StateChanged(evt);
            }
        });
        getContentPane().add(spnSer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 50, -1));

        spnSui3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSui3StateChanged(evt);
            }
        });
        getContentPane().add(spnSui3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 50, -1));

        spnBra3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBra3StateChanged(evt);
            }
        });
        getContentPane().add(spnBra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 50, -1));

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel136.setText("Grupo G");
        getContentPane().add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        jLabel137.setText("Uruguai");
        getContentPane().add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, -1, -1));

        jLabel138.setText("Portugal");
        getContentPane().add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, -1, -1));

        jLabel139.setText("Uruguai");
        getContentPane().add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, -1, -1));

        jLabel140.setText("Korea");
        getContentPane().add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, -1, -1));

        jLabel141.setText("Uruguai");
        getContentPane().add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, -1, -1));

        jLabel142.setText("Korea");
        getContentPane().add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, -1));

        jLabel143.setText("Korea");
        getContentPane().add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 460, -1, -1));

        jLabel144.setText("Gana");
        getContentPane().add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, -1, -1));

        lblSe7.setText("Portugal");
        getContentPane().add(lblSe7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 520, -1, -1));

        jLabel145.setText("Gana");
        getContentPane().add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, -1, -1));

        jLabel146.setText("Gana");
        getContentPane().add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, -1, -1));

        jLabel147.setText("Portugal");
        getContentPane().add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, -1, -1));

        jLabel148.setText("X");
        getContentPane().add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, -1, -1));

        jLabel149.setText("X");
        getContentPane().add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, -1, -1));

        jLabel150.setText("X");
        getContentPane().add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, -1, -1));

        jLabel151.setText("X");
        getContentPane().add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, -1, -1));

        jLabel152.setText("X");
        getContentPane().add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, -1, -1));

        jLabel153.setText("X");
        getContentPane().add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, -1, -1));

        spnPor3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPor3StateChanged(evt);
            }
        });
        getContentPane().add(spnPor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 50, -1));

        spnKor1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnKor1StateChanged(evt);
            }
        });
        getContentPane().add(spnKor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 50, -1));

        spnUru1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnUru1StateChanged(evt);
            }
        });
        getContentPane().add(spnUru1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 50, -1));

        spnPor1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPor1StateChanged(evt);
            }
        });
        getContentPane().add(spnPor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, 50, -1));

        spnGan1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGan1StateChanged(evt);
            }
        });
        getContentPane().add(spnGan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 50, -1));

        spnPor2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPor2StateChanged(evt);
            }
        });
        getContentPane().add(spnPor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 520, 50, -1));

        spnUru2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnUru2StateChanged(evt);
            }
        });
        getContentPane().add(spnUru2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 50, -1));

        spnKor2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnKor2StateChanged(evt);
            }
        });
        getContentPane().add(spnKor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, 50, -1));

        spnGan2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGan2StateChanged(evt);
            }
        });
        getContentPane().add(spnGan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 50, -1));

        spnGan3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGan3StateChanged(evt);
            }
        });
        getContentPane().add(spnGan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, 50, -1));

        spnUru3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnUru3StateChanged(evt);
            }
        });
        getContentPane().add(spnUru3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, 50, -1));

        spnKor3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnKor3StateChanged(evt);
            }
        });
        getContentPane().add(spnKor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 50, -1));

        jLabel154.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel154.setText("Grupo H");
        getContentPane().add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, -1, -1));

        tabelaGA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Holanda", null, null, null, null},
                {"Equador", null, null, null, null},
                {"Senegal", null, null, null, null},
                {"Qatar", null, null, null, null}
            },
            new String [] {
                "Time", "Pontos", "Vitórias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGA.setShowGrid(true);
        jScrollPane9.setViewportView(tabelaGA);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 180, 340, 107));

        tabelaGH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Portugal", null, null, null, null},
                {"Coréia do Sul", null, null, null, null},
                {"Uruguai", null, null, null, null},
                {"Gales", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGH.setRequestFocusEnabled(false);
        tabelaGH.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaGH);
        tabelaGH.getAccessibleContext().setAccessibleParent(tabelaGA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 540, 340, 107));

        tabelaGB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Inglaterra", null, null, null, null},
                {"Irã", null, null, null, null},
                {"EUA", null, null, null, null},
                {"Gales", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGB.setRequestFocusEnabled(false);
        tabelaGB.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaGB);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 180, 340, 107));

        tabelaGC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Polônia", null, null, null, null},
                {"Argentina", null, null, null, null},
                {"Arábia S.", null, null, null, null},
                {"Gales", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGC.setRequestFocusEnabled(false);
        tabelaGC.setShowGrid(true);
        jScrollPane3.setViewportView(tabelaGC);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 300, 340, 107));

        tabelaGD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"França", null, null, null, null},
                {"Austrália", null, null, null, null},
                {"Dinamarca", null, null, null, null},
                {"Tunísia", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGD.setRequestFocusEnabled(false);
        tabelaGD.setShowGrid(true);
        jScrollPane4.setViewportView(tabelaGD);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 300, 340, 107));

        tabelaGE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Espanha", null, null, null, null},
                {"Japão", null, null, null, null},
                {"Costa Rica", null, null, null, null},
                {"Alemanha", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGE.setRequestFocusEnabled(false);
        tabelaGE.setShowGrid(true);
        jScrollPane5.setViewportView(tabelaGE);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 420, 340, 107));

        tabelaGF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Croácia", null, null, null, null},
                {"Marrocos", null, null, null, null},
                {"Bélgica", null, null, null, null},
                {"Canadá", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGF.setRequestFocusEnabled(false);
        tabelaGF.setShowGrid(true);
        jScrollPane6.setViewportView(tabelaGF);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 420, 340, 107));

        tabelaGG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil", null, null, null, null},
                {"Suíça", null, null, null, null},
                {"Camarões", null, null, null, null},
                {"Gales", null, null, null, null}
            },
            new String [] {
                "Times", "Pontos", "Vitorias", "Derrotas", "Empates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGG.setRequestFocusEnabled(false);
        tabelaGG.setShowGrid(true);
        jScrollPane7.setViewportView(tabelaGG);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 540, 340, 107));

        jLabel155.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel155.setText("Classificação");
        getContentPane().add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnQa1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQa1StateChanged
        // TODO add your handling code here:
        grupoA[3].setGolsjogo1(Integer.parseInt(spnQa1.getValue().toString()));
    }//GEN-LAST:event_spnQa1StateChanged

    private void spnEq1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEq1StateChanged
        // TODO add your handling code here:
        grupoA[1].setGolsjogo1(Integer.parseInt(spnEq1.getValue().toString()));
    }//GEN-LAST:event_spnEq1StateChanged

    private void btnQaEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQaEqActionPerformed
        // Primeiro dou reset em todos os atributos que eu quero dos times
        grupoA[0].resetar();
        grupoA[1].resetar();
        grupoA[2].resetar();
        grupoA[3].resetar();
        grupoB[0].resetar();
        grupoB[1].resetar();
        grupoB[2].resetar();
        grupoB[3].resetar();
        grupoC[0].resetar();
        grupoC[1].resetar();
        grupoC[2].resetar();
        grupoC[3].resetar();
        grupoD[0].resetar();
        grupoD[1].resetar();
        grupoD[2].resetar();
        grupoD[3].resetar();
        grupoE[0].resetar();
        grupoE[1].resetar();
        grupoE[2].resetar();
        grupoE[3].resetar();
        grupoF[0].resetar();
        grupoF[1].resetar();
        grupoF[2].resetar();
        grupoF[3].resetar();
        grupoG[0].resetar();
        grupoG[1].resetar();
        grupoG[2].resetar();
        grupoG[3].resetar();
        grupoH[0].resetar();
        grupoH[1].resetar();
        grupoH[2].resetar();
        grupoH[3].resetar();
        //Lista de todos os jogos
        jogo.Jogo1(grupoA[3], grupoA[1]);
        jogo.Jogo1(grupoA[2], grupoA[0]);
        jogo.Jogo2(grupoA[3], grupoA[2]);
        jogo.Jogo2(grupoA[1], grupoA[0]);
        jogo.Jogo3(grupoA[3], grupoA[0]);
        jogo.Jogo3(grupoA[1], grupoA[2]);
        jogo.Jogo1(grupoB[0], grupoB[1]);
        jogo.Jogo1(grupoB[2], grupoB[3]);
        jogo.Jogo2(grupoB[3], grupoB[1]);
        jogo.Jogo2(grupoB[0], grupoB[2]);
        jogo.Jogo3(grupoB[1], grupoB[2]);
        jogo.Jogo3(grupoB[3], grupoB[0]);
        jogo.Jogo1(grupoC[1], grupoC[2]);
        jogo.Jogo1(grupoC[3], grupoC[0]);
        jogo.Jogo2(grupoC[0], grupoC[2]);
        jogo.Jogo2(grupoC[1], grupoC[3]);
        jogo.Jogo3(grupoC[0], grupoC[1]);
        jogo.Jogo3(grupoC[2], grupoC[3]);
        jogo.Jogo1(grupoD[2], grupoD[3]);
        jogo.Jogo1(grupoD[0], grupoD[1]);
        jogo.Jogo2(grupoD[1], grupoD[3]);
        jogo.Jogo2(grupoD[0], grupoD[2]);
        jogo.Jogo3(grupoD[0], grupoD[3]);
        jogo.Jogo3(grupoD[1], grupoD[2]);
        jogo.Jogo1(grupoE[3], grupoE[1]);
        jogo.Jogo1(grupoE[0], grupoE[2]);
        jogo.Jogo2(grupoE[1], grupoE[2]);
        jogo.Jogo2(grupoE[0], grupoE[3]);
        jogo.Jogo3(grupoE[0], grupoE[1]);
        jogo.Jogo3(grupoE[2], grupoE[3]);
        jogo.Jogo1(grupoF[1], grupoF[0]);
        jogo.Jogo1(grupoF[2], grupoF[3]);
        jogo.Jogo2(grupoF[2], grupoF[1]);
        jogo.Jogo2(grupoF[0], grupoF[3]);
        jogo.Jogo3(grupoF[0], grupoF[2]);
        jogo.Jogo3(grupoF[3], grupoF[1]);
        jogo.Jogo1(grupoG[1], grupoG[2]);
        jogo.Jogo1(grupoG[0], grupoG[3]);
        jogo.Jogo2(grupoG[2], grupoG[3]);
        jogo.Jogo2(grupoG[0], grupoG[1]);
        jogo.Jogo3(grupoG[0], grupoG[2]);
        jogo.Jogo3(grupoG[3], grupoG[1]);
        jogo.Jogo1(grupoH[2], grupoH[1]);
        jogo.Jogo1(grupoH[0], grupoH[3]);
        jogo.Jogo2(grupoH[1], grupoH[3]);
        jogo.Jogo2(grupoH[0], grupoH[2]);
        jogo.Jogo3(grupoH[0], grupoH[1]);
        jogo.Jogo3(grupoH[3], grupoH[2]);
        //Cálculo dos pontos
        for(int c=0;c<grupoA.length;c++){
            grupoA[c].setPontos();
            grupoA[c].setPontos();
            grupoA[c].setPontos();
            grupoA[c].setPontos();
            grupoB[c].setPontos();
            grupoB[c].setPontos();
            grupoB[c].setPontos();
            grupoB[c].setPontos();
            grupoC[c].setPontos();
            grupoC[c].setPontos();
            grupoC[c].setPontos();
            grupoC[c].setPontos();
            grupoD[c].setPontos();
            grupoD[c].setPontos();
            grupoD[c].setPontos();
            grupoD[c].setPontos();
            grupoE[c].setPontos();
            grupoE[c].setPontos();
            grupoE[c].setPontos();
            grupoE[c].setPontos();
            grupoF[c].setPontos();
            grupoF[c].setPontos();
            grupoF[c].setPontos();
            grupoF[c].setPontos();
            grupoG[c].setPontos();
            grupoG[c].setPontos();
            grupoG[c].setPontos();
            grupoG[c].setPontos();
            grupoH[c].setPontos();
            grupoH[c].setPontos();
            grupoH[c].setPontos();
            grupoH[c].setPontos();
        }
        //Preenchimento da tabela do Grupo A
        tabelaGA.setValueAt(grupoA[0].getNome(), 0,0);  
        tabelaGA.setValueAt(grupoA[1].getNome(), 1,0);  
        tabelaGA.setValueAt(grupoA[2].getNome(), 2,0);
        tabelaGA.setValueAt(grupoA[3].getNome(), 3,0);
        tabelaGA.setValueAt(grupoA[0].getPontos(), 0,1);  
        tabelaGA.setValueAt(grupoA[1].getPontos(), 1,1);  
        tabelaGA.setValueAt(grupoA[2].getPontos(), 2,1);
        tabelaGA.setValueAt(grupoA[3].getPontos(), 3,1);
        tabelaGA.setValueAt(grupoA[0].getVitorias(), 0,2);  
        tabelaGA.setValueAt(grupoA[1].getVitorias(), 1,2);  
        tabelaGA.setValueAt(grupoA[2].getVitorias(), 2,2);
        tabelaGA.setValueAt(grupoA[3].getVitorias(), 3,2);
        tabelaGA.setValueAt(grupoA[0].getDerrotas(), 0,3);  
        tabelaGA.setValueAt(grupoA[1].getDerrotas(), 1,3);  
        tabelaGA.setValueAt(grupoA[2].getDerrotas(), 2,3);
        tabelaGA.setValueAt(grupoA[3].getDerrotas(), 3,3);
        tabelaGA.setValueAt(grupoA[0].getEmpates(), 0,4);  
        tabelaGA.setValueAt(grupoA[1].getEmpates(), 1,4);  
        tabelaGA.setValueAt(grupoA[2].getEmpates(), 2,4);
        tabelaGA.setValueAt(grupoA[3].getEmpates(), 3,4);
        //Preenchimento da tabela do Grupo B
        tabelaGB.setValueAt(grupoB[0].getNome(), 0,0);  
        tabelaGB.setValueAt(grupoB[1].getNome(), 1,0);  
        tabelaGB.setValueAt(grupoB[2].getNome(), 2,0);
        tabelaGB.setValueAt(grupoB[3].getNome(), 3,0);
        tabelaGB.setValueAt(grupoB[0].getPontos(), 0,1);  
        tabelaGB.setValueAt(grupoB[1].getPontos(), 1,1);  
        tabelaGB.setValueAt(grupoB[2].getPontos(), 2,1);
        tabelaGB.setValueAt(grupoB[3].getPontos(), 3,1);
        tabelaGB.setValueAt(grupoB[0].getVitorias(), 0,2);  
        tabelaGB.setValueAt(grupoB[1].getVitorias(), 1,2);  
        tabelaGB.setValueAt(grupoB[2].getVitorias(), 2,2);
        tabelaGB.setValueAt(grupoB[3].getVitorias(), 3,2);
        tabelaGB.setValueAt(grupoB[0].getDerrotas(), 0,3);  
        tabelaGB.setValueAt(grupoB[1].getDerrotas(), 1,3);  
        tabelaGB.setValueAt(grupoB[2].getDerrotas(), 2,3);
        tabelaGB.setValueAt(grupoB[3].getDerrotas(), 3,3);
        tabelaGB.setValueAt(grupoB[0].getEmpates(), 0,4);  
        tabelaGB.setValueAt(grupoB[1].getEmpates(), 1,4);  
        tabelaGB.setValueAt(grupoB[2].getEmpates(), 2,4);
        tabelaGB.setValueAt(grupoB[3].getEmpates(), 3,4);
        //Preenchimento da Tabela do Grupo C
        tabelaGC.setValueAt(grupoC[0].getNome(), 0,0);  
        tabelaGC.setValueAt(grupoC[1].getNome(), 1,0);  
        tabelaGC.setValueAt(grupoC[2].getNome(), 2,0);
        tabelaGC.setValueAt(grupoC[3].getNome(), 3,0);
        tabelaGC.setValueAt(grupoC[0].getPontos(), 0,1);  
        tabelaGC.setValueAt(grupoC[1].getPontos(), 1,1);  
        tabelaGC.setValueAt(grupoC[2].getPontos(), 2,1);
        tabelaGC.setValueAt(grupoC[3].getPontos(), 3,1);
        tabelaGC.setValueAt(grupoC[0].getVitorias(), 0,2);  
        tabelaGC.setValueAt(grupoC[1].getVitorias(), 1,2);  
        tabelaGC.setValueAt(grupoC[2].getVitorias(), 2,2);
        tabelaGC.setValueAt(grupoC[3].getVitorias(), 3,2);
        tabelaGC.setValueAt(grupoC[0].getDerrotas(), 0,3);  
        tabelaGC.setValueAt(grupoC[1].getDerrotas(), 1,3);  
        tabelaGC.setValueAt(grupoC[2].getDerrotas(), 2,3);
        tabelaGC.setValueAt(grupoC[3].getDerrotas(), 3,3);
        tabelaGC.setValueAt(grupoC[0].getEmpates(), 0,4);  
        tabelaGC.setValueAt(grupoC[1].getEmpates(), 1,4);  
        tabelaGC.setValueAt(grupoC[2].getEmpates(), 2,4);
        tabelaGC.setValueAt(grupoC[3].getEmpates(), 3,4);
        //Preenchimento da Tabela do Grupo D
        tabelaGD.setValueAt(grupoD[0].getNome(), 0,0);  
        tabelaGD.setValueAt(grupoD[1].getNome(), 1,0);  
        tabelaGD.setValueAt(grupoD[2].getNome(), 2,0);
        tabelaGD.setValueAt(grupoD[3].getNome(), 3,0);
        tabelaGD.setValueAt(grupoD[0].getPontos(), 0,1);  
        tabelaGD.setValueAt(grupoD[1].getPontos(), 1,1);  
        tabelaGD.setValueAt(grupoD[2].getPontos(), 2,1);
        tabelaGD.setValueAt(grupoD[3].getPontos(), 3,1);
        tabelaGD.setValueAt(grupoD[0].getVitorias(), 0,2);  
        tabelaGD.setValueAt(grupoD[1].getVitorias(), 1,2);  
        tabelaGD.setValueAt(grupoD[2].getVitorias(), 2,2);
        tabelaGD.setValueAt(grupoD[3].getVitorias(), 3,2);
        tabelaGD.setValueAt(grupoD[0].getDerrotas(), 0,3);  
        tabelaGD.setValueAt(grupoD[1].getDerrotas(), 1,3);  
        tabelaGD.setValueAt(grupoD[2].getDerrotas(), 2,3);
        tabelaGD.setValueAt(grupoD[3].getDerrotas(), 3,3);
        tabelaGD.setValueAt(grupoD[0].getEmpates(), 0,4);  
        tabelaGD.setValueAt(grupoD[1].getEmpates(), 1,4);  
        tabelaGD.setValueAt(grupoD[2].getEmpates(), 2,4);
        tabelaGD.setValueAt(grupoD[3].getEmpates(), 3,4);
        //Preenchimento da Tabela do Grupo E
        tabelaGE.setValueAt(grupoE[0].getNome(), 0,0);  
        tabelaGE.setValueAt(grupoE[1].getNome(), 1,0);  
        tabelaGE.setValueAt(grupoE[2].getNome(), 2,0);
        tabelaGE.setValueAt(grupoE[3].getNome(), 3,0);
        tabelaGE.setValueAt(grupoE[0].getPontos(), 0,1);  
        tabelaGE.setValueAt(grupoE[1].getPontos(), 1,1);  
        tabelaGE.setValueAt(grupoE[2].getPontos(), 2,1);
        tabelaGE.setValueAt(grupoE[3].getPontos(), 3,1);
        tabelaGE.setValueAt(grupoE[0].getVitorias(), 0,2);  
        tabelaGE.setValueAt(grupoE[1].getVitorias(), 1,2);  
        tabelaGE.setValueAt(grupoE[2].getVitorias(), 2,2);
        tabelaGE.setValueAt(grupoE[3].getVitorias(), 3,2);
        tabelaGE.setValueAt(grupoE[0].getDerrotas(), 0,3);  
        tabelaGE.setValueAt(grupoE[1].getDerrotas(), 1,3);  
        tabelaGE.setValueAt(grupoE[2].getDerrotas(), 2,3);
        tabelaGE.setValueAt(grupoE[3].getDerrotas(), 3,3);
        tabelaGE.setValueAt(grupoE[0].getEmpates(), 0,4);  
        tabelaGE.setValueAt(grupoE[1].getEmpates(), 1,4);  
        tabelaGE.setValueAt(grupoE[2].getEmpates(), 2,4);
        tabelaGE.setValueAt(grupoE[3].getEmpates(), 3,4);
        //Preenchimento da Tabela do Grupo F
        tabelaGF.setValueAt(grupoF[0].getNome(), 0,0);  
        tabelaGF.setValueAt(grupoF[1].getNome(), 1,0);  
        tabelaGF.setValueAt(grupoF[2].getNome(), 2,0);
        tabelaGF.setValueAt(grupoF[3].getNome(), 3,0);
        tabelaGF.setValueAt(grupoF[0].getPontos(), 0,1);  
        tabelaGF.setValueAt(grupoF[1].getPontos(), 1,1);  
        tabelaGF.setValueAt(grupoF[2].getPontos(), 2,1);
        tabelaGF.setValueAt(grupoF[3].getPontos(), 3,1);
        tabelaGF.setValueAt(grupoF[0].getVitorias(), 0,2);  
        tabelaGF.setValueAt(grupoF[1].getVitorias(), 1,2);  
        tabelaGF.setValueAt(grupoF[2].getVitorias(), 2,2);
        tabelaGF.setValueAt(grupoF[3].getVitorias(), 3,2);
        tabelaGF.setValueAt(grupoF[0].getDerrotas(), 0,3);  
        tabelaGF.setValueAt(grupoF[1].getDerrotas(), 1,3);  
        tabelaGF.setValueAt(grupoF[2].getDerrotas(), 2,3);
        tabelaGF.setValueAt(grupoF[3].getDerrotas(), 3,3);
        tabelaGF.setValueAt(grupoF[0].getEmpates(), 0,4);  
        tabelaGF.setValueAt(grupoF[1].getEmpates(), 1,4);  
        tabelaGF.setValueAt(grupoF[2].getEmpates(), 2,4);
        tabelaGF.setValueAt(grupoF[3].getEmpates(), 3,4);
        //Preenchimento da Tabela do Grupo G
        tabelaGG.setValueAt(grupoG[0].getNome(), 0,0);  
        tabelaGG.setValueAt(grupoG[1].getNome(), 1,0);  
        tabelaGG.setValueAt(grupoG[2].getNome(), 2,0);
        tabelaGG.setValueAt(grupoG[3].getNome(), 3,0);
        tabelaGG.setValueAt(grupoG[0].getPontos(), 0,1);  
        tabelaGG.setValueAt(grupoG[1].getPontos(), 1,1);  
        tabelaGG.setValueAt(grupoG[2].getPontos(), 2,1);
        tabelaGG.setValueAt(grupoG[3].getPontos(), 3,1);
        tabelaGG.setValueAt(grupoG[0].getVitorias(), 0,2);  
        tabelaGG.setValueAt(grupoG[1].getVitorias(), 1,2);  
        tabelaGG.setValueAt(grupoG[2].getVitorias(), 2,2);
        tabelaGG.setValueAt(grupoG[3].getVitorias(), 3,2);
        tabelaGG.setValueAt(grupoG[0].getDerrotas(), 0,3);  
        tabelaGG.setValueAt(grupoG[1].getDerrotas(), 1,3);  
        tabelaGG.setValueAt(grupoG[2].getDerrotas(), 2,3);
        tabelaGG.setValueAt(grupoG[3].getDerrotas(), 3,3);
        tabelaGG.setValueAt(grupoG[0].getEmpates(), 0,4);  
        tabelaGG.setValueAt(grupoG[1].getEmpates(), 1,4);  
        tabelaGG.setValueAt(grupoG[2].getEmpates(), 2,4);
        tabelaGG.setValueAt(grupoG[3].getEmpates(), 3,4);
        //Preenchimento da Tabela do Grupo H
        tabelaGH.setValueAt(grupoH[0].getNome(), 0,0);  
        tabelaGH.setValueAt(grupoH[1].getNome(), 1,0);  
        tabelaGH.setValueAt(grupoH[2].getNome(), 2,0);
        tabelaGH.setValueAt(grupoH[3].getNome(), 3,0);
        tabelaGH.setValueAt(grupoH[0].getPontos(), 0,1);  
        tabelaGH.setValueAt(grupoH[1].getPontos(), 1,1);  
        tabelaGH.setValueAt(grupoH[2].getPontos(), 2,1);
        tabelaGH.setValueAt(grupoH[3].getPontos(), 3,1);
        tabelaGH.setValueAt(grupoH[0].getVitorias(), 0,2);  
        tabelaGH.setValueAt(grupoH[1].getVitorias(), 1,2);  
        tabelaGH.setValueAt(grupoH[2].getVitorias(), 2,2);
        tabelaGH.setValueAt(grupoH[3].getVitorias(), 3,2);
        tabelaGH.setValueAt(grupoH[0].getDerrotas(), 0,3);  
        tabelaGH.setValueAt(grupoH[1].getDerrotas(), 1,3);  
        tabelaGH.setValueAt(grupoH[2].getDerrotas(), 2,3);
        tabelaGH.setValueAt(grupoH[3].getDerrotas(), 3,3);
        tabelaGH.setValueAt(grupoH[0].getEmpates(), 0,4);  
        tabelaGH.setValueAt(grupoH[1].getEmpates(), 1,4);  
        tabelaGH.setValueAt(grupoH[2].getEmpates(), 2,4);
        tabelaGH.setValueAt(grupoH[3].getEmpates(), 3,4);
    }//GEN-LAST:event_btnQaEqActionPerformed

    private void spnSe1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSe1StateChanged
        // TODO add your handling code here:
        grupoA[2].setGolsjogo1(Integer.parseInt(spnSe1.getValue().toString()));
    }//GEN-LAST:event_spnSe1StateChanged

    private void spnHo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnHo1StateChanged
        // TODO add your handling code here:
        grupoA[0].setGolsjogo1(Integer.parseInt(spnHo1.getValue().toString()));
    }//GEN-LAST:event_spnHo1StateChanged

    private void spnQa2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQa2StateChanged
        // TODO add your handling code here:
        grupoA[3].setGolsjogo2(Integer.parseInt(spnQa2.getValue().toString()));
    }//GEN-LAST:event_spnQa2StateChanged

    private void spnSe2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSe2StateChanged
        // TODO add your handling code here:
        grupoA[2].setGolsjogo2(Integer.parseInt(spnSe2.getValue().toString()));
    }//GEN-LAST:event_spnSe2StateChanged

    private void spnEq2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEq2StateChanged
        // TODO add your handling code here:
        grupoA[1].setGolsjogo2(Integer.parseInt(spnEq2.getValue().toString()));
    }//GEN-LAST:event_spnEq2StateChanged

    private void spnHo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnHo2StateChanged
        // TODO add your handling code here:
        grupoA[0].setGolsjogo2(Integer.parseInt(spnHo2.getValue().toString()));
    }//GEN-LAST:event_spnHo2StateChanged

    private void spnQa3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQa3StateChanged
        // TODO add your handling code here:
        grupoA[3].setGolsjogo3(Integer.parseInt(spnQa3.getValue().toString()));
    }//GEN-LAST:event_spnQa3StateChanged

    private void spnHo3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnHo3StateChanged
        // TODO add your handling code here:
        grupoA[0].setGolsjogo3(Integer.parseInt(spnHo3.getValue().toString()));
    }//GEN-LAST:event_spnHo3StateChanged

    private void spnEq3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEq3StateChanged
        // TODO add your handling code here:
        grupoA[1].setGolsjogo3(Integer.parseInt(spnEq3.getValue().toString()));
    }//GEN-LAST:event_spnEq3StateChanged

    private void spnSe3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSe3StateChanged
        // TODO add your handling code here:
        grupoA[2].setGolsjogo3(Integer.parseInt(spnSe3.getValue().toString()));
    }//GEN-LAST:event_spnSe3StateChanged

    private void spnEua3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEua3StateChanged
        // TODO add your handling code here:
        grupoB[2].setGolsjogo3(Integer.parseInt(spnEua3.getValue().toString()));
    }//GEN-LAST:event_spnEua3StateChanged

    private void spnIra1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIra1StateChanged
        // TODO add your handling code here:
        grupoB[1].setGolsjogo1(Integer.parseInt(spnIra1.getValue().toString()));
    }//GEN-LAST:event_spnIra1StateChanged

    private void spnIn1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIn1StateChanged
        // TODO add your handling code here:
        grupoB[0].setGolsjogo1(Integer.parseInt(spnIn1.getValue().toString()));
    }//GEN-LAST:event_spnIn1StateChanged

    private void spnEua1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEua1StateChanged
        // TODO add your handling code here:
        grupoB[2].setGolsjogo1(Integer.parseInt(spnEua1.getValue().toString()));
    }//GEN-LAST:event_spnEua1StateChanged

    private void spnGal1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGal1StateChanged
        // TODO add your handling code here:
        grupoB[3].setGolsjogo1(Integer.parseInt(spnGal1.getValue().toString()));
    }//GEN-LAST:event_spnGal1StateChanged

    private void spnEua2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEua2StateChanged
        // TODO add your handling code here:
        grupoB[2].setGolsjogo2(Integer.parseInt(spnEua2.getValue().toString()));
    }//GEN-LAST:event_spnEua2StateChanged

    private void spnIn2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIn2StateChanged
        // TODO add your handling code here:
        grupoB[0].setGolsjogo2(Integer.parseInt(spnIn2.getValue().toString()));
    }//GEN-LAST:event_spnIn2StateChanged

    private void spnIra2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIra2StateChanged
        // TODO add your handling code here:
        grupoB[1].setGolsjogo2(Integer.parseInt(spnIra2.getValue().toString()));
    }//GEN-LAST:event_spnIra2StateChanged

    private void spnGal2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGal2StateChanged
        // TODO add your handling code here:
        grupoB[3].setGolsjogo2(Integer.parseInt(spnGal2.getValue().toString()));
    }//GEN-LAST:event_spnGal2StateChanged

    private void spnGal3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGal3StateChanged
        // TODO add your handling code here:
        grupoB[3].setGolsjogo3(Integer.parseInt(spnGal3.getValue().toString()));
    }//GEN-LAST:event_spnGal3StateChanged

    private void spnIn3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIn3StateChanged
        // TODO add your handling code here:
        grupoB[0].setGolsjogo3(Integer.parseInt(spnIn3.getValue().toString()));
    }//GEN-LAST:event_spnIn3StateChanged

    private void spnIra3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIra3StateChanged
        // TODO add your handling code here:
        grupoB[1].setGolsjogo3(Integer.parseInt(spnIra3.getValue().toString()));
    }//GEN-LAST:event_spnIra3StateChanged

    private void spnMex3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMex3StateChanged
        // TODO add your handling code here:
        grupoC[3].setGolsjogo3(Integer.parseInt(spnMex3.getValue().toString()));
    }//GEN-LAST:event_spnMex3StateChanged

    private void spnAra1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAra1StateChanged
        // TODO add your handling code here:
        grupoC[2].setGolsjogo1(Integer.parseInt(spnAra1.getValue().toString()));
    }//GEN-LAST:event_spnAra1StateChanged

    private void spnArg1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnArg1StateChanged
        // TODO add your handling code here:
        grupoC[1].setGolsjogo1(Integer.parseInt(spnArg1.getValue().toString()));
    }//GEN-LAST:event_spnArg1StateChanged

    private void spnMex1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMex1StateChanged
        // TODO add your handling code here:
        grupoC[3].setGolsjogo1(Integer.parseInt(spnMex1.getValue().toString()));
    }//GEN-LAST:event_spnMex1StateChanged

    private void spnPol1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPol1StateChanged
        // TODO add your handling code here:
        grupoC[0].setGolsjogo1(Integer.parseInt(spnPol1.getValue().toString()));
    }//GEN-LAST:event_spnPol1StateChanged

    private void spnMex2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMex2StateChanged
        // TODO add your handling code here:
        grupoC[3].setGolsjogo2(Integer.parseInt(spnMex2.getValue().toString()));
    }//GEN-LAST:event_spnMex2StateChanged

    private void spnArg2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnArg2StateChanged
        // TODO add your handling code here:
        grupoC[1].setGolsjogo2(Integer.parseInt(spnArg2.getValue().toString()));
    }//GEN-LAST:event_spnArg2StateChanged

    private void spnAra2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAra2StateChanged
        // TODO add your handling code here:
        grupoC[2].setGolsjogo2(Integer.parseInt(spnAra2.getValue().toString()));
    }//GEN-LAST:event_spnAra2StateChanged

    private void spnPol2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPol2StateChanged
        // TODO add your handling code here:
        grupoC[0].setGolsjogo2(Integer.parseInt(spnPol2.getValue().toString()));
    }//GEN-LAST:event_spnPol2StateChanged

    private void spnPol3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPol3StateChanged
        // TODO add your handling code here:
        grupoC[0].setGolsjogo3(Integer.parseInt(spnPol3.getValue().toString()));
    }//GEN-LAST:event_spnPol3StateChanged

    private void spnArg3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnArg3StateChanged
        // TODO add your handling code here:
        grupoC[1].setGolsjogo3(Integer.parseInt(spnArg3.getValue().toString()));
    }//GEN-LAST:event_spnArg3StateChanged

    private void spnAra3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAra3StateChanged
        // TODO add your handling code here:
        grupoC[2].setGolsjogo3(Integer.parseInt(spnAra3.getValue().toString()));
    }//GEN-LAST:event_spnAra3StateChanged

    private void spnFra3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnFra3StateChanged
        // TODO add your handling code here:
        grupoD[0].setGolsjogo3(Integer.parseInt(spnFra3.getValue().toString()));
    }//GEN-LAST:event_spnFra3StateChanged

    private void spnTun1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTun1StateChanged
        // TODO add your handling code here:
        grupoD[3].setGolsjogo1(Integer.parseInt(spnTun1.getValue().toString()));
    }//GEN-LAST:event_spnTun1StateChanged

    private void spnDin1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDin1StateChanged
        // TODO add your handling code here:
        grupoD[2].setGolsjogo1(Integer.parseInt(spnDin1.getValue().toString()));
    }//GEN-LAST:event_spnDin1StateChanged

    private void spnFra1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnFra1StateChanged
        // TODO add your handling code here:
        grupoD[0].setGolsjogo1(Integer.parseInt(spnFra1.getValue().toString()));
    }//GEN-LAST:event_spnFra1StateChanged

    private void spnAus1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAus1StateChanged
        // TODO add your handling code here:
        grupoD[1].setGolsjogo1(Integer.parseInt(spnAus1.getValue().toString()));
    }//GEN-LAST:event_spnAus1StateChanged

    private void spnFra2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnFra2StateChanged
        // TODO add your handling code here:
        grupoD[0].setGolsjogo2(Integer.parseInt(spnFra2.getValue().toString()));
    }//GEN-LAST:event_spnFra2StateChanged

    private void spnDin2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDin2StateChanged
        // TODO add your handling code here:
        grupoD[2].setGolsjogo2(Integer.parseInt(spnDin2.getValue().toString()));
    }//GEN-LAST:event_spnDin2StateChanged

    private void spnTun2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTun2StateChanged
        // TODO add your handling code here:
        grupoD[3].setGolsjogo2(Integer.parseInt(spnTun2.getValue().toString()));
    }//GEN-LAST:event_spnTun2StateChanged

    private void spnAus2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAus2StateChanged
        // TODO add your handling code here:
        grupoD[1].setGolsjogo2(Integer.parseInt(spnAus2.getValue().toString()));
    }//GEN-LAST:event_spnAus2StateChanged

    private void spnAus3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAus3StateChanged
        // TODO add your handling code here:
        grupoD[1].setGolsjogo3(Integer.parseInt(spnAus3.getValue().toString()));
    }//GEN-LAST:event_spnAus3StateChanged

    private void spnDin3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDin3StateChanged
        // TODO add your handling code here:
        grupoD[2].setGolsjogo3(Integer.parseInt(spnDin3.getValue().toString()));
    }//GEN-LAST:event_spnDin3StateChanged

    private void spnTun3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTun3StateChanged
        // TODO add your handling code here:
        grupoD[3].setGolsjogo3(Integer.parseInt(spnTun3.getValue().toString()));
    }//GEN-LAST:event_spnTun3StateChanged

    private void spnEsp3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEsp3StateChanged
        // TODO add your handling code here:
        grupoE[0].setGolsjogo3(Integer.parseInt(spnEsp3.getValue().toString()));
    }//GEN-LAST:event_spnEsp3StateChanged

    private void spnJap1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnJap1StateChanged
        // TODO add your handling code here:
        grupoE[1].setGolsjogo1(Integer.parseInt(spnJap1.getValue().toString()));
    }//GEN-LAST:event_spnJap1StateChanged

    private void spnAle1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAle1StateChanged
        // TODO add your handling code here:
        grupoE[3].setGolsjogo1(Integer.parseInt(spnAle3.getValue().toString()));
    }//GEN-LAST:event_spnAle1StateChanged

    private void spnEsp1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEsp1StateChanged
        // TODO add your handling code here:
        grupoE[0].setGolsjogo1(Integer.parseInt(spnEsp1.getValue().toString()));
    }//GEN-LAST:event_spnEsp1StateChanged

    private void spnCos1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCos1StateChanged
        // TODO add your handling code here:
        grupoE[2].setGolsjogo1(Integer.parseInt(spnCos1.getValue().toString()));
    }//GEN-LAST:event_spnCos1StateChanged

    private void spnEsp2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEsp2StateChanged
        // TODO add your handling code here:
        grupoE[0].setGolsjogo2(Integer.parseInt(spnEsp2.getValue().toString()));
    }//GEN-LAST:event_spnEsp2StateChanged

    private void spnAle2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAle2StateChanged
        // TODO add your handling code here:
        grupoE[3].setGolsjogo2(Integer.parseInt(spnAle2.getValue().toString()));
    }//GEN-LAST:event_spnAle2StateChanged

    private void spnJap2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnJap2StateChanged
        // TODO add your handling code here:
        grupoE[1].setGolsjogo2(Integer.parseInt(spnJap2.getValue().toString()));
    }//GEN-LAST:event_spnJap2StateChanged

    private void spnCos2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCos2StateChanged
        // TODO add your handling code here:
        grupoE[2].setGolsjogo2(Integer.parseInt(spnCos2.getValue().toString()));
    }//GEN-LAST:event_spnCos2StateChanged

    private void spnCos3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCos3StateChanged
        // TODO add your handling code here:
        grupoE[2].setGolsjogo3(Integer.parseInt(spnCos3.getValue().toString()));
    }//GEN-LAST:event_spnCos3StateChanged

    private void spnAle3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAle3StateChanged
        // TODO add your handling code here:
        grupoE[3].setGolsjogo3(Integer.parseInt(spnAle3.getValue().toString()));
    }//GEN-LAST:event_spnAle3StateChanged

    private void spnJap3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnJap3StateChanged
        // TODO add your handling code here:
        grupoE[1].setGolsjogo3(Integer.parseInt(spnJap3.getValue().toString()));
    }//GEN-LAST:event_spnJap3StateChanged

    private void spnMar3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMar3StateChanged
        // TODO add your handling code here:
        grupoF[1].setGolsjogo3(Integer.parseInt(spnMar3.getValue().toString()));
    }//GEN-LAST:event_spnMar3StateChanged

    private void spnCro1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCro1StateChanged
        // TODO add your handling code here:
        grupoF[0].setGolsjogo1(Integer.parseInt(spnCro1.getValue().toString()));
    }//GEN-LAST:event_spnCro1StateChanged

    private void spnMar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMar1StateChanged
        // TODO add your handling code here:
        grupoF[1].setGolsjogo1(Integer.parseInt(spnMar1.getValue().toString()));
    }//GEN-LAST:event_spnMar1StateChanged

    private void spnBel1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBel1StateChanged
        // TODO add your handling code here:
        grupoF[2].setGolsjogo1(Integer.parseInt(spnBel1.getValue().toString()));
    }//GEN-LAST:event_spnBel1StateChanged

    private void spnCan1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCan1StateChanged
        // TODO add your handling code here:
        grupoF[3].setGolsjogo1(Integer.parseInt(spnCan1.getValue().toString()));
    }//GEN-LAST:event_spnCan1StateChanged

    private void spnMar2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMar2StateChanged
        // TODO add your handling code here:
        grupoF[1].setGolsjogo2(Integer.parseInt(spnMar2.getValue().toString()));
    }//GEN-LAST:event_spnMar2StateChanged

    private void spnBel2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBel2StateChanged
        // TODO add your handling code here:
        grupoF[2].setGolsjogo2(Integer.parseInt(spnBel2.getValue().toString()));
    }//GEN-LAST:event_spnBel2StateChanged

    private void spnCro2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCro2StateChanged
        // TODO add your handling code here:
        grupoF[0].setGolsjogo2(Integer.parseInt(spnCro2.getValue().toString()));
    }//GEN-LAST:event_spnCro2StateChanged

    private void spnCan2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCan2StateChanged
        // TODO add your handling code here:
        grupoF[3].setGolsjogo2(Integer.parseInt(spnCan2.getValue().toString()));
    }//GEN-LAST:event_spnCan2StateChanged

    private void spnBel3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBel3StateChanged
        // TODO add your handling code here:
        grupoF[2].setGolsjogo3(Integer.parseInt(spnBel3.getValue().toString()));
    }//GEN-LAST:event_spnBel3StateChanged

    private void spnCro3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCro3StateChanged
        // TODO add your handling code here:
        grupoF[0].setGolsjogo3(Integer.parseInt(spnCro3.getValue().toString()));
    }//GEN-LAST:event_spnCro3StateChanged

    private void spnCan3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCan3StateChanged
        // TODO add your handling code here:
        grupoF[3].setGolsjogo3(Integer.parseInt(spnCan3.getValue().toString()));
    }//GEN-LAST:event_spnCan3StateChanged

    private void spnCam3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCam3StateChanged
        // TODO add your handling code here:
        grupoG[2].setGolsjogo3(Integer.parseInt(spnCam3.getValue().toString()));
    }//GEN-LAST:event_spnCam3StateChanged

    private void spnCam1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCam1StateChanged
        // TODO add your handling code here:
        grupoG[2].setGolsjogo1(Integer.parseInt(spnCam1.getValue().toString()));
    }//GEN-LAST:event_spnCam1StateChanged

    private void spnSui1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSui1StateChanged
        // TODO add your handling code here:
        grupoG[1].setGolsjogo1(Integer.parseInt(spnSui1.getValue().toString()));
    }//GEN-LAST:event_spnSui1StateChanged

    private void spnBra1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBra1StateChanged
        // TODO add your handling code here:
        grupoG[0].setGolsjogo1(Integer.parseInt(spnBra1.getValue().toString()));
    }//GEN-LAST:event_spnBra1StateChanged

    private void spnSer1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSer1StateChanged
        // TODO add your handling code here:
        grupoG[3].setGolsjogo1(Integer.parseInt(spnSer1.getValue().toString()));
    }//GEN-LAST:event_spnSer1StateChanged

    private void spnBra2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBra2StateChanged
        // TODO add your handling code here:
        grupoG[0].setGolsjogo2(Integer.parseInt(spnBra2.getValue().toString()));
    }//GEN-LAST:event_spnBra2StateChanged

    private void spnSui2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSui2StateChanged
        // TODO add your handling code here:
        grupoG[1].setGolsjogo2(Integer.parseInt(spnSui2.getValue().toString()));
    }//GEN-LAST:event_spnSui2StateChanged

    private void spnCam2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCam2StateChanged
        // TODO add your handling code here:
        grupoG[2].setGolsjogo2(Integer.parseInt(spnCam2.getValue().toString()));
    }//GEN-LAST:event_spnCam2StateChanged

    private void spnSer2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSer2StateChanged
        // TODO add your handling code here:
        grupoG[3].setGolsjogo2(Integer.parseInt(spnSer2.getValue().toString()));
    }//GEN-LAST:event_spnSer2StateChanged

    private void spnSer3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSer3StateChanged
        // TODO add your handling code here:
        grupoG[3].setGolsjogo3(Integer.parseInt(spnSer3.getValue().toString()));
    }//GEN-LAST:event_spnSer3StateChanged

    private void spnSui3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSui3StateChanged
        // TODO add your handling code here:
        grupoG[1].setGolsjogo3(Integer.parseInt(spnSui3.getValue().toString()));
    }//GEN-LAST:event_spnSui3StateChanged

    private void spnBra3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBra3StateChanged
        // TODO add your handling code here:
        grupoG[0].setGolsjogo3(Integer.parseInt(spnBra3.getValue().toString()));
    }//GEN-LAST:event_spnBra3StateChanged

    private void spnPor3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPor3StateChanged
        // TODO add your handling code here:
        grupoH[0].setGolsjogo3(Integer.parseInt(spnPor3.getValue().toString()));
    }//GEN-LAST:event_spnPor3StateChanged

    private void spnKor1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnKor1StateChanged
        // TODO add your handling code here:
        grupoH[1].setGolsjogo1(Integer.parseInt(spnKor1.getValue().toString()));
    }//GEN-LAST:event_spnKor1StateChanged

    private void spnUru1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnUru1StateChanged
        // TODO add your handling code here:
        grupoH[2].setGolsjogo1(Integer.parseInt(spnUru1.getValue().toString()));
    }//GEN-LAST:event_spnUru1StateChanged

    private void spnPor1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPor1StateChanged
        // TODO add your handling code here:
        grupoH[0].setGolsjogo1(Integer.parseInt(spnPor1.getValue().toString()));
    }//GEN-LAST:event_spnPor1StateChanged

    private void spnGan1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGan1StateChanged
        // TODO add your handling code here:
        grupoH[3].setGolsjogo1(Integer.parseInt(spnGan1.getValue().toString()));
    }//GEN-LAST:event_spnGan1StateChanged

    private void spnPor2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPor2StateChanged
        // TODO add your handling code here:
        grupoH[0].setGolsjogo2(Integer.parseInt(spnPor2.getValue().toString()));
    }//GEN-LAST:event_spnPor2StateChanged

    private void spnUru2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnUru2StateChanged
        // TODO add your handling code here:
        grupoH[2].setGolsjogo2(Integer.parseInt(spnUru2.getValue().toString()));
    }//GEN-LAST:event_spnUru2StateChanged

    private void spnKor2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnKor2StateChanged
        // TODO add your handling code here:
        grupoH[1].setGolsjogo2(Integer.parseInt(spnKor2.getValue().toString()));
    }//GEN-LAST:event_spnKor2StateChanged

    private void spnGan2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGan2StateChanged
        // TODO add your handling code here:
        grupoH[3].setGolsjogo2(Integer.parseInt(spnGan2.getValue().toString()));
    }//GEN-LAST:event_spnGan2StateChanged

    private void spnGan3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGan3StateChanged
        // TODO add your handling code here:
        grupoH[3].setGolsjogo3(Integer.parseInt(spnGan3.getValue().toString()));
    }//GEN-LAST:event_spnGan3StateChanged

    private void spnUru3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnUru3StateChanged
        // TODO add your handling code here:
        grupoH[2].setGolsjogo3(Integer.parseInt(spnUru3.getValue().toString()));
    }//GEN-LAST:event_spnUru3StateChanged

    private void spnKor3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnKor3StateChanged
        // TODO add your handling code here:
        grupoH[1].setGolsjogo3(Integer.parseInt(spnKor3.getValue().toString()));
    }//GEN-LAST:event_spnKor3StateChanged

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
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQaEq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblSe;
    private javax.swing.JLabel lblSe1;
    private javax.swing.JLabel lblSe2;
    private javax.swing.JLabel lblSe3;
    private javax.swing.JLabel lblSe4;
    private javax.swing.JLabel lblSe5;
    private javax.swing.JLabel lblSe6;
    private javax.swing.JLabel lblSe7;
    private javax.swing.JSpinner spnAle1;
    private javax.swing.JSpinner spnAle2;
    private javax.swing.JSpinner spnAle3;
    private javax.swing.JSpinner spnAra1;
    private javax.swing.JSpinner spnAra2;
    private javax.swing.JSpinner spnAra3;
    private javax.swing.JSpinner spnArg1;
    private javax.swing.JSpinner spnArg2;
    private javax.swing.JSpinner spnArg3;
    private javax.swing.JSpinner spnAus1;
    private javax.swing.JSpinner spnAus2;
    private javax.swing.JSpinner spnAus3;
    private javax.swing.JSpinner spnBel1;
    private javax.swing.JSpinner spnBel2;
    private javax.swing.JSpinner spnBel3;
    private javax.swing.JSpinner spnBra1;
    private javax.swing.JSpinner spnBra2;
    private javax.swing.JSpinner spnBra3;
    private javax.swing.JSpinner spnCam1;
    private javax.swing.JSpinner spnCam2;
    private javax.swing.JSpinner spnCam3;
    private javax.swing.JSpinner spnCan1;
    private javax.swing.JSpinner spnCan2;
    private javax.swing.JSpinner spnCan3;
    private javax.swing.JSpinner spnCos1;
    private javax.swing.JSpinner spnCos2;
    private javax.swing.JSpinner spnCos3;
    private javax.swing.JSpinner spnCro1;
    private javax.swing.JSpinner spnCro2;
    private javax.swing.JSpinner spnCro3;
    private javax.swing.JSpinner spnDin1;
    private javax.swing.JSpinner spnDin2;
    private javax.swing.JSpinner spnDin3;
    private javax.swing.JSpinner spnEq1;
    private javax.swing.JSpinner spnEq2;
    private javax.swing.JSpinner spnEq3;
    private javax.swing.JSpinner spnEsp1;
    private javax.swing.JSpinner spnEsp2;
    private javax.swing.JSpinner spnEsp3;
    private javax.swing.JSpinner spnEua1;
    private javax.swing.JSpinner spnEua2;
    private javax.swing.JSpinner spnEua3;
    private javax.swing.JSpinner spnFra1;
    private javax.swing.JSpinner spnFra2;
    private javax.swing.JSpinner spnFra3;
    private javax.swing.JSpinner spnGal1;
    private javax.swing.JSpinner spnGal2;
    private javax.swing.JSpinner spnGal3;
    private javax.swing.JSpinner spnGan1;
    private javax.swing.JSpinner spnGan2;
    private javax.swing.JSpinner spnGan3;
    private javax.swing.JSpinner spnHo1;
    private javax.swing.JSpinner spnHo2;
    private javax.swing.JSpinner spnHo3;
    private javax.swing.JSpinner spnIn1;
    private javax.swing.JSpinner spnIn2;
    private javax.swing.JSpinner spnIn3;
    private javax.swing.JSpinner spnIra1;
    private javax.swing.JSpinner spnIra2;
    private javax.swing.JSpinner spnIra3;
    private javax.swing.JSpinner spnJap1;
    private javax.swing.JSpinner spnJap2;
    private javax.swing.JSpinner spnJap3;
    private javax.swing.JSpinner spnKor1;
    private javax.swing.JSpinner spnKor2;
    private javax.swing.JSpinner spnKor3;
    private javax.swing.JSpinner spnMar1;
    private javax.swing.JSpinner spnMar2;
    private javax.swing.JSpinner spnMar3;
    private javax.swing.JSpinner spnMex1;
    private javax.swing.JSpinner spnMex2;
    private javax.swing.JSpinner spnMex3;
    private javax.swing.JSpinner spnPol1;
    private javax.swing.JSpinner spnPol2;
    private javax.swing.JSpinner spnPol3;
    private javax.swing.JSpinner spnPor1;
    private javax.swing.JSpinner spnPor2;
    private javax.swing.JSpinner spnPor3;
    private javax.swing.JSpinner spnQa1;
    private javax.swing.JSpinner spnQa2;
    private javax.swing.JSpinner spnQa3;
    private javax.swing.JSpinner spnSe1;
    private javax.swing.JSpinner spnSe2;
    private javax.swing.JSpinner spnSe3;
    private javax.swing.JSpinner spnSer1;
    private javax.swing.JSpinner spnSer2;
    private javax.swing.JSpinner spnSer3;
    private javax.swing.JSpinner spnSui1;
    private javax.swing.JSpinner spnSui2;
    private javax.swing.JSpinner spnSui3;
    private javax.swing.JSpinner spnTun1;
    private javax.swing.JSpinner spnTun2;
    private javax.swing.JSpinner spnTun3;
    private javax.swing.JSpinner spnUru1;
    private javax.swing.JSpinner spnUru2;
    private javax.swing.JSpinner spnUru3;
    private javax.swing.JTable tabelaGA;
    private javax.swing.JTable tabelaGB;
    private javax.swing.JTable tabelaGC;
    private javax.swing.JTable tabelaGD;
    private javax.swing.JTable tabelaGE;
    private javax.swing.JTable tabelaGF;
    private javax.swing.JTable tabelaGG;
    private javax.swing.JTable tabelaGH;
    // End of variables declaration//GEN-END:variables
}
