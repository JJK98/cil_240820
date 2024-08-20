import java.util.Scanner;

public class App {
    Scanner sc;

    App(Scanner sc){
        this.sc = sc;
    }
    public void run(){
        int count = 1;
        System.out.println("== 게시판 앱 ==");

        while (true){
            System.out.print("명령) ");
            String command = sc.nextLine();

            if(command.equals("종료")){
                break;
            }
            else if(command.equals("등록")){
                System.out.print("제목: ");
                String tit = sc.nextLine().trim();
                System.out.print("내용: ");
                String con = sc.nextLine().trim();
                System.out.printf("%d번 게시글이 등록되었습니다.\n",count);
                count++;
            }
            else if (command.equals("목록")) {

            }
        }


    }

}
