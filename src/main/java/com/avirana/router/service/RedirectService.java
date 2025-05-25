package com.avirana.router.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import com.avirana.router.repository.ViewRepository;

@Service
public class RedirectService {

    HashMap<String, String> urlMapper = new HashMap<>();
    ViewRepository viewRepository;

    @Autowired
    RedirectService(ViewRepository viewRepository) {

        this.viewRepository = viewRepository;

        urlMapper.put("github", "https://github.com/Avi-Rana-1718");
        urlMapper.put("leetcode", "https://leetcode.com/u/avirana3449");
        urlMapper.put("linkedin", "https://www.linkedin.com/in/avi-rana/");
        urlMapper.put("twitter", "https://x.com/_AviRana");
        urlMapper.put("myanimelist", "https://myanimelist.net/profile/_AviRana");
    }

    public RedirectView getRoute(String key) {
        String path = urlMapper.getOrDefault(key, "/404");
        viewRepository.findOne(null);
        return new RedirectView(path);
    }
}
