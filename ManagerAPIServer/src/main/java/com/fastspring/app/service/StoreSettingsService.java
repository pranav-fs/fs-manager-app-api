package com.fastspring.app.service;


import com.brightmarket.core.Model;
import com.brightmarket.core.site.BasicStoreSite;
import com.brightmarket.core.site.Site;
import com.fastspring.app.Repository.BasicStoreSiteRepository;
import com.fastspring.app.Repository.SiteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreSettingsService {

    private final SiteRepository siteRepository;
    private final BasicStoreSiteRepository basicStoreSiteRepository;


    public StoreSettingsService(SiteRepository siteRepository, BasicStoreSiteRepository basicStoreSiteRepository) {
        this.siteRepository = siteRepository;
        this.basicStoreSiteRepository = basicStoreSiteRepository;
    }

    public Site createSite(Site site){
        return siteRepository.save(site);
    }

    public Optional<Site> getSite(Long id){
        return siteRepository.findById(String.valueOf(id));
    }

    public BasicStoreSite createBasicStoreSite(BasicStoreSite basicStoreSite){
        return basicStoreSiteRepository.save(basicStoreSite);
    }

    public Optional<BasicStoreSite> getBaiscStoreSite(Long id){
        return basicStoreSiteRepository.findById(String.valueOf(id));
    }
}
