import java.io.IOException;

public class УсловныеОператоры {
    public static void main (String[] args) throws IOException {

        char ch,answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.print("Попытайтесь её угадать:");

        ch= (char)System.in.read(); // тоже что и input

        if(ch==answer) {
            System.out.println("Ура!");
        }else if (ch>answer){
            System.out.println("Перестарался");
        }else if (ch<answer) {
                System.out.println("Недостарался");
        }

    }
}
