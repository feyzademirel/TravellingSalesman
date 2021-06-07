package gezginsaticiprojesi;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class GezginSaticiProjesi {
    private int b;
    public static ArrayList<Sehir> gidilecek_sehirler1 = new ArrayList<Sehir>(Arrays.asList(
                new Sehir(41),
                new Sehir(54),
                new Sehir(81),
                new Sehir(14),
                new Sehir(6),
                new Sehir(14),
                new Sehir(67),
                new Sehir(78),
                new Sehir(74),
                new Sehir(37),
                new Sehir(18),
                new Sehir(19),
                new Sehir(57),
                new Sehir(55),
                new Sehir(5),
                new Sehir(60),
                new Sehir(52),
                new Sehir(58),
                new Sehir(28),
                new Sehir(29),
                new Sehir(61),
                new Sehir(69),
                new Sehir(25),
                new Sehir(53),
                new Sehir(8),
                new Sehir(75),
                new Sehir(36),
                new Sehir(76),
                new Sehir(4),
                new Sehir(65),
                new Sehir(30),
                new Sehir(73),
                new Sehir(56),
                new Sehir(72),
                new Sehir(13),
                new Sehir(49),
                new Sehir(12),
                new Sehir(24),
                new Sehir(62),
                new Sehir(23),
                new Sehir(21),
                new Sehir(72),
                new Sehir(47),
                new Sehir(63),
                new Sehir(2),
                new Sehir(44),
                new Sehir(46),
                new Sehir(27),
                new Sehir(79),
                new Sehir(31),
                new Sehir(80),
                new Sehir(1),
                new Sehir(38),
                new Sehir(66),
                new Sehir(71),
                new Sehir(40),
                new Sehir(50),
                new Sehir(68),
                new Sehir(51),
                new Sehir(42),
                new Sehir(33),
                new Sehir(70),
                new Sehir(7),
                new Sehir(48),
                new Sehir(15),
                new Sehir(20),
                new Sehir(32),
                new Sehir(3),
                new Sehir(26),
                new Sehir(11),
                new Sehir(54),
                new Sehir(77),
                new Sehir(16),
                new Sehir(43),
                new Sehir(64),
                new Sehir(45),
                new Sehir(9),
                new Sehir(35),
                new Sehir(10),
                new Sehir(17),
                new Sehir(59),
                new Sehir(22),
                new Sehir(39),
                new Sehir(34),
                new Sehir(41)
   
     ));
      public static ArrayList<Sehir> gidilecek_sehirler2 = new ArrayList<Sehir>(Arrays.asList(
                new Sehir(41),
                new Sehir(34),
                new Sehir(59),
                new Sehir(39),
                new Sehir(22),
                new Sehir(17),
                new Sehir(10),
                new Sehir(35),
                new Sehir(9),
                new Sehir(48),
                new Sehir(7),
                new Sehir(15),
                new Sehir(20),
                new Sehir(45),
                new Sehir(43),
                new Sehir(64),
                new Sehir(3),
                new Sehir(32),
                new Sehir(42),
                new Sehir(70),
                new Sehir(33),
                new Sehir(1),
                new Sehir(51),
                new Sehir(68),
                new Sehir(40),
                new Sehir(71),
                new Sehir(66),
                new Sehir(50),
                new Sehir(38),
                new Sehir(46),
                new Sehir(80),
                new Sehir(31),
                new Sehir(27),
                new Sehir(79),
                new Sehir(27),
                new Sehir(63),
                new Sehir(2),
                new Sehir(44),
                new Sehir(23),
                new Sehir(21),
                new Sehir(47),
                new Sehir(72),
                new Sehir(56),
                new Sehir(73),
                new Sehir(30),
                new Sehir(65),
                new Sehir(13),
                new Sehir(49),
                new Sehir(12),
                new Sehir(62),
                new Sehir(24),
                new Sehir(25),
                new Sehir(4),
                new Sehir(76),
                new Sehir(36),
                new Sehir(75),
                new Sehir(8),
                new Sehir(53),
                new Sehir(69),
                new Sehir(61),
                new Sehir(29),
                new Sehir(28),
                new Sehir(58),
                new Sehir(52),
                new Sehir(60),
                new Sehir(5),
                new Sehir(55),
                new Sehir(57),
                new Sehir(19),
                new Sehir(37),
                new Sehir(18),
                new Sehir(6),
                new Sehir(26),
                new Sehir(14),
                new Sehir(78),
                new Sehir(74),
                new Sehir(67),
                new Sehir(81),
                new Sehir(54),
                new Sehir(11),
                new Sehir(16),
                new Sehir(77),
                new Sehir(41)
              
             
     ));
       public static ArrayList<Sehir> gidilecek_sehirler3 = new ArrayList<Sehir>(Arrays.asList(
                new Sehir(41),
                new Sehir(77),
                new Sehir(16),
                new Sehir(10),
                new Sehir(35),
                new Sehir(45),
                new Sehir(43),
                new Sehir(64),
                new Sehir(20),
                new Sehir(9),
                new Sehir(48),
                new Sehir(15),
                new Sehir(7),
                new Sehir(32),
                new Sehir(3),
                new Sehir(26),
                new Sehir(6),
                new Sehir(71),
                new Sehir(66),
                new Sehir(58),
                new Sehir(38),
                new Sehir(50),
                new Sehir(40),
                new Sehir(68),
                new Sehir(42),
                new Sehir(70),
                new Sehir(33),
                new Sehir(51),
                new Sehir(1),
                new Sehir(31),
                new Sehir(27),
                new Sehir(79),
                new Sehir(27),
                new Sehir(80),
                new Sehir(46),
                new Sehir(44),
                new Sehir(2),
                new Sehir(63),
                new Sehir(47),
                new Sehir(21),
                new Sehir(23),
                new Sehir(62),
                new Sehir(24),
                new Sehir(12),
                new Sehir(49),
                new Sehir(72),
                new Sehir(56),
                new Sehir(73),
                new Sehir(30),
                new Sehir(65),
                new Sehir(13),
                new Sehir(4),
                new Sehir(76),
                new Sehir(36),
                new Sehir(25),
                new Sehir(75),
                new Sehir(8),
                new Sehir(53),
                new Sehir(69),
                new Sehir(61),
                new Sehir(29),
                new Sehir(28),
                new Sehir(52),
                new Sehir(60),
                new Sehir(5),
                new Sehir(55),
                new Sehir(19),
                new Sehir(57),
                new Sehir(37),
                new Sehir(18),
                new Sehir(78),
                new Sehir(74),
                new Sehir(67),
                new Sehir(14),
                new Sehir(81),
                new Sehir(54),
                new Sehir(11),
                new Sehir(16),
                new Sehir(10),
                new Sehir(17),
                new Sehir(59),
                new Sehir(22),
                new Sehir(39),
                new Sehir(59),
                new Sehir(34),
                new Sehir(41)
                
             
     ));
       public static ArrayList<Sehir> gidilecek_sehirler4 = new ArrayList<Sehir>(Arrays.asList(
                 new Sehir(41),
                new Sehir(16),
                new Sehir(11),
                new Sehir(26),
                new Sehir(3),
                new Sehir(32),
                new Sehir(42),
                new Sehir(6),
                new Sehir(18),
                new Sehir(19),
                new Sehir(71),
                new Sehir(40),
                new Sehir(68),
                new Sehir(50),
                new Sehir(51),
                new Sehir(38),
                new Sehir(66),
                new Sehir(58),
                new Sehir(46),
                new Sehir(60),
                new Sehir(5),
                new Sehir(19),
                new Sehir(18),
                new Sehir(78),
                new Sehir(14),
                new Sehir(54),
                new Sehir(81),
                new Sehir(67),
                new Sehir(74),
                new Sehir(37),
                new Sehir(57),
                new Sehir(55),
                new Sehir(52),
                new Sehir(28),
                new Sehir(61),
                new Sehir(29),
                new Sehir(69),
                new Sehir(53),
                new Sehir(8),
                new Sehir(75),
                new Sehir(36),
                new Sehir(76),
                new Sehir(4),
                new Sehir(25),
                new Sehir(24),
                new Sehir(62),
                new Sehir(12),
                new Sehir(49),
                new Sehir(13),
                new Sehir(65),
                new Sehir(30),
                new Sehir(73),
                new Sehir(56),
                new Sehir(72),
                new Sehir(21),
                new Sehir(47),
                new Sehir(63),
                new Sehir(2),
                new Sehir(44),
                new Sehir(23),
                new Sehir(2),
                new Sehir(27),
                new Sehir(79),
                new Sehir(27),
                new Sehir(31),
                new Sehir(80),
                new Sehir(1),
                new Sehir(33),
                new Sehir(70),
                new Sehir(7),
                new Sehir(15),
                new Sehir(48),
                new Sehir(20),
                new Sehir(9),
                new Sehir(35),
                new Sehir(45),
                new Sehir(64),
                new Sehir(43),
                new Sehir(10),
                new Sehir(17),
                new Sehir(22),
                new Sehir(39),
                new Sehir(59),
                new Sehir(34),
                new Sehir(41)
                
             
     ));
        public static ArrayList<Sehir> gidilecek_sehirler5 = new ArrayList<Sehir>(Arrays.asList(
               new Sehir(41),
                new Sehir(54),
                new Sehir(14),
                new Sehir(18),
                new Sehir(19),
                new Sehir(5),
                new Sehir(60),
                new Sehir(58),
                new Sehir(24),
                new Sehir(44),
                new Sehir(23),
                new Sehir(21),
                new Sehir(2),
                new Sehir(63),
                new Sehir(47),
                new Sehir(73),
                new Sehir(30),
                new Sehir(65),
                new Sehir(13),
                new Sehir(56),
                new Sehir(72),
                new Sehir(49),
                new Sehir(12),
                new Sehir(62),
                new Sehir(12),
                new Sehir(25),
                new Sehir(4),
                new Sehir(76),
                new Sehir(36),
                new Sehir(75),
                new Sehir(8),
                new Sehir(53),
                new Sehir(69),
                new Sehir(61),
                new Sehir(29),
                new Sehir(28),
                new Sehir(52),
                new Sehir(55),
                new Sehir(57),
                new Sehir(37),
                new Sehir(74),
                new Sehir(78),
                new Sehir(67),
                new Sehir(81),
                new Sehir(14),
                new Sehir(6),
                new Sehir(71),
                new Sehir(66),
                new Sehir(38),
                new Sehir(46),
                new Sehir(27),
                new Sehir(79),
                new Sehir(27),
                new Sehir(31),
                new Sehir(80),
                new Sehir(1),
                new Sehir(51),
                new Sehir(50),
                new Sehir(40),
                new Sehir(68),
                new Sehir(42),
                new Sehir(70),
                new Sehir(33),
                new Sehir(7),
                new Sehir(32),
                new Sehir(3),
                new Sehir(26),
                new Sehir(11),
                new Sehir(16),
                new Sehir(77),
                new Sehir(16),
                new Sehir(43),
                new Sehir(64),
                new Sehir(20),
                new Sehir(15),
                new Sehir(48),
                new Sehir(9),
                new Sehir(35),
                new Sehir(45),
                new Sehir(10),
                new Sehir(17),
                new Sehir(22),
                new Sehir(39),
                new Sehir(59),
                new Sehir(34),
                new Sehir(41)
               
             
     ));
    
    public static void main(String[] args) throws  IOException {
        Scanner scan = new Scanner(System.in);
        Scanner il = new Scanner(System.in);
        System.out.println("Kac tane il gireceksiniz? ");
        int a = scan.nextInt();
        int dizi[] = new int[a]; 
        int dizi1[] = new int[a];
        int dizi2[] = new int[a];
        int dizi3[] = new int[a];
        int dizi4[] = new int[a];
        for(int i = 0; i<a; i++){
           System.out.println("Gitmek istediginiz ilin plakasini basinda 0 olmadan girin: ");
           int c = il.nextInt();
           for(int j=0;j<gidilecek_sehirler1.size();j++){
               if(c == gidilecek_sehirler1.get(j).getPlaka()){
                   dizi[i]=j;
                   break;
               }  
           }
          for(int l=0;l<gidilecek_sehirler2.size(); l++){
              if(c == gidilecek_sehirler2.get(l).getPlaka()){
                   dizi1[i]=l;
                   break;
               }  
           }
          for(int l=0;l<gidilecek_sehirler3.size(); l++){
              if(c == gidilecek_sehirler3.get(l).getPlaka()){
                   dizi2[i]=l;
                   break;
               }  
           }
          for(int l=0;l<gidilecek_sehirler4.size(); l++){
              if(c == gidilecek_sehirler4.get(l).getPlaka()){
                   dizi3[i]=l;
                   break;
               }  
           }
          for(int l=0;l<gidilecek_sehirler5.size(); l++){
              if(c == gidilecek_sehirler5.get(l).getPlaka()){
                   dizi4[i]=l;
                   break;
               }  
           }
          }
        
        int depo = dizi[0];
        int depo1 = dizi1[0];
        int depo2 = dizi2[0];
        int depo3 = dizi3[0];
        int depo4 = dizi4[0];
        for (int y = 0; y < dizi.length; y++){
            if (dizi[y] > depo) {
                depo= dizi[y];
            }
        }
        for (int y = 0; y < dizi1.length; y++){
            if (dizi1[y] > depo1) {
                depo1= dizi1[y];
            }
        }
        for (int y = 0; y < dizi2.length; y++){
            if (dizi2[y] > depo2) {
                depo2 = dizi2[y];
            }
        }
        for (int y = 0; y < dizi3.length; y++){
            if (dizi3[y] > depo3) {
                depo3 = dizi3[y];
            }
        }
        for (int y = 0; y < dizi4.length; y++){
            if (dizi4[y] > depo4) {
                depo4 = dizi4[y];
            }
        }
        gidilecek_sehirler1.subList(depo+1, gidilecek_sehirler1.size()-1).clear();
        gidilecek_sehirler1.remove(gidilecek_sehirler1.size()-1);
        
        gidilecek_sehirler2.subList(depo1+1, gidilecek_sehirler2.size()-1).clear();
        gidilecek_sehirler2.remove(gidilecek_sehirler2.size()-1);
        
        gidilecek_sehirler3.subList(depo2+1, gidilecek_sehirler3.size()-1).clear();
        gidilecek_sehirler3.remove(gidilecek_sehirler3.size()-1);
        
        gidilecek_sehirler4.subList(depo3+1, gidilecek_sehirler4.size()-1).clear();
        gidilecek_sehirler4.remove(gidilecek_sehirler4.size()-1);
        
        gidilecek_sehirler5.subList(depo4+1, gidilecek_sehirler5.size()-1).clear();
        gidilecek_sehirler5.remove(gidilecek_sehirler5.size()-1);
        
       
             
        GezginSaticiProjesi GezginSatici1 = new GezginSaticiProjesi();
        GezginSaticiProjesi GezginSatici2 = new GezginSaticiProjesi();
        GezginSaticiProjesi GezginSatici3 = new GezginSaticiProjesi();
        GezginSaticiProjesi GezginSatici4 = new GezginSaticiProjesi();
        GezginSaticiProjesi GezginSatici5 = new GezginSaticiProjesi();
        Yol yol1 = new Yol(GezginSaticiProjesi.gidilecek_sehirler1);
        Yol yol2 = new Yol(GezginSaticiProjesi.gidilecek_sehirler2);
        Yol yol3 = new Yol(GezginSaticiProjesi.gidilecek_sehirler3);
        Yol yol4 = new Yol(GezginSaticiProjesi.gidilecek_sehirler4);
        Yol yol5 = new Yol(GezginSaticiProjesi.gidilecek_sehirler5);
        System.out.println("ROTA | KM");
        System.out.println( yol1 + " | " + yol1.toplamMesafe());
        System.out.println( yol2 + " | " + yol2.toplamMesafe());
        System.out.println( yol3 + " | " + yol3.toplamMesafe());
        System.out.println( yol4 + " | " + yol4.toplamMesafe());
        System.out.println( yol5 + " | " + yol5.toplamMesafe());
        new HillClimbing().enKısaYol(yol3); 
        new HillClimbing().enKısaYol(yol4); 
        new HillClimbing().enKısaYol(yol5); 
    }
}

