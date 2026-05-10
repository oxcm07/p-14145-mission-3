package com.back.domain.wiseSaying.repository;

import com.back.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    private final List<WiseSaying> wiseSayings = new ArrayList<>();
    private int index = 1;

    public WiseSaying save(WiseSaying wiseSaying) {
        wiseSaying.setId(index++);

        wiseSayings.add(wiseSaying);

        return wiseSaying;
    }

    public List<WiseSaying> findForList() {
        return wiseSayings.reversed();
    }
}