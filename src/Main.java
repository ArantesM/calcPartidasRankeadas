public class Main {
    public static String rank(String name, int win, int loss){
        int result = win - loss;
        String rank;

        if(result <= 10){
            rank = "Ferro";
        }else if (result >= 10 && result <= 20) {
            rank = "Bronze";
        }else if (result > 20 && result <= 50) {
            rank = "Prata";
        }else if (result > 50 && result <= 80) {
            rank = "Ouro";
        }else if (result > 80 && result <= 90) {
            rank = "Diamante";
        }else if (result > 90 && result <= 100) {
            rank = "Lendário";
        } else {
            rank = "Imortal";
        }

        return ("O herói " +name+ " tem de saldo: " +result+ "está no nível: " +rank);
    }

    public static void main(String[] args) {
        System.out.printf(rank("Superman", 121, 33));


    }
}