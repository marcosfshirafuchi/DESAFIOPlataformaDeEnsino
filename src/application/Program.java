package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    /*
        Programa DESAFIO: Plataforma de ensino desenvolvido por Marcos Ferreira Shirafuchi
        Data: 19/03/2024
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Lesson> list = new ArrayList<>();
        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++){
            System.out.printf("Dados da %da aula:\n",i);
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Título: ");
            String title = sc.nextLine();
            if(ch == 'c'){
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                list.add(new Video(title,url,seconds));
            }else{
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                list.add(new Task(title,description,questionCount));
            }
            System.out.println();
        }
        int duracaoTotalDoCurso = 0;
        for (Lesson lesson: list){
            duracaoTotalDoCurso += lesson.duration();
        }
        System.out.println();
        System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos\n", duracaoTotalDoCurso);
        sc.close();
    }
}
