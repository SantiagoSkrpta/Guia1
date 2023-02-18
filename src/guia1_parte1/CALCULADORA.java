package guia1_parte1;

import java.awt.Color;
public class CALCULADORA extends javax.swing.JFrame {
    public boolean punto=true;
    public String signo;
    public Float a,b,c;  
     
    
    Guia1_calculadora obj= new Guia1_calculadora();
    
    
    public CALCULADORA() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        botonborrar = new javax.swing.JButton();
        botonborr1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        boton0raiz = new javax.swing.JButton();
        boton0potencia = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton0sin = new javax.swing.JButton();
        boton0tan = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton0cos = new javax.swing.JButton();
        boton_dot = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        boton0igual = new javax.swing.JButton();
        boton0div = new javax.swing.JButton();
        boton0por = new javax.swing.JButton();
        boton0resta = new javax.swing.JButton();
        boton0suma = new javax.swing.JButton();
        boton0arcsin = new javax.swing.JButton();
        boton0arccos = new javax.swing.JButton();
        boton0arctan = new javax.swing.JButton();
        boton0log = new javax.swing.JButton();
        boton0euler = new javax.swing.JButton();
        boton0IVA = new javax.swing.JButton();
        change = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(221, 245, 221));

        jPanel1.setBackground(new java.awt.Color(221, 245, 221));

        pantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        result.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        botonborrar.setBackground(new java.awt.Color(255, 51, 51));
        botonborrar.setText("C");
        botonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarActionPerformed(evt);
            }
        });

        botonborr1.setBackground(new java.awt.Color(255, 51, 51));
        botonborr1.setText("AC");
        botonborr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborr1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setText("+/-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        boton0raiz.setBackground(new java.awt.Color(0, 102, 102));
        boton0raiz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0raiz.setText("x√X");
        boton0raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0raizActionPerformed(evt);
            }
        });

        boton0potencia.setBackground(new java.awt.Color(0, 102, 102));
        boton0potencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0potencia.setText("X^x");
        boton0potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0potenciaActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(102, 102, 102));
        boton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(102, 102, 102));
        boton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(102, 102, 102));
        boton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton0sin.setBackground(new java.awt.Color(0, 102, 102));
        boton0sin.setText("SIN");
        boton0sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0sinActionPerformed(evt);
            }
        });

        boton0tan.setBackground(new java.awt.Color(0, 102, 102));
        boton0tan.setText("TAN");
        boton0tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0tanActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(102, 102, 102));
        boton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(102, 102, 102));
        boton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(102, 102, 102));
        boton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(102, 102, 102));
        boton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(102, 102, 102));
        boton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(102, 102, 102));
        boton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton0cos.setBackground(new java.awt.Color(0, 102, 102));
        boton0cos.setText("COS");
        boton0cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0cosActionPerformed(evt);
            }
        });

        boton_dot.setBackground(new java.awt.Color(0, 102, 102));
        boton_dot.setText(".");
        boton_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_dotActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(102, 102, 102));
        boton0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        boton0igual.setBackground(new java.awt.Color(51, 102, 0));
        boton0igual.setText("=");
        boton0igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0igualActionPerformed(evt);
            }
        });

        boton0div.setBackground(new java.awt.Color(0, 102, 102));
        boton0div.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0div.setText("/");
        boton0div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0divActionPerformed(evt);
            }
        });

        boton0por.setBackground(new java.awt.Color(0, 102, 102));
        boton0por.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0por.setText("x");
        boton0por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0porActionPerformed(evt);
            }
        });

        boton0resta.setBackground(new java.awt.Color(0, 102, 102));
        boton0resta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0resta.setText("-");
        boton0resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0restaActionPerformed(evt);
            }
        });

        boton0suma.setBackground(new java.awt.Color(0, 102, 102));
        boton0suma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton0suma.setText("+");
        boton0suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0sumaActionPerformed(evt);
            }
        });

        boton0arcsin.setBackground(new java.awt.Color(0, 102, 102));
        boton0arcsin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        boton0arcsin.setText("ARCSIN");
        boton0arcsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0arcsinActionPerformed(evt);
            }
        });

        boton0arccos.setBackground(new java.awt.Color(0, 102, 102));
        boton0arccos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        boton0arccos.setText("ARCCOS");
        boton0arccos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0arccosActionPerformed(evt);
            }
        });

        boton0arctan.setBackground(new java.awt.Color(0, 102, 102));
        boton0arctan.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        boton0arctan.setText("ARCTAN");
        boton0arctan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0arctanActionPerformed(evt);
            }
        });

        boton0log.setBackground(new java.awt.Color(0, 102, 102));
        boton0log.setText("LOG");
        boton0log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0logActionPerformed(evt);
            }
        });

        boton0euler.setBackground(new java.awt.Color(0, 102, 102));
        boton0euler.setText("EXP");
        boton0euler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0eulerActionPerformed(evt);
            }
        });

        boton0IVA.setBackground(new java.awt.Color(0, 102, 102));
        boton0IVA.setText("IVA");
        boton0IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0IVAActionPerformed(evt);
            }
        });

        change.setBackground(new java.awt.Color(0, 102, 102));
        change.setText("RAD");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(boton_dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton0div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton0por, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton0resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton0suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton0sin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton0arcsin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton0cos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton0arccos, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton0tan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton0IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton0igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton0arctan, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonborr1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton0raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton0potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton0euler, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton0log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonborr1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton0raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton0potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton0log, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton0euler, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(boton0div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton0por, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton0resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton0suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton0sin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton0arcsin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton0cos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton0arccos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton0tan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton0arctan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton0igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton0IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CASIO   SCIENTIFIC CALCULATOR FX-991MS");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addnumero(String digito){
        pantalla.setText(pantalla.getText()+digito);
    }
    
    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        
        addnumero("0");
        
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        
        addnumero("1");
      
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        
        addnumero("2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
       
        addnumero("3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        
        addnumero("4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        
        addnumero("5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
       
        addnumero("6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        
        addnumero("7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
       
        addnumero("8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        
        addnumero("9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_dotActionPerformed
        
        String cont = pantalla.getText();
        if(cont.length()<=0){
            pantalla.setText("0.");
        } else if(pantalla.getText().contains(".")){ 
         
        } else 
            pantalla.setText(pantalla.getText()+".");
            punto=false;
    }//GEN-LAST:event_boton_dotActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Float inv=-1*Float.valueOf(result.getText());
        result.setText(String.valueOf(inv));
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void boton0divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0divActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="/";
    }//GEN-LAST:event_boton0divActionPerformed

    private void boton0porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0porActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="*";
    }//GEN-LAST:event_boton0porActionPerformed

    private void boton0restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0restaActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="-";
    }//GEN-LAST:event_boton0restaActionPerformed

    private void boton0sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0sumaActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="+";
    }//GEN-LAST:event_boton0sumaActionPerformed

    private void boton0raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0raizActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="raiz";
    }//GEN-LAST:event_boton0raizActionPerformed

    private void boton0potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0potenciaActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="pot";
    }//GEN-LAST:event_boton0potenciaActionPerformed

    private void boton0eulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0eulerActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="e";
    }//GEN-LAST:event_boton0eulerActionPerformed

    private void boton0sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0sinActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        
        pantalla.setText("");
        signo="sin";
    }//GEN-LAST:event_boton0sinActionPerformed

    private void boton0cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0cosActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="cos";
    }//GEN-LAST:event_boton0cosActionPerformed

    private void boton0tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0tanActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="tan";
    }//GEN-LAST:event_boton0tanActionPerformed

    private void boton0IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0IVAActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="IVA";
    }//GEN-LAST:event_boton0IVAActionPerformed

    private void boton0logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0logActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="log";
    }//GEN-LAST:event_boton0logActionPerformed

    private void boton0arcsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0arcsinActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="arcsin";
    }//GEN-LAST:event_boton0arcsinActionPerformed

    private void boton0arccosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0arccosActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="arccos";
    }//GEN-LAST:event_boton0arccosActionPerformed

    private void botonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarActionPerformed
        
        pantalla.setText("");
        result.setText("");
        
    }//GEN-LAST:event_botonborrarActionPerformed

    private void botonborr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborr1ActionPerformed
        String borrar= pantalla.getText().substring(0,pantalla.getText().length()-1);
        pantalla.setText(borrar);
    }//GEN-LAST:event_botonborr1ActionPerformed

    private void boton0igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0igualActionPerformed
        result.setText(pantalla.getText());
        
        switch(signo){
            case "+":
                   
                b=Float.valueOf(pantalla.getText());
                obj.num2=b;
                obj.suma(); 
                result.setText(String.valueOf(obj.getResult())); 
                pantalla.setText(a+"+"+b);
                break;
                
            case "-":
                b=Float.valueOf(pantalla.getText());
                obj.num2=b;
                obj.resta(a,b); 
                result.setText(String.valueOf(obj.resta(a,b))); 
                pantalla.setText(a+"-"+b);             
                break; 
                
            case "*":
                b=Float.valueOf(pantalla.getText());
                obj.num2=b;
                obj.multip(a,b); 
                result.setText(String.valueOf(obj.multip(a,b))); 
                pantalla.setText(a+"*"+b);             
                break;  
                
            case "/":
                      
                b=Float.valueOf(pantalla.getText());
                obj.num2=b;
                  if(b!=0){
                obj.division(a,b); 
                result.setText(String.valueOf(obj.division(a,b))); 
                pantalla.setText(a+"/"+b);             
                 
                 }else result.setText("Syntax ERROR");
                  break;
            case "IVA":
                
                obj.IVA(a); 
                result.setText(String.valueOf(obj.IVA(a))); 
                pantalla.setText("IVA("+a+")");             
                break;      
                
            case "raiz":
                b=Float.valueOf(pantalla.getText());
                obj.num2=b;
                obj.raiz(a,b); 
                result.setText(String.valueOf(obj.raiz(a,b))); 
                pantalla.setText(a+"^√("+b+")");             
                break;
                
            case "pot":
                b=Float.valueOf(pantalla.getText());
                obj.num2=b;
                obj.potencia(a,b); 
                result.setText(String.valueOf(obj.potencia(a,b))); 
                pantalla.setText(a+"^"+b);             
                break; 
                
            case "sin":
                
                obj.seno(a); 
                result.setText(String.valueOf(obj.seno(a))); 
                pantalla.setText("Sin("+a+")");             
                break; 
            
            case "cos":
                
                obj.coseno(a); 
                result.setText(String.valueOf(obj.coseno(a))); 
                pantalla.setText("Cos("+a+")");             
                break;
                
            case "tan":
                
                obj.tang(a); 
                result.setText(String.valueOf(obj.tang(a))); 
                pantalla.setText("Tan("+a+")");             
                break;
                case "arcsin":
                    
                if(a<=1 && a>=-1){
                obj.arcsin(a); 
                result.setText(String.valueOf(obj.arcsin(a))); 
                pantalla.setText("arcSin("+a+")");             
                 
                    }else result.setText("Syntax ERROR");
                    break;
            case "arccos":
                
                if(a<=1 && a>=-1){
                obj.arccos(a); 
                result.setText(String.valueOf(obj.arccos(a))); 
                pantalla.setText("arcCos("+a+")");             
                }else result.setText("Syntax ERROR");
                break;
            case "arctan":
                                
                obj.arctan(a); 
                result.setText(String.valueOf(obj.arctan(a))); 
                pantalla.setText("arcTan("+a+")"); 
                
                
            case "e":
                
                obj.expo(a); 
                result.setText(String.valueOf(obj.expo(a))); 
                pantalla.setText("EXP("+a+")");             
                break; 
                
            case "log":
                
                obj.logt(a); 
                result.setText(String.valueOf(obj.logt(a))); 
                pantalla.setText("LOG("+a+")");             
                break;     
                
        }
    }//GEN-LAST:event_boton0igualActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        String x=change.getText();
        obj.x=x;
        if(x=="DEG"){
          change.setText("RAD"); 
          change.setBackground(Color.gray);
        }else if(x=="RAD"){
        change.setText("DEG"); 
        change.setBackground(Color.cyan);
        }
            
    }//GEN-LAST:event_changeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton0arctanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0arctanActionPerformed
        a=Float.valueOf(pantalla.getText());
        obj.num1=a;
        pantalla.setText("");
        signo="arctan";
    }//GEN-LAST:event_boton0arctanActionPerformed

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
            java.util.logging.Logger.getLogger(CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULADORA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton0IVA;
    private javax.swing.JButton boton0arccos;
    private javax.swing.JButton boton0arcsin;
    private javax.swing.JButton boton0arctan;
    private javax.swing.JButton boton0cos;
    private javax.swing.JButton boton0div;
    private javax.swing.JButton boton0euler;
    private javax.swing.JButton boton0igual;
    private javax.swing.JButton boton0log;
    private javax.swing.JButton boton0por;
    private javax.swing.JButton boton0potencia;
    private javax.swing.JButton boton0raiz;
    private javax.swing.JButton boton0resta;
    private javax.swing.JButton boton0sin;
    private javax.swing.JButton boton0suma;
    private javax.swing.JButton boton0tan;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton boton_dot;
    private javax.swing.JButton botonborr1;
    private javax.swing.JButton botonborrar;
    private javax.swing.JButton change;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pantalla;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
