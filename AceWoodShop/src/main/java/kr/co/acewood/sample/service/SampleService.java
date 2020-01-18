package kr.co.acewood.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.acewood.sample.mapper.SampleMapper;
import kr.co.acewood.sample.model.Member;

@Service
public class SampleService {
    @Autowired
    private SampleMapper SampleMapper;

    /*
     * ȸ�� ����Ʈ ��ȸ (����)
     */
    public List<Member> getMembers() {
        return SampleMapper.getMembers();
    }
}
