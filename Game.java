import java.util.ArrayList;

public class Game {

    // 変数作成
    Board board;
    ArrayList<Player> playernames = new ArrayList<Player>();
    Dice dice;
  
    // コンストラクタ
    public Game(){

    }

    // Board.csv情報がthis.boardに代入される
    public void setBoard(Board board){
       this.board = board;
    }

    public void addplayer(Player player){
        this.playernames.add(player);
        //  System.out.println(player);
    }

    public void setDice(Dice dice){
        this.dice = dice;
        // System.out.println(dice);

    }

    public void start(){

        ArrayList<String> boardsquares = this.board.getsquares();
        int numofGoal = boardsquares.size();
        int sumofDice1 = 0;
        int sumofDice2 = 0;
        boolean bool = true;

         System.out.println("ゴールは"+numofGoal+"マス目");
         System.out.println("イベントの発生は1回のサイコロ振りで最大3回");
       
       while (bool){

                    // Taroの番
    
                    int numofDice1 = this.dice.numofDice();

                    System.out.println("**** Taroの番 ****");
                    System.out.println("現在の位置は"+sumofDice1+"マス目");
                    sumofDice1 += numofDice1;
                    System.out.println("出た目は" + numofDice1);

                     if (sumofDice1 >= numofGoal){
                        System.out.println("Taroはゴール");
                        break;
                    }

                    System.out.println(sumofDice1+"に進む");

                    int aftereventsPosition1 = this.events(sumofDice1);
                    sumofDice1 = aftereventsPosition1;

                     System.out.println("現在の位置は"+sumofDice1+"マス目");

                     if (sumofDice1 >= numofGoal){
                        System.out.println("Taroはゴール");
                        break;
                    }

                    
                    // Jiroの番

                

                    int numofDice2 = this.dice.numofDice();
                    
                    System.out.println("**** Jiroの番 ****");
                    System.out.println("現在の位置は"+sumofDice2+"マス目");
                    sumofDice2 += numofDice2;
                    System.out.println("出た目は" + numofDice2);

                    if (sumofDice2 >= numofGoal){
                        System.out.println("Jiroはゴール");
                        break;
                    }

                    System.out.println(sumofDice2+"に進む");


                    int aftereventsPosition2 = this.events(sumofDice2);
                    sumofDice2 = aftereventsPosition2;

                    System.out.println("現在の位置は"+sumofDice2+"マス目");
             

                    if (sumofDice2 >= numofGoal){
                        System.out.println("Jiroはゴール");
                        break;
                    }
        }
    }

    private int events(int numofPosition){

        ArrayList<String> boardsquares = this.board.getsquares();
        int correctPosition = numofPosition;

        for(int i=1; i < 4; i++){

            String squareevents = boardsquares.get(correctPosition-1);

            if(squareevents.equals("0")){

                correctPosition += Integer.parseInt(squareevents);
                System.out.println("イベントは発生なし");
                System.out.println(correctPosition+"マス目に止まる");
                break;

            }else{

                correctPosition += Integer.parseInt(squareevents) ;
                int eventnum = Integer.parseInt(squareevents);
                System.out.println("イベントが発生");
                System.out.println(eventnum+"マス移動");
                // int aftereventsPosition = numofPosition + eventnum;
                System.out.println(correctPosition  +"マス目に移動");
            }
        }
        
       
        return correctPosition;

        

    }

    


}