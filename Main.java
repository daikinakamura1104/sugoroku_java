public class Main{
    public static void main (String[] args){

        // Gameクラスのインスタンスを作成
        Game game = new Game();
        // Board.csvのボード情報を取得
        game.setBoard(new Board("board.csv"));
        game.addplayer(new Player("Taro"));
        game.addplayer(new Player("Jiro"));
        game.setDice(new Dice());
        game.start();
    }   
}

