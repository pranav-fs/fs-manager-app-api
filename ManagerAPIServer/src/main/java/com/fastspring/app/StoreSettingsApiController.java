package com.fastspring.app;

import com.brightmarket.core.site.BasicStoreSite;
import com.fastspring.app.service.StoreSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.List;
import java.util.Optional;

@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]",
        comments = "Generator version: 7.14.0"
)
@Controller
@RequestMapping("${openapi.fastSpringAppSettingsStoreAndCompany.base-path:}")
public class StoreSettingsApiController implements StoreSettingsApi {

    private final NativeWebRequest request;
    private final StoreSettingsService storeSettingsService;

    @Autowired
    public StoreSettingsApiController(@Autowired(required = false) NativeWebRequest request, StoreSettingsService storeSettingsService) {
        this.request = request;
        this.storeSettingsService = storeSettingsService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<BasicStoreSite>> getLiveStores(){
        return ResponseEntity.ok(storeSettingsService.getLiveStores());
    }

    @Override
    public ResponseEntity<List<BasicStoreSite>> getNotLiveStores(){
        return ResponseEntity.ok(storeSettingsService.getNotLiveStores());
    }



    /*
    @Override
    public ResponseEntity<Site> getSite(Long id) {
        Site site = storeSettingsService.getSite(id); // from PersistenceFacade
        if (site != null) {
            return ResponseEntity.ok(site);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<BasicStoreSite> getBasicStoreSite(Long id) {
        BasicStoreSite basicStoreSite = storeSettingsService.getBasicStoreSite(id);
        if (basicStoreSite != null) {
            return ResponseEntity.ok(basicStoreSite);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Site> createSite(Site site) {
        // You may not need this if create is not required yet
        return ResponseEntity.status(501).build(); // Not Implemented
    }

    @Override
    public ResponseEntity<BasicStoreSite> createBasicStoreSite(BasicStoreSite basicStoreSite) {
        // You may not need this if create is not required yet
        return ResponseEntity.status(501).build(); // Not Implemented
    }

     */


}