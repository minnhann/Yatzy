package yatzy.peli;

import java.util.ArrayList;
import yatzy.domain.Noppa;

/**
 * Sisältää kokoelman noppayhdistelmiä
 *
 * @author minnhann
 */
public class NoppaYhdistelmat {

    /**
     *
     */
    public NoppaYhdistelmat() {

    }

    /**
     * Tarkistaa, sisältävätkö nopat silmäluvut 1, 2, 3, 4, 5
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int pieniSuora(Noppa[] nopat) {
        ArrayList<Integer> luvut = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            luvut.add(nopat[i].getArvo());
        }

        if (luvut.contains(1) && luvut.contains(2) && luvut.contains(3)
                && luvut.contains(4) && luvut.contains(5)) {
            return 15;
        }
        return 0;
    }

    /**
     * Tarkistaa, sisältävätkö nopat silmäluvut 2, 3, 4, 5, 6
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int suuriSuora(Noppa[] nopat) {
        ArrayList<Integer> luvut = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            luvut.add(nopat[i].getArvo());
        }

        if (luvut.contains(2) && luvut.contains(3) && luvut.contains(4)
                && luvut.contains(5) && luvut.contains(6)) {
            return 20;
        }
        return 0;
    }

    /**
     * Tarkistaa, montako haluttua silmälukua olevia noppia on.
     *
     * @param nopat lista pelin nopista
     * @param numero minkä silmäluvun ilmenemiskertoja lasketaan
     * @return saman pisteluvun sisältävien noppien lukumäärä
     */
    public int montakoSamaaNumeroa(Noppa[] nopat, int numero) {
        int maara = 0;
        for (Noppa noppa : nopat) {
            if (noppa.getArvo() == numero) {
                maara++;
            }
        }
        return maara;
    }

    /**
     * Tarkistaa, löytyykö nopista kolme saman silmäluvun omaavaa noppaa.
     *
     * @param nopat lista pelin nopista
     * @return saman silmäluvun sisältävien noppien summa
     */
    public int kolmeSamanlaista(Noppa[] nopat) {
        int summa = 0;

        for (int i = 6; i > 0; i--) {
            if (montakoSamaaNumeroa(nopat, i) >= 3) {
                summa = 3 * i;
                return summa;
            }
        }
        return summa;
    }

    /**
     * Tarkistaa, löytyykö nopista neljä saman silmäluvun omaavaa noppaa.
     *
     * @param nopat lista pelin nopista
     * @return saman pisteluvun sisältävien noppien summa
     */

    public int neljaSamanlaista(Noppa[] nopat) {
        int summa = 0;

        for (int i = 6; i > 0; i--) {
            if (montakoSamaaNumeroa(nopat, i) == 4) {
                summa = 4 * i;
                return summa;
            }
        }
        return summa;
    }

    /**
     * Tarkistaa, löytyykö nopista jokin pari, eli kaksi samaa silmälukua
     * sisältävää noppaa
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int yksiPari(Noppa[] nopat) {

        for (int i = 6; i >= 1; i--) {
            if (montakoSamaaNumeroa(nopat, i) >= 2) {
                return i * 2;
            }
        }
        return 0;
    }

    /**
     * Tarkistaa, löytyykö nopista kaksi paria.
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int kaksiParia(Noppa[] nopat) {
        int parienMaara = 0;
        int summa = 0;
        for (int i = 6; i >= 1; i--) {
            if (montakoSamaaNumeroa(nopat, i) >= 2) {
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

    /**
     * Tarkistaa, löytyykö nopista kolme keskenään samaa silmälukua, ja kaksi
     * keskenään samaa silmälukua.
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int taysikasi(Noppa[] nopat) {
        int montakoLoydetty = 0;
        int summa = 0;
        for (int i = 6; i >= 1; i--) {
            if (montakoSamaaNumeroa(nopat, i) == 3) {
                if (montakoLoydetty == 2) {
                    summa += 3 * i;
                    return summa;
                }
                montakoLoydetty += 3;
                summa += 3 * i;
            } else if (montakoSamaaNumeroa(nopat, i) == 2) {
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

    /**
     * Tarkistaa, onko kaikkien noppien silmäluku sama
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int yatzy(Noppa[] nopat) {
        int ekaNoppa = nopat[0].getArvo();

        for (Noppa noppa : nopat) {
            if (noppa.getArvo() != ekaNoppa) {
                return 0;
            }
        }
        return 50;
    }

    /**
     * Laskee noppien summan
     *
     * @param nopat lista pelin nopista
     * @return kyseisestä yhdistelmästä kyseisillä nopilla saatava pistemäärä
     */
    public int sattuma(Noppa[] nopat) {
        int summa = 0;

        for (Noppa noppa : nopat) {
            summa += noppa.getArvo();
        }
        return summa;

    }

}
