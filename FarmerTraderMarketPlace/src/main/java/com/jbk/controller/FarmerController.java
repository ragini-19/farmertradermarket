package com.jbk.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jbk.service.FarmerService;

@Controller
public class FarmerController {
	
	private static final String UPLOADED_FOLDER = null;
	@Autowired
	FarmerService farmerService;
	/*
	 * @InitBinder protected void initBinder(HttpServletRequest request,
	 * ServletRequestDataBinder binder) throws ServletException {
	 * 
	 * // Convert multipart object to byte[]
	 * binder.registerCustomEditor(byte[].class, new
	 * ByteArrayMultipartFileEditor());
	 * 
	 * }
	 */

	@GetMapping("/show")
	public String uploadFile() {

		return "index";

	}
	  @PostMapping("/create1") // //new annotation since 4.3
	    public String singleFileUpload(@RequestParam(value = "file") File file,MultipartFile multipartFile,
	                                   RedirectAttributes redirectAttributes) throws Exception {

	        if (multipartFile.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            return "redirect:index";
	        }

	        try {

	        	byte[] bytes = multipartFile.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + multipartFile.getOriginalFilename());
	            Files.write(path, bytes);

	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + multipartFile.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        farmerService.GetFarmer(multipartFile,file);
			  return "redirect:/index";

	       	    }

	@PostMapping("/create2")
	public String  GetFarmer(@RequestParam(value = "file") File file, MultipartFile multipartFile,BindingResult bindingResult) throws Exception {
		
		 farmerService.GetFarmer(multipartFile,file );
		 return "redirect:/ExcelSucess";
	}

}
