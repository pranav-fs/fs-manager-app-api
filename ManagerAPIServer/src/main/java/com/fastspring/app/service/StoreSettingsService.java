package com.fastspring.app.service;

import com.brightmarket.core.site.BasicStoreSite;
import com.brightmarket.core.site.Site;
import com.brightmarket.core.util.persistence.PersistenceFacade;
import com.brightmarket.engine.site.SiteId;
import com.fastspring.app.client.MonolithEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Set;

@Service
public class StoreSettingsService {

    @Autowired
    private final MonolithEntityService monolithEntityService;

    public StoreSettingsService(MonolithEntityService monolithEntityService){
        this.monolithEntityService = monolithEntityService;
    }

    public List<BasicStoreSite> getLiveStores(){
        return monolithEntityService.findLiveStores();
    }

    public List<BasicStoreSite> getNotLiveStores(){
        return monolithEntityService.findNotLiveStores();
    }


//    public Site getSite(Long siteId) {
//        EntityManager em = persistenceFacade.getEntityManager();
//        return em.find(Site.class, siteId); // Direct JPA find from monolith
//    }
//
//    public BasicStoreSite getBasicStoreSite(Long siteId) {
//        EntityManager em = persistenceFacade.getEntityManager();
//        return em.find(BasicStoreSite.class, siteId);
//    }
//
//    // Example using a named query from monolith model
//    public Site getSiteByCustomNamedQuery(Long siteId) {
//        EntityManager em = persistenceFacade.getEntityManager();
//        return em.createNamedQuery("Site.findById", Site.class)
//                .setParameter("id", siteId)
//                .getSingleResult();
//    }
}