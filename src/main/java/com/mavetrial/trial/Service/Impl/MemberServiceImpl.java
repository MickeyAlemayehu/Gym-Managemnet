package com.mavetrial.trial.Service.Impl;


import com.mavetrial.trial.Entity.Member;
import com.mavetrial.trial.Expection.ResourceNotFound;

import java.util.List;
import java.util.stream.Collectors;

import com.mavetrial.trial.Dto.MemberDto;
import com.mavetrial.trial.Mapper.MemberMapper;
import com.mavetrial.trial.Repository.MemberRepository;
import com.mavetrial.trial.Service.MemberService;

public class MemberServiceImpl implements MemberService{
    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberDto addMember(MemberDto memberDto) {
        Member member = MemberMapper.mapToMember(memberDto);
        Member savedMember = memberRepository.save(member); 
        return MemberMapper.mapToMemberDto(savedMember);
    }

    @Override
    public MemberDto getMemberById(int memberID) {
        Member member = memberRepository.findById(memberID)
         .orElseThrow ( () -> new ResourceNotFound("Member with the ID " + memberID + " not found"));
        return MemberMapper.mapToMemberDto(member);
    }

    @Override
    public List<MemberDto> getAllMember() {
        List <Member> members = memberRepository.findAll();
        return members.stream()
        .map((member) -> MemberMapper.mapToMemberDto(member))
        .collect(Collectors.toList());
    }
}
