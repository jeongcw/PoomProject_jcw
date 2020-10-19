package com.hk.poom.controller;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hk.poom.HomeController;
import com.hk.poom.dto.CategoryDTO;
import com.hk.poom.dto.RehomeAddDTO;
import com.hk.poom.dto.RehomeReportDTO;
import com.hk.poom.dto.RehomeUpdateDTO;
import com.hk.poom.service.RehomeService;

import net.sf.json.JSONArray;

@Controller
public class RehomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
   @Autowired
   RehomeService rehomeService;
   
   @Autowired
	ServletContext sc;
   
   @GetMapping("/poom/rehome/list")
   public String rehomeList(Model model ) {
      model.addAttribute("rehomeList",rehomeService.rehomeList());
      
      return "rehome/rehomeList";
   }

   
//   @GetMapping("/poom/rehome/add")
//   public String rehomeAdd(Model model ) {
//	   logger.info("카테고리불러오기");
//	   List<CategoryDTO> category = null;
//	    category = rehomeService.category();
//	    System.out.println(category);
//	    model.addAttribute("category", JSONArray.fromObject(category));
//	    logger.info("카테고리"+model);
//      return "rehome/rehomeAdd";
//   }
   
 @GetMapping("/poom/rehome/add")
 public String rehomeAdd(Model model, RehomeAddDTO rehomeAddDTO) throws Exception{
    logger.info("카테고리불러와야해");
    
    List<CategoryDTO> category =null;
    category = rehomeService.category();
    model.addAttribute("category",JSONArray.fromObject(category));
 
    logger.info("category" + model);
    
    
    return "rehome/rehomeAdd";
 }
   
//   @PostMapping("/poom/rehome/add")
//   public String rehomeAddPost(Model model, RehomeAddDTO rehomeAddDTO ) {
//	   List<CategoryDTO> category = null;
//	    category = rehomeService.category();
//	    model.addAttribute("category", JSONArray.fromObject(category));
//      
//      rehomeService.rehomeAdd(rehomeAddDTO);
//      
//      model.addAttribute("rehomeadd",rehomeAddDTO);
//            
//      return "rehome/rehomeAddPost";
//   }
   

   @PostMapping("/poom/rehome/add")
   public String rehomeAddPost(@RequestParam("file") MultipartFile[] file, Model model,RehomeAddDTO rehomeAddDTO, @RequestParam("cateCode") String cateCode) {
    //logger.info("form 전송");
    //System.out.println(rehomeAddDTO.toString());
	   for(int i=0; i<file.length; i++) {
//           System.out.println("================== file start ==================");
//           System.out.println("파일 이름: "+file[i].getName());
//           System.out.println("파일 실제 이름: "+file[i].getOriginalFilename());
//           System.out.println("파일 크기: "+file[i].getSize());
//           System.out.println("content type: "+file[i].getContentType());
//           System.out.println("================== file   END ==================");
           
           String realPath = sc.getRealPath("/resources/img/rehome/");
           String genID = UUID.randomUUID().toString();
           String oriName = file[i].getOriginalFilename();
           String img_r = genID+"."+FilenameUtils.getExtension(oriName);
           
           if (i==0) { rehomeAddDTO.setImg_r2(""); rehomeAddDTO.setImg_r3(""); rehomeAddDTO.setImg_r4(""); rehomeAddDTO.setImg_r5("");} 
           else if (i==1) { rehomeAddDTO.setImg_r3(""); rehomeAddDTO.setImg_r4(""); rehomeAddDTO.setImg_r5(""); }
           else if (i==2) { rehomeAddDTO.setImg_r4(""); rehomeAddDTO.setImg_r5(""); }
           else if (i==3) { rehomeAddDTO.setImg_r5(""); }
           
           if (i==0) { rehomeAddDTO.setImg_r1(img_r); } 
           else if (i==1) { rehomeAddDTO.setImg_r2(img_r); }
           else if (i==2) { rehomeAddDTO.setImg_r3(img_r); }
           else if (i==3) { rehomeAddDTO.setImg_r4(img_r); }
           else if (i==4) { rehomeAddDTO.setImg_r5(img_r); }
           
           File oldProfFile = new File(realPath + file[i].getOriginalFilename());	// 업로드한 파일이 실제로 저장되는 위치  + 파일명 (확장자 포함) => 실행 디렉토리
   	    File newProfFile = new File(realPath + img_r);
   	    oldProfFile.renameTo(newProfFile);	// 파일명 변경
   	  
//   	  System.out.println("-----------완성 파일명 : "+ img_r);
   	  try {
   			// 소스 디렉토리에 저장된 파일을 실행 디렉토리에 복사하라는 명령?
   			InputStream fileStream = file[i].getInputStream();
   			FileUtils.copyInputStreamToFile(fileStream, newProfFile);
   		} catch (Exception e) {
   			FileUtils.deleteQuietly(newProfFile);
   			e.printStackTrace();
   		}
       }

      model.addAttribute("rehomeAddPost",rehomeAddDTO);   
	   rehomeService.rehomeAddPost(rehomeAddDTO);
    
    String cateName = rehomeService.rehomeCateName(cateCode);
    //System.out.println("cateName=" + cateName);
    rehomeAddDTO.setCateName(cateName);
    //RehomeAddDTO catNameSet = rehomeAddDTO;
    rehomeService.rehomeCateUpdate(rehomeAddDTO);
    
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

   @GetMapping("/poom/rehome/read")
   public String rehomeRead(@RequestParam("bno") int bno, Model model) {
	   logger.info("bno=" + bno);
	   model.addAttribute("rehomeRead",rehomeService.rehomeRead(bno));
	   return "rehome/rehomeRead";
   }
 
   @GetMapping("/poom/rehome/pay")
   public String rehomePay() {
	   return "rehome/pay";
   }
   
   @GetMapping("/poom/rehome/paySuccess")
   public String rehomePaySuccess() {
	   return "rehome/paySuccess";
   }
   
   @GetMapping("/poom/rehome/payFail")
   public String rehomePayFail() {
	   return "rehome/payFail";
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
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

