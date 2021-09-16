/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Rais
 */
public class Pecahan {

  private int pembilang;
  private int penyebut;

  public Pecahan(int pembilang, int penyebut) {
    this.pembilang = pembilang;
    this.penyebut = penyebut;
  }

  public Pecahan() {}

  // mencari FPB untuk menyederhanakan
  public static int FPB(int a, int b) {
    while (b != 0) {
      int temp = a;
      a = b;
      b = temp % b;
    }
    return a;
  }

  public int getPembilang() {
    return this.pembilang;
  }

  public void setPembilang(int pembilang) {
    this.pembilang = pembilang;
  }

  public void setPenyebut(int penyebut) {
    this.penyebut = penyebut;
  }

  public int getPenyebut() {
    return this.penyebut;
  }

  public static Pecahan tambah(Pecahan p1, Pecahan p2) {
    int penyebutSetara = p1.getPenyebut() * p2.getPenyebut();
    int pembilangP1 = p1.getPenyebut() * p2.getPembilang();
    int pembilangP2 = p1.getPembilang() * p2.getPenyebut();
    int pembilangAkhir = pembilangP1 + pembilangP2;
    int fpb = FPB(penyebutSetara, pembilangAkhir);
    penyebutSetara /= fpb;
    pembilangAkhir /= fpb;
    Pecahan pecahanAkhir = new Pecahan(pembilangAkhir, penyebutSetara);
    return pecahanAkhir;
  }

  public static Pecahan kali(Pecahan p1, Pecahan p2) {
    int penyebutSetara = p1.getPenyebut() * p2.getPenyebut();
    int pembilangAkhir = p1.getPembilang() * p2.getPembilang();
    int fpb = FPB(penyebutSetara, pembilangAkhir);
    penyebutSetara /= fpb;
    pembilangAkhir /= fpb;
    Pecahan pecahanAkhir = new Pecahan(pembilangAkhir, penyebutSetara);
    return pecahanAkhir;
  }
}
