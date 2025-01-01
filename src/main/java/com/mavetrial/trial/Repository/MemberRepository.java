package com.mavetrial.trial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.mavetrial.trial.Entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
    List<Member> findByName(String name);
}
