package kr.co.acewood.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.acewood.sample.model.Member;

@Mapper
@Repository("kr.co.acewood.sample.mapper.SampleMapper")
public interface SampleMapper {

    /*
     * 회원 리스트 조회 (샘플)
     */
    public List<Member> getMembers();
}
