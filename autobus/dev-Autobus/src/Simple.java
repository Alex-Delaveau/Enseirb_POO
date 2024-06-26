import tec.PassagerStandard;
import tec.Autobus;

class Simple {

    static public void main (String[] args) {
      Autobus serenity = new Autobus(1, 2);
  
      PassagerStandard kaylee = new PassagerStandard("Kaylee", 3);
      PassagerStandard jayne = new PassagerStandard("Jayne", 4);
      PassagerStandard inara = new PassagerStandard("Inara", 5);
  
      System.out.println(serenity);
  
      serenity.allerArretSuivant();
      //1
      kaylee.monterDans(serenity);
  
      System.out.println(serenity);
      System.out.println(kaylee);
  
      serenity.allerArretSuivant();
      //2
      jayne.monterDans(serenity);
  
      System.out.println(serenity);
      System.out.println(kaylee);
      System.out.println(jayne);
  
      serenity.allerArretSuivant();
      //3
      inara.monterDans(serenity);
  
      System.out.println(serenity);
      System.out.println(kaylee);
      System.out.println(jayne);
      System.out.println(inara);
  
      serenity.allerArretSuivant();
      //4
      System.out.println(serenity);
      System.out.println(kaylee);
      System.out.println(jayne);
      System.out.println(inara);
  
      serenity.allerArretSuivant();
      //5
      System.out.println(serenity);
      System.out.println(kaylee);
      System.out.println(jayne);
      System.out.println(inara);
    }
  }
  
  /* R'esultat de l'ex'ecution.
  [arret:0, assis:<0 [0,1[>, debout: <0 [0,2[>]
  [arret:1, assis:<1 [0,1[>, debout: <0 [0,2[>]
  Kaylee <assis>
  [arret:2, assis:<1 [0,1[>, debout: <1 [0,2[>]
  Kaylee <assis>
  Jayne <debout>
  [arret:3, assis:<1 [0,1[>, debout: <2 [0,2[>]
  Kaylee <assis>
  Jayne <debout>
  Inara <debout>
  [arret:4, assis:<0 [0,1[>, debout: <1 [0,2[>]
  Kaylee <endehors>
  Jayne <endehors>
  Inara <debout>
  [arret:5, assis:<0 [0,1[>, debout: <0 [0,2[>]
  Kaylee <endehors>
  Jayne <endehors>
  Inara <endehors>
  */