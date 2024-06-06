package Blackjack;
import java.util.Scanner;
import java.util.Random;
public class ka {
  public static void main(String[] args) {

    int min = 1;
    int max = 10;
    Random random = new Random();
    int value = random.nextInt(max + min) + min;

    Card null1 = new Card(); null1.name="0"; null1.wert=0;
    Card null2 = new Card(); null2.name="0"; null2.wert=0;

    Card twoe = new Card(); twoe.name="2"; twoe.wert=2;
    Card treee = new Card(); treee.name="3"; treee.wert=3;
    Card foure = new Card(); foure.name="4"; foure.wert=4;
    Card fivee = new Card(); fivee.name="5"; fivee.wert=5;
    Card sixe = new Card(); sixe.name="6"; sixe.wert=6;
    Card sevene = new Card(); sevene.name="7"; sevene.wert=7;
    Card eighte = new Card(); eighte.name="8"; eighte.wert=8;
    Card ninee = new Card(); ninee.name="9"; ninee.wert=9;
    Card tene = new Card(); tene.name="10"; tene.wert=10;
    Card Bube = new Card(); Bube.name="Bube"; Bube.wert=10;
    Card Dame = new Card(); Dame.name="Dame"; Dame.wert=10;
    Card König = new Card(); König.name="König"; König.wert=10;
    Card Ass = new Card(); Ass.name="Ass"; Ass.wert=10;
    
    Card Sachen[]={twoe,treee,foure,fivee,sixe,sevene,eighte,ninee,tene,Bube,Dame,König,Ass};
    System.out.println("Zallo");
    System.out.println();

    Scanner YN = new Scanner(System.in);
    System.out.println("Möchtest du spielen (y/n)");
    String JN = YN.nextLine();
    if (JN.equals("n")){
        System.out.println("OK");
        System.exit(0);
    }
    if (JN.equals("y")){
        Card C1 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card C2 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card C3 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card C4 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card C5 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card C6 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card C7 = Sachen[value];
        System.out.println("Erste Karte des Copiers: "+C1.name);
        System.out.println();
        int Ci =C1.wert+C2.wert;
        value = random.nextInt(max + min) + min;
        Card K1 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card K2 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card K3 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card K4 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card K5 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card K6 = Sachen[value];
        value = random.nextInt(max + min) + min;
        Card K7 = Sachen[value];
        int carde=1;
        int Kki = K1.wert+K2.wert;
        if (Ci==21){
          System.out.println("Deine erste Karte: "+K1.name);
          System.out.println("Deine zweite Karte: "+K2.name);
          System.out.println("Insgesamt: "+Kki);
          System.out.println();
          System.out.println("Erste Karte des Copiers: "+C1.name);
          System.out.println("Zweite Karte des Copiers: "+C2.name);
          System.out.println("Der Coupier hat insgesamt: "+Ci);
          if (Kki==21){
            System.out.println("Du und der Coupier haben Blackjack.");
            uneentschieden();
          }
          System.out.println("Coupier hat Blackjack");
          verloren();  
          System.exit(0);
        }
        if (Kki==21){
          System.out.println("Du hast Blackjack");
          gewonnen();
          System.exit(0);
        }
        else{
          Card kartenK[]=new Card[7];
          kartenK[0]=K1;kartenK[1]=K2;kartenK[2]=K3;kartenK[3]=K4;kartenK[4]=K5;kartenK[5]=K6;kartenK[6]=K7;
          while(carde <= 6){
            int Ki=0;
            if (carde>=0){
              System.out.println("Deine erste Karte: "+K1.name);
              Ki=Ki+K1.wert;
            }
            if (carde>=1){
              System.out.println("Deine zweite Karte: "+K2.name);
              Ki=Ki+K2.wert;
            }
            if (carde>=2){
              System.out.println("Deine dritte Karte: "+K3.name);
              Ki=Ki+K3.wert;
            }
            if (carde>=3){
              System.out.println("Deine vierte Karte: "+K4.name);
              Ki=Ki+K4.wert;
            }
            if (carde>=4){
              System.out.println("Deine fünfte Karte: "+K5.name);
              Ki=Ki+K5.wert;
            }
            if (carde>=5){
              System.out.println("Deine sechste Karte: "+K6.name);
              Ki=Ki+K6.wert;
            }
            if (carde>=6){
              System.out.println("Deine siebte Karte: "+K7.name);
              System.out.println("Insgesamt: "+Ki);
              System.out.println();
              dh7k();
              gewonnen();
              YN.close();
              System.exit(0);
            }
            System.out.println("Insgesamt: "+Ki);
            System.out.println();
            if (Ki>21){
              kü21();
              verloren();
              System.exit(0);
            }
            System.out.println("1: Ziehen, 2: Halten");
            String ab1 = YN.nextLine();
            System.out.println();
            if (ab1.equals("2")){
              endeC(Ci,Ki,C1,C2,C3,C4,C5,C6,C7,null1,null2);
            }
            if (ab1.equals("1")){
              carde=carde+1;
            }
          }
        }
      }
    }
  public static void endeC(int cCi,int cKi,Card cC1,Card cC2,Card cC3,Card cC4,Card cC5,Card cC6,Card cC7,Card cnull1,Card cnull2){
    System.out.println("Erste Karte des Copiers: "+cC1.name);
    System.out.println("Zweite Karte des Copiers: "+cC2.name);
    Card kartenC[]=new Card[7];
    kartenC[0]=cnull1;kartenC[1]=cnull2;kartenC[2]=cC3;kartenC[3]=cC4;kartenC[4]=cC5;kartenC[5]=cC6;kartenC[6]=cC7;
    cCi=cC1.wert+cC2.wert;
    int i = 0;
    while(i <= 6){
      i++;
      if (i==2){
        System.out.println("Dritte Karte des Copiers: "+kartenC[i].name);
      }
      if (i==3){
        System.out.println("Vierte Karte des Copiers: "+kartenC[i].name);
      }
      if (i==4){
        System.out.println("Fünfte Karte des Copiers: "+kartenC[i].name);
      }
      if (i==5){
        System.out.println("Sechste Karte des Copiers: "+kartenC[i].name);
      }
      if (i==6){
        System.out.println("Siebte Karte des Copiers: "+kartenC[i].name);
      }
      cCi=cCi+kartenC[i].wert;
      if (cCi>=17){
        if (cCi>21){
          System.out.println("Der Coupier hat insgesamt: "+cCi);
          System.out.println();
          cü21();
          gewonnen();
          System.exit(0);
        }
        if (cCi==cKi){
          System.out.println("Der Coupier hat insgesamt: "+cCi);
          System.out.println();
          gleich();
          uneentschieden();
          System.exit(0);
        }
        if (cCi>cKi){
          System.out.println("Der Coupier hat insgesamt: "+cCi);
          System.out.println();
          cmad();
          verloren();
          System.exit(0);
        }
        if (cCi<cKi){
          System.out.println("Der Coupier hat insgesamt: "+cCi);
          System.out.println();
          dmac();
          gewonnen();
          System.exit(0);
        }
      }
    }
    System.out.println("Siebte Karte des Copiers: "+cC7.name);
    cCi=cC7.wert+cCi;
    System.out.println("Der Coupier hat insgesamt: "+cCi);
    System.out.println();
    ch7k();
    verloren();
    System.exit(0); 
  }
  public static void gewonnen(){
    System.out.println("Du hast gewonnen.");
  }
  public static void verloren(){
    System.out.println("Du hast verloren.");
  }
  public static void uneentschieden(){
    System.out.println("Niemand hat gewonnen.");
  }
  public static void cü21(){
    System.out.println("Der Coupier hat mehr als 21.");
  }
  public static void gleich(){
    System.out.println("Ihr habt beide gleich viel.");
  }
  public static void cmad(){
    System.out.println("Coupier hat mehr als du.");
  }
  public static void dmac(){
    System.out.println("Du hast mehr als der Coupier");
  }
  public static void ch7k(){
    System.out.println("Der Coupier hat 7 Karten.");
  }
  public static void kü21(){
    System.out.println("Du hast mehr als 21.");
  }
  public static void dh7k(){
    System.out.println("Du hast 7 Karten.");
  }
}