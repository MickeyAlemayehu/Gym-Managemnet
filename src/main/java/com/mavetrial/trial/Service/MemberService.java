package com.mavetrial.trial.Service;

import java.util.List;

import com.mavetrial.trial.Dto.MemberDto;

public interface MemberService {
    MemberDto addMember(MemberDto memberDto);

    MemberDto getMemberById (int memberID);

    List<MemberDto> getAllMember ();

    MemberDto updateMember(int memberID, MemberDto updatedMember);

    void  deleteMemberById (int memberID);
}
