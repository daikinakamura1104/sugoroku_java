import java.util.Random;

public class Player{

    String name;

    // コンストラクタに変えてTaro,Jiroを引数に渡す。
    public Player(String name){
        // 0からnextIntの範囲まで数値がでる
        // Random rnd = new Random();
        // int num = rnd.nextInt(1) + 1;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}