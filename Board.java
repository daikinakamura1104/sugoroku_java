import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Board {

    ArrayList<String> boardsquares = new ArrayList<String>();

    public Board (String csvfile){
        // ボード内容読み込み処理

        // public static void main(String args[]){

            try {
            // BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
            FileReader file = new FileReader(csvfile);
            BufferedReader buffer = new BufferedReader(file);
            String data;
            StringTokenizer token;

            while ((data = buffer.readLine()) != null) {
                
                token = new StringTokenizer(data, ",");

                while(token.hasMoreTokens()){
                    this.boardsquares.add(token.nextToken());
                }
            }
            
            // 終了
            buffer.close();
         
            } 

            catch( FileNotFoundException e )
		    {
			// 13行目でファイルのオープンに失敗したら、ここに来る。
			System.err.println( e );
		    }
            // Exception調べる
            catch( IOException e )
		    {
			// 18行目で close メソッドに失敗したら、ここに来る。
			System.err.println( e );
		    }
        // }

        
    }

    public ArrayList getsquares(){
        // ボードマス目情報を返す
        return this.boardsquares;
    }
 
    
}