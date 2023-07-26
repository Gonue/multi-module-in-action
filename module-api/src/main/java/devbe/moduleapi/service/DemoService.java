package devbe.moduleapi.service;

import devbe.moduleapi.exception.CustomException;
import devbe.modulecommon.domain.Member;
import devbe.modulecommon.enums.CodeEnum;
import devbe.modulecommon.repository.MemberRepository;
import devbe.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;
    private final MemberRepository memberRepository;

    public String save(){
        memberRepository.save(Member.builder()
                        .name(Thread.currentThread().getName())
                        .build());
        return "save";
    }

    public String  find(){
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
        return "find";
    }

    public String exception(){
        if (true){
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }
}
