package yatzy.peli;

import java.util.ArrayList;
import yatzy.domain.Noppa;
import yatzy.domain.Pelaaja;

public class NoppaYhdistelmat {


    public NoppaYhdistelmat() {

    }

    public int pieniSuora(Pelaaja pelaaja) {
        ArrayList<Integer> luvut = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            luvut.add(pelaaja.nopat.get(i).getArvo());
        }

        if (luvut.contains(1) && luvut.contains(2) && luvut.contains(3)
                && luvut.contains(4) && luvut.contains(5)) {
            return 15;
        }
        return 0;
    }

    public int suuriSuora(Pelaaja pelaaja) {
        ArrayList<Integer> luvut = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            luvut.add(pelaaja.nopat.get(i).getArvo());
        }
        
        if (luvut.contains(2) && luvut.contains(3) && luvut.contains(4)
                && luvut.contains(5) && luvut.contains(6)) {
            return 20;
        }
        return 0;
    }

    public int montakoSamaaNumeroa(Pelaaja pelaaja, int numero) {
        int maara = 0;
        for (Noppa noppa : pelaaja.nopat) {
            if (noppa.getArvo() == numero) {
                maara++;
            }
        }
        return maara;
    }

    public int yksiPari(Pelaaja pelaaja) {

        for (int i = 6; i >= 0; i--) {
            if (montakoSamaaNumeroa(pelaaja, i) >= 2) {
                return i * 2;
            }
        }
        return 0;
    }

    public int kaksiParia(Pelaaja pelaaja) {
        int parienMaara = 0;
        int summa = 0;
        for (int i = 6; i >= 0; i--) {
            if (montakoSamaaNumeroa(pelaaja, i) >= 2) {
                if (parienMaara == 1) {
                    summa += 2 * i;
                    return summa;
                }
                summa += i * 2;
                parienMaara = 1;
            }
        }
        return 0;
    }

    public int taysikasi(Pelaaja pelaaja) {
        int montakoLoydetty = 0;
        int summa = 0;
        for (int i = 6; i >= 0; i--) {
            if (montakoSamaaNumeroa(pelaaja, i) == 3) {
                if (montakoLoydetty == 2) {
                    summa += 3 * i;
                    return summa;
                }
                montakoLoydetty += 3;
                summa += 3 * i;
            } else if (montakoSamaaNumeroa(pelaaja, i) == 2) {
                if (montakoLoydetty == 3) {
                    summa += 2 * i;
                    return summa;
                }
                montakoLoydetty += 2;
                summa += 2 * i;
            }
        }
        return 0;
    }

    public int yatzy(Pelaaja pelaaja) {
        int ekaNoppa = pelaaja.nopat.get(0).getArvo();

        for (Noppa noppa : pelaaja.nopat) {
            if (noppa.getArvo() != ekaNoppa) {
                return 0;
            }
        }
        return 50;
    }

    public int sattuma(Pelaaja pelaaja) {
        return pelaaja.getNoppienSumma();
    }
}
