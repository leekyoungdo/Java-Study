package com.sesac.seasspring.api.controller;

import com.sesac.seasspring.api.DTO.UserDTO;
import com.sesac.seasspring.api.VO.PracVO;
import com.sesac.seasspring.api.VO.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class MainController {
//    @GetMapping("/")
//    public String getMain() {
//        return "request";
//    }

    // ===GET===
    // 매개변수를 넘겨받는 방법
    // 1. /test?id=123
    // 2. /test/123
    @GetMapping("/get/response1")
    // ?key=value
    // ?name=
    // @RequestParam 은 기본값으로 required = true
//    public String getResponse1(@RequestParam String name, Model model){
//        model.addAttribute("name", name);
//        return "response";
//    }
    // @RequestParam 는 기본값으로 required=true
    public String getResponse1(
            @RequestParam(value = "name") String i,
            Model model) {
        // @RequestParam 어노테이션
        // -?name=112&id=11&age=abc
        // -string query (?뒤의 값) 에서 key("name") 에 대한
        // value("112")를 변수("i") 에 매핑
        // - required=true 기본값 -> 요청 url에서 설정한 key가 필수로 있어야 해요.
        model.addAttribute("name", i);
        return "response";
    }

    @GetMapping("/get/response2")
    // requierd=false 옵션 (@RequestParam(value="", required=false))
    // - query string에서 특정 key를 옵셔널 하게 받아야 하는 경우
    // ex) 검색할때 ( 검색어(필수) 해시태그 (선택))
    // @RequestParam(value="search") String search,
    // @RequestParam(value="hashtag" , required=false) String hashtag
    public String getResponse2(
            @RequestParam(value = "name", required = false) String name,
            Model model) {
        model.addAttribute("name", name);
        return "response";
    }

    @GetMapping("/get/response3/{param1}/{param2}")
    public String getResponse3(
            @PathVariable String param1,
            @PathVariable(value = "param2") String age,
            Model model) {
        /*
         * @PathVariable 어노테이션
         * - /test/{id} 형식의 URL 경로로 데이터를 넘겨줄 때 받는 방법
         * - 기본적으로 경로 변수의 값을 필수로 받아야 하기 때문 ( 보내지 않으면 404 error )
         * */
        model.addAttribute("name", param1);
        model.addAttribute("age", age);
        return "response";
    }

    // pathvariable을 보낼 때 선택적으로 처리해야 한다면
    @GetMapping({"/get/response4/{param1}", "/get/response4/{param1}/{param2}"})
    public String getResponse4(
            @PathVariable String param1,
            @PathVariable(required = false, value = "param2") String age,
            Model model) {
        // 중요! optional한 parameter은 맨 뒤에 오도록 설정
        model.addAttribute("name", param1);
        model.addAttribute("age", age);
        return "response";
    }


    // post 방식 - @RequestParam
    @PostMapping("/post/response1")
    public String postResponse1(
            @RequestParam(value = "name") String a,
            @RequestParam(value = "age") String b,
            Model model
    ) {
        model.addAttribute("name", a);
        model.addAttribute("age", b);
        return "response";
    }

    @PostMapping("/post/response2")
    public String postResponse2(
            @RequestParam(value = "name", required = false) String a,
            @RequestParam(value = "age", required = false) String b,
            Model model
    ) {
        model.addAttribute("name", a);
        model.addAttribute("age", b);
        return "response";
    }

    @PostMapping("/post/response3")
    @ResponseBody
    public String postResponse3(
            @RequestParam(value = "name", required = false) String a,
            @RequestParam(value = "age", required = false) String b,
            Model model
    ) {
        model.addAttribute("name", a);
        model.addAttribute("age", b);
        return "response";
    }

    // ===============실습 1======================
    @GetMapping("/introduce/{name}")
    public String introduce(
            @PathVariable(value = "name") String a,
            Model model
    ) {
        model.addAttribute("name", a);
        return "introduce";
    }

    @GetMapping("/introduce2/{name}/{age}")
    public String introduce2(
            @PathVariable(value = "name") String a,
            @PathVariable(value = "age") String b,
            Model model
    ) {
        model.addAttribute("name", a);
        model.addAttribute("age", b);
        return "introduce";
    }

    // ===========실습 2 ===============
    @PostMapping("/introduce")
    public String prac (
            @RequestParam(value = "name") String a,
            @RequestParam(value = "gender") String b,
            @RequestParam(value = "year") String c,
            @RequestParam(value = "month") String d,
            @RequestParam(value = "day") String e,
            @RequestParam(value = "hobby") String f,
            Model model
    ){
        model.addAttribute("name", a);
        model.addAttribute("gender", b);
        model.addAttribute("year", c);
        model.addAttribute("month", d);
        model.addAttribute("day" , e);
        model.addAttribute("hobby", f);
        return "introduce";
    }

    @GetMapping("/dto/response1")
    @ResponseBody
    public String dtoResponse1(@ModelAttribute UserDTO userDTO) {
        // DTO : getter와 setter가 있는 객체
        // Get 방식에서 DTO 객체로 담아서 값이 받아지는 구나.
        // @ModelAttribute : HTML 폼 데이터를 컨트롤러로 전달할 때 객체에 매핑
        // 매핑 = Setter 함수 실행
        // ?name=홍길동&age=10 -> setName("홍길동") setAge("10")
        return userDTO.getName() + " " + userDTO.getAge();
    }

    // @RequestBody : 요청의 본문에 있는 데이터 (body)를 받는 친구
    @GetMapping("/dto/response11")
    @ResponseBody
    public String dtoResponse11(@RequestBody UserDTO userDTO) {
        return userDTO.getName() + " " + userDTO.getAge();
    }

    // 일반 폼 전송 -> www-x-form-urlencoded = 쿼리 매개변수
    // 일반 폼 전송 -> RequestBody 값을 x
    // RequestBody는 요청의 본문에 있는 데이터(body)를 처리할 수 있기 떄문에
    // json, xml 일 때만 실행이 가능
    // application/json

    // 일반 폼전송 - DTO (getter, setter 모두 있는 친구)
    // 1) 어노테이션 없이 DTO로 받을 경우 -> o
    // 2) @ModelAttribute DTO로 받을 경우 -> o
    // 3) @RequestBody DTO로 받을 경우 -> 오류

    // 일반 폼 전송 -> www-x-form-urlencoded 형식이기 떄문에
    // get이든 post든  요청의 본문에 데이터가 들어가는게 아닌 폼 데이터 형태로
    // url로 데이터가 전송됨. -> 즉, 일반 폼전송은 RequestBody 사용 불가

    // 일반 폼 전송 - VO

    @GetMapping("/vo/response1")
    @ResponseBody
    public String voResponse1(UserVO userVO) {
        return userVO.getName() + " " + userVO.getAge();
    }

    // => null
    @PostMapping("/vo/response2")
    @ResponseBody
    public String voResponse2(UserVO userVO) {
        return userVO.getName() + " " + userVO.getAge();
    }

    // => null
    @PostMapping("/vo/response3")
    @ResponseBody
    public String voResponse3(@RequestBody UserVO userVO) {
        return userVO.getName() + " " + userVO.getAge();
    }
    // => 오류

    //======== axios =========
    @GetMapping("/axios/response1")
    @ResponseBody
    public String axiosResponse1(@RequestParam String name, @RequestParam String age) {
        return name + " " + age;
    } // 1. Axios - get @RequestParam -> o

    @GetMapping("/axios/response2")
    @ResponseBody
    public String axiosResponse2(UserDTO userDTO) {
        // @ModelAttribute
        // Axios = application/json
        return userDTO.getName() + " " + userDTO.getAge();
    } // 2. Axios - get - @ModelAttribute -> o

    //?key=value
    //일반폼전송은 ( get, post 상관없이 url )
    //@RequestParam
    //객체로 받는 방법
    //1. @ModelAttribute
    //- url로 들어온 값을 처리하는 친구 -> 객체에 setter 함수를 실행해주는 친구
    //- ex) ?name=홍길동
    //- 1) 넘어온 key를 @ModelAttribute 뒤의 객체에서 필드가 존재하는지 확인
    //     -> UserDTO 에 private String name;
    //- 2) 필드가 존재한다면 그 필드에 해당하는 set 함수를 실행 ( setName, setAge 함수 )
    //     -> UserDTO.setName("홍길동")
    //2. @RequestBody
    //- 클라이언트의 요청 중 본문(body)에 들어있는 데이터를 처리
    //- setter 함수 실행 x 필드 자체에 값을 넣어줘요
    //- @RequestBody는 각각의 필드(변수)에 직접적으로 값을 주입 ( 필드에 내장된 set 함수를 실행 )
    //-> 일반폼전송 -> url에 데이터 표시 o body x

    @PostMapping("/axios/response3")
    @ResponseBody
    // url이었는데, axios post 는  url에 데이터가 x
    // url에 아무것도 없는데 name, age required=true기 때문에 에러가 발생
    public String axiosRes3(@RequestParam String name, @RequestParam String age){
        return "이름: " + name + ", 나이: "+ age;
    }

    @PostMapping("/axios/response4")
    @ResponseBody
    public String axiosRes4(UserDTO userDTO){
        return "이름:" + userDTO.getName() + ", 나이: "+ userDTO.getAge();
    }
    // @ModelAttribute 를 이용해 데이터를 보냈을때 값이 null
    // axios로 보내면 url로  데이터를 보내는 게 아니라 본문으로 데이터를 보내게 된다
    // 즉 @ModelAttribute가 값을 볼 수 가 없는 거죠
    @PostMapping("/axios/response5")
    @ResponseBody
    public String axiosRes5(@RequestBody UserDTO userDTO){
        return "이름:" + userDTO.getName() + ", 나이: "+ userDTO.getAge();
    }
    // axios + post 데이터 -> @RequestBody o


    // ========== VO 이용 with. axios ==========
    @GetMapping("/axios/vo/response1")
    @ResponseBody
    public String axiosVoRes1(@RequestParam String name, @RequestParam String age) {
        return "이름: " + name + ", 나이: " + age;
    }

    @GetMapping("/axios/vo/response2")
    @ResponseBody
    public String axiosVoRes2(UserVO userVO) {
        return "이름: "+ userVO.getName() + ", 나이: "+ userVO.getAge();
    }

    @PostMapping("/axios/vo/response3")
    @ResponseBody
    public String axiosVoRes3(@RequestParam String name, @RequestParam String age) {
        return "이름: " + name + ", 나이: " + age;
    }

    @PostMapping("/axios/vo/response4")
    @ResponseBody
    public String axiosVoRes4(UserVO userVO){
        return "이름: "+ userVO.getName() + ", 나이: "+ userVO.getAge();
    }

    @PostMapping("/axios/vo/response5")
    @ResponseBody
    public String axiosVoRes5(@RequestBody UserVO userVO){
        // axios post로 데이터를 보내면 요청의 본문 (body)에 데이터가 들어간다.
        // @RequestBody는 요청의 본문에 있는 데이터를 읽을 수 있다.
        // UserVO 클래스는 setter 메소드가 없어요.
        // @RequestBody는 데이터를 각가의 필드(변수) 에 직접적으로 값 주입
        // @RequestBody는
        // UserVO UserDTO 상관없이 setter 메소드의 유무와 관계없이 변수에 값을 넣을 수 있다.
        return "이름: "+ userVO.getName() + ", 나이: "+ userVO.getAge();
    }

    @PostMapping("/axios/vo/introduce")
    @ResponseBody
    public String voResPrac(@RequestBody PracVO pracVO){
        return pracVO.getName()+"님 환영합니다";
    }


    //1. 일반 폼 전송
    // - RequestParam : GET, POST
    // - PathVariable : GET

    //2. DTO 이용 - 일반 폼 전송(url)
    //- GET? O
    //- POST + ModelAttribute? O
    //- POST + RequestBody? X

    //3. VO 이용 - 일반 폼 전송
    //- GET? NULL
    //- POST + ModelAttribute? Null
    //- POST + RequestBody? X

    //4. AXIOS - DTO
    //- GET RequestParam : o
    //- GET ModelAttribute : o
    //- GET RequestBody : x
    //- POST RequestParam : x
    //- POST ModelAttribute : null
    //- POST RequestBody : o

    //
    //5. AXIOS VO
    //- GET RequestParam : o
    //- GET ModelAttribute : NULL
    //- GET RequestBody : x
    //- POST RequestParam : x
    //- POST ModelAttribute : null
    //- POST RequestBody : o
}