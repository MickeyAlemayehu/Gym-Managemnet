package com.mavetrial.trial.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavetrial.trial.Dto.MemberDto;
import com.mavetrial.trial.Service.MemberService;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity <MemberDto> addMember(@RequestBody MemberDto memberDto){
        MemberDto savedMember = memberService.addMember(memberDto);
        return new ResponseEntity <> (savedMember, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity <MemberDto> getMemberById(@PathVariable int memberID){
        MemberDto memberDto = memberService.getMemberById(memberID);
        return ResponseEntity.ok(memberDto);
    }
}