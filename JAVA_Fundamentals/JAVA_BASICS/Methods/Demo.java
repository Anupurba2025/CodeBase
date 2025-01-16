package Methods;
class Computer{
    public void playMusic(){
        System.out.println("Music Played");
    }
    public String getMePen(int price){
        if(price == 5){
            return "pen is yours";
        }
        else{
            return "insufficient price";
        }
    }
}
public class Demo {
    public static void main(String[] args){
        Computer com = new Computer();
        com.playMusic();
        String BuyPen = com.getMePen(5);
        System.out.println(BuyPen);
    }
}
