package hello.upload.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/servlet/v1")
public class SevletUploadControllerV1 {

    @GetMapping("/upload")
    public String newFile(){
        return "upload-Form";
    }

    @PostMapping("/upload")
    public String saveFileV1(HttpServletRequest request){

        log.info("request={}", request);
        return "save-file";
    }

}
