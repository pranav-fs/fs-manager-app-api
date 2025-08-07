package com.fastspring.app;

import com.brightmarket.core.site.BasicStoreSite;
import com.brightmarket.core.site.Site;


import com.fastspring.app.service.StoreSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
@Controller
@RequestMapping("${openapi.fastSpringAppSettingsStoreAndCompany.base-path:}")
public class StoreSettingsApiController implements StoreSettingsApi {

    private final NativeWebRequest request;

    private final StoreSettingsService storeSettingsService;



    @Autowired
    public StoreSettingsApiController(NativeWebRequest request, StoreSettingsService storeSettingsService) {
        this.request = request;
        this.storeSettingsService = storeSettingsService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Site> createSite(Site site){
        return ResponseEntity.ok(storeSettingsService.createSite(site));
    }

    @Override
    public ResponseEntity<Site> getSite(Long id){
        return storeSettingsService.getSite(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<BasicStoreSite> createBasicStoreSite(BasicStoreSite basicStoreSite){
        return ResponseEntity.ok(storeSettingsService.createBasicStoreSite(basicStoreSite));
    }

    @Override
    public ResponseEntity<BasicStoreSite> getBasicStoreSite(Long id){
        return storeSettingsService.getBaiscStoreSite(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }



}
