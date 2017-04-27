public class Main {
    public static void main(String[] args){

        int n = 10; int m = 10;    //размер поля
        int k = 5;                 //длина выигрышной комбинации
        int depth = 0;              //максимальная глубина просмотра
        boolean isComputerFirst = false;

        GameField game = new GameField(n,m,k,depth);
        game.gameStart(isComputerFirst);
    }
}