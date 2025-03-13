package com.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springmvc.beans.Nvd_NhanVien;
import com.springmvc.dao.NvdNhanVienDao;

@Controller
public class NvdNhanVienController {
    
    @Autowired  
    NvdNhanVienDao nhanviendao;
    
    @GetMapping("/nhanvien/save")  
    public String showForm(Model m){  
        m.addAttribute("command", new Nvd_NhanVien());
        return "nhanvien/save"; 
    }  
    
    @PostMapping(value="/nhanvien/save")  
    public String save(@ModelAttribute("nhanvien") Nvd_NhanVien nv){  
        nhanviendao.save(nv);  
        return "redirect:/nhanvien/view";
    }
    
    @RequestMapping("nhanvien/view")  
    public String viewNhanVien(Model m){  
        List<Nvd_NhanVien> list = nhanviendao.getAllNhanVien();  
        m.addAttribute("list", list);
        return "nhanvien/view";  
    }  
    
    @RequestMapping(value="/nhanvien/editnhanvien/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Nvd_NhanVien nv = nhanviendao.getNhanVienById(id);  
        m.addAttribute("command", nv);
        return "nhanvien/edit";  
    }  
    
    @RequestMapping(value="/nhanvien/editnhanvien", method = RequestMethod.POST)  
    public String editSave(@ModelAttribute("nhanvien") Nvd_NhanVien nv){  
    	nhanviendao.update(nv);  
        return "redirect:/nhanvien/view";  
    }  
    
    @RequestMapping(value="/deletenhanvien/{id}", method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
    	nhanviendao.delete(id);  
        return "redirect:/nhanvien/view";  
    }  
}
