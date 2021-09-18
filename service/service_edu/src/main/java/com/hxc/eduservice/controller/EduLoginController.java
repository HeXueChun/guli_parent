package com.hxc.eduservice.controller;

import com.hxc.commonutils.R;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("eduservice/user")
public class EduLoginController {

    //login
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }

    //info
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avater","https://image.so.com/view?q=%E8%A9%B9%E5%A7%86%E6%96%AF%E5%A4%B4%E5%83%8F&listsrc=sobox&listsign=85219a7998c4b47bb3c1ba214db1a23a&src=360pic_strong&correct=%E8%A9%B9%E5%A7%86%E6%96%AF%E5%A4%B4%E5%83%8F&ancestor=list&cmsid=7c33dbabf9eadcaf83c7474cda4dcdb3&cmras=0&cn=0&gn=0&kn=21&crn=0&bxn=20&fsn=101&cuben=0&pornn=0&manun=39&adstar=0&clw=250#id=cdcd2d0863d08a50ae07bb534d211454&currsn=0&ps=84&pc=84");
    }
}
