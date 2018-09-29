package lection1_6;

import java.util.Scanner;

public class TicTacToe {
   int[][] gameBoard = new int[3][3];
   Scanner inputScan = new Scanner(System.in);

   String playerX = "X", playerC = "O", currentPlayer = playerX;

   int row, col;

   TicTacToe(){
        initGameBoard();

        while (true){
            drawGameBoard();

            System.out.println("Ход игрока " + currentPlayer);
            System.out.println("Выбери строку: ");
            row = inputScan.nextInt();

            System.out.println("Выбери столбец: ");
            col = inputScan.nextInt();

            gameBoard[row][col] = currentPlayer.equalsIgnoreCase(playerX) ? 1 : 2;

            currentPlayer = currentPlayer.equals(playerX) ? playerC : playerX;
        }

   }


   private void initGameBoard(){
       for (int row = 0; row < gameBoard.length; row++) {
           for (int col = 0; col < gameBoard[row].length ; col++) {
               gameBoard[row][col] = 0;
           }
       }
   }


   private void drawGameBoard(){
       for (int[] row: gameBoard){
           for (int col: row){
               switch (col){
                   case 0:
                       System.out.print("   ");
                       break;
                   case 1:
                       System.out.print(" X ");
                       break;
                   case 2:
                       System.out.print(" O ");
                       break;
               }

               System.out.print(" | ");
           }

           System.out.println();
       }
   }
}
