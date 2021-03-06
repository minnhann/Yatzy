package yatzy.gui;

import javax.swing.table.AbstractTableModel;
import yatzy.peli.Peli;

/**
 * Tilannetaulukko, jota piirtoalusta käyttää.
 *
 * @author minnhann
 */
public class Taulukko extends AbstractTableModel {

    /**
     * Peli jota pelataan.
     */
    private Peli peli;
    /**
     * Lista eri noppayhdistelmien nimistä.
     */
    private String[] nimet;

    /**
     * Konstruktorisa asetetaan peliksi pelattava peli, luodaan nimet -taulukko
     * johon listataan eri noppayhdistelmien nimet.
     */
    public Taulukko(Peli peli) {
        this.peli = peli;
        nimet = new String[18];
        listaaVaihtoehtojenNimet();
    }

    @Override
    public int getRowCount() {
        return 18;
    }

    @Override
    public int getColumnCount() {
        return peli.pelaajat.size() + 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return this.nimet[rowIndex];
        } else if (peli.pelaajat.get(columnIndex - 1).getOnkoLisattyPisteita(rowIndex)) {
            return peli.pelaajat.get(columnIndex - 1).getPisteet(rowIndex);
        }
        return " ";

    }

    @Override
    public String getColumnName(int col) {
        if (col == 0) {
            return "Pisteet";
        }
        return "Pelaaja " + col;
    }

    /**
     * Listataan nimet -taulukkoon eri noppayhdistelmien nimet taulukkoon
     * sijoitusta varten.
     */
    private void listaaVaihtoehtojenNimet() {
        this.nimet[0] = "1";
        this.nimet[1] = "2";
        this.nimet[2] = "3";
        this.nimet[3] = "4";
        this.nimet[4] = "5";
        this.nimet[5] = "6";
        this.nimet[6] = "Score";
        this.nimet[7] = "Boonus";
        this.nimet[8] = "Yksi pari";
        this.nimet[9] = "Kaksi paria";
        this.nimet[10] = "Kolme samanlaista";
        this.nimet[11] = "Neljä samanlaista";
        this.nimet[12] = "Pieni suora";
        this.nimet[13] = "Suuri suora";
        this.nimet[14] = "Täysi käsi";
        this.nimet[15] = "Yatzy";
        this.nimet[16] = "Sattuma";
        this.nimet[17] = "Total";

    }

}
