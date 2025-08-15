package com.fastspring.app.client;

import com.brightmarket.core.site.BasicStoreSite;
import com.brightmarket.core.site.BasicStoreSiteSalesStatusType;
import com.brightmarket.core.site.Site;
import com.brightmarket.core.util.persistence.PersistenceFacade;
import com.brightmarket.core.util.persistence.QueryUtil;
import com.brightmarket.core.workflow.DeploymentLifecycle;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

@Component
public class MonolithEntityService {

    @PersistenceUnit
    private EntityManagerFactory emf; // Boot injects this if configured properly

    public List<BasicStoreSite> findLiveStores() {
        EntityManager em = emf.createEntityManager();
        try {
            // Let the monolith ORM use this EM
            PersistenceFacade.openExternalEntityManager(em);

            Query query = em.createNamedQuery("BasicStoreSite.findLiveStores");
            query.setParameter("salesStatusType", BasicStoreSiteSalesStatusType.LIVE);
            query.setParameter("lifecycle", DeploymentLifecycle.PRODUCTION);
            QueryUtil.setupLargeImmutableQueryHints(query);

            return query.getResultList();
        } finally {
            PersistenceFacade.closeEntityManager();
            em.close();
        }
    }

    public List<BasicStoreSite> findNotLiveStores() {
        EntityManager em = emf.createEntityManager();
        try {
            PersistenceFacade.openExternalEntityManager(em);

            Query query = em.createNamedQuery("BasicStoreSite.findNotLiveStores");
            query.setParameter("salesStatusType", BasicStoreSiteSalesStatusType.NOT_LIVE);
            query.setParameter("lifecycle", DeploymentLifecycle.PRODUCTION);
            QueryUtil.setupLargeImmutableQueryHints(query);

            return query.getResultList();
        } finally {
            PersistenceFacade.closeEntityManager();
            em.close();
        }
    }
}
