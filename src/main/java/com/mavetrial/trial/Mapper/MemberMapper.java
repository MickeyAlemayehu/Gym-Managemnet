package com.mavetrial.trial.Mapper;

import com.mavetrial.trial.Dto.MemberDto;
import com.mavetrial.trial.Entity.Member;

public class MemberMapper{
    public static MemberDto mapToMemberDto(Member member){
        return new MemberDto(
            member.getMemberID(),
            member.getMemberName(),
            member.getMemberAge(),
            member.getMemberPhone(),
            member.getMemberAddress(),
            member.getMembership_plan(),
            member.getExpiryDate(),
            member.getClassID()
        );
    }
    public static Member mapToMember(MemberDto memberDto){
        return new Member(
            memberDto.getMemberName(),
            memberDto.getMemberAge(),
            memberDto.getMemberPhone(),
            memberDto.getMemberAddress(),
            memberDto.getMembership_plan(),
            memberDto.getExpiryDate(),
            memberDto.getClassID()
        );
    }
}
