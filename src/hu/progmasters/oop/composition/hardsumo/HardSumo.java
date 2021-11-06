package hu.progmasters.oop.composition.hardsumo;

/**
 * Folytasd a sumo feladatot az alábbi kiegészítésekkel:
 * 1) A birkózóknak a tömegük mellett eltároljuk az energiáját is.
 * - A birkózók összehasonlításakor az erejük legyen a tömegük és az energiájuk összege.
 * - Ha a két bírkozó egyforma erős, akkor mindkettő energiája csökken 1-el
 * - Ha valamelyikük erősebb, akkor ő eltolja az ellenfelét 1 mezővel, és CSAK az ő energiája csökken 1-el
 * <p>
 * Az eredmény valami ilyesmi lesz:
 * Kurosaki 100 20 _________OO_________ 5 110 Urahara
 * Kurosaki 100 19 __________OO________ 5 110 Urahara
 * Kurosaki 100 18 ___________OO_______ 5 110 Urahara
 * Kurosaki 100 17 ____________OO______ 5 110 Urahara
 * Kurosaki 100 16 _____________OO_____ 5 110 Urahara
 * Kurosaki 100 15 ______________OO____ 5 110 Urahara
 * Kurosaki 100 14 ______________OO____ 4 110 Urahara
 * Kurosaki 100 13 ______________OO____ 3 110 Urahara
 * Kurosaki 100 12 ______________OO____ 2 110 Urahara
 * Kurosaki 100 11 ______________OO____ 1 110 Urahara
 * Kurosaki 100 10 ______________OO____ 0 110 Urahara
 * Kurosaki 100 9  ______________OO____ 0 110 Urahara
 * Kurosaki 100 9  _____________OO_____ 0 110 Urahara
 * Kurosaki 100 9  ____________OO______ 0 110 Urahara
 * Kurosaki 100 9  ___________OO_______ 0 110 Urahara
 * Kurosaki 100 9  __________OO________ 0 110 Urahara
 * Kurosaki 100 9  _________OO_________ 0 110 Urahara
 * Kurosaki 100 9  ________OO__________ 0 110 Urahara
 * Kurosaki 100 9  _______OO___________ 0 110 Urahara
 * Kurosaki 100 9  ______OO____________ 0 110 Urahara
 * Kurosaki 100 9  _____OO_____________ 0 110 Urahara
 * Kurosaki 100 9  ____OO______________ 0 110 Urahara
 * Kurosaki 100 9  ___OO_______________ 0 110 Urahara
 * Kurosaki 100 9  __OO________________ 0 110 Urahara
 * Kurosaki 100 9  _OO_________________ 0 110 Urahara
 * Kurosaki 100 9  OO__________________ 0 110 Urahara
 * Kurosaki 100 9  O___________________ 0 110 Urahara
 * Urahara wins!
 * <p>
 * 2) A birkózók ne középről induljanak, hanem a pálya szélétől számítva az 5. mezőről.
 * Amíg a két birkózó nem találkozik középen, addig minden körben egyet lépnek középre, az energiájuk ilyenkor
 * nem csökken.
 * <p>
 * Példa:
 * Kurosaki 100 20 ____O__________O____ 5 110 Urahara
 * Kurosaki 100 20 _____O________O_____ 5 110 Urahara
 * Kurosaki 100 20 ______O______O______ 5 110 Urahara
 * Kurosaki 100 20 _______O____O_______ 5 110 Urahara
 * Kurosaki 100 20 ________O__O________ 5 110 Urahara
 * Kurosaki 100 20 _________OO_________ 5 110 Urahara
 * ...
 * innentől ugyanaz
 */
public class HardSumo {
}
