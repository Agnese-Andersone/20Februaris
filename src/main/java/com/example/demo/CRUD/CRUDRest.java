package com.example.demo.CRUD;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CRUDRest {
    List<MeAndFamily> meAndFamilyList = new ArrayList<>();

    @GetMapping("/family/{Id}")
    public String getMyFamily (@PathVariable("Id") String id) {
        return "Andersoni" + id;
    }

    @PostMapping("/member/new")
    public String createMember(@RequestBody MeAndFamily meAndFamily){
        meAndFamilyList.add(meAndFamily);
        return "Ok" + meAndFamily;
    }

    @PutMapping("/member/update")
    public String updateMember(@RequestBody MeAndFamily meAndFamily){
        for(MeAndFamily meAndFamily1: meAndFamilyList){
            if(meAndFamily1.getName().equals(meAndFamily.getName())){
                meAndFamily1.setRelation(meAndFamily1.getRelation());
            }
        }
        return "okidoki" + meAndFamily.getName();
    }
    @GetMapping ("/member/all")
    public List<MeAndFamily> getMeAndFamilyList(){
        return meAndFamilyList;
    }
    @DeleteMapping("member/{name}")
    public String deleteMember(@PathVariable("name")String name){
        for (MeAndFamily meAndFamily: meAndFamilyList) {
            if(meAndFamily.getName().equals(name)){
                meAndFamilyList.remove(meAndFamily);
                break;
            }
        }
        return "ok";
    }


}
