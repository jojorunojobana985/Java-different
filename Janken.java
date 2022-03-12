import java.util.Random;

public class Janken1{
public static void main(String[] args){
    Random random = new Random();
    int play1 = random.nextInt(3);
    int play2 = random.nextInt(3);
    System.out.println("player1とplayer2でじゃんけんをします。");
    System.out.println("はじめ!!!");
    
        //player1手
        if(play1 == 1 ){
            System.out.println("プレイヤー1:パー");
        }else if(play1 == 2){
            System.out.println("プレイヤー1:チョキ");
        }else if(play1 == 0){
            System.out.println("プレイヤー1:グー");
        }

        //player2手
        if(play2 == 1 ){
            System.out.println("プレイヤー2:パー");
        }else if(play2 == 2){
            System.out.println("プレイヤー2:チョキ");
        }else if(play2 == 0){
            System.out.println("プレイヤー2:グー");  
        }

        System.out.println("結果は、、、、");
        
        //じゃんけん結果表示
        if(play1 == 0 && play2 == 1){
            System.out.println("プレイヤー2の勝ち");
        }else if(play1 == 1 && play2 == 2){
            System.out.println("プレイヤー2の勝ち");
        }else if(play1 == 2 && play2 == 0){
            System.out.println("プレイヤー2の勝ち");
        }else if(play1 == 0 && play2 == 0){
            System.out.println("引き分け");
        }else if(play1 == 1 && play2 == 1){
            System.out.println("引き分け");
        }else if(play1 == 2 && play2 == 2){
            System.out.println("引き分け");
        }else{
            System.out.println("プレイヤー1の勝ち");
        }
    }    
}