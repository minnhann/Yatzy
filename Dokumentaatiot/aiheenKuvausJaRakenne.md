**Aihe:** Yatzy -peli. Toteutetaan peli, jossa 1-4 pelaajaa heitt‰v‰t vuorotellen viitt‰ noppaa. Erilaisilla noppien numerokombinaatioilla voi saavuttaa eri m‰‰r‰n pisteit‰, ja lopuksi korkeimmat pisteet saanut pelaaja voittaa pelin.

Jokainen pelaaja heitt‰‰ vuorollaan viitt‰ noppaa kerran. T‰m‰n j‰lkeen pelaaja voi valita, mit‰ nopista h‰n haluaa heitt‰‰ uudelleen yritt‰en siten saavuttaa jonkin pisteit‰ tuottavan kombinaation. Pelaaja voi heitt‰‰ myˆs kaikkia noppia uudelleen. Pelaaja voi jokaisella kierroksella heitt‰‰ noppia yhteens‰ kolme kertaa, ja jokaisen heittokerran v‰liss‰ pelaaja voi vaihtaa heitt‰m‰tt‰ j‰tt‰mi‰‰n noppia. Pelaajan ei ole pakko k‰ytt‰‰ kaikkia kolmea heittokertaa, vaan ollessaan tyytyv‰inen noppien tulokseen, h‰n valitsee, mink‰ mahdollisesti useasta kombinaatio-vaihtoehdoista nopat toteuttavat (esimerkiksi "kaksi paria" vai "yksi pari") ja pisteet kirjataan taulukkoon ylˆs. Jos nopat eiv‰t toteuta mit‰‰n kombinaatioista eik‰ pisteit‰ voida kirjata mihink‰‰n taulukon sarakkeeseen, kirjataan johonkin pelaajan valitsemista taulukon tyhjist‰ kohdista 0 pistett‰. T‰llˆin pelaaja ei voi en‰‰ yritt‰‰ myˆhemmin kyseist‰ kombinaatiota. T‰llainen tilanne on siis pelaajan kannalta eritt‰in ep‰edullinen, ja ideana onkin yritt‰‰ v‰ltt‰‰ 0 pisteit‰.


**K‰ytt‰j‰t:** Pelaajat


**Pelaajien toiminnot:**
- Nopan heitto
 - onnistuu, jos pelaajalla on pelivuoro ja h‰nell‰ on heittovuoroja viel‰ j‰ljell‰.     - yhteens‰ heittovuoroja on kolme kappaletta kullakin kierroksella.
- Noppien s‰ilytt‰minen toisella ja kolmannella heittokerralla
 - pelaaja voi valita, mit‰ nopista h‰n ei haluaa heitt‰‰ uudelleen.
- Noppien toteuttavan kombinaation valinta
 - onnistuu, jos pelaajan valitsema kombinaatio on vapaa.
 - jos vaihtoehtoja useita, pelaaja voi vapaasti valita, mihin n‰ist‰ h‰n haluaa pisteet.