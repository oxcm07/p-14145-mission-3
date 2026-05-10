package com.back;

import com.back.domain.wiseSaying.controller.WiseSayingController;
import com.back.domain.system.controller.SystemController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController(scanner);

        while(true) {
            System.out.println("명령) ");
            String cmd = scanner.nextLine();

            switch (cmd) {
                case "등록" -> wiseSayingController.write();
                case "목록" -> wiseSayingController.list();
                case "종료" -> {
                    systemController.exit();
                    return;
                }
            }
        }
    }
}