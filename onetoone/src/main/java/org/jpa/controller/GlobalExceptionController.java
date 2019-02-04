package org.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.jpa.model.GlobalExceptionMaster;
import org.jpa.service.GlobalExceptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionController {
	private static final Logger logger = LoggerFactory
            .getLogger(GlobalExceptionController.class);
	
	@Autowired
	private GlobalExceptionService globalExceptionService;
	
	@RequestMapping(value="/master/test", method=RequestMethod.GET)
	public String successMsg() {
		return "success";
	}
	
	@RequestMapping(value="/master/exceptions", method = RequestMethod.POST)
	public ResponseEntity<String> saveGlobalException(@RequestBody GlobalExceptionMaster 
			globalExceptionMaster) {
		System.out.println("......................1");
		GlobalExceptionMaster globalExceptionMaster1 = globalExceptionService.addGlobalExceptionMaster(globalExceptionMaster);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
		
	@RequestMapping(value = "/master/exceptions", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGlobalException() throws Exception{
			List<GlobalExceptionMaster> globalExceptionMaster = globalExceptionService.getAllGlobalExceptionMaster();
			return new ResponseEntity<>(globalExceptionMaster,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/master/exceptions/{exceptionCode}", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGlobalExceptionByExceptionCode(@PathVariable String exceptionCode) throws Exception{
		
			List<GlobalExceptionMaster> globalExceptionMaster = globalExceptionService.findGlobalExceptionMasterByExceptionCode(exceptionCode);
			System.out.println(globalExceptionMaster);
		
		return new ResponseEntity<>(globalExceptionMaster,HttpStatus.OK);
	}
	
	@RequestMapping(value="/master/exceptions/{exceptionMasId}", method=RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> updateGlobalException(@PathVariable int exceptionMasId, @RequestBody GlobalExceptionMaster
			globalExceptionMaster) {
		System.out.println("updating..."+exceptionMasId);
		GlobalExceptionMaster globalExceptionMaster2 = globalExceptionService.updateGlobalExceptionMaster(exceptionMasId,globalExceptionMaster);
		return new ResponseEntity<>(globalExceptionMaster2,HttpStatus.OK);
	}
	
	@RequestMapping(value="/master/exceptions/{exceptionMasId}", method=RequestMethod.DELETE)
	public @ResponseBody void deleteGlobalException(@PathVariable Long exceptionMasId){
		System.out.println("deleteid>>"+exceptionMasId);
		globalExceptionService.deleteGlobalExceptionMasterById(exceptionMasId);
	}
}
