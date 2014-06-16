package yatzy.gui;

import java.awt.Color;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import yatzy.domain.Noppa;
import yatzy.peli.Peli;

/**
 * Piirtoalusta piirtää peli-ikkunaan nopat, tilannetaulukon, heitä -napin sekä
 * eri vaihtoehdoille napit.
 *
 * @author minnhann
 */
public class Piirtoalusta extends javax.swing.JPanel {

    private JFrame frame;
    private PeliKayttoliittyma kayttis;
    private ImageIcon[] kuvat;
    private Peli peli;
    private HashMap<JButton, Noppa> nopat;

    /**
     * Creates new form NewJPanel
     *
     * @param frame pelin frame
     * @param kayttis pelin käyttöliittymä
     * @param peli kyseinen peli
     */
    public Piirtoalusta(JFrame frame, PeliKayttoliittyma kayttis, Peli peli) {
        initComponents();
        super.setBackground(Color.WHITE);
        this.frame = frame;
        this.kayttis = kayttis;
        this.peli = peli;
        this.kuvat = new ImageIcon[6];
        try {
            kuvat[0] = new ImageIcon(ImageIO.read(this.getClass().getResource("/images/noppa1.png")));
            kuvat[1] = new ImageIcon(ImageIO.read(this.getClass().getResource("/images/noppa2.png")));
            kuvat[2] = new ImageIcon(ImageIO.read(this.getClass().getResource("/images/noppa3.png")));
            kuvat[3] = new ImageIcon(ImageIO.read(this.getClass().getResource("/images/noppa4.png")));
            kuvat[4] = new ImageIcon(ImageIO.read(this.getClass().getResource("/images/noppa5.png")));
            kuvat[5] = new ImageIcon(ImageIO.read(this.getClass().getResource("/images/noppa6.png")));

        } catch (IOException ex) {
            System.out.println("Noppia ei löydy");
        }
        this.nopat = new HashMap<JButton, Noppa>();

        this.nopat.put(noppa1, peli.nopat[0]);
        this.nopat.put(noppa2, peli.nopat[1]);
        this.nopat.put(noppa3, peli.nopat[2]);
        this.nopat.put(noppa4, peli.nopat[3]);
        this.nopat.put(noppa5, peli.nopat[4]);

        this.paivitaTaulukko();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noppa1 = new javax.swing.JButton();
        noppa2 = new javax.swing.JButton();
        noppa3 = new javax.swing.JButton();
        noppa4 = new javax.swing.JButton();
        noppa5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tulosTaulukko = new javax.swing.JTable();
        heita = new javax.swing.JButton();
        ykkoset = new javax.swing.JButton();
        kakkoset = new javax.swing.JButton();
        kolmoset = new javax.swing.JButton();
        neloset = new javax.swing.JButton();
        vitoset = new javax.swing.JButton();
        kuutoset = new javax.swing.JButton();
        yksiPari = new javax.swing.JButton();
        kaksiParia = new javax.swing.JButton();
        kolmeSamaa = new javax.swing.JButton();
        neljaSamaa = new javax.swing.JButton();
        pieniSuora = new javax.swing.JButton();
        suuriSuora = new javax.swing.JButton();
        yatzy = new javax.swing.JButton();
        sattuma = new javax.swing.JButton();
        taysiKasi = new javax.swing.JButton();
        kierros = new javax.swing.JLabel();
        vuorossa = new javax.swing.JLabel();

        noppa1.setPreferredSize(new java.awt.Dimension(100, 100));
        noppa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noppa1ActionPerformed(evt);
            }
        });

        noppa2.setPreferredSize(new java.awt.Dimension(100, 100));
        noppa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noppa2ActionPerformed(evt);
            }
        });

        noppa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noppa3ActionPerformed(evt);
            }
        });

        noppa4.setPreferredSize(new java.awt.Dimension(100, 100));
        noppa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noppa4ActionPerformed(evt);
            }
        });

        noppa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noppa5ActionPerformed(evt);
            }
        });

        tulosTaulukko.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tulosTaulukko);

        heita.setText("Heitä");
        heita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heitaActionPerformed(evt);
            }
        });

        ykkoset.setText("1");
        ykkoset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ykkosetActionPerformed(evt);
            }
        });

        kakkoset.setText("2");
        kakkoset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kakkosetActionPerformed(evt);
            }
        });

        kolmoset.setText("3");
        kolmoset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolmosetActionPerformed(evt);
            }
        });

        neloset.setText("4");
        neloset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nelosetActionPerformed(evt);
            }
        });

        vitoset.setText("5");
        vitoset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitosetActionPerformed(evt);
            }
        });

        kuutoset.setText("6");
        kuutoset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuutosetActionPerformed(evt);
            }
        });

        yksiPari.setText("Yksi pari");
        yksiPari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yksiPariActionPerformed(evt);
            }
        });

        kaksiParia.setText("Kaksi paria");
        kaksiParia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaksiPariaActionPerformed(evt);
            }
        });

        kolmeSamaa.setText("Kolme samaa");
        kolmeSamaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolmeSamaaActionPerformed(evt);
            }
        });

        neljaSamaa.setText("Neljä samaa");
        neljaSamaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neljaSamaaActionPerformed(evt);
            }
        });

        pieniSuora.setText("Pieni suora");
        pieniSuora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieniSuoraActionPerformed(evt);
            }
        });

        suuriSuora.setText("Suuri suora");
        suuriSuora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suuriSuoraActionPerformed(evt);
            }
        });

        yatzy.setText("Yatzy");
        yatzy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yatzyActionPerformed(evt);
            }
        });

        sattuma.setText("Sattuma");
        sattuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sattumaActionPerformed(evt);
            }
        });

        taysiKasi.setText("Täysi käsi");
        taysiKasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taysiKasiActionPerformed(evt);
            }
        });

        kierros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kierros.setText("jLabel1");

        vuorossa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vuorossa.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(heita, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vuorossa)
                            .addComponent(kierros, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yksiPari)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ykkoset, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(kakkoset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kolmoset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(neloset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vitoset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kuutoset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(neljaSamaa)
                                            .addComponent(pieniSuora)
                                            .addComponent(kaksiParia))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(suuriSuora)
                                            .addGap(7, 7, 7)))
                                    .addComponent(taysiKasi)
                                    .addComponent(yatzy, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sattuma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(kolmeSamaa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noppa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noppa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noppa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(noppa4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noppa5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noppa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ykkoset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kakkoset)
                                .addGap(10, 10, 10)
                                .addComponent(kolmoset)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(noppa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(neloset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vitoset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kuutoset)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noppa3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noppa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yksiPari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kaksiParia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kolmeSamaa))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(neljaSamaa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noppa5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heita)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pieniSuora)
                            .addComponent(kierros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(suuriSuora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taysiKasi)
                            .addComponent(vuorossa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yatzy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sattuma)
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void noppa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noppa5ActionPerformed
        this.nopat.get(noppa5).vaihdaNopanLukitus();
        if (this.nopat.get(noppa5).onkoLukittu()) {
            noppa5.setBackground(Color.black);
        } else {
            noppa5.setBackground(Color.lightGray);
        }
    }//GEN-LAST:event_noppa5ActionPerformed

    private void noppa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noppa3ActionPerformed
        this.nopat.get(noppa3).vaihdaNopanLukitus();
        if (this.nopat.get(noppa3).onkoLukittu()) {
            noppa3.setBackground(Color.black);
        } else {
            noppa3.setBackground(Color.lightGray);
        }

    }//GEN-LAST:event_noppa3ActionPerformed

    private void noppa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noppa1ActionPerformed
        this.nopat.get(noppa1).vaihdaNopanLukitus();
        if (this.nopat.get(noppa1).onkoLukittu()) {
            noppa1.setBackground(Color.black);
        } else {
            noppa1.setBackground(Color.lightGray);
        }
    }//GEN-LAST:event_noppa1ActionPerformed

    private void heitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heitaActionPerformed
        peli.heitaNoppia();
        asetaNoppienKuvat();


    }//GEN-LAST:event_heitaActionPerformed

    private void noppa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noppa4ActionPerformed
        this.nopat.get(noppa4).vaihdaNopanLukitus();
        if (this.nopat.get(noppa4).onkoLukittu()) {
            noppa4.setBackground(Color.black);
        } else {
            noppa4.setBackground(Color.lightGray);
        }
    }//GEN-LAST:event_noppa4ActionPerformed

    private void noppa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noppa2ActionPerformed
        this.nopat.get(noppa2).vaihdaNopanLukitus();
        if (this.nopat.get(noppa2).onkoLukittu()) {
            noppa2.setBackground(Color.black);
        } else {
            noppa2.setBackground(Color.lightGray);
        }
    }//GEN-LAST:event_noppa2ActionPerformed

    private void yksiPariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yksiPariActionPerformed
        peli.lisaaPelaajallePisteita(8);
        paivitaTaulukko();
    }//GEN-LAST:event_yksiPariActionPerformed

    private void yatzyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yatzyActionPerformed
        // TODO add your handling code here:
        peli.lisaaPelaajallePisteita(15);
        paivitaTaulukko();
    }//GEN-LAST:event_yatzyActionPerformed

    private void ykkosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ykkosetActionPerformed
        peli.lisaaPelaajallePisteita(0);
        paivitaTaulukko();
    }//GEN-LAST:event_ykkosetActionPerformed

    private void kakkosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kakkosetActionPerformed
        peli.lisaaPelaajallePisteita(1);
        paivitaTaulukko();
    }//GEN-LAST:event_kakkosetActionPerformed

    private void kolmosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolmosetActionPerformed
        peli.lisaaPelaajallePisteita(2);
        paivitaTaulukko();
    }//GEN-LAST:event_kolmosetActionPerformed

    private void nelosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nelosetActionPerformed
        peli.lisaaPelaajallePisteita(3);
        paivitaTaulukko();
    }//GEN-LAST:event_nelosetActionPerformed

    private void vitosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitosetActionPerformed
        peli.lisaaPelaajallePisteita(4);
        paivitaTaulukko();
    }//GEN-LAST:event_vitosetActionPerformed

    private void kuutosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuutosetActionPerformed
        peli.lisaaPelaajallePisteita(5);
        paivitaTaulukko();
    }//GEN-LAST:event_kuutosetActionPerformed

    private void kaksiPariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaksiPariaActionPerformed
        peli.lisaaPelaajallePisteita(9);
        paivitaTaulukko();
    }//GEN-LAST:event_kaksiPariaActionPerformed

    private void kolmeSamaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolmeSamaaActionPerformed
        peli.lisaaPelaajallePisteita(10);
        paivitaTaulukko();
    }//GEN-LAST:event_kolmeSamaaActionPerformed

    private void neljaSamaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neljaSamaaActionPerformed
        peli.lisaaPelaajallePisteita(11);
        paivitaTaulukko();
    }//GEN-LAST:event_neljaSamaaActionPerformed

    private void pieniSuoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieniSuoraActionPerformed
        peli.lisaaPelaajallePisteita(12);
        paivitaTaulukko();
    }//GEN-LAST:event_pieniSuoraActionPerformed

    private void suuriSuoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suuriSuoraActionPerformed
        peli.lisaaPelaajallePisteita(13);
        paivitaTaulukko();
    }//GEN-LAST:event_suuriSuoraActionPerformed

    private void taysiKasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taysiKasiActionPerformed
        peli.lisaaPelaajallePisteita(14);
        paivitaTaulukko();
    }//GEN-LAST:event_taysiKasiActionPerformed

    private void sattumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sattumaActionPerformed
        peli.lisaaPelaajallePisteita(16);
        paivitaTaulukko();
    }//GEN-LAST:event_sattumaActionPerformed

    /**
     * Asettaa jokaiselle nopalle sen silmälukua vastaavan kuvan. Lisäksi
     * asettaa taustavärin mustaksi tai harmaaksi.
     */
    private void asetaNoppienKuvat() {
        for (JButton nappi : this.nopat.keySet()) {
            asetaNopanVari(nappi);
            nappi.setIcon(kuvat[nopat.get(nappi).getArvo() - 1]);
        }
    }

    /**
     * Asettaa lukitun nopan taustaväriksi mustan ja lukitsemattoman nopan
     * taustaväriksi vaaleanharmaan.
     */
    private void asetaNopanVari(JButton noppa) {
        if (this.nopat.get(noppa).onkoLukittu()) {
            noppa.setBackground(Color.black);
        } else {
            noppa.setBackground(Color.lightGray);
        }
    }

    /**
     * Päivittää tulostaulukon ja asettaa noppien kuvat uudelleen sekä asettaa
     * kierroksen numeron ja vuorossa olevan pelaajan nimen.
     */
    private void paivitaTaulukko() {
        tulosTaulukko.setModel(new Taulukko(this.peli));
        asetaNoppienKuvat();
        if (!peli.loppuikoPeli()) {
            asetaTekstit();
        } else {
            asetaLopputeksti();
        }

    }

    private void asetaTekstit() {
        kierros.setText("Kierros:  " + peli.getKierros());
        vuorossa.setText("Vuorossa: Pelaaja  " + (peli.getVuoro() + 1));
    }

    private void asetaLopputeksti() {
        kierros.setText("Peli päättyi!");
        vuorossa.setText("Pelin voitti  " + peli.tarkistaVoittaja() + "!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton heita;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kakkoset;
    private javax.swing.JButton kaksiParia;
    private javax.swing.JLabel kierros;
    private javax.swing.JButton kolmeSamaa;
    private javax.swing.JButton kolmoset;
    private javax.swing.JButton kuutoset;
    private javax.swing.JButton neljaSamaa;
    private javax.swing.JButton neloset;
    private javax.swing.JButton noppa1;
    private javax.swing.JButton noppa2;
    private javax.swing.JButton noppa3;
    private javax.swing.JButton noppa4;
    private javax.swing.JButton noppa5;
    private javax.swing.JButton pieniSuora;
    private javax.swing.JButton sattuma;
    private javax.swing.JButton suuriSuora;
    private javax.swing.JButton taysiKasi;
    private javax.swing.JTable tulosTaulukko;
    private javax.swing.JButton vitoset;
    private javax.swing.JLabel vuorossa;
    private javax.swing.JButton yatzy;
    private javax.swing.JButton ykkoset;
    private javax.swing.JButton yksiPari;
    // End of variables declaration//GEN-END:variables
}
