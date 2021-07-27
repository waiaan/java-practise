package com.example.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/upload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("file upload 1");
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> items = upload.parseRequest(request);
        for (FileItem item : items) {
            if (item.isFormField()) {

            } else {
                item.write(new File(path, item.getName()));
                item.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/upload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile file) throws Exception {
        System.out.println("file upload 1");
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        File file1 = new File(path);
        if (!file1.exists()) {
            file1.mkdir();
        }
        file.transferTo(new File(path, file.getOriginalFilename()));
        return "success";
    }

    @RequestMapping("/upload3")
    public String fileUpload3(MultipartFile file) throws Exception {
        System.out.println("file upload 3");
        String path = "http://127.0.0.1:8280/uploads/";
        Client client = Client.create();
        WebResource webResource = client.resource(path + file.getOriginalFilename());
        webResource.put(file.getBytes());
        return "success";
    }
}
