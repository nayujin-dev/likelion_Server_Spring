package com.sparta.week03.controller;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.models.MemoRequestDto;
import com.sparta.week03.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


    //유진 퀴즈 풀어볼라고 한 흔적 .. 하지만 영 빗나갔다 우핫핫 정답은 바로 아래에 ~~
//    @PutMapping("/api/{id}")
//    public Long updateMemo(@PathVariable Long id,@RequestBody MemoRequestDto requestDto){
//        memoRepository.findById(id);
//        Memo memo = new Memo(requestDto);
//        memo.update(requestDto);
//        return id;
//    }
    @RequiredArgsConstructor
    @RestController
    public class MemoController {

        private final MemoRepository memoRepository;
        private final MemoService memoService;

        @GetMapping("/api/memos")
        public List<Memo> getMemos() {
            LocalDateTime start = LocalDateTime.now().minusDays(1);
            LocalDateTime end = LocalDateTime.now();
            return memoRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(start, end);
        }

        @PostMapping("/api/memos")
        public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
            Memo memo = new Memo(requestDto);
            return memoRepository.save(memo);
        }

        @PutMapping("/api/memos/{id}")
        public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
            memoService.update(id, requestDto);
            return id;
        }

        @DeleteMapping("/api/memos/{id}")
        public Long deleteMemo(@PathVariable Long id) {
            memoRepository.deleteById(id);
            return id;
        }
    }