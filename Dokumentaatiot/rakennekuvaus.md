Yatzyn rakennekuvaus:

Mainissa aloitetaan peli luomalla luokat Peli ja AlunKayttoliittyma. AlunKayttoliittym‰ss‰ luodaan valikko, josta valitaan, montako pelaajaa (1-4) peliin osallistuu. ValikonKuuntelija v‰litt‰‰ tiedon pelaajien lukum‰‰r‰st‰ Main:ssa luodulle Peli -luokalle.

Peli -luokka on vastuussa pelin logiikasta. Peli luo viisi noppaa, Noppayhdistelmat -luokan sek‰ viisi pelaajaa. Peli -luokan vastuulla on noppien heitt‰minen, pelivuoron vaihtaminen, uusien noppien arpominen seuraavalle pelaajalle, pelin jatkumisen tarkistus, pisteiden lis‰‰minen pelaajalle sek‰ voittajan tarkistaminen pelin lopuksi.

Jokainen pelaaja sis‰lt‰‰ nimen, pisteet eriteltyn‰ noppayhdistelmitt‰in ja tiedon siit‰, mihin noppayhdistelmiin pelaaja on jo lis‰nnyt pisteit‰. Jokainen noppa sis‰lt‰‰ arvon, sek‰ tiedon siit‰, voiko noppaa heitt‰‰ vai ei.

PeliK‰yttˆliittym‰ luo peli-ikkunan sek‰ Piirtoalusta -luokan, jonka kautta pelin grafiikka toteutetaan. Lis‰ksi PeliK‰yttˆliittym‰ luo huomautusikkunan pelaajan yritt‰ess‰ lis‰t‰ pisteit‰ jo k‰ytettyyn pistekohtaan sek‰ pelin loppuikkunan. Piirtoalusta piirt‰‰ pelin tilannetaulukon, noppien napit, eri noppayhdistelmien napit sek‰ heit‰ -napin. Piirtoalusta tuntee pelik‰yttˆliittym‰n sek‰ pelin, jonka kautta se hyˆdynt‰‰ pelin logiikkaa. Piirtoalusta kuuntelee nappien painalluksia, p‰ivitt‰‰ noppien kuvia sek‰ tilannetaulukon. Tilannetaulukon yll‰pidossa Piirtoalusta k‰ytt‰‰ Taulukko -luokkaa, joka tallettaa pistem‰‰r‰t sek‰ eri pistekohtien nimet.