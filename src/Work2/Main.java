package Work2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Введите пожалуйста ваш лицензионный ключ");
        a = scanner.nextInt();
        DocumentWorker file;
        if (a == 1111){
            file = new DocumentWorkerPro();
            file.OpenDoc();
            file.EditDoc();
            file.SaveDoc();
        }
        else if(a == 2222){
            file = new DocumentWorkerExp();
            file.OpenDoc();
            file.EditDoc();
            file.SaveDoc();
        }
        else {
            file = new DocumentWorker();
            file.OpenDoc();
            file.EditDoc();
            file.SaveDoc();
        }
        }
    }