package com.hk.poom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hk.poom.dto.RehomeAddDTO;
import com.hk.poom.dto.RehomeReportDTO;
import com.hk.poom.dto.RehomeUpdateDTO;
import com.hk.poom.service.RehomeService;

@Controller
public class RehomeController {
   
   @Autowired
   RehomeService rehomeService;
   
   @GetMapping("/poom/rehome/list")
   public String rehomeList(Model model ) {
      model.addAttribute("rehomeList",rehomeService.rehomeList());
      
      return "rehome/rehomeList";
   }
   
   @GetMapping("/poom/rehome/add")
   public String rehomeAdd(Model model ) {
      
      
      return "rehome/rehomeAdd";
   }
   
   
   @PostMapping("/poom/rehome/add")
   public String rehomeAddPost(Model model, RehomeAddDTO rehomeAddDTO ) {
      
      
      rehomeService.rehomeAdd(rehomeAddDTO);
      
      model.addAttribute("rehomeadd",rehomeAddDTO);
            
      return "rehome/rehomeAddPost";
   }
   
   @GetMapping("/poom/rehome/update")
   public String rehomeGetOne(@RequestParam("bno") int bno, Model model) {
      model.addAttribute("rehomeGetOne",rehomeService.rehomeGetOne(bno));
      return "rehome/rehomeUpdate";
   }
   
   
   @PostMapping("/poom/rehome/update")
   public String rehomeUpdate(Model model, RehomeUpdateDTO rehomeUpdateDTO) {
	   model.addAttribute("rehomeUpdate",rehomeService.rehomeUpdate(rehomeUpdateDTO));
	   model.addAttribute("rehomeUpdate1",rehomeService.rehomeUpdate1(rehomeUpdateDTO));

      
      return "rehome/rehomeUpdatePost";
   }
   
 
   
   @GetMapping("/poom/rehome/delete")
   public String rehomeDelete(@RequestParam("bno")int bno,Model model) {

      model.addAttribute("bno",bno);
      
      return "rehome/rehomeDelete";
   }
   
   @PostMapping("/poom/rehome/delete")
   public String rehomeDeletePost(@RequestParam("bno")int bno) throws Exception{
      rehomeService.rehomeDelete(bno);
        
      return "redirect:/poom/rehome/list";
   }
   
   @GetMapping("/poom/rehome/report")
   public String rehomeGetOne1(@RequestParam("bno") int bno, Model model) {
	   model.addAttribute("rehomeGetOne1",rehomeService.rehomeGetOne(bno));
	   return "rehome/report";
   }
   @PostMapping("/poom/rehome/report")
   public String report(Model model, RehomeReportDTO report) {
	   model.addAttribute("report",rehomeService.report(report));
	       
      return "rehome/reportDone";
   }
}
   