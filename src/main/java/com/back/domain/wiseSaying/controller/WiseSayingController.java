package com.back.domain.wiseSaying.controller;

import com.back.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private final Scanner scanner;
    private final List<WiseSaying> wiseSayings = new ArrayList<>();
    private int index = 1;

    public WiseSayingController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void write() {
        System.out.print("명언 : ");
        String content = scanner.nextLine();

        System.out.print("작가 : ");
        String author = scanner.nextLine();

        int id = index++;

        wiseSayings.add(new WiseSaying(id, content, author));

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        for (WiseSaying wiseSaying : wiseSayings.reversed()) {
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent());
        }
    }
}
